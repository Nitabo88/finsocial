package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class AprobacionCreditoFinsoamigoStepDefinition {

  @Dado("^que (.*) esta en el paso de aprobación de créditos finsoamigo de un cliente con perfil (.*)$")
  public void ingresarAprobacionCreditos(String actor,String perfilRiesgo) {
    theActorCalled(actor).wasAbleTo(
        Ingresa.aAprobacionFinsoamigo(perfilRiesgo));
  }

  @Cuando("^el asesor diligencia la información del cliente con perfil (.*) en aprobación de crédito$")
  public void diligenciarInformacion(String perfilRiesgo) {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laInformacionDeAprobacionDeCreditoFinsoamigo(perfilRiesgo)
    );
  }

  @Entonces("^el asesor deberá ver el crédito en el paso de tesorería en pendiente por firma$")
  public void verificarCreditoTesoreria() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enTesoreriaPendientePorFirma()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }

  @Entonces("^el asesor deberá ver el crédito en el módulo créditos por confirmar$")
  public void verificarCreditosPorConfirmar() {
    theActorInTheSpotlight().should(seeThat(ElCredito.enLaListaDeCreditosPorConfirmar()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
  }
}
