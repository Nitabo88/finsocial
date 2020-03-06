package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListadoVetadosPage {

  public static final Target BTN_ANULAR_VETO = Target.the("boton anular veto").located(By.xpath("//button[contains(.,'Anular veto')]"));
  public static final Target BTN_ANULAR = Target.the("boton anular ").located(org.openqa.selenium.By.xpath("//button[text()='Anular']"));
  public static final Target BTN_ACEPTAR = Target.the("boton aceptar").located(org.openqa.selenium.By.xpath("//button[text()='Aceptar']"));
  public static final Target BTN_DETALLE_VETO = Target.the("boton detalle veto").locatedBy("//tr[@class='tableResult'][contains(.,'{0}')]//button[@class='bg-square-button white bg-green']");

  private ListadoVetadosPage() {
    throw new IllegalStateException("Utility class");
  }
}
