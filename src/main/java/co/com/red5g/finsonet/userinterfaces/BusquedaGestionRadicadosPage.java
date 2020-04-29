package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class BusquedaGestionRadicadosPage {

    public static final Target BTN_NUEVO_SOLICITUD = Target.the("boton nueva solicitud").located(By.id("NuevaSolicitud"));
    public static final Target BTN_BUSQUEDA = Target.the("boton busqueda").located(By.id("buscarBtn"));
    public static final Target RDB_DOCUMENTO = Target.the("opcion documento").located(By.id("doc"));
    public static final Target RDB_RADICADO = Target.the("opcion radicado").located(By.id("rad"));
    public static final Target TXT_BUSQUEDA = Target.the("input de busqueda").located(By.id("buscarInput"));
    public static final Target LST_SOLICITUD_CONTACT_CENTER = Target.the("la solicitud de contact center").locatedBy("//td[contains(text(),'{0}')]//parent::tr//td//p");

    public BusquedaGestionRadicadosPage() {
        throw new IllegalStateException("Utility class");
    }
}
