package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_FACTOR_DESEMPLEO;
import static co.com.red5g.utils.data.Constantes.VALORES;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorBancaSeguro implements Question<Integer> {

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    Integer monto = Integer.parseInt(valores.get(0));
    Double factorDesempleo = Double.parseDouble(actor.asksFor(LaInformacion.deBaseDeDatos(con().bdBancomevaEnLinea(), SQL_FACTOR_DESEMPLEO.getSql(), "FACTOR")));
    Integer plazo = Integer.parseInt(valores.get(1));
    return Math.toIntExact(Math.round((monto * plazo) * (factorDesempleo / 100)));
  }
}
