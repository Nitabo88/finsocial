package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class ConfirmacionPage {
    public static final Target LST_FILA_CONFIRMACION = Target.the("la fila de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]");

}
