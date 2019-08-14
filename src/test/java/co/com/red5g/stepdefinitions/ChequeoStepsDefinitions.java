package co.com.red5g.stepdefinitions;


import co.com.red5g.question.RegistroChequeo;
import co.com.red5g.question.VerificarIngreso;
import co.com.red5g.task.AbrirEstadoOrig;
import co.com.red5g.task.ChequearCred;
import co.com.red5g.task.Ingreso;
import co.com.red5g.task.Sesion;
import co.com.red5g.userinterfaces.OriginacionPage;
import cucumber.api.java.Before;
import cucumber.api.java.ast.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static org.hamcrest.Matchers.equalTo;

public class ChequeoStepsDefinitions {

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que (.*) quiere hacer un chequeo documentos")
    public void queDanielaQuiereHacerUnChequeoDocumentos(String nombreActor) {
        theActorCalled(nombreActor).attemptsTo(
                Sesion.sesion(),
                Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                WaitUntil.the(OriginacionPage.ORIGINACION_BUTTON,isCurrentlyVisible()),
                JavaScriptClick.on(OriginacionPage.ORIGINACION_BUTTON),
                JavaScriptClick.on(OriginacionPage.LINK_CHEQUEO_DOCUMENTOS));
                //AbrirEstadoOrig.elEstado("Chequeo de Documentos");
    }

    @Cuando("se chequee el credito del usuario identificado con (.*)")
    public void seChequeeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
        theActorInTheSpotlight().attemptsTo(
                ChequearCred.aprobacionChequeo(cedula));
    }


    @Entonces("Daniela deberia ver \"(.*)\" de la pagina")
    public void danielaDeberiaVerDeLaPagina(String texto) {
        theActorInTheSpotlight().should(seeThat(RegistroChequeo.is(),
                    equalTo(texto)));
        }



    }

