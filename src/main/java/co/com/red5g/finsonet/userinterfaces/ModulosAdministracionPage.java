package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ModulosAdministracionPage {
    public static final Target LNK_COMERCIAL = Target.the("el link comercial").located(By.id("comercial"));
    public static final Target LNK_REPORTES = Target.the("el link de los reportes").located(By.id("reports"));
    public static final Target LNK_ORIGINACION = Target.the("el link de los reportes").located(By.id("origin"));

    private ModulosAdministracionPage() {
        throw new IllegalStateException("Utility class");
    }
}