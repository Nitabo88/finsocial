package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.tasks.Normalizar;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;

public class AprobacionCreditoHuyStepDefinition {

  @Dado("^que (.*) quiere aprobar un crédito huy$")
  public void consultarCredito(final String actor) {
    theActorCalled(actor).attemptsTo(
        Consulta.elCreditoEnAprobacionDeCreditosHuy()
    );
  }


  @Cuando("^el asesor normalice el credito$")
  public void NormalizarCredito() {
    theActorInTheSpotlight().attemptsTo(
        Normalizar.elCredito()
    );
  }

  @Cuando("^el asesor diligencia la información de aprobación de crédito huy$")
  public void elAsesorDiligenciaLaInformaciónDeAprobaciónDeCréditoHuy() {
    theActorInTheSpotlight().attemptsTo(
        Diligencia.laAprobacionDelCreditonEnIncorporacionHuy()
    );
  }

  @Entonces("^el podrá ver el crédito en incorporación huy$")
  public void elPodráVerElCréditoEnIncorporaciónHuy() {
  }
}
