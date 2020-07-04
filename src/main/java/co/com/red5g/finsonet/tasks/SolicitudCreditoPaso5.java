package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso5 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;

  public SolicitudCreditoPaso5(String cookie, FormularioSolicitud formularioSolicitud) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-5";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification ->
                    requestSpecification
                        .contentType(ContentType.URLENC)
                        .header("Cookie", "PHPSESSID=" + cookie)
                        .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                        .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                        .formParam(estructuraFormularioSolicitud("nivelEstudioConyugue"), formularioSolicitud.getNivelEstudioConyugue())
                        .formParam(estructuraFormularioSolicitud("sexoConyugue"), formularioSolicitud.getSexoConyugue())
                        .formParam(estructuraFormularioSolicitud("tipoDocumentoConyugue"), formularioSolicitud.getTipoDocumentoConyugue())
                        .formParam(estructuraFormularioSolicitud("ocupacionConyugue"), formularioSolicitud.getOcupacionConyugue())
                        .formParam(estructuraFormularioSolicitud("cargoConyugue"), formularioSolicitud.getCargoConyugue())
                        .formParam(estructuraFormularioSolicitud("celularConyugue"), formularioSolicitud.getCelularConyugue())
                        .formParam(estructuraFormularioSolicitud("dependenciaEconomica"), formularioSolicitud.getDependenciaEconomica())
                        .formParam(estructuraFormularioSolicitud("documentoConyugue"), formularioSolicitud.getDocumentoConyugue())
                        .formParam(estructuraFormularioSolicitud("epsConyugue"), formularioSolicitud.getEpsConyugue())
                        .formParam(estructuraFormularioSolicitud("fechaIngreso"), formularioSolicitud.getFechaIngreso())
                        .formParam(estructuraFormularioSolicitud("fechaExpedicionConyugue"), formularioSolicitud.getFechaExpedicionConyugue())
                        .formParam(estructuraFormularioSolicitud("fechaNacimientoConyugue"), formularioSolicitud.getFechaNacimientoConyugue())
                        .formParam(estructuraFormularioSolicitud("lugarTrabajoConyugue"), formularioSolicitud.getLugarTrabajoConyugue())
                        .formParam(estructuraFormularioSolicitud("lugarExpedicionConyugue"), formularioSolicitud.getLugarExpedicionConyugue())
                        .formParam(estructuraFormularioSolicitud("lugarNacimientoConyugue"), formularioSolicitud.getLugarNacimientoConyugue())
                        .formParam(estructuraFormularioSolicitud("primerNombreConyugue"), formularioSolicitud.getPrimerNombreConyugue())
                        .formParam(estructuraFormularioSolicitud("segundoNombreConyugue"), formularioSolicitud.getSegundoNombreConyugue())
                        .formParam(estructuraFormularioSolicitud("primerApellidoConyugue"), formularioSolicitud.getPrimerApellidoConyugue())
                        .formParam(estructuraFormularioSolicitud("segundoApellidoConyugue"), formularioSolicitud.getSegundoApellidoConyugue())
                        .formParam(estructuraFormularioSolicitud("totalIngresosConyugue"), formularioSolicitud.getTotalIngresosConyugue())
                        .formParam(estructuraFormularioSolicitud("totalEgresosConyugue"), formularioSolicitud.getTotalEgresosConyugue()))
    );
  }
}
