package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.questions.Credito;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.tasks.Diligenciar.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.finsonet.userinterfaces.MisEstadosPage.LST_FILA_DOCUMENTOS;
import static co.com.red5g.finsonet.utils.UtileriaFechas.masUnMinuto;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class Estado implements Task {
    private ChequeoDocumento chequeoDocumento;


    public static Performable diligenciar(ChequeoDocumento chequeoDocumento) { return instrumented(Estado.class, chequeoDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_PENDIENTE, isCurrentlyEnabled()),
                Click.on(BTN_PENDIENTE),
                Click.on(LST_MODAL_DEFAULT),
                Click.on(LST_MODAL_CHECK1),
                Enter.theValue("Datos incompletos").into("//*[@id=\"area\"]"),
                Click.on(BTN_MODAL_ENVIAR));
    }

    public Estado(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }
    public static Credito ubicarseConDocumento() {
        return new Credito();
    }

    public Boolean answeredBy(Actor actor) {
        boolean columna = LST_FILA_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR),actor.recall(FECHA_SOLICITUD_CREDITO)).resolveFor(actor).isPresent();
        if(!columna){
            columna =  LST_FILA_DOCUMENTOS.of(actor.recall(CEDULA_ACTOR),masUnMinuto(actor.recall(FECHA_SOLICITUD_CREDITO))).resolveFor(actor).isPresent();
        }
        return columna;
    }
}

