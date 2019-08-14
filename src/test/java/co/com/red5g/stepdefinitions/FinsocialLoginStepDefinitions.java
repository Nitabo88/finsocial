package co.com.red5g.stepdefinitions;

import co.com.red5g.question.VerificarIngreso;
import co.com.red5g.task.Ingreso;
import co.com.red5g.task.Sesion;

import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;


public class FinsocialLoginStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("(.*) quiere acceder a finsocial")
    public void quiereAccederAFinsocial(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
        Sesion.sesion());
    }

    @Cuando("el ingresa el (.*) la (.*) y (.*)")
    public void elIngresaElLaY(String usuario, String contrasena, String codigo) {
      theActorInTheSpotlight().attemptsTo(Ingreso.usuario(usuario).de(contrasena).a(codigo));
    }

    @Entonces("el debería ver  \"(.*)\" de la pagina")
    public void elDeberíaAccederALaPagina(String texto) {
        theActorInTheSpotlight().should(seeThat(VerificarIngreso.is(),
                equalTo(texto)));;

    }
}
