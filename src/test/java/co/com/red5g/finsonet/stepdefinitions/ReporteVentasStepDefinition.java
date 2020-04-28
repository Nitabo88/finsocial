package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_CREDITO_DETALLE_ANTECARTERA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_CREDITO_DETALLE_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_VALOR_DETALLE_ORIGINACION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.ElNumero;
import co.com.red5g.finsonet.questions.factories.ElValor;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.utils.Utilerias;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class ReporteVentasStepDefinition {

    @Dado("que un (.*) quiere consultar un reporte")
    public void ingresarReportes(String strActor) {
        theActorCalled(strActor).attemptsTo(
                Consulta.unReporte()
        );
    }

    @Cuando("el ingresa al reporte del mes de originacion")
    public void consultarReporteOriginacion() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeOriginacion()
        );
    }

    @Cuando("el ingresa al reporte del mes de antecartera")
    public void consultarReporteAntecartera() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeAntecartera()
        );
    }

    @Cuando("el ingresa al reporte del mes de venta nueva")
    public void consultarReporteVentaNueva() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.enElReporteDeVentaNueva()
        );
    }

    @Cuando("el ingresa al reporte del mes de venta liberada")
    public void consultarVentaLiberada() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.enElReporteDeVentaLiberada()
        );
    }

    @Entonces("el observara que el valor consolidado y el detalle del reporte de originacion son consistentes")
    public void verificarValorReporteOriginacion() {
        theActorInTheSpotlight()
            .should(seeThat(ElValor.delReporteDeOriginacion(), containsString(String.valueOf(Utilerias.suma(LST_VALOR_DETALLE_ORIGINACION.resolveAllFor(theActorInTheSpotlight()))))));
    }

    @Y("^que el numero de creditos consolidado y el detalle del reporte de originacion son consistentes$")
    public void verificarCreditosReporteOriginacion() {
        theActorInTheSpotlight()
            .should(seeThat(ElNumero.deCreditosDelReporteDeOriginacion(), containsString(String.valueOf(Utilerias.suma(LST_CREDITO_DETALLE_ORIGINACION.resolveAllFor(theActorInTheSpotlight()))))));
    }

    @Entonces("el observara que el numero de creditos consolidado y el detalle del reporte de antecartera son consistentes")
    public void verificarReporteAntecartera() {
        theActorInTheSpotlight()
            .should(seeThat(ElNumero.deCreditosDelReporteDeAntecartera(), containsString(String.valueOf(Utilerias.suma(LST_CREDITO_DETALLE_ANTECARTERA.resolveAllFor(theActorInTheSpotlight()))))));
    }

    @Entonces("el observara que el valor consolidado y el detalle del reporte de venta nueva son consistentes")
    public void verificarValorReporteVentaNueva() {
        theActorInTheSpotlight()
            .should(seeThat(ElValor.delReporteDeVentaNueva(), containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalleDelReporteDeVentaNueva()))));
    }

    @Y("^que el numero de creditos consolidado y el detalle del reporte de venta nueva son consistentes$")
    public void verificarCreditosVentaNueva() {
        theActorInTheSpotlight()
            .should(seeThat(ElNumero.deCreditosDelReporteDeVentaNueva(), containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditosDelReporteDeVentaNueva()))));
    }

    @Y("^que el numero de creditos consolidado y el detalle del reporte de venta liberada son consistentes$")
    public void verificarCreditosVentaLiberada() {
        theActorInTheSpotlight()
            .should(seeThat(ElNumero.deCreditosDelReporteDeVentaLiberada(), containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditosDelReporteDeVentaLiberada()))));
    }

    @Entonces("^el observara que el valor consolidado y el detalle del reporte de venta liberada son consistentes$")
    public void verificarValorVentaLiberada() {
        theActorInTheSpotlight()
            .should(seeThat(ElValor.delReporteDeVentaLiberada(), containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalleDelReporteDeVentaLiberada()))));
    }
}