package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException;
import co.com.red5g.finsonet.questions.ElFormulario;
import co.com.red5g.finsonet.tasks.Diligenciar;
import co.com.red5g.finsonet.tasks.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCreditoCreadoException.MENSAJE_CREDITO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FormularioSolicitudStepDefinition {

    @Dado("que un (.*) quiere llenar el formulario de solicitud de credito")
    public void ingresarFormularioSolicitud(String actor) {
        theActorCalled(actor).attemptsTo(
                Ubicarse.enElFormulario()
        );
    }

    @Cuando("diligencia el formulario de un cliente en su totalidad")
    public void diligenciarFormularioSolicitudCredito() {
        theActorInTheSpotlight().attemptsTo(
                Diligenciar.laSolicitudDeCredito()
        );
    }

    @Entonces("el debería visualizar el credito del cliente")
    public void verificarSolicitudCrecito() {
        theActorInTheSpotlight().should(seeThat(ElFormulario.fueEnviado()).orComplainWith(NoSeVeElCreditoCreadoException.class, MENSAJE_CREDITO));
    }
}