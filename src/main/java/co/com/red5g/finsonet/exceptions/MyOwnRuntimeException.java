package co.com.red5g.finsonet.exceptions;

import java.awt.*;

public class MyOwnRuntimeException extends Throwable {

    public MyOwnRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public MyOwnRuntimeException(AWTException e) {
    }
}
