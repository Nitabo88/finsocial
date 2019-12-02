package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.CambiarPestana.cambiarPestana;
import static co.com.red5g.finsonet.tasks.Diligenciar.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_FILA_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ElFormulario implements Question<Boolean> {

    public static ElFormulario fueEnviado() {
        return new ElFormulario();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        cambiarPestana();
        actor.attemptsTo(
                Click.on(LNK_HOME),
                WaitUntil.the(LNK_ORIGINACION, isClickable()).forNoMoreThan(6).seconds(),
                Click.on(LNK_ORIGINACION));
        boolean fila = LST_FILA_CHEQUEO_DOCUMENTOS .of(actor.recall(CEDULA_ACTOR),actor.recall(FECHA_SOLICITUD_CREDITO)).resolveFor(actor).isPresent();
        if(!fila){
            fila = LST_FILA_CHEQUEO_DOCUMENTOS .of(actor.recall(CEDULA_ACTOR),masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO))).resolveFor(actor).isPresent();
        }
        return fila;    }
}
