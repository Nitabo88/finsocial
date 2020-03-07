package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormalizacionPage {

  public static final Target LST_ACCION_FORMALIZACION = Target.the("la lista de acciones de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]//ancestor::tr//div[@class='dropdown-menu']//a[text()='{1}']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.xpath("//input[@placeholder='Motivo']"));
  public static final Target BTN_OK = Target.the("el boton Ok").located(By.xpath("//button[@class='confirm']"));
  public static final Target BTN_ENVIAR = Target.the("el boton enviar").locatedBy("#boton2");
  public static final Target LST_MOTIVO_PENDIENTE = Target.the("la lista motivo pendiente").located(By.id("motivo"));
  public static final Target TXT_DETALLE_PENDIENTE = Target.the("el detalle del motivo pendiente").located(By.id("area"));
  public static final Target LST_FILA_FORMALIZACION = Target.the("la fila de la tabla de formalizacion").locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr");
  public static final Target LST_FILA_PENDIENTE_FORMALIZACION = Target.the("la fila de la tabla pendiente de formalizacion").locatedBy("//table[@id='table_p']//a[contains(@href,'{0}')]/ancestor::tr");
  public static final Target BTN_ACCION_FORMALIZACION = Target.the("el boton de accion de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr//div[@class='dropdown-menu']");

  private FormalizacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
