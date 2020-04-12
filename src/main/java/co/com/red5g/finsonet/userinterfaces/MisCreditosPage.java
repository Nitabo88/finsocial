package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public final class MisCreditosPage {

    public static final Target LST_FILA_CREDITO_HUY = Target.the("La fila del credito huy")
        .locatedBy("//td[text()='CrediHuy']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]");
    public static final Target LST_FILA_CREDITO_LIBRANZA = Target.the("La fila del credito de libranza")
        .locatedBy("//td[text()='Libranza']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]");
    public static final Target LST_COLUMNA_PROCESO = Target.the("La columna del proceso a seguir")
        .locatedBy("//td[text()='Libranza']//parent::tr//td[contains(.,'{0}')]//parent::tr//td[contains(text(),'{1}')]//preceding-sibling::td//a");

    private MisCreditosPage() {
        throw new IllegalStateException("Utility class");
    }
}
