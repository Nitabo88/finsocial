package co.com.red5g.finsonet.exceptions;

public class NoSeMarcaElVeto extends AssertionError {
    public static final String MENSAJE_VETO = "La persona marcada como vetada no aparece en la lista de veto";

    public NoSeMarcaElVeto(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
