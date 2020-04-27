package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder.aUn;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EquipoSatisfaccionStepDefinition {

    @Dado("^que el (.*) generar una PQR$")
    public void queElAsesorGenerarUnaPQR(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Ubicarse.enElModuloContact()
        );
    }

    @Cuando("^el asesor genere una nueva PQR$")
    public void genereUnaNuevaPQR() {
        theActorInTheSpotlight().attemptsTo
                (Diligencia.unaNuevaSolicitudContact(aUn().Cliente()));
    }

    @Entonces("^el asesor deberia verlo en listado de nuevos ingresos$")
    public void elAsesorDeberiaVerloEnListadoDeNuevosIngresos() {
    }
}
