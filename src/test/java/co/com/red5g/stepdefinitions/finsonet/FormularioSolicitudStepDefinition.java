package co.com.red5g.stepdefinitions.finsonet;

import static co.com.red5g.models.builders.finsonet.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.exceptions.finsonet.NoSeVeElCreditoException;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ubicarse;
import co.com.red5g.questions.ElFormulario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class FormularioSolicitudStepDefinition {

    @Dado("que un (.*) quiere llenar el formulario de solicitud de credito")
    public void ingresarFormularioSolicitud(String actor) {
        theActorCalled(actor).attemptsTo(
                Ubicarse.enElFormulario(la().informacionDelCreditoFormulario())
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
            .should(GivenWhenThen.seeThat(ElFormulario.fueEnviado()).orComplainWith(NoSeVeElCreditoException.class, NoSeVeElCreditoException.MENSAJE_CREDITO));
    }
}