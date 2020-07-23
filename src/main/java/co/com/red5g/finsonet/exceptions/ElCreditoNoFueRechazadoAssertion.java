package co.com.red5g.finsonet.exceptions;

public class ElCreditoNoFueRechazadoAssertion extends AssertionError {

  public static final String MENSAJE_CREDITO_RECHAZADO = "El credito aun esta en la tabla";

  public ElCreditoNoFueRechazadoAssertion(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
