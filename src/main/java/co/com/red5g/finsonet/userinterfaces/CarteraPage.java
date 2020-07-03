package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CarteraPage {

    public static final Target LST_FILA_CARTERA = Target.the("la fila de la tabla de cartera")
        .locatedBy("//td[text()='CrediHuy']//parent::tr//td[text()='{0}'][2]");
    public static final Target TXT_CEDULA = Target.the("la cedula").located(By.id("cedula"));

    private CarteraPage() {
        throw new IllegalStateException("Utility class");
    }
}
