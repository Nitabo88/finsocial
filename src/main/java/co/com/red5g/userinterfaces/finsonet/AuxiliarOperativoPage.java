package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class AuxiliarOperativoPage {
  public static final Target LNK_CHEQUEO_DOCUMENTOS = Target.the("el link de auxiliar operativo").located(By.id("chequeo-docs"));

  private AuxiliarOperativoPage() {
    throw new IllegalStateException("Utility class");
  }
}
