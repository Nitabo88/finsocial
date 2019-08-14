package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AprobacionPage {

    public static Target encontrar (int cedula) {
        return Target.the("Lista de Aprobacion").located(By.xpath("//*[contains(text(), '"+cedula+"' )]/preceding-sibling::td[1]/a"));
    }

    public static final Target BTN_APROBAR = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"pLibranza\"]/div[2]/div[14]/div[2]/div/button[5]"));


}
