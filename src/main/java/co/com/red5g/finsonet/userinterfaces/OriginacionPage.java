package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OriginacionPage {
    public static final Target MNU_HAMBURGUESA = Target.the("El menu hamburguesa").located(By.id("hamburger"));
    public static final Target MNU_REPORTES = Target.the("El menu hamburguesa").located(By.xpath("//div[@id='menu'][contains(.,'Reportes')]"));
}