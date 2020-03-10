package co.com.red5g.stepdefinitions;

import co.com.red5g.task.*;
import co.com.red5g.userinterfaces.OriginacionPage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AprobStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) quiere hacer una aprobacion")
    public void queDanielaQuiereHacerUnaAprobacion(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                JavaScriptClick.on(OriginacionPage.ORIGINACION_BUTTON));
                JavaScriptClick.on(OriginacionPage.LINK_APROBACION);

    }

    @Cuando("se apruebe el credito del usuario identificado con (.*)")
    public void seApruebeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
        theActorInTheSpotlight().attemptsTo(
                AprobarCred.aprobacionCred(cedula));
    }

    @Entonces("el crédito debe pasar a incorporacion")
    public void elCreditoDebePasarAIncorporacion() {
        // Write code here that turns the phrase above into concrete actions
        throw new cucumber.api.PendingException();
    }
}
