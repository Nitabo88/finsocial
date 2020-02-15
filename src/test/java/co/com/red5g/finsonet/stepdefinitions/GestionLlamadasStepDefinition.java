package co.com.red5g.finsonet.stepdefinitions;

import co.com.red5g.finsonet.exceptions.NoSeVeElCreditoException;
import co.com.red5g.finsonet.questions.Credito;
import co.com.red5g.finsonet.questions.LaNoCreacionDelCredito;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;


public class GestionLlamadasStepDefinition {

    @Dado("que un (.*) quiere asignar una llamada para el credito")
    public void queUnAsesorQuiereAsignarUnaLlamadaParaElCredito(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Loguearse.enFinsonet());
                //Ubicarse.enNuevoCredito());

    }


    @Cuando("^el ingresa el numero del credito (\\d+) realiza el proceso de asignacion$")
    public void elIngresaElNumeroDelCreditoRealizaElProcesoDeAsignacion(int arg1) {



    }

    @Entonces("^el credito quedara asignado al asesor$")
    public void elCreditoQuedaraAsignadoAlAsesor() {


    }

    @Dado("^que un asesor quiere confirmar una llamada para el credito$")
    public void queUnAsesorQuiereConfirmarUnaLlamadaParaElCredito() {


    }

    @Cuando("^el ingresa el numero del credito (\\d+) realiza el proceso de gestion$")
    public void elIngresaElNumeroDelCreditoRealizaElProcesoDeGestion(int arg1) {

    }


}
