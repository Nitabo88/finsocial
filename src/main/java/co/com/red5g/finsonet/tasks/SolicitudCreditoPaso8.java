package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static co.com.red5g.utils.data.EstructuraFormularioSolicitud.estructuraFormularioSolicitud;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoPaso8 implements Task {

  FormularioSolicitud formularioSolicitud;
  String cookie;
  String cedula;

  public SolicitudCreditoPaso8(String cookie, FormularioSolicitud formularioSolicitud, String cedula) {
    this.formularioSolicitud = formularioSolicitud;
    this.cookie = cookie;
    this.cedula = cedula;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String numeroCredito = actor.recall(NUMERO_CREDITO);
    actor.attemptsTo(
        Post.to("/ajax/ajxFormSolicitud.php")
            .with(
                requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                    .header("Cookie", "PHPSESSID=" + cookie)
                    .formParam(estructuraFormularioSolicitud("numeroCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("numeroPaso"), formularioSolicitud.getNumeroPaso())
                    .formParam(estructuraFormularioSolicitud("fecha"), formularioSolicitud.getFecha())
                    .formParam(estructuraFormularioSolicitud("perfil"), formularioSolicitud.getPerfil())
                    .formParam(estructuraFormularioSolicitud("llaveCredito"), numeroCredito)
                    .formParam(estructuraFormularioSolicitud("pasoSolucion"), formularioSolicitud.getPasoSolucion())
                    .formParam(estructuraFormularioSolicitud("asesor"), formularioSolicitud.getAsesor())
                    .formParam(estructuraFormularioSolicitud("ciudadCredito"), formularioSolicitud.getCiudadCredito())
                    .formParam(estructuraFormularioSolicitud("calificacion"), formularioSolicitud.getCalificacion())
                    .formParam(estructuraFormularioSolicitud("tipoSolicitud"), formularioSolicitud.getTipoSolicitud())
                    .formParam(estructuraFormularioSolicitud("agenciaVinculacion"), formularioSolicitud.getAgenciaVinculacion())
                    .formParam(estructuraFormularioSolicitud("vinculacion"), formularioSolicitud.getVinculacion())
                    .formParam(estructuraFormularioSolicitud("monto"), formularioSolicitud.getMonto())
                    .formParam(estructuraFormularioSolicitud("linea"), formularioSolicitud.getLinea())
                    .formParam(estructuraFormularioSolicitud("cuota"), formularioSolicitud.getCuota())
                    .formParam(estructuraFormularioSolicitud("plazo"), formularioSolicitud.getPlazo())
                    .formParam(estructuraFormularioSolicitud("tasaInteres"), formularioSolicitud.getTasaInteres())
                    .formParam(estructuraFormularioSolicitud("tasaMora"), formularioSolicitud.getTasaMora())
                    .formParam(estructuraFormularioSolicitud("tasaMaxima"), formularioSolicitud.getTasaMaxima())
                    .formParam(estructuraFormularioSolicitud("primerApellido"), formularioSolicitud.getPrimerApellido())
                    .formParam(estructuraFormularioSolicitud("segundoApellido"), formularioSolicitud.getSegundoApellido())
                    .formParam(estructuraFormularioSolicitud("primerNombre"), formularioSolicitud.getPrimerNombre())
                    .formParam(estructuraFormularioSolicitud("segundoNombre"), formularioSolicitud.getSegundoNombre())
                    .formParam(estructuraFormularioSolicitud("tipoDocumento"), formularioSolicitud.getTipoDocumento())
                    .formParam(estructuraFormularioSolicitud("numeroDocumento"), cedula)
                    .formParam(estructuraFormularioSolicitud("lugarExpedicion"), formularioSolicitud.getLugarExpedicion())
                    .formParam(estructuraFormularioSolicitud("fechaExpedicion"), formularioSolicitud.getFechaExpedicion())
                    .formParam(estructuraFormularioSolicitud("fechaNacimiento"), formularioSolicitud.getFechaNacimiento())
                    .formParam(estructuraFormularioSolicitud("sexo"), formularioSolicitud.getSexo())
                    .formParam(estructuraFormularioSolicitud("lugarNacimiento"), formularioSolicitud.getLugarNacimiento())
                    .formParam(estructuraFormularioSolicitud("estadoCivil"), formularioSolicitud.getEstadoCivil())
                    .formParam(estructuraFormularioSolicitud("pais"), formularioSolicitud.getPais())
                    .formParam(estructuraFormularioSolicitud("ciudadDepartamento"), formularioSolicitud.getCiudadDepartamento())
                    .formParam(estructuraFormularioSolicitud("tipoVivienda"), formularioSolicitud.getTipoVivienda())
                    .formParam(estructuraFormularioSolicitud("estrato"), formularioSolicitud.getEstrato())
                    .formParam(estructuraFormularioSolicitud("arrendatario"), formularioSolicitud.getArrendatario())
                    .formParam(estructuraFormularioSolicitud("telefonoArrendador"), formularioSolicitud.getTelefonoArrendador())
                    .formParam(estructuraFormularioSolicitud("direccionResidencia"), formularioSolicitud.getDireccionResidencia())
                    .formParam(estructuraFormularioSolicitud("barrio"), formularioSolicitud.getBarrio())
                    .formParam(estructuraFormularioSolicitud("telefonoResidencia"), formularioSolicitud.getTelefonoResidencia())
                    .formParam(estructuraFormularioSolicitud("celular"), formularioSolicitud.getCelular())
                    .formParam(estructuraFormularioSolicitud("correspondenciaA"), formularioSolicitud.getCorrespondenciaA())
                    .formParam(estructuraFormularioSolicitud("email"), formularioSolicitud.getEmail())
                    .formParam(estructuraFormularioSolicitud("anios"), formularioSolicitud.getAnios())
                    .formParam(estructuraFormularioSolicitud("meses"), formularioSolicitud.getMeses())
                    .formParam(estructuraFormularioSolicitud("eps"), formularioSolicitud.getEps())
                    .formParam(estructuraFormularioSolicitud("adulto"), formularioSolicitud.getAdulto())
                    .formParam(estructuraFormularioSolicitud("menor18"), formularioSolicitud.getMenor18())
                    .formParam(estructuraFormularioSolicitud("nivelEstudio"), formularioSolicitud.getNivelEstudio())
                    .formParam(estructuraFormularioSolicitud("profesion"), formularioSolicitud.getProfesion())
                    .formParam(estructuraFormularioSolicitud("ocupacion"), formularioSolicitud.getOcupacion())
                    .formParam(estructuraFormularioSolicitud("declaraRenta"), formularioSolicitud.getDeclaraRenta())
                    .formParam(estructuraFormularioSolicitud("decisionCargo"), formularioSolicitud.getDecisionCargo())
                    .formParam(estructuraFormularioSolicitud("recursosPublicos"), formularioSolicitud.getRecursosPublicos())
                    .formParam(estructuraFormularioSolicitud("personajePublico"), formularioSolicitud.getPersonajePublico())
                    .formParam(estructuraFormularioSolicitud("empresa"), formularioSolicitud.getEmpresa())
                    .formParam(estructuraFormularioSolicitud("cargo"), formularioSolicitud.getCargo())
                    .formParam(estructuraFormularioSolicitud("fechaVinculacion"), formularioSolicitud.getFechaVinculacion())
                    .formParam(estructuraFormularioSolicitud("direccionTrabajo"), formularioSolicitud.getDireccionTrabajo())
                    .formParam(estructuraFormularioSolicitud("ciudadTrabajo"), formularioSolicitud.getCiudadTrabajo())
                    .formParam(estructuraFormularioSolicitud("nitEmpresa"), formularioSolicitud.getNitEmpresa())
                    .formParam(estructuraFormularioSolicitud("telefonoEmpresa"), formularioSolicitud.getTelefonoEmpresa())
                    .formParam(estructuraFormularioSolicitud("extension"), formularioSolicitud.getExtension())
                    .formParam(estructuraFormularioSolicitud("tipoEmpresa"), formularioSolicitud.getTipoEmpresa())
                    .formParam(estructuraFormularioSolicitud("actividadEconomica"), formularioSolicitud.getActividadEconomica())
                    .formParam(estructuraFormularioSolicitud("tipoContrato"), formularioSolicitud.getTipoContrato())
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
                    .formParam(estructuraFormularioSolicitud("detalleRazon"), formularioSolicitud.getDetalleRazon())
                    .formParam(estructuraFormularioSolicitud("primerNombreConyugue"), formularioSolicitud.getPrimerNombreConyugue())
                    .formParam(estructuraFormularioSolicitud("segundoNombreConyugue"), formularioSolicitud.getSegundoNombreConyugue())
                    .formParam(estructuraFormularioSolicitud("primerApellidoConyugue"), formularioSolicitud.getPrimerApellidoConyugue())
                    .formParam(estructuraFormularioSolicitud("segundoApellidoConyugue"), formularioSolicitud.getSegundoApellidoConyugue())
                    .formParam(estructuraFormularioSolicitud("tipoDocumentoConyugue"), formularioSolicitud.getTipoDocumentoConyugue())
                    .formParam(estructuraFormularioSolicitud("documentoConyugue"), formularioSolicitud.getDocumentoConyugue())
                    .formParam(estructuraFormularioSolicitud("fechaExpedicionConyugue"), formularioSolicitud.getFechaExpedicionConyugue())
                    .formParam(estructuraFormularioSolicitud("lugarExpedicionConyugue"), formularioSolicitud.getLugarExpedicionConyugue())
                    .formParam(estructuraFormularioSolicitud("fechaNacimientoConyugue"), formularioSolicitud.getFechaNacimientoConyugue())
                    .formParam(estructuraFormularioSolicitud("lugarNacimientoConyugue"), formularioSolicitud.getLugarNacimientoConyugue())
                    .formParam(estructuraFormularioSolicitud("sexoConyugue"), formularioSolicitud.getSexoConyugue())
                    .formParam(estructuraFormularioSolicitud("lugarTrabajoConyugue"), formularioSolicitud.getLugarTrabajoConyugue())
                    .formParam(estructuraFormularioSolicitud("ocupacionConyugue"), formularioSolicitud.getOcupacionConyugue())
                    .formParam(estructuraFormularioSolicitud("dependenciaEconomica"), formularioSolicitud.getDependenciaEconomica())
                    .formParam(estructuraFormularioSolicitud("fechaIngreso"), formularioSolicitud.getFechaIngreso())
                    .formParam(estructuraFormularioSolicitud("cargoConyugue"), formularioSolicitud.getCargoConyugue())
                    .formParam(estructuraFormularioSolicitud("totalIngresosConyugue"), formularioSolicitud.getTotalIngresosConyugue())
                    .formParam(estructuraFormularioSolicitud("totalEgresosConyugue"), formularioSolicitud.getTotalEgresosConyugue())
                    .formParam(estructuraFormularioSolicitud("epsConyugue"), formularioSolicitud.getEpsConyugue())
                    .formParam(estructuraFormularioSolicitud("nivelEstudioConyugue"), formularioSolicitud.getNivelEstudioConyugue())
                    .formParam(estructuraFormularioSolicitud("celularConyugue"), formularioSolicitud.getCelularConyugue())
                    .formParam(estructuraFormularioSolicitud("nombreReferenciaFamiliar"), formularioSolicitud.getNombreReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("parentescoReferenciaFamiliar"), formularioSolicitud.getParentescoReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("telefonoReferenciaFamiliar"), formularioSolicitud.getTelefonoReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("ciudadReferenciaFamiliar"), formularioSolicitud.getCiudadReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("celularReferenciaFamiliar"), formularioSolicitud.getCelularReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("direccionReferenciaFamiliar"), formularioSolicitud.getDireccionReferenciaFamiliar())
                    .formParam(estructuraFormularioSolicitud("nombreReferenciaPersonal"), formularioSolicitud.getNombreReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("parentescoReferenciaPersonal"), formularioSolicitud.getParentescoReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("telefonoReferenciaPersonal"), formularioSolicitud.getTelefonoReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("ciudadReferenciaPersonal"), formularioSolicitud.getCiudadReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("celularReferenciaPersonal"), formularioSolicitud.getCelularReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("direccionReferenciaPersonal"), formularioSolicitud.getDireccionReferenciaPersonal())
                    .formParam(estructuraFormularioSolicitud("entidadFinanciera"), formularioSolicitud.getEntidadFinanciera())
                    .formParam(estructuraFormularioSolicitud("sucursal"), formularioSolicitud.getSucursal())
                    .formParam(estructuraFormularioSolicitud("tipoProducto"), formularioSolicitud.getTipoProducto())
                    .formParam(estructuraFormularioSolicitud("calificacionAtencion"), formularioSolicitud.getCalificacionAtencion())
                    .formParam(estructuraFormularioSolicitud("razonCalificacion"), formularioSolicitud.getRazonCalificacion())
                    .formParam(estructuraFormularioSolicitud("conocioFinsocial"), formularioSolicitud.getConocioFinsocial())
                    .formParam(estructuraFormularioSolicitud("razonConocio"), formularioSolicitud.getRazonConocio())
                    .formParam(estructuraFormularioSolicitud("transaccionMonedaExtranjera"), formularioSolicitud.getTransaccionMonedaExtranjera())
                    .formParam(estructuraFormularioSolicitud("cuentaExterior"), formularioSolicitud.getCuentaExterior()))
    );
  }
}
