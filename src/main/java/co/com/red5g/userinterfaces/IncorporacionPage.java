package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IncorporacionPage {

    public static final Target COMBO_ANIO = Target.the("Lista de cartera").located(By.id("comboAnoLiq"));
    public static final Target COMBO_MES= Target.the("Lista de cartera").located(By.id("comboMesLiq"));
    public static final Target BTN_APROBAR= Target.the("Lista de cartera").located(By.xpath("//*[@id=\"pLibranza\"]/div[2]/div[14]/div[2]/div/button[5]"));

}
