package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BandejaCallCenterPage {

  public static final Target TXT_FILTRO_DOCUMENTO = Target.the("el filtro para buscar por documento").located(By.id("documento"));
  public static final Target BTN_FILTRO = Target.the("el boton del filtro").located(By.xpath("//i[@class='fas fa-filter fa-2x']"));
  public static final Target LBL_BANDEJA_CALL_CENTER = Target.the("el label de bandeja de call center").located(By.xpath("//h2[@class='title-breadcrumbs title-breadcrumbs--secondary']"));
  public static final Target TXT_FILTRO_ID = Target.the("el label de bandeja de call center").located(By.id("id"));
  public static final Target LBL_FILA_TIPO = Target.the("el label la fila tipo de la bandeja de call center").located(By.xpath("//td[contains(text(),'Gestión')]"));

  private BandejaCallCenterPage() {
    throw new IllegalStateException("Utility class");
  }

}
