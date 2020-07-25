package co.com.red5g.finsonet.tasks;

import static co.com.red5g.utils.data.Constantes.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

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
                        .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                        .formParam(estructuraFormularioSolicitud("numeroPaso"), numeroPaso)
                        .formParam(estructuraFormularioSolicitud("activosCorrientes"), formularioSolicitud.getActivosCorrientes())
                        .formParam(estructuraFormularioSolicitud("activosFijos"), formularioSolicitud.getActivosFijos())
                        .formParam(estructuraFormularioSolicitud("otrosActivos"), formularioSolicitud.getOtrosActivos())
                        .formParam(estructuraFormularioSolicitud("cualesActivos"), formularioSolicitud.getCualesActivos())
                        .formParam(estructuraFormularioSolicitud("totalActivos"), formularioSolicitud.getTotalActivos())
                        .formParam(estructuraFormularioSolicitud("pasivosFinancieros"), formularioSolicitud.getPasivosFinancieros())
                        .formParam(estructuraFormularioSolicitud("pasivosCorrientes"), formularioSolicitud.getPasivosCorrientes())
                        .formParam(estructuraFormularioSolicitud("otrosPasivos"), formularioSolicitud.getOtrosPasivos())
                        .formParam(estructuraFormularioSolicitud("cualesPasivos"), formularioSolicitud.getCualesPasivos())
                        .formParam(estructuraFormularioSolicitud("totalPasivos"), formularioSolicitud.getTotalPasivos())
                        .formParam(estructuraFormularioSolicitud("tipoInmueble"), formularioSolicitud.getTipoInmueble())
                        .formParam(estructuraFormularioSolicitud("valorComercialInmueble"), formularioSolicitud.getValorComercialInmueble())
                        .formParam(estructuraFormularioSolicitud("otrosPasivos"), formularioSolicitud.getOtrosPasivos())
                        .formParam(estructuraFormularioSolicitud("hipotecadoA"), formularioSolicitud.getHipotecadoA())
                        .formParam(estructuraFormularioSolicitud("direccion"), formularioSolicitud.getDireccion())
                        .formParam(estructuraFormularioSolicitud("saldoCreditoInmueble"), formularioSolicitud.getSaldoCreditoInmueble())
                        .formParam(estructuraFormularioSolicitud("vehiculoClase"), formularioSolicitud.getVehiculoClase())
                        .formParam(estructuraFormularioSolicitud("valorComercialVehiculo"), formularioSolicitud.getValorComercialVehiculo())
                        .formParam(estructuraFormularioSolicitud("marcaModelo"), formularioSolicitud.getMarcaModelo())
                        .formParam(estructuraFormularioSolicitud("placa"), formularioSolicitud.getPlaca())
                        .formParam(estructuraFormularioSolicitud("saldoCreditoVehiculo"), formularioSolicitud.getSaldoCreditoVehiculo())
                        .formParam(estructuraFormularioSolicitud("prendaAFavor"), formularioSolicitud.getPrendaAFavor())
                        .formParam(estructuraFormularioSolicitud("salarioFijo"), formularioSolicitud.getSalarioFijo())
                        .formParam(estructuraFormularioSolicitud("salarioVariableComisiones"), formularioSolicitud.getSalarioVariableComisiones())
                        .formParam(estructuraFormularioSolicitud("arrendamiento"), formularioSolicitud.getArrendamiento())
                        .formParam(estructuraFormularioSolicitud("rendimientosFinancieros"), formularioSolicitud.getRendimientosFinancieros())
                        .formParam(estructuraFormularioSolicitud("honorarios"), formularioSolicitud.getHonorarios())
                        .formParam(estructuraFormularioSolicitud("otrosIngresos"), formularioSolicitud.getOtrosIngresos())
                        .formParam(estructuraFormularioSolicitud("cualesIngresos"), formularioSolicitud.getCualesIngresos())
                        .formParam(estructuraFormularioSolicitud("totalIngresos"), formularioSolicitud.getTotalIngresos())
                        .formParam(estructuraFormularioSolicitud("arriendos"), formularioSolicitud.getArriendos())
                        .formParam(estructuraFormularioSolicitud("gastosPersonales"), formularioSolicitud.getGastosPersonales())
                        .formParam(estructuraFormularioSolicitud("prestamosDiferentes"), formularioSolicitud.getPrestamosDiferentes())
                        .formParam(estructuraFormularioSolicitud("deducciones"), formularioSolicitud.getDeducciones())
                        .formParam(estructuraFormularioSolicitud("tarjetaCredito"), formularioSolicitud.getTarjetaCredito())
                        .formParam(estructuraFormularioSolicitud("otrosGastos"), formularioSolicitud.getOtrosGastos())
                        .formParam(estructuraFormularioSolicitud("cualesGastos"), formularioSolicitud.getCualesGastos())
                        .formParam(estructuraFormularioSolicitud("totalEgresos"), formularioSolicitud.getTotalEgresos())
                        .formParam(estructuraFormularioSolicitud("pagoHipoteca"), formularioSolicitud.getPagoHipoteca())
                        .formParam(estructuraFormularioSolicitud("valorComercialVivienda"), formularioSolicitud.getValorComercialVivienda())
                        .formParam(estructuraFormularioSolicitud("dondeVivir"), formularioSolicitud.getDondeVivir())
                        .formParam(estructuraFormularioSolicitud("quiereComprar"), formularioSolicitud.getQuiereComprar())
                        .formParam(estructuraFormularioSolicitud("cupoExtra"), formularioSolicitud.getCupoExtra())
                        .formParam(estructuraFormularioSolicitud("razonCredito"), formularioSolicitud.getRazonCredito())
                        .formParam(estructuraFormularioSolicitud("detalleRazon"), formularioSolicitud.getDetalleRazon()))
    );
  }
}
