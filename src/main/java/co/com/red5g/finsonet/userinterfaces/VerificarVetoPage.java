package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class VerificarVetoPage {
    public static final Target LST_FILA_VETOS = Target.the("La fila de clientes vetados").locatedBy("//*[@id=\"tablaListado\"]/tr[1]/td[1]");

    private VerificarVetoPage() {
        throw new IllegalStateException("Utility class");
    }
}
