package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LBL_PORCENTAJE_COMISION;

import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class PorcentajeComision implements Question<Double> {

  private static final Pattern FORMATO = Pattern.compile(" %");

  public static Question<Double> porcentajeComision() {
    return new PorcentajeComision();
  }

  @Override
  public Double answeredBy(final Actor actor) {
    String porcentajeComision = String.valueOf(FORMATO.split(LBL_PORCENTAJE_COMISION.resolveFor(actor).getText())[0]);
    return porcentajeComision.equals("%") ? 0.0 : Double.parseDouble(porcentajeComision);
  }
}
