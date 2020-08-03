package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.QueriesFinsonet.SQL_FORMULARIO_SOLICITUD;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class TotalIngresos implements Question<String> {

  public static TotalIngresos totalIngresos() {
    return new TotalIngresos();
  }

  @Override
  public String answeredBy(Actor actor) {
    int valor =
        Integer.parseInt(actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "otros_ingresos"))) +
            Integer.parseInt(actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "total_ingresos")));
    return String.valueOf(valor);
  }
}
