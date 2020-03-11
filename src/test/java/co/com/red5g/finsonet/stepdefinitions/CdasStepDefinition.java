package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class CdasStepDefinition {

    @Dado("^que (.*) esta en el modulo de CDAS$")
    public void ingresarModuloCdas(String actor) {
        theActorCalled(actor).attemptsTo(Ingresa.alModuloCDAS());
    }

    @Cuando("^el asesor diligencia los CDAS del credito$")
    public void elAsesorDiligenciaLosCDASDelCredito() {

    }

    @Entonces("^el podra ver el credito en estado completo$")
    public void elPodraVerElCreditoEnEstadoCompleto() {
    }
}
