package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

public class AprobacionCreditos implements Task {

  private static final String APROBACION_CREDITO = "Apr. de créditos";

  private final Credito credito;

  public AprobacionCreditos(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Consulta.elCreditoEnConfirmacion(credito),
        Diligencia.laInformacionDeConfirmacion(),
        Click.on(MNM_ORIGINACION.of(APROBACION_CREDITO))
    );
  }
}
