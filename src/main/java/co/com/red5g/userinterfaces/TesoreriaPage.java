package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class TesoreriaPage {
    public static int cedula;

    public static Target guardar (int cedula) {
        return Target.the("Lista de tesoreria").located(By.xpath("//*[contains(text(), '"+cedula+"' )]/preceding-sibling::td[1]/a"));
    }

   // public static final Target BTN_GUARDAR = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"pLibranza\"]/div[2]/div[14]/div[2]/div/button[7]"));
   public static final Target BTN_ESPERA_TES = Target.the("Lista de tesoreria").located(By.xpath("//*[@id=\"table_n\"]/tbody/tr/td[10]/div/button[1]"));
   public static final Target BTN_GUARDAR = Target.the("Lista de tesoreria").located(By.xpath("//*[contains(text(), '"+cedula+"' )]/preceding-sibling::td[1]/a"));


}
