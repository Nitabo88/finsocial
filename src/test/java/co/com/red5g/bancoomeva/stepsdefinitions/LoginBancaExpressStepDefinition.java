package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.bancoomeva.questions.Mensaje;
import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;


public class LoginBancaExpressStepDefinition {

  @Dado("^que (.*) quiere acceder a Banca Express$")
  public void ubicarsePagina(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.aBancoomeva());
  }

  @Cuando("^ingresa su información de autenticación de Banca Express$")
  public void ingresarInformacionAutenticacion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().unColaborador()));
  }

  @Entonces("^el debería poder ver el mensaje (.*) en Banca Express$")
  public void verificarIngreso(final String mensaje) {
    theActorInTheSpotlight().should(seeThat("El mensaje", Mensaje.deBienvenida(), equalTo(mensaje)));
  }
}
