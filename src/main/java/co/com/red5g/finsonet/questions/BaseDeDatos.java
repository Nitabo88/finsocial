package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.ConsultaBD.RESULTADO_CONSULTA;

import co.com.red5g.finsonet.models.CredencialesBD;
import co.com.red5g.finsonet.tasks.ConsultaBD;
import java.util.HashMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BaseDeDatos implements Question<String> {

  CredencialesBD credencialesBD;
  String sql;
  String columna;

  public BaseDeDatos(CredencialesBD credencialesBD, String sql, String columna) {
    this.credencialesBD = credencialesBD;
    this.sql = sql;
    this.columna = columna;
  }


  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(
        new ConsultaBD(credencialesBD, sql)
    );
    HashMap<String, String> resultadoConsulta = actor.recall(RESULTADO_CONSULTA);
    return resultadoConsulta.get(columna).toLowerCase();
  }
}
