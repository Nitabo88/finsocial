package co.com.red5g.finsonet.questions.factories;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.LBL_MENSAJE_ERROR;

import co.com.red5g.finsonet.questions.MensajeError;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ElMensaje {

  private ElMensaje() {
  }

  public static Question<String> noRegistra() {
    return new MensajeError();
  }

  public static Question<String> deError() {
    return actor ->
        TextContent.of(LBL_MENSAJE_ERROR).viewedBy(actor).value();
  }
}
