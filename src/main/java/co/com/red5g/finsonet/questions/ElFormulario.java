package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElFormulario implements Question<Boolean> {

    private static final int TIEMPO = 30;

    public static Question<Boolean> fueEnviado() {
        return new ElFormulario();
    }

    @Override
    public Boolean answeredBy(final Actor actor) {
        actor.attemptsTo(
            WaitUntil.the(LNK_HOME, isVisible()).forNoMoreThan(ElFormulario.TIEMPO).seconds(),
            JavaScriptClick.on(LNK_HOME),
            WaitUntil.the(LNK_ORIGINACION, isVisible()).forNoMoreThan(ElFormulario.TIEMPO).seconds(),
            JavaScriptClick.on(LNK_ORIGINACION));
        final String numeroCredito = actor.recall(NUMERO_CREDITO);
        return LST_FILA_CHEQUEO_DOCUMENTOS.of(numeroCredito).resolveFor(actor).isPresent();
    }
}
