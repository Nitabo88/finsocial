package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException;
import co.com.red5g.finsonet.interacions.Abrir;
import co.com.red5g.finsonet.questions.Mensaje;
import co.com.red5g.finsonet.tasks.Ingresar;
import co.com.red5g.finsonet.userinterfaces.LoginFinsocialPage;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static co.com.red5g.finsonet.exceptions.ElUsuarioNoSeAutenticoException.MENSAJE_LOGUEO_NO_EXITOSO;
import static co.com.red5g.finsonet.models.builder.CredencialesBuilder.de;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class LoginFinsonetStepDefinition {
    private LoginFinsocialPage loginFinsocialPage;

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Dado("que (.*) quiere acceder a finsonet")
    public void ingresarPagina(String nombreActor) {
        theActorCalled(nombreActor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().wasAbleTo(Abrir.laPaginaPrincipal());
    }

    @Cuando("(.*) se autentica en finsonet con el usuario (.*), la contraseña (.*) y el codigo (.*)")
    public void autenticarUsuario(String actor, String usuario, String contrasena, String codigo) {
        theActorCalled(actor).can(BrowseTheWeb.with(navegador));
        theActorInTheSpotlight().attemptsTo(
                Abrir.laPaginaPrincipal(),
                Ingresar.lasCredenciales(de().unUsuarioBasico(usuario, contrasena, codigo))
        );
    }

    @Cuando("ingresa su informacion de autenticacion")
    public void diligenciarInformacionIngreso() {
        theActorInTheSpotlight().attemptsTo(Ingresar.lasCredenciales(de().unUsuarioBasico()));
    }

    @Entonces("el debería ver (.*)")
    public void verificarIngreso(String strMensaje) {
        theActorInTheSpotlight().should(seeThat(Mensaje.deBienvenidaEs(strMensaje)).orComplainWith(ElUsuarioNoSeAutenticoException.class,MENSAJE_LOGUEO_NO_EXITOSO));
    }
}
