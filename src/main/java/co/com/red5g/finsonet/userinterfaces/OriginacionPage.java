package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public final class OriginacionPage {
    public static final Target MNM_HAMBURGUESA = Target.the("El menu hamburguesa").locatedBy("#hamburger");
    public static final Target MNM_ORIGINACION = Target.the("El menu de originacion").locatedBy("//div[@class='col-md-11 col-sm-7 header-menu']//span[@class='menu--label'][contains(text(),'{0}')]");
    public static final Target MNM_NUEVO_ORIGINACION = Target.the("El menu nuevo de originacion").locatedBy("//div[@id='menuOr']//a[@title='{0}']");

    private OriginacionPage() {
        throw new IllegalStateException("Utility class");
    }
}