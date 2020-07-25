package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailHomePage {

  public static final Target TXT_BUSCAR_CORREO = Target.the("el campo email").located(By.xpath("//input[@placeholder='Buscar correo']"));
  public static final Target LBL_CORREO_CODIGO = Target.the("el campo email").located(By.xpath("//div[contains(text(),'no leída')]"));
  public static final Target LBL_CORREO_NOTIFICACION = Target.the("el campo email").located(By.xpath("//span[contains(text(),'esta tendrá una duración de (3) minutos')]"));

  private GmailHomePage() {
    throw new IllegalStateException("Utility class");
  }
}
