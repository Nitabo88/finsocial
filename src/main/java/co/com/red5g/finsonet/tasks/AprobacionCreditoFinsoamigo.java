package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Obtener;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder.con;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;

public class AprobacionCreditoFinsoamigo implements Task {

  private final String perfilRiesgo;
  private static final String APROBACION_CREDITO = "Apr. de créditos";

  public AprobacionCreditoFinsoamigo(String perfilRiesgo) {
    this.perfilRiesgo = perfilRiesgo;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = Obtener.numeroCredito(perfilRiesgo, "").answeredBy(actor);
    actor.attemptsTo(
            Ingresa.aChequeoDocumentosFinsoamigo(),
            Diligencia.laInformacionDeChequeoDeDocumentosFinsoamigo(con().finsoamigo(), numeroCredito),
            Click.on(MNM_ORIGINACION.of(APROBACION_CREDITO))
    );
  }
}
