package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.tasks.ConsultaBD.RESULTADO_CONSULTA;

import java.util.HashMap;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class BaseDeDatos implements Question<String> {

  private static String columna = "";

  public BaseDeDatos(String columna) {
    this.columna = columna;
  }

  @Override
  public String answeredBy(Actor actor) {
    HashMap<String, String> resultadoConsulta = actor.recall(RESULTADO_CONSULTA);
    return resultadoConsulta.get(columna).toLowerCase();
  }
}
