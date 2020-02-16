package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.questions.Veto;
import co.com.red5g.finsonet.tasks.Eliminar;
import co.com.red5g.finsonet.tasks.ModuloVetados;
import co.com.red5g.finsonet.tasks.RealizarVeto;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static co.com.red5g.finsonet.models.builders.VetadosBuilder.a;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class VetadosStepDefinition {
    private static final String ESTADO_NO_EXITOSO = "El cliente ya tiene un veto interno.";

    @Before("Vetados")
    public void quitarMarca() {
        theActorInTheSpotlight().attemptsTo(Eliminar.elVeto(a().unCliente()));
    }

    @Dado("que el (.*) quiere aginar un veto interno")
    public void ubicarseEnVetados(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Loguearse.enFinsonet(),
                ModuloVetados.ubicarseEnVetados()
        );
    }

    @Cuando("el asesor asigne un veto interno a un cliente")
    public void asignarVetoInterno() {
        theActorInTheSpotlight().attemptsTo
                (RealizarVeto.interno(a().unCliente())
        );
    }

    @Entonces("el asesor deberia verlo en listado de vetos")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should
                (seeThat(Veto.existe()));
    }
}
