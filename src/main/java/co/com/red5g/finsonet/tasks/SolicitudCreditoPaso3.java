package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

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
                    .formParam("id_cred", numeroCredito)
                    .formParam("numPaso", numeroPaso)
                    .formParam("cmbActEcon", formularioSolicitud.getActEcon())
                    .formParam("cmbCiudad2", formularioSolicitud.getCiudad2())
                    .formParam("cmbTipoContrato", formularioSolicitud.getTipoContrato())
                    .formParam("cmbTipoEmp", formularioSolicitud.getTipoEmp())
                    .formParam("dirTrabajo", formularioSolicitud.getDirTrabajo())
                    .formParam("rdOcupacion", formularioSolicitud.getRdOcupacion())
                    .formParam("txtCargo", formularioSolicitud.getCargo())
                    .formParam("txtDeRenta", formularioSolicitud.getDeRenta())
                    .formParam("txtDesicionCargo", formularioSolicitud.getDesicionCargo())
                    .formParam("txtEmpresa", formularioSolicitud.getEmpresa())
                    .formParam("txtExt", formularioSolicitud.getExt())
                    .formParam("txtFechaVinculacion", formularioSolicitud.getFechaVinculacion())
                    .formParam("txtNitEmpresa", formularioSolicitud.getNitEmpresa())
                    .formParam("txtPerPubl", formularioSolicitud.getPerPubl())
                    .formParam("txtTelEmpresa", formularioSolicitud.getTelEmpresa())
                    .formParam("txtrecPublicos", formularioSolicitud.getrecPublicos()))
    );
  }
}
