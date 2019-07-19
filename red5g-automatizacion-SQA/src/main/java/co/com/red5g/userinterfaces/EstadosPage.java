package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class EstadosPage {
    public static final Target CHEQUEO_PAGE = Target.the("Lista de chequeo").located(By.xpath("//*[@id='sectionOr']/div/section/div[1]/h3"));
    public static final Target CONFIRMACION_PAGE = Target.the("Lista de confirmacion").located(By.xpath("//*[@id=\"sectionOr\"]/div/section/div[1]/h3"));
    public static final Target APROBACION_PAGE = Target.the("Lista de aprobacion").locatedBy("#sectionOr > div > section > div:nth-child(1) > h3");
    public static final Target INCORPORACION_PAGE = Target.the("Lista de incorporacion").locatedBy("#sectionOr > div > section > div:nth-child(1) > h3");
    public static final Target FORMALIZACION_PAGE = Target.the("Lista de formalizacion").locatedBy("#sectionOr > div > section > div:nth-child(1) > h3");
    public static final Target TESORERIA_PAGE = Target.the("Lista de tesoreria").locatedBy("#sectionOr > div > section > div:nth-child(2) > h3");
    public static final Target ANTECARTERA_PAGE = Target.the("Lista de antecartera").locatedBy("#sectionOr > div > section > div:nth-child(2) > h3");
    public static final Target GIROS_PAGE = Target.the("Lista de giros").locatedBy("#sectionOr > div > section > div:nth-child(1) > h3");
    public static final Target CARTERA_PAGE = Target.the("Lista de cartera").located(By.xpath("//*[@id=\"sectionOr\"]/div/section/div[1]/h3"));
}

//*[@id='sectionOr']//h3[@class='faq-title faq-title2']