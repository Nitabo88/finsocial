package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR2_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACTIVAL;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA_ANTIGUA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_ACIERTA_DATACREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_PUNTAJE_CIFIN;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionIncompletaChequeoDocumentos implements Task {

    private static final int TIEMPO = 10;
    private final ChequeoDocumento chequeoDocumento;

    public InformacionIncompletaChequeoDocumentos(ChequeoDocumento chequeoDocumento) {
        this.chequeoDocumento = chequeoDocumento;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(
            JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of(numeroCredito)),
            Click.on(BTN_PAPELERIA_ANTIGUA),
            Click.on(BTN_ACEPTAR1_POP_UP),
            Click.on(BTN_ACTIVAL),
            Click.on(BTN_ACEPTAR2_POP_UP),
            Click.on(BTN_ACEPTAR),
            WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
            Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
            Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
            Click.on(BTN_GUARDAR)
        );
    }
}