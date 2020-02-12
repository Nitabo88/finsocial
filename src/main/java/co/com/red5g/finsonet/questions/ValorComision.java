package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_VALORES_LIQUIDACION;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorComision implements Question<Double> {

  private static final String FORMATO_NUMERO = "[^\\d]";
  private final String nombreAsesor;

  public ValorComision(String nombreAsesor) {
    this.nombreAsesor = nombreAsesor;
  }

  public static Question<Double> valorComision(final String nombreAsesor) {
    return new ValorComision(nombreAsesor);
  }

  @Override
  public Double answeredBy(final Actor actor) {
    final WebElementFacade lstTotalLiquidacion = (LST_TOTALES_VALORES_LIQUIDACION.of(this.nombreAsesor)).resolveFor(actor);
    return Double.parseDouble(lstTotalLiquidacion.getText().replaceAll(ValorComision.FORMATO_NUMERO, ""));
  }
}
