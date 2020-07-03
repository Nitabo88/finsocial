package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

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
                    .formParam("a_vinculacion", formularioSolicitud.getAVinculacion())
                    .formParam("crid", numeroCredito)
                    .formParam("cuota", formularioSolicitud.getCuota())
                    .formParam("id_cred", numeroCredito)
                    .formParam("numPaso", numeroPaso)
                    .formParam("pasoSol", formularioSolicitud.getPasoSol())
                    .formParam("perfil", formularioSolicitud.getPerfil())
                    .formParam("tasaI", formularioSolicitud.getTasaI())
                    .formParam("tasaM", formularioSolicitud.getTasaM())
                    .formParam("tasaMax", formularioSolicitud.getTasaMax())
                    .formParam("txtAsesor", formularioSolicitud.getAsesor())
                    .formParam("txtCiuC", formularioSolicitud.getCiuC())
                    .formParam("txtCalf", formularioSolicitud.getCalf())
                    .formParam("txtFecha", formularioSolicitud.getFecha())
                    .formParam("txtLinea", formularioSolicitud.getLinea())
                    .formParam("txtMonto", formularioSolicitud.getMonto())
                    .formParam("txtPlaz", formularioSolicitud.getPlaz())
                    .formParam("txtTSol", formularioSolicitud.getTSol())
                    .formParam("txtVin", formularioSolicitud.getVin())));
  }
}
