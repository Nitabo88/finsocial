package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso4 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;

  public SolicitudCreditoPaso4(String cookie, FormularioSolicitud formularioSolicitud) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    String numeroPaso = "step-4";
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification ->
                    requestSpecification
                        .contentType(ContentType.URLENC)
                        .header("Cookie", "PHPSESSID=" + cookie)
                        .formParam("id_cred", numeroCredito)
                        .formParam("numPaso", numeroPaso)
                        .formParam("activos_corrientes", formularioSolicitud.getActivosCorrientes())
                        .formParam("activos_fijos", formularioSolicitud.getActivosFijos())
                        .formParam("otros_activos", formularioSolicitud.getOtrosActivos())
                        .formParam("cuales_activos", formularioSolicitud.getCualesActivos())
                        .formParam("total_activos", formularioSolicitud.getTotalActivos())
                        .formParam("pasivos_financieros", formularioSolicitud.getPasivosFinancieros())
                        .formParam("pasivos_corrientes", formularioSolicitud.getPasivosCorrientes())
                        .formParam("otros_pasivos", formularioSolicitud.getOtrosPasivos())
                        .formParam("cuales_pasivos", formularioSolicitud.getCualesPasivos())
                        .formParam("total_pasivos", formularioSolicitud.getTotalPasivos())
                        .formParam("txtTipoInm", formularioSolicitud.getTipoInm())
                        .formParam("txtValorComInm", formularioSolicitud.getValorComInm())
                        .formParam("otros_pasivos", formularioSolicitud.getOtrosPasivos())
                        .formParam("txtHipotecado", formularioSolicitud.getHipotecado())
                        .formParam("dirBienes", formularioSolicitud.getDirBienes())
                        .formParam("txtSaldoCredInm", formularioSolicitud.getSaldoCredInm())
                        .formParam("txtVehCls", formularioSolicitud.getVehCls())
                        .formParam("txtValorComVeh", formularioSolicitud.getValorComVeh())
                        .formParam("txtMarcaVeh", formularioSolicitud.getMarcaVeh())
                        .formParam("txtPlacaVeh", formularioSolicitud.getPlacaVeh())
                        .formParam("txtSaldoCredVeh", formularioSolicitud.getSaldoCredVeh())
                        .formParam("txtPrendaFavVeh", formularioSolicitud.getPrendaFavVeh())
                        .formParam("txtSueldoFijo", formularioSolicitud.getSueldoFijo())
                        .formParam("txtSalVarCom", formularioSolicitud.getSalVarCom())
                        .formParam("txtArrendamiento", formularioSolicitud.getArrendamiento())
                        .formParam("txtRenFin", formularioSolicitud.getRenFin())
                        .formParam("txtHonorarios", formularioSolicitud.getHonorarios())
                        .formParam("txtOtrosIng", formularioSolicitud.getOtrosIng())
                        .formParam("txtCualesIng", formularioSolicitud.getCualesIng())
                        .formParam("txtTIngresos", formularioSolicitud.getTIngresos())
                        .formParam("txtArriendos", formularioSolicitud.getArriendos())
                        .formParam("txtGastosPer", formularioSolicitud.getGastosPer())
                        .formParam("txtPresDfFin", formularioSolicitud.getPresDfFin())
                        .formParam("txtDeducciones", formularioSolicitud.getDeducciones())
                        .formParam("txtTarjCred", formularioSolicitud.getTarjCred())
                        .formParam("txtOtrosGastos", formularioSolicitud.getOtrosGastos())
                        .formParam("txtCualesGastos", formularioSolicitud.getCualesGastos())
                        .formParam("txtTEgresos", formularioSolicitud.getTEgresos())
                        .formParam("txtPagHip", formularioSolicitud.getPagHip())
                        .formParam("txtVlrComViv", formularioSolicitud.getVlrComViv())
                        .formParam("txtGustaVivir", formularioSolicitud.getGustaVivir())
                        .formParam("rdCompViv", formularioSolicitud.getRdCompViv())
                        .formParam("rdCupoExtra", formularioSolicitud.getRdCupoExtra())
                        .formParam("cmbRazondecredito", formularioSolicitud.getRazondecredito())
                        .formParam("razon", formularioSolicitud.getRazon()))
    );
  }
}
