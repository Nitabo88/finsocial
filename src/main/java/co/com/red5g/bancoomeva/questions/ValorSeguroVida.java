package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesBancoomeva.SQL_PROPORCIONAL_SEGURO;
import static co.com.red5g.utils.data.Constantes.VALORES;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import java.util.List;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValorSeguroVida implements Question<Integer> {

  @Override
  public Integer answeredBy(Actor actor) {
    List<String> valores = actor.recall(VALORES);
    Double valorPorMillon = Double.parseDouble(actor.asksFor(LaInformacion.deBaseDeDatos(con().bdBancomevaEnLinea(), SQL_PROPORCIONAL_SEGURO.getSql(), "VALOR")));
    Double proporcional = valorPorMillon / 1000000;
    Integer monto = Integer.parseInt(valores.get(0));
    return Math.toIntExact(Math.round(monto * (proporcional)));
  }
}
