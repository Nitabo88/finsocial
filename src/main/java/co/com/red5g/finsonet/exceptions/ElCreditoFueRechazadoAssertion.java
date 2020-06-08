package co.com.red5g.finsonet.exceptions;

public class ElCreditoFueRechazadoAssertion extends AssertionError {
    public static final String MENSAJE_USUARIO_VETADO = "NO REGISTRA";

    public ElCreditoFueRechazadoAssertion(final String mensaje, final Throwable causa) {
        super(mensaje, causa);
    }
}
