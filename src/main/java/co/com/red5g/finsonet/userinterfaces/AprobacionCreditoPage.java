package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;



public class AprobacionCreditoPage {
  public static final Target BTN_APROBAR = Target.the("El boton aprobar").located(By.xpath("//button[contains(.,'Aprobar')]"));
  public static final Target LBL_POLITICAS_CREDITO = Target.the("El label de politicas de credito").located(By.xpath("//h3[contains(.,'Políticas del crédito')]"));
  public static final Target BTN_OK = Target.the("El boton ok").located(By.xpath("//button[@class='confirm'][contains(.,'OK')]"));
  public static final Target BTN_ENVIAR = Target.the("El boton enviar").located(By.id("boton2"));
  public static final Target BTN_ENVIAR_NEGACION = Target.the("El boton enviar").located(By.xpath("//div[@id='mRechNeg']//button[contains(@class,'btn btn-primary')][contains(text(),'Enviar')]"));
  public static final Target BTN_NEGAR = Target.the("El boton negar").located(By.xpath("//button[contains(text(),'Negar')]"));
  public static final Target MNM_ACCION = Target.the("el menu de acciones de aprobacion de credito")
      .locatedBy("//div[@class='btn-group open']//div[@class='dropdown-menu']//a[contains(.,'{0}')]");
  public static final Target LST_MOTIVO = Target.the("Lista de motivos en aprobacion de credito").located(By.id("motivo"));
  public static final Target LST_MOTIVO_NEGAR = Target.the("Lista de motivos en la negacion del credito").located(By.id("motivo5"));
  public static final Target LST_PENDIENTE_APROBACION_CREDITO = Target.the("Fila de los creditos pendientes en aprobacion de credito")
          .locatedBy("//table[@id='table_p']//a[@class='faq-link'][contains(@href,'{0}')]//ancestor::tr");
  public static final Target LST_FILA_APROBACION_CREDITO = Target.the("la fila de la tabla de aprobacion creditos")
          .locatedBy("//table[@id='table_n']//tr//td[@style='text-align: left']//a[contains"
                  + "(@href,'{0}')]//ancestor::tr");
  public static final Target TXT_MOTIVO = Target.the("motivo de regresar el credito").located(By.id("area"));
  public static final Target TXT_MOTIVO_NEGACION = Target.the("motivo de negar el credito").located(By.id("area4"));
  public static final Target LBL_NOMBRE_FINSOAMIGO = Target.the("la columna del nombre del finsoamigo")
          .locatedBy("//td[text()='Finsoamigo']//parent::tr//a[@class='faq-link']");
  public static final Target LST_FILA_APROBACION_CREDITO_HUY = Target.the("la fila de la tabla de aprobacion creditos huy")
          .locatedBy("//td[text()='CrediHuy']//parent::tr//a[contains(@href,'{0}')]//ancestor::tr");
  public static final Target LST_NOMBRE_APROBACION_CREDITO_HUY = Target.the("el nombre de la tabla de aprobacion creditos huy")
          .locatedBy("//td[text()='CrediHuy']//parent::tr//a[contains(@href,'{0}')]//ancestor::tr//a[@class='faq-link']");
  public static final Target BTN_NORMALIZAR_CREDITO_HUY = Target.the("el boton de normalizar credito")
          .locatedBy("//td[text()='CrediHuy']//parent::tr//a[contains(@href,'64597')]//ancestor::tr//button");
  public static final Target LST_PENDIENTE_APROBACION_CREDIHUY = Target.the("Fila de los crediHuy pendientes en aprobacion de credito")
          .locatedBy("//table[@id='table_p']//td[text()='CrediHuy']//parent::tr//a[@class='faq-link'][contains(@href,'{0}')]//ancestor::tr");

  private AprobacionCreditoPage() {
    throw new IllegalStateException("Utility class");
  }
}
