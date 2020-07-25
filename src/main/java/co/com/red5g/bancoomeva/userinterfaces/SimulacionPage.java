package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SimulacionPage {

  public static final Target BTN_AGREGAR_LIBRANZA = Target.the("boton de colaborador").located(By.id("btnAgregarLinea1"));
  public static final Target BTN_AGREGAR_CUPO_ACTIVO = Target.the("boton de colaborador").located(By.id("btnAgregarLinea2"));
  public static final Target TXT_MONTO_CREDITO_LIBRANZA = Target.the("boton de colaborador").located(By.id("txtMonto1"));
  public static final Target LST_PLAZO_LIBRANZA = Target.the("boton de colaborador").located(By.id("txtPlazo1"));
  public static final Target LBL_TASA_LIBRANZA = Target.the("boton de colaborador").located(By.id("tasa1"));
  public static final Target LBL_MODAL_INSUFICIENTE = Target.the("boton de colaborador").located(By.id("genericModalContent"));
  public static final Target BTN_ACEPTAR = Target.the("boton de colaborador").located(By.xpath("//button[text()='Aceptar']"));
  public static final Target BTN_GUARDAR = Target.the("boton de colaborador").located(By.id("btnAceptarLinea1"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton de colaborador").located(By.id("btnConfirmarProd"));
  public static final Target BTN_COLABORADOR = Target.the("boton de colaborador").located(By.xpath("//div[@class='div-login']"));
  public static final Target BTN_SALIR = Target.the("boton de colaborador").located(By.xpath("//p[text()='Salir']"));
  public static final Target LBL_CUOTA_CREDITO = Target.the("boton de colaborador").located(By.id("vlrCuota1"));
  public static final Target LBL_CUOTA_SEGURO_VIDA = Target.the("boton de colaborador").located(By.id("vlrCuotaSeguroVida1"));
  public static final Target LBL_VALOR_CREDITO = Target.the("boton de colaborador").located(By.id("vlrMonto1"));
  public static final Target LBL_BANCA_SEGURO = Target.the("boton de colaborador").located(By.id("vlrBancaSeguro1"));

  private SimulacionPage() {throw new IllegalStateException("Utility class");
  }
}
