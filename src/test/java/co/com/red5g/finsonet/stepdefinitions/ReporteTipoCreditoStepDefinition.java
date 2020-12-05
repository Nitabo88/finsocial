package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.BTN_DETALLE_APROBACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.BTN_DETALLE_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.BTN_DETALLE_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.BTN_DETALLE_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.BTN_DETALLE_RADICADOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_APROBACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_NUMERO_CREDITOS_RADICADOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_APROBACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_INCORPORACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_VALOR_RADICADOS;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_FINSOALIVIO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_FINSOCREDITO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_FINSOPRODUCTIVO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LNK_VER_DETALLE_FINSOTIENDA;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_CREDITOS_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_VALOR_DETALLE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.ElNumero;
import co.com.red5g.finsonet.questions.factories.ElValor;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Entonces;

public class ReporteTipoCreditoStepDefinition {

  @Cuando("^el ingresa al reporte del mes de FinsoCrédito$")
  public void ingresarFinsocredito() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.enElReporte(LNK_VER_DETALLE_FINSOCREDITO)
    );
  }

  @Cuando("^el ingresa al reporte del mes de Finsoamigo$")
  public void ingresarFinsoamigo() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.enElReporte(LNK_VER_DETALLE_FINSOAMIGO)
    );
  }

  @Cuando("^el ingresa al reporte del mes de FinsoProductivo$")
  public void ingresarFinsoProductivo() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.enElReporte(LNK_VER_DETALLE_FINSOPRODUCTIVO)
    );
  }

  @Cuando("^el ingresa al reporte del mes de Finsoalivio$")
  public void ingresarFinsoalivio() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.enElReporte(LNK_VER_DETALLE_FINSOALIVIO)
    );
  }

  @Cuando("^el ingresa al reporte del mes de Tu tienda en casa$")
  public void ingresarFinsotienda() {
    theActorInTheSpotlight().attemptsTo(
        Ingresa.enElReporte(LNK_VER_DETALLE_FINSOTIENDA)
    );
  }

  @Entonces("^el asesor observara que el valor consolidado y el número de créditos es igual a la suma del detalle de los reportes de (.*)$")
  public void verificarValorReportes(String tipoCredito) {
    theActorInTheSpotlight()
        .should(
            seeThat(ElValor.totalDeLosCreditos(LBL_VALOR_RADICADOS),
                containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalle(BTN_DETALLE_RADICADOS, LST_VALOR_DETALLE)))),
            seeThat(ElNumero.totalDeLosCreditos(LBL_NUMERO_CREDITOS_RADICADOS),
                containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditos(LST_CREDITOS_DETALLE)))),
            seeThat(ElValor.totalDeLosCreditos(LBL_VALOR_DOCUMENTOS),
                containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalle(BTN_DETALLE_DOCUMENTOS, LST_VALOR_DETALLE)))),
            seeThat(ElNumero.totalDeLosCreditos(LBL_NUMERO_CREDITOS_DOCUMENTOS),
                containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditos(LST_CREDITOS_DETALLE)))),
            seeThat(ElValor.totalDeLosCreditos(LBL_VALOR_CONFIRMACION),
                containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalle(BTN_DETALLE_CONFIRMACION, LST_VALOR_DETALLE)))),
            seeThat(ElNumero.totalDeLosCreditos(LBL_NUMERO_CREDITOS_CONFIRMACION),
                containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditos(LST_CREDITOS_DETALLE)))),
            seeThat(ElValor.totalDeLosCreditos(LBL_VALOR_APROBACION),
                containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalle(BTN_DETALLE_APROBACION, LST_VALOR_DETALLE)))),
            seeThat(ElNumero.totalDeLosCreditos(LBL_NUMERO_CREDITOS_APROBACION),
                containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditos(LST_CREDITOS_DETALLE)))),
            seeThat(ElValor.totalDeLosCreditos(LBL_VALOR_INCORPORACION),
                containsString(theActorInTheSpotlight().asksFor(ElValor.delDetalle(BTN_DETALLE_INCORPORACION, LST_VALOR_DETALLE)))),
            seeThat(ElNumero.totalDeLosCreditos(LBL_NUMERO_CREDITOS_INCORPORACION),
                containsString(theActorInTheSpotlight().asksFor(ElNumero.delDetalleDeCreditos(LST_CREDITOS_DETALLE))))
        );
  }
}
