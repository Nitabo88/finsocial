package co.com.red5g.bancoomeva.stepsdefinitions;

import static co.com.red5g.bancoomeva.modelos.builders.CredencialesBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoAssertion;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.bancoomeva.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class LoginStepDefinition {

  @Dado("^que (.*) quiere acceder a Banca Express$")
  public void ubicarsePagina(String actor) {
    theActorCalled(actor).wasAbleTo(Ingresa.aHome());
  }

  @Cuando("^ingresa su información de autenticación de Banca Express$")
  public void ingresarInformacionAutenticacion() {
    theActorInTheSpotlight().attemptsTo(Diligencia.lasCredencialesDeAutenticacion(con().unColaborador()));
  }

  @Entonces("^el debería ver el mensaje (.*)$")
  public void verificarIngreso(final String strMensaje) {
    theActorInTheSpotlight().should(seeThat(Mensaje.deBienvenidaEs(strMensaje)).orComplainWith(ElUsuarioNoSeAutenticoAssertion.class, ElUsuarioNoSeAutenticoAssertion.MENSAJE_LOGUEO_NO_EXITOSO));
  }
}
