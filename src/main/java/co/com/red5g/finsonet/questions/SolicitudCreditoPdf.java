package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.models.builders.CredencialesBDBuilder.con;
import static co.com.red5g.utils.conexionbd.Queries.SQL_FORMULARIO_SOLICITUD;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import co.com.red5g.finsonet.questions.factories.LaInformacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class SolicitudCreditoPdf implements Question<Integer> {

  public static Question<Integer> tipoCliente() {
    return new SolicitudCreditoPdf();
  }

  @Override
  public Integer answeredBy(Actor actor) {
    int pdf = 0;
    int ocupacion = Integer.parseInt(theActorInTheSpotlight()
        .asksFor(LaInformacion.deBaseDeDatos(con().bdEnLineaAutogestion(), SQL_FORMULARIO_SOLICITUD.getSql(), "ocupacion")));
    if (ocupacion == 68) {
      pdf = 2;
    }
    return pdf;
  }
}
