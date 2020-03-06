package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormalizacionPage {

  public static final Target LST_ACCION_FORMALIZACION = Target.the("la lista de acciones de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]//ancestor::tr//div[@class='dropdown-menu']//a[text()='{1}']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.xpath("//input[@placeholder='Motivo']"));
  public static final Target BTN_OK = Target.the("el boton Ok").located(org.openqa.selenium.By.xpath("//button[@class='confirm']"));
  public static final Target LST_FILA_FORMALIZACION = Target.the("la fila de la tabla de formalizacion").locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr");
  public static final Target BTN_ACCION_FORMALIZACION = Target.the("el boton de accion de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr//div[@class='dropdown-menu']");

  private FormalizacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
