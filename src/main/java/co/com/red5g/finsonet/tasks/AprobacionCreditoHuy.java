package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

public class AprobacionCreditoHuy implements Task {

  private final Credito credito;
  private static final String APROBACION = "Apr. de créditos";

  public AprobacionCreditoHuy(Credito credito) {
    this.credito = credito;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Ingresa.aChequeoDocumentosHuy(credito),
        Diligencia.laInformacionDeChequeoDeDocumentosHuy(con().huy()),
        Click.on(MNM_ORIGINACION.of(APROBACION)));
  }
}