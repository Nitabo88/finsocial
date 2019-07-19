package co.com.red5g.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.red5g.userinterfaces.LoginFinsocialComponent.CUENTA;

public class VerificarIngreso  implements Question <String> {

    @Override
    public String answeredBy(Actor actor) {

        return Text.of(CUENTA).viewedBy(actor).asString();
    }

    public static VerificarIngreso is (){

        return new VerificarIngreso();
    }
}
