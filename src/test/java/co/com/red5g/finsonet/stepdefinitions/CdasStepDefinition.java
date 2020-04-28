package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.AccionCdasBuilder.con;
import static co.com.red5g.finsonet.models.builders.CreditoBuilder.la;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.finsonet.questions.GestionDocumental;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class CdasStepDefinition {

    @Dado("^que (.*) esta en el modulo de CDAS con la informacion previa completa$")
    public void ingresarModulaCdasCompleto(String actor) {
        theActorCalled(actor).attemptsTo(Ingresa.alModuloCDASCompleto(la().informacionDelCreditoCdasCompleto()));
    }

    @Dado("^que (.*) esta en el modulo de CDAS$")
    public void ingresarModuloCdas(String actor) {
        theActorCalled(actor).attemptsTo(Ingresa.alModuloCDAS(la().informacionDelCreditoCdas()));
    }

    @Cuando("^el asesor diligencia los CDAS del credito como completos$")
    public void diligenciarCdas() {
        theActorInTheSpotlight().attemptsTo(Diligencia.laInformacionDeLosDocumentos(con().vistoBueno()));
    }

    @Cuando("^el asesor diligencia los CDAS del credito con excepcion$")
    public void diligenciarCdasExcepcion() {
        theActorInTheSpotlight().attemptsTo(Diligencia.laInformacionDeLosDocumentos(con().excepcion()));
    }

    @Entonces("^el podra ver el credito en estado (.*)$")
    public void verificarEstadoCompleto(String estado) {
        theActorInTheSpotlight().should(seeThat(GestionDocumental.estado(), equalTo(estado)));
    }
}
