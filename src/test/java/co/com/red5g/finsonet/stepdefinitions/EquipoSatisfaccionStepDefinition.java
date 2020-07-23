package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.questions.LaSolicitud;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder.aUn;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class EquipoSatisfaccionStepDefinition {

    private static final String GESTION = "NUEVO";

    @Dado("^que el (.*) generar una PQR$")
    public void queElAsesorGenerarUnaPQR(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Ubicarse.enElModuloEquipoSatisfaccion()
        );
    }

    @Cuando("^el asesor genere una nueva PQR$")
    public void genereUnaNuevaPQR() {
        theActorInTheSpotlight().attemptsTo
                (Diligencia.unaNuevaSolicitud(aUn().cliente()));
    }

    @Entonces("^el asesor deberá verlo en el listado de nuevos ingresos$")
    public void verificarNuevoIngreso() {
        theActorInTheSpotlight().should(seeThat(LaSolicitud.deContacto(), containsString(GESTION)));
    }
}
