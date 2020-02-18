package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeVeElCredito.MENSAJE_CREDITO;
import static co.com.red5g.finsonet.questions.ElFormulario.fueEnviado;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class FormularioSolicitudStepDefinition {

    @Dado("que un (.*) quiere llenar el formulario de solicitud de credito")
    public void ingresarFormularioSolicitud(final String actor) {
        theActorCalled(actor).attemptsTo(
                Ubicarse.enElFormulario()
        );
    }

    @Cuando("diligencia el formulario de un cliente en su totalidad")
    public void diligenciarFormularioSolicitudCredito() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laSolicitudDeCredito()
        );
    }

    @Entonces("el debería visualizar el credito del cliente")
    public void verificarSolicitudCrecito() {
        theActorInTheSpotlight()
            .should(seeThat(fueEnviado()).orComplainWith(NoSeVeElCredito.class, MENSAJE_CREDITO));
    }
}