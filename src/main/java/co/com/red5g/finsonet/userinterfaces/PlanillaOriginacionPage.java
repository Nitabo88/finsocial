package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;

public class PlanillaOriginacionPage {

  private static final IFrame FRAME = IFrame.withPath(By.id("frame"));
  public static final Target LST_SELECCIONAR_GESTION = Target.the("la lista de seleccionar gestion").inIFrame(FRAME).located(By.id("txtGestion"));
  public static final Target TXT_DETALLE_GESTION = Target.the("el detalle de gestion").inIFrame(FRAME).located(By.id("txtDetGestion"));
  public static final Target BTN_ACTUALIZAR_GESTION = Target.the("el boton actualizar gestion").located(By.xpath("//button[text()='Actualizar gestión']"));
  public static final Target BTN_REGISTRAR = Target.the("el boton de registro").inIFrame(FRAME).located(By.xpath("//button[contains(text(),'Registrar')]"));
  public static final Target TXT_ARCHIVO_GESTION = Target.the("el archivo de subida").inIFrame(FRAME).located(By.id("fileGestion"));
  public static final Target BTN_SELECCIONE_ARCHIVO = Target.the("el archivo de subida").inIFrame(FRAME).located(By.xpath("//button[contains(text(),'Seleccione un archivo')]"));
  public static final Target TXT_SELECCIONE_ARCHIVO = Target.the("el archivo de subida").inIFrame(FRAME).located(By.id("textFile"));
}
