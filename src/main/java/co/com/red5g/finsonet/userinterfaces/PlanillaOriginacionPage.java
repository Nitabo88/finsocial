package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PlanillaOriginacionPage {

  private static final IFrame FRAME = IFrame.withPath(By.id("frame"));
  public static final Target LST_SELECCIONAR_GESTION = Target.the("la lista de seleccionar gestion").inIFrame(PlanillaOriginacionPage.FRAME).located(By.id("txtGestion"));
  public static final Target TXT_DETALLE_GESTION = Target.the("el detalle de gestion").inIFrame(PlanillaOriginacionPage.FRAME).located(By.id("txtDetGestion"));
  public static final Target BTN_ACTUALIZAR_GESTION = Target.the("el boton actualizar gestion").located(By.xpath("//button[text()='Actualizar gestión']"));
  public static final Target BTN_REGISTRAR = Target.the("el boton de registro").inIFrame(PlanillaOriginacionPage.FRAME).located(By.xpath("//button[contains(text(),'Registrar')]"));
  public static final Target BTN_GUARDAR = Target.the("el boton guardar").located(By.xpath("//button[contains(text(),'Guardar')]"));
  public static final Target LNK_FILE_UPLOAD = Target.the("el link de subida del archivo").inIFrame(PlanillaOriginacionPage.FRAME).located(By.id("fileGestion"));
  public static final Target LST_ANIO_DESCUENTO = Target.the("el año de inicio de descuento").located(By.id("comboAnoLiq"));
  public static final Target LST_MES_DESCUENTO = Target.the("el mes de inicio de descuento").located(By.id("comboMesLiq"));
  public static final Target LBL_DATOS_LIBRANZA = Target.the("texto fecha de liquidacion del credito").located(By.xpath("//h3[contains(text(),'Datos de la Libranza')]"));
  public static final Target TXT_FECHA_LIQUIDACION_CREDITO = Target.the("fecha de liquidacion del credito").located(By.id("textoIniDesc"));

  private PlanillaOriginacionPage() {throw new IllegalStateException("Utility class");
  }
}
