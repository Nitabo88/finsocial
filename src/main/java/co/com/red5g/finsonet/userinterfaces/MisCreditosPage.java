package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MisCreditosPage {
    public static final Target TBL_LISTADO_CREDITOS = Target.the("La tabla con la lista de creditos").located(By.xpath("//table[contains(@class,'table-striped')]"));
}