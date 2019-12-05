package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ListadoChequeoDocumentoPage {
    public static final Target BTN_MODAL_PAPELERIA_NUEVA = Target.the("Boton del modal de papeleria opcion papeleria nueva").locatedBy(("//*[@id=\"modPapeleria\"]/div/div/div[2]/div/div[1]/div/div[1]/label"));
    public static final Target BTN_MODAL_PAPELERIA_ANTIGUA = Target.the("Boton del modal de papeleria opcion papeleria antigua").locatedBy(("//*[@id=\"modPapeleria\"]/div/div/div[2]/div/div[1]/div/div[2]/label"));
    public static final Target BTN_PAPELERIA_ACEPTAR = Target.the("Boton aceptar del modal de papeleria").located(By.id("btn-aceptar-1"));
    public static final Target BTN_MODAL_PAPELERIA_ANTIGUA_COOP = Target.the("Boton del modal de afianzado opcion coophumana").locatedBy(("//*[@id=\"modAfianzado\"]/div/div/div[2]/div/div[1]/div/div[1]/label"));
    public static final Target BTN_MODAL_PAPELERIA_ANTIGUA_ACTIVAL = Target.the("Boton del modal de afianzado opcion coophumana").locatedBy(("//*[@id=\"modAfianzado\"]/div/div/div[2]/div/div[1]/div/div[2]/label"));
    public static final Target BTN_PAPELERIA_ANTIGUA_ACEPTAR = Target.the("Boton aceptar del modal de afianzado").located(By.id("btn-aceptar-2"));

}
