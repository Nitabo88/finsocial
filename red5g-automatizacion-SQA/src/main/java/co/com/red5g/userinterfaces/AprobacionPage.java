package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AprobacionPage {

    public static final Target BTN_APROBAR = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"pLibranza\"]/div[2]/div[14]/div[2]/div/button[5]"));
    //public static final Target BTN_ACEPTAR = Target.the("Lista de cartera").locatedBy("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");

}
