package co.com.red5g.question;

import co.com.red5g.userinterfaces.ChequeoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.userinterfaces.LoginFinsocialComponent.CUENTA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;

public class RegistroChequeo  implements Question <String> {
    @Override
    public String answeredBy(Actor actor) {
        WaitUntil.the(ChequeoPage.TEXTO_REGISTRO, isCurrentlyEnabled());
        return Text.of(ChequeoPage.TEXTO_REGISTRO).viewedBy(actor).asString();
    }

    public static RegistroChequeo is (){

        return new RegistroChequeo();
    }
}
