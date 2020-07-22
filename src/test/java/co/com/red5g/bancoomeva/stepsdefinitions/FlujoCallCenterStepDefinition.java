package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.bancoomeva.questions.factories.ElValor;
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

  @Cuando("^el asesor call center diligencia los tres pasos de crédito en línea$")
  public void diligenciarPasosGestion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.losPrimerosPasosDeUnCredito());
  }

  @Y("^(.*) realiza el proceso de firma$")
  public void diligenciarFirma(String actor) {
    theActorCalled(actor).attemptsTo(Diligencia.laFirmaDelCredito());
  }

  @Entonces("^el debería poder ver el crédito creado$")
  public void verificarCreditoCreado() {
    theActorInTheSpotlight().should(
        seeThat("La cuota del crédito", ElValor.deSimulacion(3),equalTo(ElValor.deLaCuotadelCredito()))
    );
  }
}
