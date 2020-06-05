package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SoportesNuevosPage {

  public static final Target LBL_SOPORTES_NUEVOS = Target.the("El titulo de soportes nuevos").located(By.xpath("//h3[contains(text(),'SOPORTES NUEVOS:')]"));
  public static final Target LNK_FORMATO =
      Target.the("El pdf").locatedBy("//a[contains(.,'{0}')]");

  private SoportesNuevosPage() {
    throw new IllegalStateException("Utility class");
  }
}
