package co.com.red5g.finsonet.exceptions;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NoSeVeElCreditoException extends AssertionError {

  private static String mensaje;
  public static final String MENSAJE_CREDITO = "El credito" + mensaje + "no aparece en la tabla esperada";

  public NoSeVeElCreditoException(String message, Throwable cause) {
    super(message, cause);
    this.mensaje = theActorInTheSpotlight().recall(NUMERO_CREDITO);
  }
}
