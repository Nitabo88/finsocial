package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_COOPERATIVA;
import static co.com.red5g.utils.pdf.UrlsPdfs.urlPdf;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class UrlSoportes implements Question<String> {

  String url;
  String numeroCredito;

  public UrlSoportes(String url, String numeroCredito) {
    this.url = url;
    this.numeroCredito = numeroCredito;
  }

  public static Question<String> obtenerUrlDelPdf(String url, String numeroCredito) {
    return new UrlSoportes(url, numeroCredito);
  }

  @Override
  public String answeredBy(Actor actor) {
    String cooperativa =
        actor.asksFor(
            (LaInformacion.deBaseDeDatos(
                con().bdCreditos(), String.format(SQL_COOPERATIVA.getSql(), numeroCredito), "e_afianzado")));
    if (url.equals("Desafiliación a Cooperativa")) {
      if (cooperativa.equals("2")) {
        return urlPdf("Desafiliación Coophumana");
      } else {
        return urlPdf("Desafiliación Actival");
      }
    } else {
      return urlPdf(url);
    }
  }
}
