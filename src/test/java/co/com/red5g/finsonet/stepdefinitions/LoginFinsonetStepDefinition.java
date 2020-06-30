package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoAssertion;
import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class LoginFinsonetStepDefinition {

    @Dado("que (.*) quiere acceder a finsonet")
    public void ingresarPagina(final String nombreActor) {
        theActorCalled(nombreActor).wasAbleTo(AbreLaPagina.finsonet());
    }

    @Cuando("(.*) se autentica en finsonet con el usuario (.*), la contraseña (.*) y el codigo (.*)")
    public void autenticarUsuario(final String actor, final String usuario, final String contrasena, final String codigo) {
        theActorCalled(actor).attemptsTo(
                AbreLaPagina.finsonet(),
                Ingresa.lasCredenciales(de().unUsuarioBasico(usuario, contrasena, codigo))
        );
    }

    @Cuando("ingresa su informacion de autenticacion")
    public void diligenciarInformacionIngreso() {
        theActorInTheSpotlight().attemptsTo(
                Ingresa.lasCredenciales(de().unUsuarioBasico()));
    }

    @Entonces("el debería ver (.*)")
    public void verificarIngreso(final String strMensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Mensaje.deBienvenidaEs(strMensaje)).orComplainWith(ElUsuarioNoSeAutenticoAssertion.class, ElUsuarioNoSeAutenticoAssertion.MENSAJE_LOGUEO_NO_EXITOSO));
    }
}