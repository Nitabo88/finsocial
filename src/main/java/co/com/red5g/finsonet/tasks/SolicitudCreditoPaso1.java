package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso1 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;

  public SolicitudCreditoPaso1(String cookie, FormularioSolicitud formularioSolicitud) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-1";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                    .header("Cookie", "PHPSESSID=" + cookie)
                    .formParam(estructuraFormularioSolicitud("agenciaVinculacion"), formularioSolicitud.getAgenciaVinculacion())
                    .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("cuota"), formularioSolicitud.getCuota())
                    .formParam(estructuraFormularioSolicitud("llaveCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                    .formParam(estructuraFormularioSolicitud("pasoSolucion"), formularioSolicitud.getPasoSolucion())
                    .formParam(estructuraFormularioSolicitud("perfil"), formularioSolicitud.getPerfil())
                    .formParam(estructuraFormularioSolicitud("tasaInteres"), formularioSolicitud.getTasaInteres())
                    .formParam(estructuraFormularioSolicitud("tasaMora"), formularioSolicitud.getTasaMora())
                    .formParam(estructuraFormularioSolicitud("tasaMaxima"), formularioSolicitud.getTasaMaxima())
                    .formParam(estructuraFormularioSolicitud("asesor"), formularioSolicitud.getAsesor())
                    .formParam(estructuraFormularioSolicitud("ciudadCredito"), formularioSolicitud.getCiudadCredito())
                    .formParam(estructuraFormularioSolicitud("calificacion"), formularioSolicitud.getCalificacion())
                    .formParam(estructuraFormularioSolicitud("fecha"), formularioSolicitud.getFecha())
                    .formParam(estructuraFormularioSolicitud("linea"), formularioSolicitud.getLinea())
                    .formParam(estructuraFormularioSolicitud("monto"), formularioSolicitud.getMonto())
                    .formParam(estructuraFormularioSolicitud("plazo"), formularioSolicitud.getPlazo())
                    .formParam(estructuraFormularioSolicitud("tipoSolicitud"), formularioSolicitud.getTipoSolicitud())
                    .formParam(estructuraFormularioSolicitud("vinculacion"), formularioSolicitud.getVinculacion())));
  }
}
