package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ConfirmPage {
    public static final Target BTN_ACCION = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"table_n\"]/tbody/tr[1]/td[11]/div/button[2]"));
    //PREGUNTAR COMO HACER PARA QUE TENGA EN CUENTA LA ACCION QUE SE VA A REALIZAR YA QUE DEPENDIENDO DE LA FILA CAMBIA EL XPATH
    public static final Target BTN_CONFIRMAR = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"table_n\"]/tbody/tr[1]/td[11]/div/div/a[1]"));
    public static final Target BTN_ACEPTAR = Target.the("Lista de cartera").locatedBy("body > div.sweet-alert.showSweetAlert.visible > div.sa-button-container > div > button");
}
