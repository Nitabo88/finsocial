package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailLoginPage {

  public static final Target TXT_EMAIL = Target.the("el campo email").located(By.id("identifierId"));
  public static final Target TXT_CONTRASENA = Target.the("el campo contraseña").located(By.name("password"));
  public static final Target BTN_SIGUIENTE_EMAIL = Target.the("el campo siguiente email").located(By.id("identifierNext"));
  public static final Target BTN_SIGUIENTE_CONTRASENA = Target.the("el campo siguiente contraseña").located(By.id("passwordNext"));

  private GmailLoginPage() {
    throw new IllegalStateException("Utility class");
  }
}
