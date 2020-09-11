package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.models.builders.VetadosBuilder.a;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.finsonet.exceptions.NoSeMarcaElVetoAssertion;
import co.com.red5g.finsonet.questions.Veto;
import co.com.red5g.finsonet.questions.factories.ElMensaje;
import co.com.red5g.finsonet.tasks.Eliminar;
import co.com.red5g.finsonet.tasks.IntentaCrear;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;

public class VetadosStepDefinition {

    @Before("@Vetados")
    public void quitarMarca() {
        theActorCalled("Administrador").attemptsTo(Eliminar.elVeto(a().unCliente()));
    }

    @Dado("que el (.*) quiere asignar un veto interno")
    public void ubicarseEnVetados(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
            Ubicarse.enVetados()
        );
    }

    @Cuando("el asesor asigne un veto interno a un cliente")
    public void asignarVetoInterno() {
        theActorInTheSpotlight().attemptsTo
            (Diligencia.elVetoInterno(a().unCliente()));
    }

    @Entonces("el asesor deberá ver al cliente en el listado de vetados")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should
            (GivenWhenThen.seeThat(Veto.existe(a().unCliente())).orComplainWith(NoSeMarcaElVetoAssertion.class, NoSeMarcaElVetoAssertion.MENSAJE_VETO));
    }

    @Y("el asesor no deberá poder crear un crédito con este usuario")
    public void crearCredito() {
        String NO_REGISTRA = "NO REGISTRA";
        theActorInTheSpotlight().attemptsTo(
            IntentaCrear.unCredito(a().unCliente()));
        theActorInTheSpotlight()
            .should(GivenWhenThen.seeThat(ElMensaje.noRegistra(), equalTo(NO_REGISTRA)));
    }
}
