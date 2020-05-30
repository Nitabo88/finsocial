package co.com.red5g.finsonet.stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.tasks.Obtener;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;

public class PruebaStepDefinition {

  @Dado("^que (.*) quiere acceder a un pdf$")
  public void queUnAsesorQuiereAccederAUnPdf(String actor) {
    theActorCalled(actor).attemptsTo(Ingresa.alPDF());
  }


  @Cuando("^obtiene la informacion del pdf$")
  public void obtieneLaInformacionDelPdf() {
    theActorInTheSpotlight().attemptsTo(Obtener.laInformacionDelPdf());
  }

  @Y("^obtiene la  informacion de la BD$")
  public void obtieneLaInformacionDeLaBD() {
    theActorInTheSpotlight().attemptsTo(Consulta.laInformacionDeLaBD());
  }
}
