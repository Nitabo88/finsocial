package co.com.red5g.wiipo.stepdefinitions;

import co.com.red5g.wiipo.questions.Mensaje;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.wiipo.tasks.Abrir;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.wiipo.models.builders.CredencialesBuilder.de;
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
