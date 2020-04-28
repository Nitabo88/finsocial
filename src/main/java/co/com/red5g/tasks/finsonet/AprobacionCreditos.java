package co.com.red5g.tasks.finsonet;

import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Consulta;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AprobacionCreditos implements Task {

  private static final String APROBACION_CREDITO = "Apr. de créditos";

  private Credito credito;

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
