package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.utils.data.Constantes.CEDULA_ACTOR;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;

public class ServicioDataPdf implements Question<String> {

  private static final String REST_API_URL = "http://10.10.1.55:8082/test";

  public static Question<String> laInformacionDelPdf() {
    return new ServicioDataPdf();
  }

  @Override
  public String answeredBy(Actor actor) {
    String numeroCedula = actor.recall(CEDULA_ACTOR);
    actor.whoCan(CallAnApi.at(REST_API_URL));
    actor.attemptsTo(
        Get.resource("/testSP.php?t=2&doc={cedula}").with(request -> request.pathParam("cedula", numeroCedula)));
    return SerenityRest.lastResponse().body().toString();
  }
}
