package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LlamadasPage {
    public static final Target MNU_HAMBURGER = Target.the("menu de acceso modulo llamadas").located(By.id("hamburger"));
    public static final Target CHK_ID_LLAMADAS = Target.the("menu de acceso modulo llamadas").locatedBy("//input[@id='chk-{0}']");
    public static final Target BTN_ASIGNACION_LIBRANZA = Target.the("boton de asignacion credito libranza").located(By.id("botonLibranza"));
    public static final Target BTN_ASIGNACION_HUY= Target.the("boton de asignacion credito huy").located(By.id("botonHuy"));
    public static final Target BTN_CONFIRMAR_LLAMADAS = Target.the("menu de acceso modulo llamadas").locatedBy("//button[@class='swal2-confirm btn confirm-button-class-green swal2-styled']");
    public static final Target LST_FILA_LLAMADAS = Target.the("la fila de llamadas asignadas").locatedBy("//tr[@id='listLlamadas-{0}']//span[@class='fas fa-phone-alt']");
    public static final Target CHK_RESPUESTA_CUATRO = Target.the("Seleccionar la cuarta pregunta").locatedBy("//input[@id='respuesta-1-{0}']");
    public static final Target CHK_RESPUESTA_QUINTO = Target.the("Seleccionar la quinta pregunta").locatedBy("//input[@id='respuesta-7-{0}']");
    public static final Target TXT_OBSERVACION_LLAMADA = Target.the("Campo de observacion llamada").locatedBy("//textarea[@id='textarea-{0}']");
    public static final Target BTN_CERTIFICACION_LLAMADAS = Target.the("Campo de observacion llamada").locatedBy("//button[text()='Aceptar']");
    public static final Target BTN_ADVERTENCIA_GUARDAR = Target.the("Campo de observacion llamada").locatedBy("//button[text()='Regresar']");
    public static final Target BTN_GUARDAR_GESTION = Target.the("Campo de observacion llamada").located(By.id("btnGuardar"));




}
