package co.com.red5g.general.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.devco.automation.web.ChangeToTab;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.JavascriptExecutor;

public class OpenNewTab implements Interaction {

  String url;
  private static final int NEW_TAB_INDEX = 1;
  private static final String JS_COMMAND_FOR_NEW_TAB = "window.open('');";

  public OpenNewTab(String url) {
    this.url = url;
  }

  public static OpenNewTab onBrowser(String url) {
    return instrumented(OpenNewTab.class, url);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    try {
      ((JavascriptExecutor) BrowseTheWeb.as(actor).getDriver()).executeScript(JS_COMMAND_FOR_NEW_TAB);
      actor.attemptsTo(
          ChangeToTab.withIndex(NEW_TAB_INDEX),
          ChangeUrl.onBrowser(url));
    } catch (Exception ex) {
      Logger.getAnonymousLogger().log(Level.SEVERE, "Could not open a new tab window", ex);
    }
  }
}
