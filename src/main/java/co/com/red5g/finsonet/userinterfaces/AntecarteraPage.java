package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AntecarteraPage {

    public static final Target LST_FILA_ANTECARTERA = Target.the("la fila de la tabla de antercartera").locatedBy("//div[@id='fixed-table-container-1']//table[@class='tab-sort tablesorter tablesorter-default']//td[text()='{0}']//parent::tr");

    private AntecarteraPage() {
        throw new IllegalStateException("Utility class");
    }
}
