package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class VentaLiberadaReportePage {
    public static final Target LST_CANTIDAD = Target.the("La cantidad de creditos").located(By.className("DOcantidad"));
    public static final Target LST_VALOR = Target.the("El valor de los creditos").located(By.className("DOsuma"));
}