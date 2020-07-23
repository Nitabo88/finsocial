package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class ComercialPage {
    public static final Target LNK_NUEVO_CREDITO = Target.the("el link nuevo_credito").located(By.xpath("//h3[text()='Nuevo Crédito']//parent::a//div"));
    public static final Target LNK_NUEVO_CREDITO_HUY = Target.the("el link nuevo_credito").located(By.xpath("//h3[text()='Nuevo Crédito Huy']//parent::a//div"));
    public static final Target LNK_MIS_CREDITOS = Target.the("el link mis creditos").located(By.id("mis_creditos"));
    public static final Target LNK_CREDITOS_POR_CONFIRMAR = Target.the("el link creditos por confirmar").located(By.id("por_confirmar"));

    private ComercialPage() {
        throw new IllegalStateException("Utility class");
    }
}