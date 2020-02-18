package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.IngresaAContact;
import co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage;
import static co.com.red5g.finsonet.userinterfaces.EquipoSatisfaccionPage.BTN_NUEVO_CONTACT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;

public class ContactCenter implements Task {

    public static Performable ubicarseEnContactCenter() {
        return instrumented(ContactCenter.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                IngresaAContact.NuevaSolicitudContact(),
                WaitUntil.the(BTN_NUEVO_CONTACT, isEnabled()));
    }
}
