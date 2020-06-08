package co.com.red5g.finsonet.exceptions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoSeVeElCreditoAssertion extends AssertionError {

  private static final String CREDITO = theActorInTheSpotlight().recall(NUMERO_CREDITO);
  public static final String MENSAJE_CREDITO = "El credito " + CREDITO + " no aparece en la tabla esperada";

  public NoSeVeElCreditoAssertion(String message, Throwable cause) {
    super(message, cause);
  }
}
