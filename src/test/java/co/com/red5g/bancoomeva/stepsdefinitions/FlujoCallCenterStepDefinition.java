package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static co.com.red5g.bancoomeva.userinterfaces.CreditoPage.BTN_APLAZAR;
import static co.com.red5g.bancoomeva.userinterfaces.CreditoPage.BTN_APROBAR;
import static co.com.red5g.bancoomeva.userinterfaces.CreditoPage.BTN_NEGAR;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_CLIENTE_APROBADO;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_CLIENTE_PRE_APROBADO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.bancoomeva.questions.factories.ElCredito;
import co.com.red5g.bancoomeva.questions.factories.ElPdf;
import co.com.red5g.bancoomeva.questions.factories.ElValor;
import co.com.red5g.bancoomeva.questions.factories.Mensaje;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class FlujoCallCenterStepDefinition {

  @Dado("^que (.*) quiere acceder a un crédito por el call center$")
  public void ingresarFlujoCallCenter(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.alFlujodeCallCenter(con().unColaborador()));
  }

  @Cuando("^el asesor del call center diligencia el crédito aprobado de libranza con el valor mínimo$")
  public void diligenciarPasosGestionAprobado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elCreditoConValoresMinimos(SQL_CLIENTE_APROBADO.getSql()));
  }

  @Y("^el cliente realiza el proceso de firma de un cliente aprobado$")
  public void diligenciarFirmaClienteAprobado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.laFirmaDelCredito());
  }

  @Entonces("^el debería poder ver el crédito creado$")
  public void verificarCreditoCreado() {
    theActorInTheSpotlight().should(
        seeThat("La cuota del crédito", ElValor.deSimulacion(3), equalTo(theActorInTheSpotlight().asksFor(ElValor.deLaCuotadelCredito()))),
        seeThat("El valor de banca seguro", ElValor.deSimulacion(6), equalTo(theActorInTheSpotlight().asksFor(ElValor.deBancaSeguro()))),
        seeThat("El valor del crédito", ElValor.deSimulacion(5), equalTo(theActorInTheSpotlight().asksFor(ElValor.delCredito()))),
        seeThat("La cuota del seguro de vida", ElValor.deSimulacion(4), equalTo(theActorInTheSpotlight().asksFor(ElValor.delSeguroDeVida()))),
        seeThat("El credito esta en estado negado", ElCredito.aprobadoEnBandejaCallCenter(), containsString("Gestion Aprobada en fabrica")),
        seeThat("El tipo de producto", Mensaje.deCartaComercial(), containsString("Libre inversión")),
        seeThat("El tipo de producto", ElPdf.deEquidadSeguros(), containsString("Libre inversión"))
    );
  }

  @Y("^el cliente realiza el proceso de firma de un cliente pre-aprobado$")
  public void diligenciarFirmaClientePreAprobado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.laFirmaDelCreditoPreAprobado());
  }

  @Y("^el asesor aprueba el proceso de fábrica$")
  public void aprobarProcesoFabrica() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elProcesoEnFabricaDeCreditos(BTN_APROBAR));
  }

  @Cuando("^el asesor del call center diligencia el crédito pre-aprobado de libranza con el valor mínimo$")
  public void diligenciarPasosGestionPreAprobado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elCreditoConValoresMinimos(SQL_CLIENTE_PRE_APROBADO.getSql()));
  }

  @Y("^el asesor niega el proceso de fábrica$")
  public void negarCreditoFabricaDeCredito() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elProcesoEnFabricaDeCreditos(BTN_NEGAR));
  }

  @Entonces("^el asesor debería poder ver el crédito negado en la bandeja de call center$")
  public void verificarNegacionCredito() {
    theActorInTheSpotlight().should(
        seeThat("La cuota del crédito", ElValor.deSimulacion(3), equalTo(theActorInTheSpotlight().asksFor(ElValor.deLaCuotadelCredito()))),
        seeThat("El valor de banca seguro", ElValor.deSimulacion(6), equalTo(theActorInTheSpotlight().asksFor(ElValor.deBancaSeguro()))),
        seeThat("El valor del crédito", ElValor.deSimulacion(5), equalTo(theActorInTheSpotlight().asksFor(ElValor.delCredito()))),
        seeThat("La cuota del seguro de vida", ElValor.deSimulacion(4), equalTo(theActorInTheSpotlight().asksFor(ElValor.delSeguroDeVida()))),
        seeThat("El credito esta en estado", ElCredito.negadoEnBandejaCallCenter(), containsString("Gestion Rechazada en fabrica"))
    );
  }

  @Y("^el asesor aplaza el proceso de fábrica$")
  public void elAsesorAplazaElProcesoDeFábrica() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elProcesoEnFabricaDeCreditos(BTN_APLAZAR));
  }

  @Entonces("^el asesor debería poder ver el crédito aplazado en la bandeja de call center$")
  public void verificarCreditoAplazado() {
    theActorInTheSpotlight().should(
        seeThat("La cuota del crédito", ElValor.deSimulacion(3), equalTo(theActorInTheSpotlight().asksFor(ElValor.deLaCuotadelCredito()))),
        seeThat("El valor de banca seguro", ElValor.deSimulacion(6), equalTo(theActorInTheSpotlight().asksFor(ElValor.deBancaSeguro()))),
        seeThat("El valor del crédito", ElValor.deSimulacion(5), equalTo(theActorInTheSpotlight().asksFor(ElValor.delCredito()))),
        seeThat("La cuota del seguro de vida", ElValor.deSimulacion(4), equalTo(theActorInTheSpotlight().asksFor(ElValor.delSeguroDeVida()))),
        seeThat("El credito esta en estado", ElCredito.negadoEnBandejaCallCenter(), containsString("Gestion Aplazada en fabrica"))
    );
  }
}
