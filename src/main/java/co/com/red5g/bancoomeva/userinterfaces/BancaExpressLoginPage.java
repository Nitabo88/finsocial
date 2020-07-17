package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class BancaExpressLoginPage {

  public static final Target LBL_BIENVENIDO = Target.the("mensaje de bienvenida").located(By.xpath("//h3[text()='¡Bienvenido!']"));
  public static final Target TXT_USUARIO = Target.the("usuario").located(By.id("user"));
  public static final Target TXT_CONTRASENA = Target.the("contraseña").located(By.id("pass"));
  public static final Target BTN_INGRESAR = Target.the("contraseña").located(By.xpath("//button[contains(text(),'Ingresar')]"));
}
