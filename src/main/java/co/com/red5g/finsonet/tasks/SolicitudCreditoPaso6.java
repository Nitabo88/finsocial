package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

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
                        .formParam("id_cred", numeroCredito)
                        .formParam("numPaso", numeroPaso)
                        .formParam("cmbCiudadRefFam", formularioSolicitud.getCiudadRefFam())
                        .formParam("cmbCiudadRefPer", formularioSolicitud.getCiudadRefPer())
                        .formParam("dirFamiliar", formularioSolicitud.getDirFamiliar())
                        .formParam("dirPersonal", formularioSolicitud.getDirPersonal())
                        .formParam("cmbTipoProd", formularioSolicitud.getTipoProd())
                        .formParam("ref_familiar_nombre", formularioSolicitud.getRefFamiliarNombre())
                        .formParam("ref_familiar_par", formularioSolicitud.getRefFamiliarPar())
                        .formParam("ref_familiar_tel", formularioSolicitud.getRefFamiliarTel())
                        .formParam("ref_personal_nombre", formularioSolicitud.getRefPersonalNombre())
                        .formParam("ref_personal_par", formularioSolicitud.getRefPersonalPar())
                        .formParam("ref_personal_tel", formularioSolicitud.getRefPersonalTel())
                        .formParam("txtCelRFam", formularioSolicitud.getCelRFam())
                        .formParam("txtCelRPer", formularioSolicitud.getCelRPer())
                        .formParam("txtNEntFin", formularioSolicitud.getNEntFin())
                        .formParam("txtSucursal", formularioSolicitud.getSucursal()))
    );
  }
}
