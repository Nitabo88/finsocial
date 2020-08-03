package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OficinaPage {

  public static final Target LNK_FABRICA_CREDITOS = Target.the("el boton de bandeja de fabrica de creditos").located(By.id("compraCartera"));
  public static final Target LBL_OFICINA = Target.the("el label de oficina").located(By.xpath("//p[contains(text(),'Banca')]"));

  private OficinaPage() {
    throw new IllegalStateException("Utility class");
  }
}
