package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.IFrame;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FirmaPage {

  private static final IFrame FRAME = IFrame.withPath(By.id("docFrame"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR = Target.the("boton aceptar y continuar").located(By.id("aceptarYContinuar"));
  public static final Target TXT_CODIGO = Target.the("el campo del codigo").located(By.xpath("//input[@class='input-pass']"));
  public static final Target BTN_REGRESAR_INICIO = Target.the("boton regresar a inicio").located(By.id("btnContinuarUno"));
  public static final Target BTN_ACEPTAR_Y_CONTINUAR_DOCUMENTOS = Target.the("boton de colaborador").located(By.xpath("//span[text()=' Aceptar y continuar']//parent::button"));
  public static final Target TXT_CODIGO_RECUPERACION = Target.the("el campo del codigo de recuperacion").located(By.xpath("//input[@id='codigo']"));
  public static final Target CHK_TERMINOS_Y_CONDICIONES = Target.the("checkbox de terminos y condiciones").located(By.id("inlineCheckbox1"));
  public static final Target LBL_TERMINOS_Y_CONDICIONES = Target.the("el texto de terminos y condiciones").located(By.xpath("//p[contains(text(),'ﬁrmo el presente formulario')]"));
  public static final Target BTN_ACEPTO_TERMINOS_Y_CONDICIONES = Target.the("boton de acepto terminos y condiciones").located(By.id("btnAceptoTerminos"));
  public static final Target BTN_CONTINUAR = Target.the("boton de continuar").located(By.xpath("//button[contains(text(),'Continuar')]"));
  public static final Target LNK_INPUT = Target.the("subir archivos").located(By.xpath("//input[@class='subirArchivos']"));
  public static final Target LBL_MENSAJE = Target.the("el mensaje de bancoomeva de felicitaciones").located(By.xpath("//div[@id='mensaje']"));
  public static final Target BTN_DOCUMENTO_0151 = Target.the("el documento 0151")
      .located(By.xpath("//p[contains(text(),'SUS-FO-0151 Solicitud certificado individual de se')]//ancestor::div[@class='grid-document']//button"));
  public static final Target LNK_FILE_0151 = Target.the("El boton de seleccionar archivo").inIFrame(FRAME).located(By.xpath("//embed"));
  public static final Target BTN_CERRAR_ARCHIVO = Target.the("El boton cerrar archivo").inIFrame(FRAME).located(By.xpath("//button[@id='btnRechazo']"));

  private FirmaPage() {
    throw new IllegalStateException("Utility class");
  }
}
