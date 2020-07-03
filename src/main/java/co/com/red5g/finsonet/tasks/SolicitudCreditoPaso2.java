package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

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
                    .formParam("id_cred", numeroCredito)
                    .formParam("numPaso", numeroPaso)
                    .formParam("cmbCiudad", formularioSolicitud.getCiudad())
                    .formParam("cmbCorrespondencia", formularioSolicitud.getCorrespondencia())
                    .formParam("cmbEstCivil", formularioSolicitud.getEstCivil())
                    .formParam("cmbNivelEst", formularioSolicitud.getNivelEst())
                    .formParam("cmbProfesion", formularioSolicitud.getProfesion())
                    .formParam("cmbSexo", formularioSolicitud.getSexo())
                    .formParam("cmbTipoDoc", formularioSolicitud.getTipoDoc())
                    .formParam("cmbTipoViv", formularioSolicitud.getTipoViv())
                    .formParam("dirCa", formularioSolicitud.getDirCa())
                    .formParam("txtAdulto", formularioSolicitud.getAdulto())
                    .formParam("txtAnios", formularioSolicitud.getAnios())
                    .formParam("txtArrend", formularioSolicitud.getArrend())
                    .formParam("txtBarrio", formularioSolicitud.getBarrio())
                    .formParam("txtCel", formularioSolicitud.getCel())
                    .formParam("txtEmail", formularioSolicitud.getEmail())
                    .formParam("txtEps", formularioSolicitud.getEps())
                    .formParam("txtEstrato", formularioSolicitud.getEstrato())
                    .formParam("txtFechaExp", formularioSolicitud.getFechaExp())
                    .formParam("txtFechaNac", formularioSolicitud.getFechaNac())
                    .formParam("txtLugarExp", formularioSolicitud.getLugarExp())
                    .formParam("txtLugarNac", formularioSolicitud.getLugarNac())
                    .formParam("txtMenor18", formularioSolicitud.getMenor18())
                    .formParam("txtMeses", formularioSolicitud.getMeses())
                    .formParam("txtNoDoc", cedula)
                    .formParam("txtPApellido", formularioSolicitud.getPApellido())
                    .formParam("txtSApellido", formularioSolicitud.getSApellido())
                    .formParam("txtPais", formularioSolicitud.getPais())
                    .formParam("txtPNombre", formularioSolicitud.getPNombre())
                    .formParam("txtSNombre", formularioSolicitud.getSNombre())
                    .formParam("txtTel", formularioSolicitud.getTel())
                    .formParam("txtTelArr", formularioSolicitud.getTelArr())));
  }
}
