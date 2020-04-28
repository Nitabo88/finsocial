package co.com.red5g.stepdefinitions.finsonet;

import static co.com.red5g.models.builders.finsonet.VetadosBuilder.a;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.exceptions.finsonet.NoSeMarcaElVetoException;
import co.com.red5g.questions.ElMensaje;
import co.com.red5g.questions.Veto;
import co.com.red5g.tasks.finsonet.Eliminar;
import co.com.red5g.tasks.finsonet.IntentaCrear;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ubicarse;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.GivenWhenThen;

public class VetadosStepDefinition {

   private static final String ACTOR = "Administrador";
   private static final String NO_REGISTRA = "NO REGISTRA";


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
          (GivenWhenThen.seeThat(Veto.existe(a().unCliente())).orComplainWith(NoSeMarcaElVetoException.class, NoSeMarcaElVetoException.MENSAJE_VETO));
    }

    @Y("el asesor no deberia poder crear un credito con este usuario")
    public void IntentarCrearCredito() {
      theActorInTheSpotlight().attemptsTo(
          IntentaCrear.unCredito(a().unCliente()));
      theActorInTheSpotlight()
          .should(GivenWhenThen.seeThat(ElMensaje.noRegistra(), equalTo(NO_REGISTRA)));
    }
}
