package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulacionPage {

  public static final Target BTN_AGREGAR_LIBRANZA = Target.the("boton agregar libranza").located(By.id("btnAgregarLinea1"));
  public static final Target BTN_AGREGAR_CUPO_ACTIVO = Target.the("boton agregar cupo activo").located(By.id("btnAgregarLinea2"));
  public static final Target TXT_MONTO_CREDITO_LIBRANZA = Target.the("el monto del credito de libranza").located(By.xpath("//input[@id='txtMonto1']"));
  public static final Target TXT_MONTO = Target.the("el monto del credito de libranza").located(By.id("txtMonto1"));
  public static final Target LST_PLAZO_LIBRANZA = Target.the("el plazo").located(By.id("txtPlazo1"));
  public static final Target LBL_TASA_LIBRANZA = Target.the("la tasa de libranza").located(By.id("tasa1"));
  public static final Target LBL_MODAL_INSUFICIENTE = Target.the("modal insuficiente").located(By.id("genericModalContent"));
  public static final Target BTN_ACEPTAR = Target.the("boton aceptar").located(By.xpath("//button[text()='Aceptar']"));
  public static final Target BTN_GUARDAR = Target.the("boton guardar").located(By.id("btnAceptarLinea1"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton aceptar y continuar").located(By.id("btnConfirmarProd"));
  public static final Target BTN_COLABORADOR = Target.the("boton de colaborador").located(By.xpath("//div[@class='div-login']"));
  public static final Target BTN_SALIR = Target.the("boton salir").located(By.xpath("//p[text()='Salir']"));
  public static final Target LBL_CUOTA_CREDITO = Target.the("vuota credito").located(By.id("vlrCuota1"));
  public static final Target LBL_CUOTA_SEGURO_VIDA = Target.the("cuota seguro de vida").located(By.id("vlrCuotaSeguroVida1"));
  public static final Target LBL_VALOR_CREDITO = Target.the("valor credito").located(By.id("vlrMonto1"));
  public static final Target LBL_BANCA_SEGURO = Target.the("valor banca seguro").located(By.id("vlrBancaSeguro1"));
  public static final Target LBL_OFERTA_PREAPROBADA = Target.the("valor oferta pre-aprobada").located(By.xpath("//div[@id='linea1']//p[contains(text(),'Valor de la oferta pre-aprobada:')]//span"));
  public static final Target LBL_MAXIMO_CANAL = Target.the("el valor maximo por canal").located(By.xpath("//div[@id='linea1']//p[contains(text(),'Valor máximo a solicitar por este canal:')]//span"));
  public static final Target CHK_BANCA_SEGURO = Target.the("el checkbox de banca seguro").located(By.id("bancaSeguro1"));
  public static final Target TBL_CONFIRMACION_PRODUCTOS = Target.the("confirmacion de productos").located(By.id("formConfirmarProd"));

  private SimulacionPage() {throw new IllegalStateException("Utility class");
  }
}
