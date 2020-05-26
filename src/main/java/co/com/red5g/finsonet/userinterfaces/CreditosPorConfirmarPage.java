package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CreditosPorConfirmarPage {

    public static final Target LST_FILA_CREDITOS = Target.the("la fila del credito por confirmar").locatedBy("//a[contains(@href ,'{0}')]//ancestor::tr");

    private CreditosPorConfirmarPage() {
        throw new IllegalStateException("Utility class");
    }
}
