package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.questions.BaseDeDatos;
import co.com.red5g.finsonet.questions.PDF;
import net.serenitybdd.screenplay.Question;

public class LaInformacion {

  public static Question<String> deBaseDeDatos(String columna) {
    return new BaseDeDatos(columna);
  }

  public static Question<String> delPdf(int i) {
    return new PDF(i);
  }
}
