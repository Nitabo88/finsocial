package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.tasks.InformacionCredito.FECHA_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ElFormulario implements Question<Boolean> {

    public static ElFormulario fueEnviado() {
        return new ElFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        cambiarPestana();
        actor.attemptsTo(
            Click.on(LNK_HOME),
            WaitUntil.the(LNK_ORIGINACION, isEnabled()).forNoMoreThan(15).seconds(),
            Click.on(LNK_ORIGINACION));
        WebElementFacade lstFila = seleccionarFila(LST_FILA_CHEQUEO_DOCUMENTOS, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_CREDITO)).answeredBy(actor);
        return lstFila.isPresent();
    }
}
