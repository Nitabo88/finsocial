package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.Obtener.INFORMACION_PDF;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PDF implements Question<String> {

  @Override
  public String answeredBy(Actor actor) {
    return theActorInTheSpotlight().recall(INFORMACION_PDF).toString().toLowerCase();
  }
}
