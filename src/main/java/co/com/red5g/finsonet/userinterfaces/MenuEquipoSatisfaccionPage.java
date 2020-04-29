package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuEquipoSatisfaccionPage {

    public static final Target MNM_PQR = Target.the("menu PQR").locatedBy(("//div[@id='sticky-wrapper']//li[@class='dropdown'][contains(.,'PQR')]"));
    public static final Target MNM_SUBMENU_PQR = Target.the("submenu PQR").locatedBy(("//li[@class='dropdown open']//ul[@class='dropdown-menu']//li//span[@class='menu--label'][contains(text(),'{0}')]"));

    private MenuEquipoSatisfaccionPage() {
        throw new IllegalStateException("Utility class");
    }
}
