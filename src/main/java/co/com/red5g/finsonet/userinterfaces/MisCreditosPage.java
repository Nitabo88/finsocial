package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MisCreditosPage {
    public static final Target LST_FILA_CREDITOS = Target.the("La fila del credito").locatedBy("//td[contains(.,'{0}')]//parent::tr[contains(.,'{1}')]//child::td");

    private MisCreditosPage() {
        throw new IllegalStateException("Utility class");
    }
}
