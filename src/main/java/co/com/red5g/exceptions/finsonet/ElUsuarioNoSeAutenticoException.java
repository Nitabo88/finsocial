package co.com.red5g.exceptions.finsonet;

public class ElUsuarioNoSeAutenticoException extends AssertionError {
    public static final String MENSAJE_LOGUEO_NO_EXITOSO = "Error al autenticarse en la aplicacion";

    public ElUsuarioNoSeAutenticoException(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}