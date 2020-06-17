package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static co.com.red5g.utils.conexionbd.Queries.SQL_LUGAR_NACIMIENTO;
import static co.com.red5g.utils.string.UtileriaFechas.fechaPdfYyyyMmDd;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class LugarYFechaNacimiento implements Question<String> {

  public static Question<String> lugarYFechaNacimiento() {
    return new LugarYFechaNacimiento();
  }

  @Override
  public String answeredBy(Actor actor) {
    String fechaNacimiento = fechaPdfYyyyMmDd(actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "fecha_nac")));
    String lugarNacimiento = actor.asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_LUGAR_NACIMIENTO.getSql(), "ciudad"));
    return lugarNacimiento + " " + fechaNacimiento;
  }
}