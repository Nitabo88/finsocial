package co.com.red5g.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OriginacionPage {
    public static final Target ORIGINACION_BUTTON = Target.the("Originacion Button").located(By.id("origin"));
    public static final Target LINK_CHEQUEO_DOCUMENTOS = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[1]/a/span"));
    public static final Target LINK_CONFIRMACION = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[2]/a/span"));
    public static final Target LINK_APROBACION = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[3]/a/span"));
    public static final Target LINK_INCORPORACION = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[5]/a/span"));
    public static final Target LINK_FORMALIZACION = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[6]/a/span"));
    public static final Target LINK_TESORERIA = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[7]/a/span"));
    public static final Target LINK_ANTECARTERA = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[8]/a/span"));
    public static final Target LINK_GIROS = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[9]/a/span"));
    public static final Target LINK_CARTERA = Target.the("Source Language Button").located(By.xpath("//*[@id=\"accordionOr2\"]/li[10]/a/span"));
}

