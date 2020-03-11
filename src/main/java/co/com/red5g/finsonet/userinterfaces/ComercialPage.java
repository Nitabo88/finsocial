package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public final class ComercialPage {
    public static final Target LNK_NUEVO_CREDITO = Target.the("el link nuevo_credito").located(By.xpath("//h3[text()='Nuevo Crédito']//parent::a//div"));
    public static final Target LNK_NUEVO_CREDITO_HUY= Target.the("el link nuevo_credito").located(By.xpath("//h3[text()='Nuevo Crédito Huy']//parent::a//div"));

    private ComercialPage() {
        throw new IllegalStateException("Utility class");
    }
}