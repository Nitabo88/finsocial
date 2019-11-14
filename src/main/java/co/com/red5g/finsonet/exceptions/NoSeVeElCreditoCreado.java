package co.com.red5g.finsonet.exceptions;

public class NoSeVeElCreditoCreado extends AssertionError {
     public static final String MENSAJE_CREDITO = "No aparece la tabla de mis creditos";

    public NoSeVeElCreditoCreado(String mensaje, Throwable causa) {
        super(mensaje , causa);
    }
}
