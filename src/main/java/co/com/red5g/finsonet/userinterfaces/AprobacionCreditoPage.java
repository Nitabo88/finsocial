package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class AprobacionCreditoPage {

  public static final Target BTN_APROBAR = Target.the("El boton aprobar").located(By.xpath("//button[contains(.,'Aprobar')]"));
  public static final Target LBL_POLITICAS_CREDITO = Target.the("El label de politicas de credito").located(By.xpath("//h3[contains(.,'Políticas del crédito')]"));
  public static final Target BTN_OK = Target.the("El boton ok").located(By.xpath("//button[@class='confirm'][contains(.,'OK')]"));
  public static final Target BTN_ENVIAR = Target.the("El boton enviar").located(By.id("boton2"));
  public static final Target MNU_ACCION = Target.the("el menu de acciones de aprobacion de credito").locatedBy("//div[@class='btn-group open']//div[@class='dropdown-menu']//a[contains(.,'{0}')]");
  public static final Target LST_MOTIVO = Target.the("Lista de motivos en aprobacion de credito").located(By.id("motivo"));
  public static final Target LST_PENDIENTE_APROBACION_CREDITO = Target.the("Fila de los creditos pendientes en aprobacion de credito").locatedBy("//table[@id='table_p']//a[@class='faq-link"
      + "'][contains(@href,'{0}')]//ancestor::tr");
  public static final Target LST_FILA_APROBACION_CREDITO = Target.the("la fila de la tabla de aprobacion creditos").locatedBy("//table[@id='table_n']//tr//td[@style='text-align: left']//a[contains"
      + "(@href,'{0}')]//ancestor::tr");
  public static final Target TXT_MOTIVO = Target.the("motivo de regresar el credito").located(By.id("area"));


  private AprobacionCreditoPage() {
    throw new IllegalStateException("Utility class");
  }
}
