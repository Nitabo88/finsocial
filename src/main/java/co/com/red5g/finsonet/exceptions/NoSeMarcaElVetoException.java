package co.com.red5g.finsonet.exceptions;

public class NoSeMarcaElVetoException extends AssertionError {
    public static final String MENSAJE_VETO = "La persona marcada como vetada no aparece en la lista de veto";

    public NoSeMarcaElVetoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
