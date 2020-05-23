package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.interacions.factories.Subir;
import co.com.red5g.finsonet.models.ChequeoDocumento;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.conditions.Check;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.utils.NumeroCreditoFinsoamigo.CHEQUEO_DOCUMENTO_EXITOSO;

public class InformacionChequeoDocumentoFinsoamigo implements Task {

  private ChequeoDocumento chequeoDocumento;

  public InformacionChequeoDocumentoFinsoamigo(ChequeoDocumento chequeoDocumento) {
    this.chequeoDocumento = chequeoDocumento;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = CHEQUEO_DOCUMENTO_EXITOSO.getNumeroCredito();
    actor.remember(NUMERO_CREDITO, numeroCredito);
    actor.attemptsTo(
            JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE_FINSOAMIGO.of(numeroCredito)),
            Check.whether(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria()).resolveFor(actor).isVisible()).andIfSo(
                    Click.on(BTN_PAPELERIA.of(chequeoDocumento.getPapeleria())),
                    Click.on(BTN_ACEPTAR1_POP_UP),
                    Click.on(BTN_ACEPTAR),
                    WaitFor.seconds(2)),
            Enter.theValue(this.chequeoDocumento.getPuntajeCifin()).into(TXT_PUNTAJE_CIFIN),
            Enter.theValue(this.chequeoDocumento.getAciertaDatacredito()).into(TXT_ACIERTA_DATACREDITO),
            Subir.losArchivosDeChequeoDocumentosFinsoamigo(),
            Click.on(BTN_GUARDAR),
            Click.on(BTN_ACEPTAR)
    );
  }
}
