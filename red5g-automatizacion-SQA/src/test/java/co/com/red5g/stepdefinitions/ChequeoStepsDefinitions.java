package co.com.red5g.stepdefinitions;

import co.com.red5g.task.AbrirEstadoOrig;
import co.com.red5g.task.ChequearCred;
import co.com.red5g.task.Ingreso;
import co.com.red5g.task.Sesion;
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

public class ChequeoStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) quiere hacer un chequeo documentos")
    public void queDanielaQuiereHacerUnChequeoDocumentos(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                Click.on(OriginacionPage.ORIGINACION_BUTTON));
                AbrirEstadoOrig.elEstado("Chequeo de Documentos");
    }

    @Cuando("se chequee el credito del usuario identificado con (.*)")
    public void seChequeeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
        theActorInTheSpotlight().attemptsTo(
                ChequearCred.aprobacionChequeo(cedula));
    }

    @Entonces("el crédito debe pasar a confirmación")
    public void elCréditoDebePasarAConfirmación() {
        //theActorInTheSpotlight().should(GivenWhenThen.seeThat());


    }
}
