package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeMarcaElVetoAssertion;
import co.com.red5g.finsonet.questions.ElMensaje;
import co.com.red5g.finsonet.questions.Veto;
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

import static co.com.red5g.finsonet.models.builders.VetadosBuilder.a;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class VetadosStepDefinition {

    private static String ACTOR = "Administrador";
    private static String NO_REGISTRA = "NO REGISTRA";


    @Before("@Vetados")
    public void quitarMarca() {
        theActorCalled(ACTOR).attemptsTo(Eliminar.elVeto(a().unCliente()));
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

    @Entonces("el asesor deberia ver al cliente en el listado de vetados")
    public void verificarCreacionCredito() {
      theActorInTheSpotlight().should
          (GivenWhenThen.seeThat(Veto.existe(a().unCliente())).orComplainWith(NoSeMarcaElVetoAssertion.class, NoSeMarcaElVetoAssertion.MENSAJE_VETO));
    }

    @Y("el asesor no deberia poder crear un credito con este usuario")
    public void IntentarCrearCredito() {
      theActorInTheSpotlight().attemptsTo(
          IntentaCrear.unCredito(a().unCliente()));
      theActorInTheSpotlight()
          .should(GivenWhenThen.seeThat(ElMensaje.noRegistra(), equalTo(NO_REGISTRA)));
    }
}
