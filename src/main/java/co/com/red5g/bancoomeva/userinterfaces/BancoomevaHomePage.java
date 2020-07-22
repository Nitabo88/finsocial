package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://10.10.1.55:8085/")
public class BancoomevaHomePage extends PageObject {

  public static final Target FRM_BODY = Target.the("boton de colaborador").locatedBy("body");
  public static final Target BTN_SOY_COLABORADOR = Target.the("boton de colaborador").located(By.xpath("//button[contains(.,'Soy colaborador')]"));
  public static final Target LNK_CODIGO_RECUPERACION = Target.the("boton de colaborador").located(By.xpath("//a[contains(text(),'Tengo un código de recuperación.')]"));
  public static final Target SPN_CARGA = Target.the("boton de colaborador").located(By.xpath("//a[contains(text(),'Tengo un código de recuperación.')]"));
}
