package co.com.red5g.stepdefinitions;

import co.com.red5g.question.RegistroChequeo;
import co.com.red5g.task.*;
import co.com.red5g.userinterfaces.ConfirmPage;
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

import javax.swing.*;

import static co.com.red5g.userinterfaces.OriginacionPage.LINK_CONFIRMACION;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;
import static org.hamcrest.core.IsEqual.equalTo;


    public class ConfirmStepsDefinitions {

        @Before
        public void setTheStage() {
            OnStage.setTheStage(new OnlineCast());
        }

        @Dado("que (.*) quiere hacer una Confirmación")
        public void queDanielaQuiereHacerUnaConfirmacion(String nombreActor) {
            theActorCalled(nombreActor).attemptsTo(
                    Sesion.sesion(),
                    Ingreso.usuario("daramirez").de("Dramirez.1609@").a("123456"),
                    // WaitUntil.the(OriginacionPage.ORIGINACION_BUTTON,isCurrentlyVisible()),
                    Click.on(OriginacionPage.ORIGINACION_BUTTON));
            //WaitUntil.the(OriginacionPage.LINK_CONFIRMACION, isCurrentlyVisible());
              Click.on(OriginacionPage.LINK_TESORERIA);
            //System.out.println(OriginacionPage.LINK_CONFIRMACION);
            //JOptionPane.showMessageDialog(null, OriginacionPage.LINK_CONFIRMACION);

        }
    }
/*
        @Cuando("se confirme el credito del usuario identificado con (.*)")
        public void seConfirmeElCreditoDelUsuarioIdentificadoConCedula(int cedula) {
            theActorInTheSpotlight().attemptsTo(
                    ConfirmarCred.aprobacionConfirm(cedula));
        }


        @Entonces("Daniela deberia ver \"(.*)\" en la pagina")
        public void danielaDeberiaVerEnLaPagina(String texto) {
            theActorInTheSpotlight().should(seeThat(RegistroConfirm.is(),
                    equalTo(texto)));
        }
    }
*/

