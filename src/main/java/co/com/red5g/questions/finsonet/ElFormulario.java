package co.com.red5g.questions.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.userinterfaces.finsonet.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElFormulario implements Question<Boolean> {

    private static final int TIEMPO = 100;

    public static Question<Boolean> fueEnviado() {
        return new ElFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            WaitUntil.the(LNK_HOME, isVisible()).forNoMoreThan(TIEMPO).seconds(),
            Click.on(LNK_HOME),
            WaitFor.seconds(2),
            JavaScriptClick.on(LNK_ORIGINACION),
            MoveMouse.to(LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA.of(numeroCredito)));
        return LST_FILA_CHEQUEO_DOCUMENTOS_LIBRANZA.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
