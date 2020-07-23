package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR_ACCION_HUY;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR_HUY;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ENVIAR_NEGACION;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_NEGAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_OK;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_CHEQUEO_DOCUMENTOS_NEGADO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_HUY;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_MOTIVO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_AREA;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class NegacionChequeoDocumentoCrediHuy implements Task {
    private ChequeoDocumento chequeoDocumento;

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
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_ACEPTAR_ACCION_HUY),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_NEGAR),
            SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO),
            Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_AREA),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_ENVIAR_NEGACION),
            WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS_NEGADO, isVisible()).forNoMoreThan(TIEMPO_300).seconds(),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_OK));
    }
}
