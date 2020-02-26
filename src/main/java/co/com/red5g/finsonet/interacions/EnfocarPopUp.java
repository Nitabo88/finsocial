package co.com.red5g.finsonet.interacions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class EnfocarPopUp implements Interaction {

    public static Performable enfocarPopUp() {
        return instrumented(EnfocarPopUp.class);
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        BrowseTheWeb.as(actor).getDriver().switchTo().alert();
    }
}
