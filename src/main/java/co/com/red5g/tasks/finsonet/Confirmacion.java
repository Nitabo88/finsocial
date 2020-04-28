package co.com.red5g.tasks.finsonet;

import static co.com.red5g.models.builders.finsonet.ChequeoDocumentoBuilder.con;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.userinterfaces.finsonet.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Realiza;
import co.com.red5g.questions.finsonet.PasoConfirmacionExitosa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Confirmacion implements Task {

  private Credito credito;

  public Confirmacion(Credito credito) {
    this.credito = credito;
  }

  private static final int TIEMPO = 50;

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Realiza.unChequeoDeDocumento(credito),
        Diligencia.laInformacionDeChequeoDeDocumentosLibranza(con().libranza()),
        WaitUntil.the(SPN_CARGANDO, isNotVisible()).forNoMoreThan(TIEMPO).seconds(),
        Click.on(MNM_ORIGINACION.of(PasoConfirmacionExitosa.CONFIRMACION))
    );
  }
}