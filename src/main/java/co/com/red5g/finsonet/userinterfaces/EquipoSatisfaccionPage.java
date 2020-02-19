package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.48:82/PQR/busqueda.php")

public class EquipoSatisfaccionPage extends PageObject {

    public static final Target BTN_NUEVO_CONTACT = Target.the("boton nueva solicitud contact").located(By.id("NuevaSolicitud"));
    public static final Target TXT_DOCUMENTO = Target.the("input text documento").located(By.id("documento"));
    public static final Target LST_ASUNTO = Target.the("lista de asuntos").located(By.id("asunto2"));
    public static final Target LST_PROTOCOLOS = Target.the("lista de protocolos").located(By.id("protocolos"));
    public static final Target TXT_DETALLE = Target.the("input text detalle").located(By.id("detalle"));
    public static final Target TXT_DETALLE_PROTOCOLO = Target.the("input text detalle protocolo").located(By.id("detalleEnvio"));
    public static final Target BTN_ENVIAR_PROTOCOLO = Target.the("boton envio de protocolo").located(By.id("EnvioRespuestaContact"));
    public static final Target BTN_PRIMER_CONTACTO = Target.the("boton respuesta primer contacto").located(By.id("primerContacto"));
    public static final Target BTN_RESPUESTA_PROTOCOLO = Target.the("boton respuesta del protocolo").locatedBy(("//div[@class=\"col-md-12 text-center\"]//button[@onclick=\"getCertificados();\"]"));
    public static final Target BTN_CANAL_CONTACTO= Target.the("boton Whatsaap en canal contacto").locatedBy(("//div[@option='6']"));
    public static final Target BTN_CLOSE_PROTOCOLO= Target.the("boton cerrar protocolo").locatedBy(("//button[@class=\"swal2-close\"]"));
    public static final Target BTN_REALIZAR_ENCUESTA= Target.the("boton realizar encuesta").locatedBy(("//button[@onclick=\"irEncuesta();\"]"));
    public static final Target TXT_DOCUMENTO_ENCUESTA = Target.the("boton realizar encuesta").located(By.id("numId"));
    public static final Target SPN_PREGUNTA_1 = Target.the("boton realizar encuesta").located(By.id("respuesta11"));
    public static final Target SPN_PREGUNTA_2 = Target.the("boton realizar encuesta").located(By.id("respuesta21"));
    public static final Target BTN_ENCUESTA_GUARDAR = Target.the("boton guardar encuesta").located(By.id("btnGuardar"));
    public static final Target MNU_EQUIPO_SATISFACCION = Target.the("Hamburger equipo satisfaccion").located(By.id("hamburger"));
    public static final Target MNU_CONTACT_CENTER = Target.the("Hamburger equipo satisfaccion").located(By.id("pqr-main"));
    public static final Target MNU_BUSQUEDA_CONTACT = Target.the("Hamburger equipo satisfaccion").located(By.id("contact-busq"));
    public static final Target BTN_BUSQUEDA_CONTACT = Target.the("Hamburger equipo satisfaccion").located(By.id("buscarBtn"));
    public static final Target SPN_RADICADO_BUSQUEDA = Target.the("Hamburger equipo satisfaccion").located(By.id("rad"));


}
