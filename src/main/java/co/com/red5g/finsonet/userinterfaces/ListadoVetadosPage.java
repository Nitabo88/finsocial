package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListadoVetadosPage {

  public static final Target BTN_ANULAR_VETO = Target.the("boton anular veto").located(By.xpath("//button[contains(.,'Anular veto')]"));
  public static final Target BTN_DETALLE_VETO = Target.the("boton detalle veto").locatedBy("//tr[@class='tableResult'][contains(.,'{0}')]//button[@class='bg-square-button white bg-green']");

  private ListadoVetadosPage() {
    throw new IllegalStateException("Utility class");
  }
}
