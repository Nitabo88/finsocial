package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class IncorporacionPage {

  public static final Target LST_FILA_INCORPORACION = Target.the("la fila de la tabla de incorporacion").locatedBy("//td[contains(text(),'{0}')]");
  public static final Target LST_SOLICITADO_POR = Target.the("la lista de solicitado por del cuadro emergente").located(By.id("txtAut"));
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.id("txtMotivo"));
  public static final Target BTN_REGISTRAR = Target.the("el boton de registro").located(By.id("btn-aceptar-regreso"));
  public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
  public static final Target MNU_HAMBURGUESA = Target.the("el menu hamburguesa").located(By.id("hamburger"));
  public static final Target MNU_APROBACION_CREDITO = Target.the("el menu aprobacion credito").located(By.id("or-aprob"));
  public static final Target BTN_REGRESAR_INCORPORACION = Target.the("el boton regresar")
      .locatedBy("//tr[@role='row']//td[contains(text(),'{0}')]//parent::tr//button[@data-original-title='Regresar']");
}
