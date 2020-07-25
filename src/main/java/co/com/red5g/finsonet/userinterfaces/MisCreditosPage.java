package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class MisCreditosPage {

  public static final Target LST_FILA_CREDITO_HUY = Target.the("La fila del credito huy")
      .locatedBy("//td[text()='CrediHuy']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]//parent::tr");
  public static final Target LST_FILA_CREDITO_LIBRANZA = Target.the("La fila del credito de libranza")
      .locatedBy("//td[text()='Libranza']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]//parent::tr");
  public static final Target LST_COLUMNA_FORMULARIO_SOLICITUD = Target.the("La columna del proceso a seguir")
      .locatedBy("//td[text()='Libranza']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]//preceding-sibling::td//a[text()='FORMULARIO SOLICITUD']");
  public static final Target LST_COLUMNA_CHEQUEO_DOCUMENTO = Target.the("La columna del proceso a seguir")
      .locatedBy("//td[text()='CrediHuy']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]//parent::tr//td");
  public static final Target LBL_ID = Target.the("la cabecera ID de la tabla").located(By.xpath("//table[@id='tablaOriginacion']//div[@class='th-inner sortable both'][contains(text(),'ID')]"));
  public static final Target LBL_ID2 = Target.the("la cabecera ID de la tabla ascendente").located(By.xpath("//div[@class='th-inner sortable both asc'][contains(text(), 'ID')]"));
  public static final Target LNK_REPROCESOS= Target.the("la pestaña de reprocesos").located(By.xpath("//a[@class='nav-link text-green-o active']"));
  public static final Target LST_FILA_REPROCESOS= Target.the("la fila de reprocesos").located(By.xpath("//div[@id='reprocesos']//tbody//td[text()='104544']//parent::tr"));

  private MisCreditosPage() {
    throw new IllegalStateException("Utility class");
  }
}
