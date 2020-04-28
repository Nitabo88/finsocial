package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR2_POP_UP;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_GUARDAR;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.TXT_ACIERTA_DATACREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.TXT_PUNTAJE_CIFIN;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.models.finsonet.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionIncompletaChequeoDocumentos implements Task {

    private static final int TIEMPO = 100;
    private final ChequeoDocumento chequeoDocumento;

    public InformacionIncompletaChequeoDocumentos(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_LIBRANZA.of(numeroCredito)),
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
            Click.on(BTN_ACEPTAR1_POP_UP),
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getAfianzado())),
            Click.on(BTN_ACEPTAR2_POP_UP),
            Click.on(BTN_ACEPTAR),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
            Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
            Click.on(BTN_GUARDAR)
        );
    }
}