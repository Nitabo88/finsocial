package co.com.red5g.stepdefinitions.wiipo;

import co.com.red5g.questions.wiipo.Mensaje;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import co.com.red5g.tasks.wiipo.Abrir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.models.builders.wiipo.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class LoginWiipoStepDefinition {

    @Dado("que (.*) quiere acceder a Wiipo")
    public void ingresarPagina(String actor) {
        theActorCalled(actor).wasAbleTo(Abrir.wiipo());
    }

    @Cuando("^ingresa su información de autenticación$")
    public void diligenciarInformacionAutenticacion() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.lasCredencialesWiipo(de().unUsuarioWiipo()));
    }

    @Entonces("^el deberá ver (.*)$")
    public void verificarLogueo(String mensaje) {
        theActorInTheSpotlight().should(seeThat(Mensaje.deBienvenida(), equalTo(mensaje)));
    }
}
