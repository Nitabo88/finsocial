package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.LlamadasPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;


public class LlamadasStepDefinition {

    @Dado("que un (.*) quiere asignar una llamada para el credito")
    public void queUnAsesorQuiereAsignarUnaLlamadaParaElCredito(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Ubicarse.enLlamada()
        );
    }

    @Cuando("el realiza el proceso de asignacion")
    public void elRealizaElProcesoDeAsignacion() {
        String numeroCredito = "83570";
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(CHK_ID_LLAMADAS.of(numeroCredito), isPresent()).forNoMoreThan(100).seconds(),
                JavaScriptClick.on(CHK_ID_LLAMADAS.of(numeroCredito)),
                WaitUntil.the(BTN_ASIGNACION_HUY, isPresent()).forNoMoreThan(100).seconds(),
                JavaScriptClick.on(BTN_ASIGNACION_HUY)
        );

        theActorInTheSpotlight().should(seeThat(ElCredito.asignado()));


    }

    @Y("^procesa la llamada$")
    public void procesaLaLlamada() {

    }

    @Entonces("^el credito quedara confirmado$")
    public void elCreditoQuedaraConfirmado() {
        //el question es cuando el credito quedo melo.
    }
}
