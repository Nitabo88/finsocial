package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirmaPage {
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton de colaborador").located(By.id("aceptarYContinuar"));
  public static final Target TXT_CODIGO = Target.the("boton de colaborador").located(By.xpath("//input[@class='input-pass']"));
  public static final Target BTN_REGRESAR_INICIO = Target.the("boton de colaborador").located(By.id("btnContinuarUno"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS = Target.the("boton de colaborador").located(By.xpath("//span[text()=' Aceptar y continuar']//parent::button"));
  public static final Target TXT_CODIGO_RECUPERACION = Target.the("boton de colaborador").located(By.xpath("//input[@id='codigo']"));
  public static final Target CHK_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.id("inlineCheckbox1"));
  public static final Target LBL_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.xpath("//p[contains(text(),'ﬁrmo el presente formulario')]"));
  public static final Target BTN_ACEPTO_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.id("btnAceptoTerminos"));
  public static final Target BTN_CONTINUAR = Target.the("boton de colaborador").located(By.xpath("//button[contains(text(),'Continuar')]"));
  public static final Target BTN_SUBIR_DOCUMENTO = Target.the("boton de colaborador").located(By.xpath("//div[@class='bot']//div"));
  public static final Target LNK_INPUT = Target.the("boton de colaborador").located(By.xpath("//input[@class='subirArchivos']"));
  public static final Target SPN_CARGA = Target.the("boton de colaborador").located(By.xpath("//img[@class='logo']"));
}
