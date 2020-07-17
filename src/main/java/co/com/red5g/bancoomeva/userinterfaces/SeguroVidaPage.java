package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SeguroVidaPage {
  public static final Target TXT_PESO = Target.the("el peso").located(By.id("txtPeso"));
  public static final Target TXT_ESTATURA = Target.the("la estatura").located(By.id("txtEstatura"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton de colaborador").located(By.id("btnContinuar"));
  public static final Target RBN_ADICIONAR_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("addbenef"));
  public static final Target TXT_NOMBRES_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("benef[1][txtNombreBen]"));
  public static final Target TXT_APELLIDOS_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("benef[1][txtApellidosBen]"));
  public static final Target TXT_DOCUMENTO_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("benef[1][txtNumDocBen]"));
  public static final Target TXT_PORCENTAJE_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("benef[1][txtParticipacionBen]"));
  public static final Target TXT_EMAIL_BENEFICIARIO = Target.the("boton de colaborador").located(By.id("benef[1][txtEmail]"));
  public static final Target RBN_SALARIO_ESTABLE = Target.the("boton de colaborador").located(By.id("recSalario"));
  public static final Target RBN_SALARIO_NO_ESTABLE = Target.the("boton de colaborador").located(By.id("recInSalario"));

}
