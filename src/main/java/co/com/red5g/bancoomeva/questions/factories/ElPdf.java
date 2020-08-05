package co.com.red5g.bancoomeva.questions.factories;

import co.com.red5g.bancoomeva.questions.PdfEquidadSeguros;
import net.serenitybdd.screenplay.Question;

public class ElPdf {

  public static Question<String> deEquidadSeguros() {
    return new PdfEquidadSeguros();
  }
}
