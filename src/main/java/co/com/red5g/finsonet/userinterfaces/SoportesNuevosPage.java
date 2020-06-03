package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SoportesNuevosPage {

  public static final Target LBL_SOPORTES_NUEVOS = Target.the("El titulo de soportes nuevos").located(By.xpath("//h3[contains(text(),'SOPORTES NUEVOS:')]"));
  public static final Target LNK_FORMATO_SEGURO_VIDA_MUNDIAL = Target.the("El formato del seguro de vida mundial").located(By.xpath("//a[contains(.,'Formato Seguro de Vida Mundial')]"));

  private SoportesNuevosPage() {
    throw new IllegalStateException("Utility class");
  }
}
