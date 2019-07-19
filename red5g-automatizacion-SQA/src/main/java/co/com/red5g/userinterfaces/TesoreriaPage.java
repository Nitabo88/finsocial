package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TesoreriaPage {
    public static int cedula =22494794 ;

    public static final Target BTN_GUARDAR = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"pLibranza\"]/div[2]/div[14]/div[2]/div/button[7]"));
    public static final Target XPATH = Target.the("Lista de cartera").located(By.xpath("//*[contains(text()," + cedula + " )]/preceding-sibling::td[1]/a"));
}
