package co.com.red5g.finsonet.exceptions;

public class ElDetalleNoCorrespondeException extends AssertionError {
    public static final String MENSAJE_REPORTE = "Error al validar el detalle del reporte";

    public ElDetalleNoCorrespondeException(String message, Throwable cause) {
        super(message, cause);
    }
}
