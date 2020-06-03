package co.com.red5g.finsonet.questions.factories;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.finsonet.questions.BaseDeDatos;
import co.com.red5g.finsonet.questions.PDF;
import net.serenitybdd.screenplay.Question;

public class LaInformacion {

  private LaInformacion() {
  }

  public static Question<String> deBaseDeDatos(CredencialesBD credencialesBD, String sql, String columna) {
    return new BaseDeDatos(credencialesBD, sql, columna);
  }

  public static Question<String> delPdf(int filaCampo) {
    return new PDF(filaCampo);
  }
}
