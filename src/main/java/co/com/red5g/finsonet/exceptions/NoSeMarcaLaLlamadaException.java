package co.com.red5g.finsonet.exceptions;

public class NoSeMarcaLaLlamadaException extends AssertionError {
     public static final String MENSAJE_LLAMADA = "La llamda no aparece en la tabla esperada";

    public NoSeMarcaLaLlamadaException(String mensaje, Throwable causa) {
        super(mensaje , causa);
    }
}
