package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AuxiliarOperativoPage {
  public static final Target LNK_CHEQUEO_DOCUMENTOS = Target.the("el link de auxiliar operativo").located(By.id("chequeo-docs"));

  private AuxiliarOperativoPage() {
    throw new IllegalStateException("Utility class");
  }
}
