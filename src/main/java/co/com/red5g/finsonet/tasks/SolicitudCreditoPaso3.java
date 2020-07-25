package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso3 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;

  public SolicitudCreditoPaso3(String cookie, FormularioSolicitud formularioSolicitud) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-3";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                    .header("Cookie", "PHPSESSID=" + cookie)
                    .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                    .formParam(estructuraFormularioSolicitud("actividadEconomica"), formularioSolicitud.getActividadEconomica())
                    .formParam(estructuraFormularioSolicitud("ciudadTrabajo"), formularioSolicitud.getCiudadTrabajo())
                    .formParam(estructuraFormularioSolicitud("tipoContrato"), formularioSolicitud.getTipoContrato())
                    .formParam(estructuraFormularioSolicitud("tipoEmpresa"), formularioSolicitud.getTipoEmpresa())
                    .formParam(estructuraFormularioSolicitud("direccionTrabajo"), formularioSolicitud.getDireccionTrabajo())
                    .formParam(estructuraFormularioSolicitud("ocupacion"), formularioSolicitud.getOcupacion())
                    .formParam(estructuraFormularioSolicitud("cargo"), formularioSolicitud.getCargo())
                    .formParam(estructuraFormularioSolicitud("declaraRenta"), formularioSolicitud.getDeclaraRenta())
                    .formParam(estructuraFormularioSolicitud("decisionCargo"), formularioSolicitud.getDecisionCargo())
                    .formParam(estructuraFormularioSolicitud("empresa"), formularioSolicitud.getEmpresa())
                    .formParam(estructuraFormularioSolicitud("extension"), formularioSolicitud.getExtension())
                    .formParam(estructuraFormularioSolicitud("fechaVinculacion"), formularioSolicitud.getFechaVinculacion())
                    .formParam(estructuraFormularioSolicitud("nitEmpresa"), formularioSolicitud.getNitEmpresa())
                    .formParam(estructuraFormularioSolicitud("personajePublico"), formularioSolicitud.getPersonajePublico())
                    .formParam(estructuraFormularioSolicitud("telefonoEmpresa"), formularioSolicitud.getTelefonoEmpresa())
                    .formParam(estructuraFormularioSolicitud("recursosPublicos"), formularioSolicitud.getRecursosPublicos()))
    );
  }
}
