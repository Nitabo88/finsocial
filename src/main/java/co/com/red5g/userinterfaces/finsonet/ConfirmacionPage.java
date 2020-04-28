package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class ConfirmacionPage {

    public static final Target LST_FILA_CONFIRMACION = Target.the("la fila de la tabla")
        .locatedBy("//tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]//parent::td//parent::tr");
    public static final Target BTN_ACCION_CONFIRMACION = Target.the("el boton de accion")
        .locatedBy("//tr[@role='row']//td[@style='text-align: left']//a[contains(@href,'{0}')]//parent::td//parent::tr//button[@class='btn btn-primary dropdown-toggle dropdown-toggle-split']");
    public static final Target MNM_ACCION = Target.the("el menu de acciones de confirmacion").locatedBy("//div[@class='btn-group open']//div[@class='dropdown-menu']//a[contains(.,'{0}')]");
    public static final Target BTN_OK = Target.the("el boton ok de confirmacion").located(By.xpath("//button[@class='confirm']"));
    public static final Target TXT_MOTIVO = Target.the("motivo de regresar el credito").located(By.xpath("//input[@placeholder='Motivo']"));
    public static final Target LBL_CREDITO_REGRESADO = Target.the("credito regresado").located(By.xpath("//p[contains(.,'CRÉDITO REGRESADO')]"));
    public static final Target LST_MOTIVO_PENDIENTE = Target.the("motivo estado pendiente").located(By.id("motivo"));
    public static final Target TXT_MOTIVO_PENDIENTE = Target.the("detalle del estado pendiente").located(By.id("area"));
    public static final Target BTN_ACEPTAR = Target.the("Boton aceptar").located(By.id("boton2"));
    public static final Target BTN_ACCION_PENDIENTE_HUY = Target.the("Boton aceptar")
        .locatedBy("//td[text()='CrediHuy']//parent::tr//a[contains(@href,'{0}')]//ancestor::tr//button[@data-toggle='dropdown']");
    public static final Target LST_FILA_CONFIRMACION_PENDIENTE = Target.the("la fila de la tabla")
        .locatedBy("//table[@id='table_p']//a[contains(@href,'{0}')]//ancestor::tr");

    private ConfirmacionPage() {
        throw new IllegalStateException("Utility class");
    }
}