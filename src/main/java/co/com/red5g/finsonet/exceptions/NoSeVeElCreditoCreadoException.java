package co.com.red5g.finsonet.exceptions;

public class NoSeVeElCreditoCreadoException extends AssertionError {
     public static final String MENSAJE_CREDITO = "El credito no aparece en la tabla esperada";

    public NoSeVeElCreditoCreadoException(String mensaje, Throwable causa) {
        super(mensaje , causa);
    }
}
