package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

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
                        .formParam("id_cred", numeroCredito)
                        .formParam("numPaso", numeroPaso)
                        .formParam("cmbNivelEstCon", formularioSolicitud.getNivelEstCon())
                        .formParam("cmbSexoCon", formularioSolicitud.getSexoCon())
                        .formParam("cmbTipoDocCony", formularioSolicitud.getTipoDocCony())
                        .formParam("rdOcupacionCon", formularioSolicitud.getRdOcupacionCon())
                        .formParam("txtCargoCon", formularioSolicitud.getCargoCon())
                        .formParam("txtCelCon", formularioSolicitud.getCelCon())
                        .formParam("txtDepEco", formularioSolicitud.getDepEco())
                        .formParam("txtDocConyugue", formularioSolicitud.getDocConyugue())
                        .formParam("txtEpsConyuge", formularioSolicitud.getEpsConyuge())
                        .formParam("txtFecIngr", formularioSolicitud.getFecIngr())
                        .formParam("txtFechaExpCon", formularioSolicitud.getFechaExpCon())
                        .formParam("txtFechaNacCon", formularioSolicitud.getFechaNacCon())
                        .formParam("txtLugTrabCon", formularioSolicitud.getLugTrabCon())
                        .formParam("txtLugarExpCon", formularioSolicitud.getLugarExpCon())
                        .formParam("txtLugarNacCon", formularioSolicitud.getLugarNacCon())
                        .formParam("txtPNConyugue", formularioSolicitud.getPNConyugue())
                        .formParam("txtSNConyugue", formularioSolicitud.getSNConyugue())
                        .formParam("txtPAConyugue", formularioSolicitud.getPAConyugue())
                        .formParam("txtSAConyugue", formularioSolicitud.getSAConyugue())
                        .formParam("txtTIngCon", formularioSolicitud.getTIngCon())
                        .formParam("txtTEgrCon", formularioSolicitud.getTEgrCon()))
    );
  }
}
