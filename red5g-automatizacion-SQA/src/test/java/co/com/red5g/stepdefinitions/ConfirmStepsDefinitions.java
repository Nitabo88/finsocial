package co.com.red5g.stepdefinitions;

import co.com.red5g.task.*;
import co.com.red5g.userinterfaces.OriginacionPage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class ConfirmStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) quiere hacer una confirmacion")
    public void queDanielaQuiereHacerUnaConfirmacion(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                Click.on(OriginacionPage.ORIGINACION_BUTTON));
                AbrirEstadoOrig.elEstado("Confirmación");

    }
    @Cuando("se confirme el credito del usuario identificado con (.*)")
    public void seConfirmeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
        theActorInTheSpotlight().attemptsTo(
                ConfirmarCred.aprobacionConfirm(cedula));
    }

    @Entonces("el crédito debe pasar a aprobacion credito")
    public void elCréditoDebePasarAAprobacionCredito() {

    }



}
