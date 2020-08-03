package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreditoPage {

  public static final Target LBL_CREDITO = Target.the("el label de credito").located(By.xpath("//h2[contains(text(),'Crédito')]"));
  public static final Target BTN_APROBAR = Target.the("el boton aprobar").located(By.xpath("//button[contains(text(),'Aprobar')]"));
  public static final Target BTN_APLAZAR = Target.the("el boton aplazar").located(By.xpath("//button[contains(text(),'Aplazar')]"));
  public static final Target BTN_NEGAR = Target.the("el boton negar").located(By.xpath("//button[contains(text(),'Negar')]"));

  private CreditoPage() {
    throw new IllegalStateException("Utility class");
  }
}
