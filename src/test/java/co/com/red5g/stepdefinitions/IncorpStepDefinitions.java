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

public class IncorpStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("que (.*) quiere hacer una incorporacion")
    public void queDanielaQuiereHacerUnaIncroporacion(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                Click.on(OriginacionPage.ORIGINACION_BUTTON));
                AbrirEstadoOrig.elEstado("incorporacion");
    }

    @Cuando("se incorpore el credito del usuario identificado con cedula")
    public void seIncorporeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
        theActorInTheSpotlight().attemptsTo(
                IncorpCred.aprobacionIncorp(cedula));
    }

    @Entonces("el crédito debe pasar a Formalizacion")
    public void elCréditoDebePasarAFormalizacion() {

    }

}
