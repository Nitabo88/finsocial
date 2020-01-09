package co.com.red5g.finsonet.exceptions;

public class ElCreditoNoFueRechazado extends AssertionError {
  public static final String MENSAJE_CREDITO_RECHAZADO = "El credito aun aparece en la tabla";

  public ElCreditoNoFueRechazado(String mensaje, Throwable causa) {
    super(mensaje , causa);
  }
}
