package co.com.red5g.tasks.finsonet;

import static co.com.red5g.models.builders.finsonet.ChequeoDocumentoBuilder.con;
import static co.com.red5g.userinterfaces.finsonet.OriginacionPage.MNM_ORIGINACION;

import co.com.red5g.models.finsonet.Credito;
import co.com.red5g.tasks.factories.finsonet.Diligencia;
import co.com.red5g.tasks.factories.finsonet.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AprobacionCreditoHuy implements Task {

  private Credito credito;
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