package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BusquedaGestionRadicadosPage {

    public static final Target BTN_NUEVO_SOLICITUD = Target.the("boton nueva solicitud").located(By.id("NuevaSolicitud"));
    public static final Target BTN_NUEVO_PQRS = Target.the("boton nuevo PQRS").located(By.id("NuevoPQR"));
    public static final Target BTN_BUSQUEDA = Target.the("boton busqueda").located(By.id("buscarBtn"));
    public static final Target RDB_DOCUMENTO = Target.the("opcion documento").located(By.id("doc"));
    public static final Target RDB_RADICADO = Target.the("opcion radicado").located(By.id("rad"));
    public static final Target TXT_BUSQUEDA = Target.the("input de busqueda").located(By.id("buscarInput"));
    public static final Target TXT_CONTACT_CENTER = Target.the("el submenu contact center").located(By.xpath("//a[@title='Contact center']"));
    public static final Target LST_NUEVOS_INGRESOS = Target.the("la lista de nuevos ingresos").locatedBy("//span[text()='{0}']//ancestor::tr");

    private BusquedaGestionRadicadosPage() {
        throw new IllegalStateException("Utility class");
    }
}
