package co.com.red5g.question;

import co.com.red5g.userinterfaces.ChequeoPage;
import co.com.red5g.userinterfaces.ConfirmPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class RegistroConfirm implements Question {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(ConfirmPage.BTN_OK, isCurrentlyEnabled());
        return Text.of(ConfirmPage.BTN_OK).viewedBy(actor).asString();

    }
}
