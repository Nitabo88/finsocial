package co.com.red5g.questions;

import static co.com.red5g.userinterfaces.finsonet.LiquidadorComisionesPage.LST_TOTALES_VALORES_LIQUIDACION;

import java.util.regex.Pattern;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorComision implements Question<Double> {

  private static final Pattern FORMATO = Pattern.compile("[^\\d]");
  private final String nombreAsesor;

  public ValorComision(final String nombreAsesor) {
    this.nombreAsesor = nombreAsesor;
  }

  public static Question<Double> valorComision(String nombreAsesor) {
    return new ValorComision(nombreAsesor);
  }

  @Override
  public Double answeredBy(Actor actor) {
    WebElementFacade lstTotalLiquidacion = (LST_TOTALES_VALORES_LIQUIDACION.of(nombreAsesor)).resolveFor(actor);
    return Double.parseDouble(FORMATO.matcher(lstTotalLiquidacion.getText()).replaceAll(""));
  }
}
