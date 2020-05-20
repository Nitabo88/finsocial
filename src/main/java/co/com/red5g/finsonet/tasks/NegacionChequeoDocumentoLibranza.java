package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

public class NegacionChequeoDocumentoLibranza implements Task {
    private static final int TIEMPO = 120;
    private ChequeoDocumento chequeoDocumento;

    public NegacionChequeoDocumentoLibranza(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                MoveMouse.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)),
                JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)),
                Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
                Click.on(BTN_ACEPTAR1_POP_UP),
                Click.on(BTN_PAPELERIA.of(chequeoDocumento.getAfianzado())),
                Click.on(BTN_ACEPTAR2_POP_UP),
                Click.on(BTN_ACEPTAR),
                WaitUntil.the(BTN_NEGAR_LIBRANZA, isPresent()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_NEGAR_LIBRANZA),
                SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO_NEGACION),
                Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_DETALLE),
                Click.on(BTN_ACEPTAR_NEGACION),
                WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_ACEPTAR2));
    }
}
