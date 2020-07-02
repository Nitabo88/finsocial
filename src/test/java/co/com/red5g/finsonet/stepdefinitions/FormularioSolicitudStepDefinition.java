package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder.con;
import static co.com.red5g.finsonet.tasks.InformacionCreditoLibranza.CEDULA_ACTOR;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.CoreMatchers.equalTo;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.questions.ElFormulario;
import co.com.red5g.finsonet.questions.factories.ElCredito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class FormularioSolicitudStepDefinition {

    private static final Integer CODIGO_RESPUESTA = 200;

    @Dado("que un (.*) quiere llenar el formulario de solicitud de crédito")
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

    @Entonces("el debería visualizar el crédito del cliente")
    public void verificarSolicitudCredito() {
        theActorInTheSpotlight()
            .should(seeThat(ElFormulario.fueEnviado()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
    }

    @Cuando("^diligencia el formulario de un cliente por back end$")
    public void diligenciaFormularioSolicitudBackEnd() {
        theActorInTheSpotlight().attemptsTo(
            Diligencia.laSolicitudDeCreditoBackEnd(de().unUsuarioAdministrador(), con().informacionLibranza(), theActorInTheSpotlight().recall(CEDULA_ACTOR))
        );
    }

    @Entonces("^el debería visualizar el crédito en estado OK$")
    public void verificarSolicitudCreditoBackend() {
        theActorInTheSpotlight().should(seeThat("El codigo de respuesta es:", ElCredito.seProceso(), equalTo(CODIGO_RESPUESTA)));
    }
}