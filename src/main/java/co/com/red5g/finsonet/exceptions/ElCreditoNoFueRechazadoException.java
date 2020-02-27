package co.com.red5g.finsonet.exceptions;

public class ElCreditoNoFueRechazadoException extends AssertionError {

  public static final String MENSAJE_CREDITO_RECHAZADO = "El credito aun esta en la tabla";

  public ElCreditoNoFueRechazadoException(final String mensaje, final Throwable causa) {
    super(mensaje, causa);
  }

}
