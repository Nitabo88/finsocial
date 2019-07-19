package co.com.red5g.stepdefinitions;

import co.com.red5g.question.VerificarEstado;
import co.com.red5g.task.AbrirEstadoOrig;
import co.com.red5g.task.Ingreso;
import co.com.red5g.task.Sesion;
import co.com.red5g.userinterfaces.OriginacionPage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.IsEqual.equalTo;

public class OrigStepDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) ingresar a originación para verificar estados del credito")
    public void queQuiereIngresarAOriginaciónParaVerificarEstadosDelCredito(String nombreActor) {
                theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                Click.on(OriginacionPage.ORIGINACION_BUTTON));
    }

    @Cuando("ella ingrese a \"(.*)\"")
    public void ingreseAOriginacionA(String estadoOrig) {
               theActorInTheSpotlight().attemptsTo(
               AbrirEstadoOrig.elEstado(estadoOrig));
    }

    @Entonces("ella deberia ver el menu de \"(.*)\"")
    public void seVisualizaraElMenuDe(String estadoOrig) {
        theActorInTheSpotlight().should(seeThat(VerificarEstado.is(estadoOrig),
                equalTo(estadoOrig)));
    }
}


