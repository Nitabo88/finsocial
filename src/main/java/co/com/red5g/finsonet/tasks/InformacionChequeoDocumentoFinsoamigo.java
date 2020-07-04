package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_GUARDAR;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_ACIERTA_DATACREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.TXT_PUNTAJE_CIFIN;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_3;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_300;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.factories.Subir;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class InformacionChequeoDocumentoFinsoamigo implements Task {

  private final ChequeoDocumento chequeoDocumento;
  private final String numeroCredito;

  public InformacionChequeoDocumentoFinsoamigo(ChequeoDocumento chequeoDocumento, String numeroCredito) {
    this.chequeoDocumento = chequeoDocumento;
    this.numeroCredito = numeroCredito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.remember(NUMERO_CREDITO, numeroCredito);
    actor.attemptsTo(
            MoveMouse.to(LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO.of(numeroCredito)),
            JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO.of(numeroCredito)));
    actor.attemptsTo(
        Check.whether(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria()).resolveFor(actor).isVisible()).andIfSo(
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
            Click.on(BTN_ACEPTAR1_POP_UP),
            Click.on(BTN_ACEPTAR)),
        Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
        Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
        WaitFor.seconds(TIEMPO_3),
        Subir.losArchivosDeChequeoDocumentosFinsoamigo(),
        Click.on(BTN_GUARDAR),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO_300).seconds(),
        WaitFor.seconds(TIEMPO_3),
        Click.on(BTN_ACEPTAR)
    );
  }
}
