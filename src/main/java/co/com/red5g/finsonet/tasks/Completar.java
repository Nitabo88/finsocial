package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

import java.util.List;

import static co.com.red5g.finsonet.questions.SeleccionarColumna.FECHA;
import static co.com.red5g.finsonet.questions.SeleccionarColumna.seleccionarColumna;
import static co.com.red5g.finsonet.tasks.Diligenciar.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.Ingresa.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Completar implements Task {
    private ChequeoDocumento chequeoDocumento;

    public Completar(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    public static Performable elChequeoDeDocumentos(ChequeoDocumento chequeoDocumento) {
        return instrumented(Completar.class, chequeoDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String cedula = actor.recall(CEDULA_ACTOR);
        List<WebElementFacade> lstChequeoDocumentos = seleccionarColumna(LST_COLUMNAS_CHEQUEO_DOCUMENTOS, cedula, actor.recall(FECHA_SOLICITUD_CREDITO)).answeredBy(actor);
        String nombre = lstChequeoDocumentos.get(1).getText();
        actor.attemptsTo(
                JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(cedula, actor.recall(FECHA), nombre)),
                Click.on(BTN_PAPELERIA_ANTIGUA),
                Click.on(BTN_ACEPTAR1_POP_UP),
                Click.on(BTN_ACTIVAL),
                Click.on(BTN_ACEPTAR2_POP_UP),
                Click.on(BTN_ACEPTAR),
                Enter.theValue(chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
                Enter.theValue(chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
                Click.on(BTN_GUARDAR)
        );
    }
}