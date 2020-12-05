package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR2_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_LISTADO_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_ACIERTA_DATACREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_PUNTAJE_CIFIN;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_10;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_120;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isPresent;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.factories.Subir;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionChequeoDocumentoLibranza implements Task {

    private final ChequeoDocumento chequeoDocumento;

    public InformacionChequeoDocumentoLibranza(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            Scroll.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)).andAlignToBottom(),
            JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)),
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
            Click.on(BTN_ACEPTAR1_POP_UP),
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getAfianzado())),
            Click.on(BTN_ACEPTAR2_POP_UP),
            WaitFor.seconds(TIEMPO_3),
            Click.on(BTN_ACEPTAR));
        actor.attemptsTo(
            WaitUntil.the(LBL_LISTADO_CHEQUEO_DOCUMENTOS, isPresent()).forNoMoreThan(TIEMPO_120).seconds(),
            Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
            Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
            Subir.losArchivosDeChequeoDocumentos(),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_10).seconds(),
            Scroll.to(BTN_GUARDAR).andAlignToBottom(),
            JavaScriptClick.on(BTN_GUARDAR),
            WaitUntil.the(BTN_ACEPTAR, isEnabled()).forNoMoreThan(TIEMPO_10).seconds(),
            Click.on(BTN_ACEPTAR)
        );
    }
}