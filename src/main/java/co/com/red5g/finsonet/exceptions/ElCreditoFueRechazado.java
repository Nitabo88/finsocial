package co.com.red5g.finsonet.exceptions;

public class ElCreditoFueRechazado extends AssertionError {
    public static final String MENSAJE_USUARIO_VETADO = "El cliente se encuentra vetado";

    public ElCreditoFueRechazado(final String mensaje, final Throwable causa) {
        super(mensaje, causa);
    }
}
