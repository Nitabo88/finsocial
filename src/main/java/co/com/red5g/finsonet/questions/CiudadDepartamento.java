package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.Queries.SQL_CIUDAD_RESIDENCIA;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CiudadDepartamento implements Question<String> {

  private int campo;

  public CiudadDepartamento(int campo) {
    this.campo = campo;
  }

  public static Question<String> ciudadDepartamento(int campo) {
    return new CiudadDepartamento(campo);
  }

  @Override
  public String answeredBy(Actor actor) {
    String ciudadDepartamento = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_CIUDAD_RESIDENCIA.getSql(), "ciudad"));
    return ciudadDepartamento.split("-")[campo].trim();
  }
}
