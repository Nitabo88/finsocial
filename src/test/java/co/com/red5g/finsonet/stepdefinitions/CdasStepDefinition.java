package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.AccionCdasBuilder.con;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.GestionDocumental;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CdasStepDefinition {

    @Dado("^que (.*) esta en el modulo de CDAS$")
    public void ingresarModuloCdas(String actor) {
        theActorCalled(actor).attemptsTo(Ingresa.alModuloCDAS());
    }

    @Cuando("^el asesor diligencia los CDAS del credito$")
    public void diligenciarCdas() {
        theActorInTheSpotlight().attemptsTo(Diligencia.laInformacionDeLosDocumentos(con().vistoBueno()));
    }

    @Entonces("^el podra ver el credito en estado completo$")
    public void verificarEstadoCompleto() {
        theActorInTheSpotlight().should(seeThat(GestionDocumental.completa(), containsString("INCOMPLETO")));
    }
}