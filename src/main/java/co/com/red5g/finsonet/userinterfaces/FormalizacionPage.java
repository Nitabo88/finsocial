package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormalizacionPage {

  public static final Target BTN_ACCION_FORMALIZACION = Target.the("el boton accion de formalizacion").locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')"
      + "]//ancestor::tr//button[@data-toggle='dropdown']");
  public static final Target LST_ACCION_FORMALIZACION = Target.the("la lista de acciones de formalizacion").locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')"
      + "]//ancestor::tr//div[@class='dropdown-menu']//a[text()"
      + "='{1}']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.xpath("//input[@placeholder='Motivo']"));
  public static final Target BTN_OK = Target.the("el boton Ok").located(By.xpath("//button[text()='OK']"));

  private FormalizacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
