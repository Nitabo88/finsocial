package co.com.red5g.finsonet.exceptions;

public class NoSeVeElCreditoCreadoException extends AssertionError {
     public static final String MENSAJE_CREDITO = "No aparece la tabla de mis creditos";

    public NoSeVeElCreditoCreadoException(String mensaje, Throwable causa) {
        super(mensaje , causa);
    }
}
