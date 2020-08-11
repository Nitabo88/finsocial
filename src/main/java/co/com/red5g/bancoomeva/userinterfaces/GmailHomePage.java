package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GmailHomePage {

  public static final Target TXT_BUSCAR_CORREO = Target.the("el campo de busqueda de correo").located(By.xpath("//input[@placeholder='Buscar correo']"));
  public static final Target LBL_CORREO_CODIGO = Target.the("el correo del codigo de simulacion").located(By.xpath("//div[contains(text(),'no leída')]"));
  public static final Target LBL_CORREO_NOTIFICACION = Target.the("el correo del codigo de firma").located(By.xpath("//span[contains(text(),'esta tendrá una duración de (3) minutos')]"));
  public static final Target LBL_CORREO_CARTA_COMERCIAL = Target.the("el correo de la carta comercial")
      .located(By.xpath("//td//span[contains(text(),'VNP - CARTA COMERCIAL')]//ancestor::div[@class='y6']"));
  public static final Target TBL_PRODUCTO_CORREO = Target.the("la tabla con el detalle de producto").located(By.xpath("//p[text()='Producto']//ancestor::div[contains(@style,'margin-bottom')]"));
  public static final Target LST_PRODUCTO_CORREO = Target.the("las filas de la tabla del correo").located(By.xpath("//p[text()='Producto']//ancestor::div[contains(@style,'margin-bottom')]//td"));
  public static final Target LBL_ID_GESTION = Target.the("el mensaje del id de gestion").located(By.xpath("//span[contains(text(),'CODIGO DE RETOMAR')]"));
  public static final Target LNK_ID_PDF = Target.the("el plugin que contiene el pdf").located(By.id("plugin"));
  public static final Target BTN_ABRIR_NUEVA_VENTANA = Target.the("el boton de abrir documento en nueva ventana")
      .located(By.xpath("//div[contains(text(),'Abrir en una ventana nueva')]"));
  public static final Target LNK_ARCHIVO_0151 = Target.the("el mensaje del id de gestion")
      .located(By.xpath("//span[text()=' archivos adjuntos']//parent::div//following-sibling::div//a//span[contains(text(),'17_')]//parent::a"));


  private GmailHomePage() {
    throw new IllegalStateException("Utility class");
  }
}
