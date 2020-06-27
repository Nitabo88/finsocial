package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.CredencialesBuilder.de;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoAssertion;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import co.com.red5g.finsonet.questions.ElFormulario;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;

public class FormularioSolicitudStepDefinition {

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
    public void verificarSolicitudCrecito() {
        theActorInTheSpotlight()
            .should(GivenWhenThen.seeThat(ElFormulario.fueEnviado()).orComplainWith(NoSeVeElCreditoAssertion.class, NoSeVeElCreditoAssertion.MENSAJE_CREDITO));
    }

    @Cuando("^diligencia el formulario de un cliente por back end$")
    public void diligenciaFormularioSolicitudBackEnd() {
        theActorInTheSpotlight().attemptsTo(
                Diligencia.laSolicitudDeCreditoBackEnd(de().unUsuarioAdministrador(),con().informacionLibranza(),la().informacionDelCreditoFormulario())
        );
    }
}