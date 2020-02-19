package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.tasks.CrearSolicitudContact;
import co.com.red5g.finsonet.tasks.RealizarVeto;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder.un;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class EquipoSatisfaccionStepDefinition {

    @Dado("^que el (.*) generar una PQR$")
    public void queElAsesorGenerarUnaPQR(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Ubicarse.enContact()
        );
    }

    @Cuando("^el asesor genere una nueva PQR$")
    public void genereUnaNuevaPQR() {
        theActorInTheSpotlight().attemptsTo
                (CrearSolicitudContact.Para(un().Usuario())
                );
    }

    @Entonces("^el asesor deberia verlo en listado de nuevos ingresos$")
    public void elAsesorDeberiaVerloEnListadoDeNuevosIngresos() {
    }
}
