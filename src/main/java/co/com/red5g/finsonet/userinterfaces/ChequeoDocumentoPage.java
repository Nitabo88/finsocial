package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChequeoDocumentoPage {
    public static final Target BTN_PENDIENTE = Target.the("Boton de estado en chequeo de documentos").locatedBy(("//*[@id=\"boton\"]"));
    public static final Target LST_MODAL_DEFAULT = Target.the("Clickear en lista de motivos en chequeo de documentos").located(By.id("motivo") );
    public static final Target LST_MODAL_CHECK1 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 2").locatedBy("//*[@id=\"motivo\"]/option[2]");
    public static final Target LST_MODAL_CHECK2 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 3").locatedBy("//*[@id=\"motivo\"]/option[3]");
    public static final Target LST_MODAL_CHECK3 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 4").locatedBy("//*[@id=\"motivo\"]/option[4]");
    public static final Target LST_MODAL_CHECK4 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 5").locatedBy("//*[@id=\"motivo\"]/option[5]");
    public static final Target LST_MODAL_CHECK5 = Target.the("Seleccionar motivo de la lista en chequeo de documentos Opcion 6").locatedBy("//*[@id=\"motivo\"]/option[6]");
    public static final Target BTN_MODAL_ENVIAR = Target.the("Enviar motivo en chequeo de documentos").located(By.id("boton2") );

}
