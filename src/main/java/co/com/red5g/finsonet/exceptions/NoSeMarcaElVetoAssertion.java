package co.com.red5g.finsonet.exceptions;

public class NoSeMarcaElVetoAssertion extends AssertionError {
    public static final String MENSAJE_VETO = "La persona marcada como vetada no aparece en la lista de veto";

    public NoSeMarcaElVetoAssertion(final String mensaje, final Throwable causa) {
        super(mensaje, causa);
    }
}
