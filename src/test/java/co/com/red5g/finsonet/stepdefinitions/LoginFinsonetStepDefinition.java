package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException;
import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.finsonet.tasks.SeAutentica;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException.MENSAJE_LOGUEO_NO_EXITOSO;
import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginFinsonetStepDefinition {

    @Dado("que (.*) quiere acceder a finsonet")
    public void ingresarPagina(String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(AbreLaPagina.finsonet());
    }

    @Cuando("(.*) se autentica en finsonet con el usuario (.*), la contraseña (.*) y el codigo (.*)")
    public void autenticarUsuario(String actor, String usuario, String contrasena, String codigo) {
        theActorCalled(actor).attemptsTo(
                AbreLaPagina.finsonet());
        theActorInTheSpotlight().attemptsTo(
                SeAutentica.conCredenciales(de().unUsuarioBasico(usuario, contrasena, codigo))
        );
    }

    @Cuando("ingresa su informacion de autenticacion")
    public void diligenciarInformacionIngreso() {
        theActorInTheSpotlight().attemptsTo(SeAutentica.conCredenciales(de().unUsuarioBasico()));
    }

    @Entonces("el debería ver (.*)")
    public void verificarIngreso(String strMensaje) {
        theActorInTheSpotlight().should(seeThat(Mensaje.deBienvenidaEs(strMensaje)).orComplainWith(ElUsuarioNoSeAutenticoException.class,MENSAJE_LOGUEO_NO_EXITOSO));
    }
}
