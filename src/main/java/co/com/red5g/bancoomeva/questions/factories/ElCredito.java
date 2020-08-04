package co.com.red5g.bancoomeva.questions.factories;

import co.com.red5g.bancoomeva.questions.BandejaCallCenter;
import net.serenitybdd.screenplay.Question;

public class ElCredito {

  public static Question<String> negadoEnBandejaCallCenter() {
    return new BandejaCallCenter();
  }

  public static Question<String> aprobadoEnBandejaCallCenter() {
    return new BandejaCallCenter();
  }
}
