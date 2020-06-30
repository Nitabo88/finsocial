package co.com.red5g.finsonet.exceptions;

public class ElUsuarioNoSeAutenticoAssertion extends AssertionError {
    public static final String MENSAJE_LOGUEO_NO_EXITOSO = "Error al autenticarse en la aplicacion";

    public ElUsuarioNoSeAutenticoAssertion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}