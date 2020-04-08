package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaGestionPage {

  public static final Target RDB_CRITERIO_BUSQUEDA = Target.the("criterio de busqueda llamadas").locatedBy("//span[contains(text(),'{0}')]");
  public static final Target TXT_BUSQUEDA = Target.the("texto de busqueda").located(By.id("busquedaGestion"));
  public static final Target BTN_GESTIONAR = Target.the("boton gestionar").locatedBy("//a[contains(@href,'{0}')]//span[@class='fas fa-phone-alt']");
  public static final Target LBL_GESTION = Target.the("boton gestionar").locatedBy("//div[contains(@class,'label-eye-icon')]//p");


  private BusquedaGestionPage() {
    throw new IllegalStateException("Utility class");
  }
}
