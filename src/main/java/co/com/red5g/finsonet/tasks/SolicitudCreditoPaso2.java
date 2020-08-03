package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso2 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cedula;
  String cookie;

  public SolicitudCreditoPaso2(String cookie, FormularioSolicitud formularioSolicitud, String cedula) {
    this.formularioSolicitud = formularioSolicitud;
    this.cedula = cedula;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-2";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                    .header("Cookie", "PHPSESSID=" + cookie)
                    .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                    .formParam(estructuraFormularioSolicitud("ciudadDepartamento"), formularioSolicitud.getCiudadDepartamento())
                    .formParam(estructuraFormularioSolicitud("correspondenciaA"), formularioSolicitud.getCorrespondenciaA())
                    .formParam(estructuraFormularioSolicitud("estadoCivil"), formularioSolicitud.getEstrato())
                    .formParam(estructuraFormularioSolicitud("nivelEstudio"), formularioSolicitud.getNivelEstudio())
                    .formParam(estructuraFormularioSolicitud("profesion"), formularioSolicitud.getProfesion())
                    .formParam(estructuraFormularioSolicitud("sexo"), formularioSolicitud.getSexo())
                    .formParam(estructuraFormularioSolicitud("tipoDocumento"), formularioSolicitud.getTipoDocumento())
                    .formParam(estructuraFormularioSolicitud("tipoVivienda"), formularioSolicitud.getTipoVivienda())
                    .formParam(estructuraFormularioSolicitud("direccionResidencia"), formularioSolicitud.getDireccionResidencia())
                    .formParam(estructuraFormularioSolicitud("adulto"), formularioSolicitud.getAdulto())
                    .formParam(estructuraFormularioSolicitud("anios"), formularioSolicitud.getAnios())
                    .formParam(estructuraFormularioSolicitud("arrendatario"), formularioSolicitud.getArrendatario())
                    .formParam(estructuraFormularioSolicitud("barrio"), formularioSolicitud.getBarrio())
                    .formParam(estructuraFormularioSolicitud("celular"), formularioSolicitud.getCelular())
                    .formParam(estructuraFormularioSolicitud("email"), formularioSolicitud.getEmail())
                    .formParam(estructuraFormularioSolicitud("eps"), formularioSolicitud.getEps())
                    .formParam(estructuraFormularioSolicitud("estrato"), formularioSolicitud.getEstrato())
                    .formParam(estructuraFormularioSolicitud("fechaExpedicion"), formularioSolicitud.getFechaExpedicion())
                    .formParam(estructuraFormularioSolicitud("fechaNacimiento"), formularioSolicitud.getFechaNacimiento())
                    .formParam(estructuraFormularioSolicitud("lugarExpedicion"), formularioSolicitud.getLugarExpedicion())
                    .formParam(estructuraFormularioSolicitud("lugarNacimiento"), formularioSolicitud.getLugarNacimiento())
                    .formParam(estructuraFormularioSolicitud("menor18"), formularioSolicitud.getMenor18())
                    .formParam(estructuraFormularioSolicitud("meses"), formularioSolicitud.getMeses())
                    .formParam(estructuraFormularioSolicitud("numeroDocumento"), cedula)
                    .formParam(estructuraFormularioSolicitud("primerApellido"), formularioSolicitud.getPrimerApellido())
                    .formParam(estructuraFormularioSolicitud("segundoApellido"), formularioSolicitud.getSegundoApellido())
                    .formParam(estructuraFormularioSolicitud("pais"), formularioSolicitud.getPais())
                    .formParam(estructuraFormularioSolicitud("primerNombre"), formularioSolicitud.getPrimerNombre())
                    .formParam(estructuraFormularioSolicitud("segundoNombre"), formularioSolicitud.getSegundoNombre())
                    .formParam(estructuraFormularioSolicitud("telefonoResidencia"), formularioSolicitud.getTelefonoResidencia())
                    .formParam(estructuraFormularioSolicitud("telefonoArrendador"), formularioSolicitud.getTelefonoArrendador())));
  }
}
