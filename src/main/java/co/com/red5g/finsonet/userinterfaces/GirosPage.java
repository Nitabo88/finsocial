package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class GirosPage {

  public static final Target LST_POR_GIRAR =
      Target.the("la fila de creditos por girar")
          .locatedBy("//a[@href='/planillaDetalleCredito.php?crid={0}']//ancestor::tr");
  public static final Target LBL_NOMBRE_POR_GIRAR = Target.the("el link a la planilla del credito pendiente por girar").locatedBy("//a[@href='/planillaDetalleCredito.php?crid={0}']");

  private GirosPage() {
    throw new IllegalStateException("Utility class");
  }
}
