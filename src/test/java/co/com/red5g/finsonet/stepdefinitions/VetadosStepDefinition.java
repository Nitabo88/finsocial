package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.finsonet.exceptions.NoSeMarcaElVeto.MENSAJE_VETO;
import static co.com.red5g.finsonet.models.builders.VetadosBuilder.a;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.exceptions.NoSeMarcaElVeto;
import co.com.red5g.finsonet.questions.Veto;
import co.com.red5g.finsonet.tasks.Eliminar;
import co.com.red5g.finsonet.tasks.Intenta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;

public class VetadosStepDefinition {

  private static final String ACTOR = "Administrador";

   @Before("@Vetados")
    public void quitarMarca() {
     theActorCalled(ACTOR).wasAbleTo(Eliminar.elVeto(a().unCliente()));
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
                (Diligencia.ElVetoInterno(a().unCliente())
        );
    }

    @Entonces("el asesor deberia ver al cliente en el listado de vetados")
    public void verificarCreacionCredito() {
        theActorInTheSpotlight().should
                (seeThat(Veto.existe(a().unCliente())).orComplainWith(NoSeMarcaElVeto.class,MENSAJE_VETO));
    }

    @Y("^el asesor no deberia poder crear un credito con este usuario$")
    public void IntentarCrearCredito() {
       theActorInTheSpotlight().attemptsTo(
               Intenta.crearUnCredito()
       );
    }
}
