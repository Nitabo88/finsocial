package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionLLamadasPage {

  public static final Target CHK_RESPUESTA_UNO =
      Target.the("¿Está usted tramitando su crédito desde la página de finsocial?")
          .locatedBy(
              "//input[@id='rdPreg-{0}-6']//following-sibling::span[contains(text(),'Sí')]");
  public static final Target CHK_RESPUESTA_CUATRO =
      Target.the("¿Cuando ha obtenido un crédito por libranza lo hizo para?")
          .locatedBy("//input[@data-info='4-{0}-{1}']//following-sibling::span");
  public static final Target CHK_RESPUESTA_QUINTO = Target.the("¿Cuál fue su prioridad al obtener un crédito por libranza?").locatedBy("//input[@data-info='5-{0}-{1}']//following-sibling::span");
  public static final Target CHK_FORMA_GIRO = Target.the(" Forma de giro").locatedBy("//input[@id='rdGiro{0}-{1}']");
  public static final Target CHK_TIPO_CONFIRMACION =
      Target.the("Tipo de Confirmación")
          .locatedBy("//input[@name='rdTipoConf-{0}'][@value='1']");
  public static final Target TXT_OBSERVACION_LLAMADA = Target.the("Campo de observacion llamada").locatedBy("//textarea[@id='textarea-{0}']");
  public static final Target BTN_CERTIFICACION_LLAMADAS = Target.the("Campo de certificación de la llamada").locatedBy("//button[text()='Regresar']");
  public static final Target BTN_ACEPTAR = Target.the("Campo de advertencia para guardar").locatedBy("//button[text()='Aceptar']");
  public static final Target BTN_GUARDAR = Target.the("Campo para guardar la gestión").locatedBy("//button[@onclick='marcaLlamadaExitosa({0}, 1);']");

  private ConfirmacionLLamadasPage() {
    throw new IllegalStateException("Utility class");
  }
}
