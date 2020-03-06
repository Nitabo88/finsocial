package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IncorporacionPage {

  public static final Target LST_FILA_INCORPORACION = Target.the("la fila de la tabla de incorporacion").locatedBy("//h2[text()='Incorporación de créditos']//ancestor::div[@class='panel "
      + "panel-green']//td[contains(.,'{0}')]//parent::tr");
  public static final Target LST_FILA_PENDIENTE_INCORPORACION = Target.the("la fila de pendientes en la tabla de incorporacion").locatedBy("//div//h2[text()='Incorporación "
      + "pendiente']//ancestor::div[@class='panel panel-green']//td[text()='{0}']//parent::tr");
  public static final Target LST_MOTIVO_DEVOLUCION = Target.the("la fila del motivo de devolucion").located(By.id("txtMotivo2"));
  public static final Target LST_TIPO_DEVOLUCION = Target.the("el tipo de devolucion").located(org.openqa.selenium.By.id("txtTipoDev"));
  public static final Target LST_SOLICITADO_POR = Target.the("la lista de solicitado por del cuadro emergente").located(org.openqa.selenium.By.id("txtAut"));
  public static final Target LST_INCORPORACION_NOMBRE = Target.the("la lista de solicitado por del cuadro emergente").locatedBy("//h2[text()='Incorporación de "
      + "créditos']//ancestor::div[@class='panel panel-green']//td[contains(.,'{0}')]//parent::tr//a[@class='faq-link']");
  public static final Target TXT_MOTIVO = Target.the("el motivo de regreso").located(org.openqa.selenium.By.id("txtMotivo"));
  public static final Target LBL_INCORPORACION = Target.the("el texto de incorporacion").located(org.openqa.selenium.By.xpath("//h1[text()='Incorporación']"));
  public static final Target TXT_DETALLE = Target.the("el detalle de pendiente").located(org.openqa.selenium.By.id("txtDetalle2"));
  public static final Target BTN_ACEPTAR = Target.the("el boton aceptar").located(org.openqa.selenium.By.xpath("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']"));
  public static final Target BTN_OK = Target.the("el boton aceptar").located(org.openqa.selenium.By.xpath("//button[text()='OK']"));
  public static final Target BTN_APROBAR = Target.the("el boton aprobar").located(org.openqa.selenium.By.xpath("//button[text()='Aprobar']"));
  public static final Target MNU_HAMBURGUESA = Target.the("el menu hamburguesa").located(org.openqa.selenium.By.id("hamburger"));
  public static final Target MNU_APROBACION_CREDITO = Target.the("el menu aprobacion credito").located(org.openqa.selenium.By.id("or-aprob"));
  public static final Target BTN_REGRESAR_INCORPORACION = Target.the("el boton regresar")
      .locatedBy("//tr[@role='row']//td[contains(text(),'{0}')]//parent::tr//button[@data-original-title='Regresar']");
  public static final Target BTN_PENDIENTE_INCORPORACION = Target.the("el boton pendiente")
      .locatedBy("//tr[@role='row']//td[contains(text(),'{0}')]//parent::tr//button[@data-original-title='Pendiente']");
  public static final Target BTN_REGISTRAR_REGRESAR = Target.the("el boton de registro de regresar").located(org.openqa.selenium.By.id("btn-aceptar-regreso"));
  public static final Target BTN_REGISTRAR_PENDIENTE = Target.the("el boton de registro de pendiente").located(org.openqa.selenium.By.id("btn-aceptar-pendiente2"));

  private IncorporacionPage() {
    throw new IllegalStateException("Utility class");
  }
}
