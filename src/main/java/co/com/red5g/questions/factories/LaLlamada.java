package co.com.red5g.questions.factories;

import co.com.red5g.questions.ValidarLlamadaFinsoamigo;
import co.com.red5g.questions.ValidarLlamadaLibranza;
import net.serenitybdd.screenplay.Question;

public class LaLlamada {

  private LaLlamada() {
  }

  public static Question<String> estaConfirmada() {
    return new ValidarLlamadaLibranza();
  }

  public static Question<String> fueExitosa() {
    return new ValidarLlamadaFinsoamigo();
  }

}

