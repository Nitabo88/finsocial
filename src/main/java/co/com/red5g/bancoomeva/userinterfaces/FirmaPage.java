package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirmaPage {
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton de colaborador").located(By.id("aceptarYContinuar"));
  public static final Target TXT_CODIGO_RECUPERACION = Target.the("boton de colaborador").located(By.xpath("//input[@id='codigo']"));
  public static final Target CHK_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.id("inlineCheckbox1"));
  public static final Target LBL_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.xpath("//p[contains(text(),'ﬁrmo el presente formulario')]"));
  public static final Target BTN_ACEPTO_TERMINOS_Y_CONDICIONES = Target.the("boton de colaborador").located(By.id("btnAceptoTerminos"));
  public static final Target BTN_CONTINUAR = Target.the("boton de colaborador").located(By.xpath("//button[contains(text(),'Continuar')]"));
  public static final Target BTN_UPLOAD_FILE = Target.the("boton de colaborador").located(By.xpath("//span[text()='Adjuntar Documento']"));
  public static final Target LNK_FILE = Target.the("boton de colaborador").located(By.xpath("//span[text()='Adjuntar Documento']"));

}
