package co.com.red5g.bancoomeva.questions.factories;

import static co.com.red5g.bancoomeva.userinterfaces.BancaExpressLoginPage.LBL_ERROR;
import static co.com.red5g.bancoomeva.userinterfaces.DashBoardPage.LBL_MENSAJE_DASHBOARD;
import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LST_PRODUCTO_CORREO;

import co.com.red5g.bancoomeva.questions.CartaComercial;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Mensaje {

  private Mensaje() {
  }

  public static Question<String> deBienvenida() {
    return actor -> Text.of(LBL_MENSAJE_DASHBOARD).viewedBy(actor).value();
  }

  public static Question<String> deError() {
    return actor -> Text.of(LBL_ERROR).viewedBy(actor).value();
  }

  public static Question<String> deCartaComercial() {
    return new CartaComercial();
  }

    public static Question<String> deCartaComercial(String posicion) {
    return actor -> Text.of(LST_PRODUCTO_CORREO.of(posicion)).viewedBy(actor).value();
  }
}
