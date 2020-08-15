package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class IncorporacionPage {

  public static final Target LST_FILA_INCORPORACION =
      Target.the("la fila de la tabla de incorporacion")
          .locatedBy(
              "//h2[contains(text(),'Incorporación')]//ancestor::div[@class='panel panel-green']//td[contains(.,'{0}')]//parent::tr");
  public static final Target LST_FILA_PENDIENTE_INCORPORACION = Target.the("la fila de pendientes en la tabla de incorporacion")
      .locatedBy("//div//h2[text()='Incorporación pendiente']//ancestor::div[@class='panel panel-green']//td[text()='{0}']//parent::tr");
  public static final Target LST_MOTIVO_DEVOLUCION = Target.the("la fila del motivo de devolucion").located(By.id("txtMotivo2"));
  public static final Target LST_TIPO_DEVOLUCION = Target.the("el tipo de devolucion").located(By.id("txtTipoDev"));
  public static final Target LST_SOLICITADO_POR = Target.the("la lista de solicitado por del cuadro emergente").located(By.id("txtAut"));
  public static final Target LST_INCORPORACION_NOMBRE = Target.the("la lista de solicitado por del cuadro emergente")
      .locatedBy("//h2[text()='Incorporación Libranza']//ancestor::div[@class='panel panel-green']//td[contains(.,'{0}')]//parent::tr//a[@class='faq-link']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(By.id("txtMotivo"));
  public static final Target LBL_INCORPORACION = Target.the("el texto de incorporacion").located(By.xpath("//h2[text()='Incorporación Libranza Digital']"));
  public static final Target TXT_DETALLE = Target.the("el detalle de pendiente").located(By.id("txtDetalle2"));
  public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
  public static final Target BTN_OK = Target.the("el boton aceptar").located(By.xpath("//button[text()='OK']"));
  public static final Target BTN_APROBAR = Target.the("el boton aprobar").located(By.xpath("//button[text()='Aprobar']"));
  public static final Target MNM_HAMBURGUESA = Target.the("el menu hamburguesa").located(By.id("hamburger"));
  public static final Target MNM_APROBACION_CREDITO = Target.the("el menu aprobacion credito").located(By.id("or-aprob"));
  public static final Target BTN_REGRESAR_INCORPORACION = Target.the("el boton regresar")
      .locatedBy("//tr[@role='row']//td[contains(text(),'{0}')]//parent::tr//button[@data-original-title='Regresar']");
  public static final Target BTN_PENDIENTE_INCORPORACION = Target.the("el boton pendiente")
      .locatedBy("//tr[@role='row']//td[contains(text(),'{0}')]//parent::tr//button[@data-original-title='Pendiente']");
  public static final Target BTN_REGISTRAR_REGRESAR = Target.the("el boton de registro de regresar").located(By.id("btn-aceptar-regreso"));
  public static final Target BTN_REGISTRAR_PENDIENTE = Target.the("el boton de registro de pendiente").located(By.id("btn-aceptar-pendiente2"));
  public static final Target LST_INCORPORACION_HUY_NOMBRE = Target.the("la columna del nombre del credito")
          .locatedBy("//td[contains(text(),'{0}')]//parent::tr//a[@href='formOrigHuy.php?crid={0}']");

  private IncorporacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
