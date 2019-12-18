package co.com.red5g.finsonet.exceptions;

public class UploadFileException extends AssertionError {
    public static final String MENSAJE_SCRIPT = "no se pudo correr el script de carga del archivo";

    public UploadFileException(String message, Throwable cause) {
        super(message, cause);
    }
}