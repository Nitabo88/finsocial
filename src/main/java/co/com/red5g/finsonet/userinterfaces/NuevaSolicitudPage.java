package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NuevaSolicitudPage {

    public static final Target BTN_RESPUESTA_PROTOCOLO = Target.the("boton respuesta del protocolo").locatedBy(("//button[@onclick='getCertificados();']"));
    public static final Target BTN_CANAL_CONTACTO = Target.the("boton canal contacto").locatedBy(("//div[@option='{0}']"));
    public static final Target BTN_GUARDAR = Target.the("boton guardar creacion PQRS").located(By.id("Creacion"));
    public static final Target BTN_ACEPTAR = Target.the("boton guardar creacion PQRS").located(By.xpath("//button[text()='Aceptar']"));
    public static final Target BTN_CLOSE_PROTOCOLO = Target.the("boton cerrar protocolo").locatedBy(("//button[@class='swal2-confirm swal2-styled']"));
    public static final Target TXT_DOCUMENTO = Target.the("input text documento").located(By.id("documento"));
    public static final Target LST_ASUNTO = Target.the("lista de asuntos").located(By.id("asunto"));
    public static final Target TXT_DETALLE = Target.the("el detalle de la solicitud").located(By.id("detalle"));
    public static final Target BTN_PRIMER_CONTACTO = Target.the("boton primer contacto").located(By.id("primerContacto"));
    public static final Target LST_PROTOCOLOS = Target.the("lista de protocolos").located(By.id("protocolos"));
    public static final Target TXT_DETALLE_PROTOCOLO = Target.the("el detalle del protocolo").located(By.id("detalleEnvio"));
    public static final Target BTN_ENVIAR_PROTOCOLO = Target.the("boton envio de protocolo").located(By.id("EnvioRespuestaContact"));
    public static final Target LBL_CREACION_PQRS = Target.the("label creacion PQRS").located(By.xpath("//p[contains(text(), 'Su número de radicado es:')]"));
    public static final Target LBL_NOMBRE_NUEVO_INGRESO_PQRS = Target.the("el nombre de nuevo ingreso").locatedBy("//tr[@id='tr-{0}']//a");

    private NuevaSolicitudPage() {
        throw new IllegalStateException("Utility class");
    }
}
