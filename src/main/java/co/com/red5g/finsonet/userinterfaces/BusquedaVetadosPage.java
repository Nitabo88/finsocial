package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaVetadosPage {
  public static final Target CHK_CRITERIO_BUSQUEDA = Target.the("Checkbox del criterio de busqueda").locatedBy("//div[@id='checkboxes'][contains(.,'{0}')]");
  public static final Target TXT_PARAMETRO_BUSQUEDA = Target.the("parametro de busqueda").located(By.id("txtParBusqueda"));

}
