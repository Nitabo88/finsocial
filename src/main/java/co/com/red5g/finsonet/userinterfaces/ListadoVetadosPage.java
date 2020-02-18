package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListadoVetadosPage {
  public static final Target CHK_CRITERIO_BUSQUEDA = Target.the("Checkbox del criterio de busqueda").locatedBy("//div[@id='checkboxes'][contains(.,'{0}')]");
  public static final Target TXT_PARAMETRO_BUSQUEDA = Target.the("parametro de busqueda").located(By.id("txtParBusqueda"));
  public static final Target BTN_BUSQUEDA = Target.the("boton de busqueda").located(By.id("btn-busqueda"));
  public static final Target LBL_MENSAJE_ERROR = Target.the("Mensaje de documento no encontrado").located(By.xpath("//p[contains(.,'El documento ingresado no se encontró en base de datos.')]"));
  public static final Target BTN_ACEPTAR = Target.the("Mensaje de documento no encontrado").located(By.xpath("//button[contains(.,'Aceptar')]"));
  public static final Target BTN_VETO = Target.the("boton veto").located(By.id("vetInt"));
  public static final Target BTN_ANULAR_VETO = Target.the("boton anular veto").located(By.xpath("//button[contains(.,'Anular veto')]"));
  public static final Target BTN_DETALLE_VETO = Target.the("boton detalle veto").locatedBy("//tr[@class='tableResult'][contains(.,'{0}')]//button[@class='bg-square-button white bg-green']");

}
