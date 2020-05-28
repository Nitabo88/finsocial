package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class NegacionChequeoDocumentoCrediHuy implements Task {
    private static final int TIEMPO = 300;
    private final ChequeoDocumento chequeoDocumento;

    public NegacionChequeoDocumentoCrediHuy(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
                MoveMouse.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
                JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY.of(numeroCredito)),
                Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
                Click.on(BTN_ACEPTAR_HUY),
                Click.on(BTN_ACEPTAR_ACCION_HUY),
                WaitFor.seconds(2),
                Click.on(BTN_NEGAR),
                SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
                Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
                Click.on(BTN_ENVIAR_NEGACION),
                WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS_NEGADO, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(BTN_OK));
    }
}
