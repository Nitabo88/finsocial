package co.com.red5g.exceptions.finsonet;

import static co.com.red5g.interacions.finsonet.Ingresar.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoSeVeElCreditoException extends AssertionError {

  private static final String CREDITO = theActorInTheSpotlight().recall(NUMERO_CREDITO);
  public static final String MENSAJE_CREDITO = "El credito " + CREDITO + " no aparece en la tabla esperada";

  public NoSeVeElCreditoException(String message, Throwable cause) {
    super(message, cause);
  }
}
