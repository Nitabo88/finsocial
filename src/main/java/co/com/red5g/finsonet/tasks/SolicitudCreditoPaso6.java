package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso6 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;

  public SolicitudCreditoPaso6(String cookie, FormularioSolicitud formularioSolicitud) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-6";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification ->
                    requestSpecification
                        .contentType(ContentType.URLENC)
                        .header("Cookie", "PHPSESSID=" + cookie)
                        .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                        .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                        .formParam(estructuraFormularioSolicitud("ciudadReferenciaFamiliar"), formularioSolicitud.getCiudadReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("ciudadReferenciaPersonal"), formularioSolicitud.getCiudadReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("direccionReferenciaFamiliar"), formularioSolicitud.getDireccionReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("direccionReferenciaPersonal"), formularioSolicitud.getDireccionReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("tipoProducto"), formularioSolicitud.getTipoProducto())
                        .formParam(estructuraFormularioSolicitud("nombreReferenciaFamiliar"), formularioSolicitud.getNombreReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("parentescoReferenciaFamiliar"), formularioSolicitud.getParentescoReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("telefonoReferenciaFamiliar"), formularioSolicitud.getTelefonoReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("nombreReferenciaPersonal"), formularioSolicitud.getNombreReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("parentescoReferenciaPersonal"), formularioSolicitud.getParentescoReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("telefonoReferenciaPersonal"), formularioSolicitud.getTelefonoReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("celularReferenciaFamiliar"), formularioSolicitud.getCelularReferenciaFamiliar())
                        .formParam(estructuraFormularioSolicitud("celularReferenciaPersonal"), formularioSolicitud.getCelularReferenciaPersonal())
                        .formParam(estructuraFormularioSolicitud("nitEmpresa"), formularioSolicitud.getNitEmpresa())
                        .formParam(estructuraFormularioSolicitud("sucursal"), formularioSolicitud.getSucursal()))
    );
  }
}
