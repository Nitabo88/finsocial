package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ComercialPage {
    public static final Target LNK_NUEVO_CREDITO = Target.the("el link nuevo_credito").located(By.id("nuevo_credito"));

    private ComercialPage() {
        throw new IllegalStateException("Utility class");
    }
}