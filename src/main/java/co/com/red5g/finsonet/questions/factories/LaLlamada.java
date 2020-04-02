package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.ValidarLlamadaLibranza;
import co.com.red5g.finsonet.questions.ValidarLlamadaFinsoamigo;
import net.serenitybdd.screenplay.Question;

public class LaLlamada {

  public static Question<String> estaConfirmada() {
    return new ValidarLlamadaLibranza();
  }

  public static Question<String> fueExitosa() {
    return new ValidarLlamadaFinsoamigo();
  }

}
