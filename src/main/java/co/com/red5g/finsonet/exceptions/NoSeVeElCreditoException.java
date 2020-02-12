package co.com.red5g.finsonet.exceptions;

public class NoSeVeElCreditoException extends AssertionError {
     public static final String MENSAJE_CREDITO = "El credito no aparece en la tabla esperada";

    public NoSeVeElCreditoException(final String mensaje, final Throwable causa) {
        super(mensaje , causa);
    }
}
