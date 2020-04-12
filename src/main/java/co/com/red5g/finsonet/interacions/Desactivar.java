package co.com.red5g.finsonet.interacions;

import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import org.openqa.selenium.JavascriptExecutor;

public class Desactivar implements Interaction {

  public static Desactivar ventanaSubirArchivo() {
    return new Desactivar();
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ((JavascriptExecutor) getProxiedDriver())
        .executeScript(
            "HTMLInputElement.prototype.click = function() { if(this.type !== 'file') HTMLElement.prototype.click.call(this); };");
  }
}
