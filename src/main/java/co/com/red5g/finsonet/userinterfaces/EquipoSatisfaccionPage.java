package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.48:82/PQR/busqueda.php")

public class EquipoSatisfaccionPage extends PageObject {

    public static final Target BTN_NUEVO_CONTACT = Target.the("boton nueva solicitud contact").located(By.id("NuevaSolicitud"));
}
