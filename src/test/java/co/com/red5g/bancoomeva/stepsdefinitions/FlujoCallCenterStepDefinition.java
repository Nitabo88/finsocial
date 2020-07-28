package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

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

  @Cuando("^el asesor del call center diligencia el crédito de libranza con el valor mínimo$")
  public void diligenciarPasosGestion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.elCreditoConValoresMinimos());
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
        seeThat("El tipo de producto", Mensaje.deCartaComercial(), containsString("Libre inversión"))
    );
  }

  @Y("^el cliente realiza el proceso de firma de un cliente pre-aprobado$")
  public void diligenciarFirmaClientePreAprobado() {
    theActorInTheSpotlight().attemptsTo(Diligencia.laFirmaDelCreditoPreAprobado());
  }
}
