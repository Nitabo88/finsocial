package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BandejaFabricaPage {

  public static final Target TXT_FILTRO_DOCUMENTO = Target.the("el filtro para buscar por documento").located(By.id("documento"));
  public static final Target BTN_FILTRO = Target.the("el boton del filtro").located(By.xpath("//i[@class='fas fa-filter fa-2x']"));
  public static final Target BTN_ACCION = Target.the("el boton accion de la fila").locatedBy("//td[text()='{0}']//parent::tr//a");
  public static final Target LBL_BANDEJA_FABRICA = Target.the("el label de bandeja de fabrica").located(By.xpath("//h2[@class='title-breadcrumbs title-breadcrumbs--secondary']"));
  public static final Target TXT_FILTRO_ID = Target.the("el label de bandeja de fabrica").located(By.id("id"));

}
