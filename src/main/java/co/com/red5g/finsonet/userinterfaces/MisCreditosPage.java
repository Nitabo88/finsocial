package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class MisCreditosPage {

  public static final Target LST_FILA_CREDITO_HUY =
      Target.the("La fila del credito huy")
          .locatedBy("//td[text()='CrediHuy']//parent::tr//td[text()='{0}']//parent::tr");
  public static final Target LST_FILA_CREDITO_LIBRANZA = Target.the("La fila del credito de libranza")
      .locatedBy("//td[text()='Libranza']//parent::tr//td[text()='{0}']//parent::tr");
  public static final Target LST_COLUMNA_FORMULARIO_SOLICITUD = Target.the("La columna del proceso a seguir")
      .locatedBy("//td[text()='Libranza']//parent::tr//td[text()='{0}']//parent::tr//a[text()='FORMULARIO SOLICITUD']");
  public static final Target TXT_BUSCAR = Target.the("el campo de búsqueda de mis créditos")
      .located(By.xpath("//div[@id='originacion']//input[@placeholder='Buscar']"));
  public static final Target LBL_MIS_CREDITOS = Target.the("la cabecera de mis créditos").located(By.xpath("//div[@class='panel-heading']//h2"));


  private MisCreditosPage() {
    throw new IllegalStateException("Utility class");
  }
}
