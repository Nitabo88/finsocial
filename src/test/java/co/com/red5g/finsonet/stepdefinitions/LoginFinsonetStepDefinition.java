package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.IsEqual.equalTo;

import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoAssertion;
import co.com.red5g.finsonet.interacions.AbreLaPagina;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.finsonet.questions.factories.ElMensaje;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class LoginFinsonetStepDefinition {

    private static final String MENSAJE_NO_LOGUEO = "No esta permitido iniciar sesion, cualquier inquietud comuniquese con sistemas.";
    private static final String MENSAJE_CONTRASENA = "El usuario o contraseña son incorrectos";

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
        theActorInTheSpotlight()
            .should(GivenWhenThen.seeThat(Mensaje.deBienvenidaEs(strMensaje)).orComplainWith(ElUsuarioNoSeAutenticoAssertion.class, ElUsuarioNoSeAutenticoAssertion.MENSAJE_LOGUEO_NO_EXITOSO));
    }

    @Entonces("^el asesor debería ver un mensaje de error$")
    public void verificarMensajeError() {
        theActorInTheSpotlight().should(seeThat(ElMensaje.deError(), anyOf(equalTo(MENSAJE_NO_LOGUEO), equalTo(MENSAJE_CONTRASENA))));
    }

    @Cuando("^ingresa su información de autenticación con contraseña errada$")
    public void ingresarContrasenaErrada() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.lasCredencialesErradas(de().unUsuarioContrasenaInvalida()));
    }

    @Cuando("^ingresa su información de autenticación con usuario errado$")
    public void ingresarUsuarioErrado() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.lasCredencialesErradas(de().unUsuarioInvalido()));
    }

    @Cuando("^ingresa su información de autenticación con data errada$")
    public void ingresarDataErrada() {
        theActorInTheSpotlight().attemptsTo(
            Ingresa.lasCredencialesErradas(de().unUsuarioDataInvalida()));
    }
}