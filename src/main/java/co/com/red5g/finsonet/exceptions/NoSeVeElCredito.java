package co.com.red5g.finsonet.exceptions;

public class NoSeVeElCredito extends AssertionError {
     public static final String MENSAJE_CREDITO = "El credito no aparece en la tabla esperada";

    public NoSeVeElCredito(final String mensaje, final Throwable causa) {
        super(mensaje , causa);
    }
}
