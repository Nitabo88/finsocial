package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class FormalizacionPage {

  private static final IFrame FRAME = IFrame.withPath(By.className("fancybox-iframe"));
  public static final Target LST_ACCION_FORMALIZACION = Target.the("la lista de acciones de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]//ancestor::tr//div[@class='dropdown-menu']//a[text()='{1}']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.xpath("//input[@placeholder='Motivo']"));
  public static final Target BTN_OK = Target.the("el boton Ok").located(By.xpath("//button[@class='confirm']"));
  public static final Target BTN_ENVIAR = Target.the("el boton enviar").locatedBy("#boton2");
  public static final Target BTN_GUARDAR_DATOS = Target.the("el boton guardar").located(By.xpath("//button[text()='Guardar Datos']"));
  public static final Target LST_MOTIVO_PENDIENTE = Target.the("la lista motivo pendiente").located(By.id("motivo"));
  public static final Target TXT_DETALLE_PENDIENTE = Target.the("el detalle del motivo pendiente").located(By.id("area"));
  public static final Target LST_FILA_FORMALIZACION = Target.the("la fila de la tabla de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr");
  public static final Target LST_FILA_PENDIENTE_FORMALIZACION = Target.the("la fila de la tabla pendiente de formalizacion")
      .locatedBy("//table[@id='table_p']//a[contains(@href,'{0}')]/ancestor::tr");
  public static final Target LST_COLUMNA_NOMBRE_FORMALIZACION = Target.the("la columna nombre de la de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]//ancestor::tr//td[@style='text-align: left']");
  public static final Target BTN_ACCION_FORMALIZACION = Target.the("el boton de accion de formalizacion")
      .locatedBy("//table[@id='table_n']//a[contains(@href,'{0}')]/ancestor::tr//div[@class='dropdown-menu']");
  public static final Target BTN_SUBIR_DOCUMENTOS = Target.the("El boton de subir documentos de formalizacion").located(By.xpath("//button[contains(text(),'Subir Documentos')]"));
  public static final Target BTN_SELECCIONAR_ARCHIVO = Target.the("El boton de seleccionar archivo").inIFrame(FRAME).located(By.xpath("//span[@class='buttonText']"));
  public static final Target LNK_FILE = Target.the("el input del archivo").inIFrame(FRAME).located(By.id("file"));
  public static final Target BTN_ENVIAR_FILE = Target.the("el boton enviar archivo").inIFrame(FRAME).located(By.name("submit"));
  public static final Target BTN_CERRAR = Target.the("el boton enviar archivo").inIFrame(FRAME).located(By.xpath("//a[@class='fancybox-item fancybox-close']"));
  public static final Target BTN_UPLOAD = Target.the("icono de cargar").located(By.xpath("//i[contains(@class,'fa-upload')]"));
  public static final Target BTN_GUARDAR = Target.the("el boton guardar").located(By.id("btnGuardar"));
  public static final Target LBL_FORMALIZACION = Target.the("el titulo de formalizacion").located(By.xpath("//h3[text()='Formalización_huy']"));
  public static final Target LST_NOMBRE_FORMALIZACION_CREDIHUY = Target.the("la columna de nombre de formalizacion huy").locatedBy("//td[text()='CrediHuy']//parent::tr//a[@href='/chequeo_docs_huy.php?crid={0}&act=1']");

  private FormalizacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
