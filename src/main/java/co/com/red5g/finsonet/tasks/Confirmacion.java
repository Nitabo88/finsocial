package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.questions.PasoConfirmacionExitosa.CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_CARGANDO;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Realiza;
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
        Click.on(MNM_ORIGINACION.of(CONFIRMACION))
    );
  }
}