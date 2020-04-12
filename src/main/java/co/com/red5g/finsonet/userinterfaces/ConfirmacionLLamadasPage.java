package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionLLamadasPage {

  public static final Target CHK_RESPUESTA_CUATRO = Target.the("Seleccionar la cuarta pregunta").locatedBy("//input[@id='respuesta-1-{0}']");
  public static final Target CHK_RESPUESTA_QUINTO = Target.the("Seleccionar la quinta pregunta").locatedBy("//input[@id='respuesta-7-{0}']");
  public static final Target TXT_OBSERVACION_LLAMADA = Target.the("Campo de observacion llamada").locatedBy("//textarea[@id='textarea-{0}']");
  public static final Target BTN_CERTIFICACION_LLAMADAS = Target.the("Campo de certificación de la llamada").locatedBy("//button[text()='Regresar']");
  public static final Target BTN_ACEPTAR = Target.the("Campo de advertencia para guardar").locatedBy("//button[text()='Aceptar']");
  public static final Target BTN_GUARDAR = Target.the("Campo para guardar la gestión").locatedBy("//button[@onclick='marcaLlamadaExitosa({0}, 1);']");

  private ConfirmacionLLamadasPage() {
    throw new IllegalStateException("Utility class");
  }
}
