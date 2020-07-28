package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailHomePage {

  public static final Target TXT_BUSCAR_CORREO = Target.the("el campo de busqueda de correo").located(By.xpath("//input[@placeholder='Buscar correo']"));
  public static final Target LBL_CORREO_CODIGO = Target.the("el correo del codigo de simulacion").located(By.xpath("//div[contains(text(),'no leída')]"));
  public static final Target LBL_CORREO_NOTIFICACION = Target.the("el correo del codigo de firma").located(By.xpath("//span[contains(text(),'esta tendrá una duración de (3) minutos')]"));
  public static final Target LBL_CORREO_CARTA_COMERCIAL = Target.the("el correo de la carta comercial").located(By.xpath("//td//span[contains(text(),'VNP - CARTA COMERCIAL')]//ancestor::div[@class='y6']"));
  public static final Target TBL_PRODUCTO_CORREO = Target.the("la tabla con el detalle de producto").located(By.xpath("//p[text()='Producto']//ancestor::div[contains(@style,'margin-bottom')]"));

  private GmailHomePage() {
    throw new IllegalStateException("Utility class");
  }
}
