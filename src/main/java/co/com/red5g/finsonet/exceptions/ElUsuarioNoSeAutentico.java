package co.com.red5g.finsonet.exceptions;

public class ElUsuarioNoSeAutentico extends AssertionError {
    public static final String MENSAJE_LOGUEO_NO_EXITOSO = "Error al autenticarse en la aplicacion";

    public ElUsuarioNoSeAutentico(final String mensaje, final Throwable causa) {
        super(mensaje, causa);
    }
}