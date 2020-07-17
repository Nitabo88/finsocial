package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ValidacionPage {

  public static final Target LBL_MENSAJE_BIENVENIDA = Target.the("el mensaje de bienvenida").located(By.xpath("//h3[text()='¡Bienvenido, estas en modo call center!']"));
  public static final Target LST_TIPO_DOCUMENTO = Target.the("el tipo de documento").located(By.id("txtTipoIdentificacion"));
  public static final Target TXT_NUMERO_DOCUMENTO = Target.the("el numero de documento").located(By.id("txtIdentificacion"));
  public static final Target CHK_TERMINOS_Y_CONDICIONES = Target.the("selecciona check de terminos y condiciones").located(By.name("chkTerminos"));
  public static final Target BTN_ACEPTO_TERMINOS_Y_CONDICIONES = Target.the("acepta terminos y condiciones").located(By.id("btnAceptoTerminos"));
  public static final Target BTN_CONTINUAR = Target.the("el boton continuar").located(By.id("btnContinuarUno"));
  public static final Target TXT_ACEPTO_TERMINOS_Y_CONDICIONES = Target.the("acepta terminos y condiciones").located(By.xpath("//p[contains(text(),'ﬁrmo el presente formulario.')]"));
  public static final Target BTN_CONTINUAR_DATOS = Target.the("acepta terminos y condiciones").located(By.id("btnContinuarProceso"));
  public static final Target BTN_ACEPTO = Target.the("acepta terminos y condiciones").located(By.id("btnAcepto"));
  public static final Target LNK_RECUPERACION = Target.the("acepta terminos y condiciones").located(By.id("//a[contains(text(),'Tengo un código de recuperación.')]"));
}
