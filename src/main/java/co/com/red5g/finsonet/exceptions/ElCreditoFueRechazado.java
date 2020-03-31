package co.com.red5g.finsonet.exceptions;

public class ElCreditoFueRechazado extends AssertionError {
    public static final String MENSAJE_USUARIO_VETADO = "NO REGISTRA";

    public ElCreditoFueRechazado(final String mensaje, final Throwable causa) {
        super(mensaje, causa);
    }
}
