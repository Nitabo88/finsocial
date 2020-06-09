package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class NombreCompleto implements Question<String> {

  public static Question<String> nombreCompleto() {
    return new NombreCompleto();
  }

  @Override
  public String answeredBy(Actor actor) {
    String nombre = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "nombre"));
    String segundoNombre = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_nombre"));
    String apellido = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "p_apellido"));
    String segundoApellido = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "s_apellido"));
    if (segundoNombre.isEmpty() && segundoApellido.isEmpty()) {
      return nombre + "  " + apellido;
    } else if (segundoNombre.isEmpty()) {
      return nombre + "  " + apellido + " " + segundoApellido;
    } else if (segundoApellido.isEmpty()) {
      return nombre + " " + segundoNombre + " " + apellido;
    } else {
      return nombre + " " + segundoNombre + " " + apellido + " " + segundoApellido;
    }
  }
}
