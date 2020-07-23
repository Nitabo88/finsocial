package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

public class Desactivar implements Interaction {

  public static Desactivar ventanaSubirArchivo() {
    return new Desactivar();
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver())
        .executeScript(
            "HTMLInputElement.prototype.click = function() { if(this.type !== 'file') HTMLElement.prototype.click.call(this); };");
  }
}
