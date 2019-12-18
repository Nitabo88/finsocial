package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static co.com.red5g.finsonet.questions.SeleccionarColumna.FECHA;
import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PENDIENTE;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_COLUMNAS_CHEQUEO_DOCUMENTOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Estado implements Task {
    private ChequeoDocumento chequeoDocumento;

    public static Performable ubicarseConDocumento() {
        return instrumented(Estado.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String cedula = actor.recall(CEDULA_ACTOR);
        seleccionarColumna(LST_COLUMNAS_CHEQUEO_DOCUMENTOS, cedula, actor.recall(FECHA_SOLICITUD_CREDITO)).answeredBy(actor);
        actor.attemptsTo(
                JavaScriptClick.on(BTN_PENDIENTE.of(cedula,actor.recall(FECHA))));
    }
}

