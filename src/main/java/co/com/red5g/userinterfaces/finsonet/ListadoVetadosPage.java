package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;

public class ListadoVetadosPage {

  public static final Target BTN_ANULAR_VETO = Target.the("boton anular veto interno ").locatedBy(("//button[contains(.,'Anular veto')]"));
  public static final Target BTN_ANULAR = Target.the("boton anular modal").locatedBy("//div[@class='swal2-actions actions-class']//button[contains(.,'Anular')]");
  public static final Target BTN_ACEPTAR = Target.the("boton aceptar modal ").locatedBy("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']");
  public static final Target BTN_DETALLE_VETO = Target.the("boton detalle veto").locatedBy("//tr[@class='tableResult'][contains(.,'{0}')]//button[@class='bg-square-button white bg-green']");

  private ListadoVetadosPage() {
    throw new IllegalStateException("Utility class");
  }
}
