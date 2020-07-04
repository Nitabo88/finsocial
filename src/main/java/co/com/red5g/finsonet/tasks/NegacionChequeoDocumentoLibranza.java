package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR2;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR2_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR_NEGACION;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_NEGAR_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_MOTIVO_NEGACION;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

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

public class NegacionChequeoDocumentoLibranza implements Task {
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
            WaitUntil.the(BTN_NEGAR_LIBRANZA, isPresent()).forNoMoreThan(TIEMPO_10).seconds(),
            Click.on(BTN_NEGAR_LIBRANZA),
            SelectFromOptions.byVisibleText(chequeoDocumento.getSeleccionMotivo()).from(LST_MOTIVO_NEGACION),
            Enter.theValue(chequeoDocumento.getRazonMotivo()).into(TXT_DETALLE),
            Click.on(BTN_ACEPTAR_NEGACION),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_ACEPTAR2));
    }
}
