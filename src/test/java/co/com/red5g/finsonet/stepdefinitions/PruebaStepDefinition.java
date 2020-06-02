package co.com.red5g.finsonet.stepdefinitions;

import static co.com.red5g.utils.Queries.SQL_FORMULARIO_SOLICITUD;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import co.com.red5g.finsonet.tasks.Obtener;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Ingresa;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
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

  @Y("^obtiene la informacion de la BD$")
  public void obtieneLaInformacionDeLaBD() {
    theActorInTheSpotlight().attemptsTo(Consulta.laInformacionDeLaBD(SQL_FORMULARIO_SOLICITUD.getSql()));
  }

  @Entonces("^la informacion corresponde$")
  public void laInformacionCorresponde() {
    theActorInTheSpotlight().should(
        seeThat(LaInformacion.delPdf(11), containsString(theActorInTheSpotlight().asksFor(LaInformacion.deBaseDeDatos("email")))),
        seeThat(LaInformacion.delPdf(3), containsString(theActorInTheSpotlight().asksFor(LaInformacion.deBaseDeDatos("nombre")))),
        seeThat(LaInformacion.delPdf(3), containsString(theActorInTheSpotlight().asksFor(LaInformacion.deBaseDeDatos("p_apellido")))),
        seeThat(LaInformacion.delPdf(5), containsString(theActorInTheSpotlight().asksFor(LaInformacion.deBaseDeDatos("no_doc")))),
        seeThat(LaInformacion.delPdf(10), containsString(theActorInTheSpotlight().asksFor(LaInformacion.deBaseDeDatos("dir_residencia")))));
  }
}
