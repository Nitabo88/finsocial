package co.com.red5g.tasks.finsonet;

import static co.com.red5g.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_ACEPTAR1_POP_UP;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_GUARDAR;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.BTN_PAPELERIA;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.TXT_ACIERTA_DATACREDITO;
import static co.com.red5g.userinterfaces.finsonet.ChequeoDocumentosPage.TXT_PUNTAJE_CIFIN;

import co.com.red5g.interacions.factories.Subir;
import co.com.red5g.models.finsonet.ChequeoDocumento;
import java.util.List;

import co.com.red5g.questions.finsonet.ObtenerUrl;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;

public class InformacionChequeoDocumentoFinsoamigo implements Task {

  private ChequeoDocumento chequeoDocumento;

  public InformacionChequeoDocumentoFinsoamigo(ChequeoDocumento chequeoDocumento) {
    this.chequeoDocumento = chequeoDocumento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    List<WebElementFacade> lstNombreChequeoDocumento = LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO.resolveAllFor(actor);
    actor.attemptsTo(
        JavaScriptClick.on(lstNombreChequeoDocumento.get(0)));
    actor.remember(NUMERO_CREDITO, ObtenerUrl.obtenerUrl());
    actor.attemptsTo(
        Check.whether(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria()).resolveFor(actor).isVisible()).andIfSo(
            Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
            Click.on(BTN_ACEPTAR1_POP_UP),
            Click.on(BTN_ACEPTAR)),
        Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
        Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
        Subir.losArchivosDeChequeoDocumentos(),
        Click.on(BTN_GUARDAR),
        Click.on(BTN_ACEPTAR)
    );
  }
}
