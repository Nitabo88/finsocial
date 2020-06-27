package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.models.FormularioSolicitud;
import co.com.red5g.finsonet.tasks.factories.Loguearse;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class SolicitudCreditoBack implements Task {

    Credenciales credenciales;
    FormularioSolicitud formularioSolicitud;
    Credito credito;

    public SolicitudCreditoBack(Credenciales credenciales, FormularioSolicitud formularioSolicitud, Credito credito) {
        this.credenciales = credenciales;
        this.formularioSolicitud = formularioSolicitud;
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.attemptsTo(Loguearse.enFinsonetBack(credenciales));
        String cookie = SerenityRest.lastResponse().getCookie("PHPSESSID");
        actor.attemptsTo(
            Post.to("/ajax/ajxFormSolicitud.php")
                .with(
                    requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                        .header("Cookie", "PHPSESSID=" + cookie)
                        .formParam("id_cred", numeroCredito)
                        .formParam("numPaso", formularioSolicitud.getNumPaso())
                        .formParam("txtFecha", formularioSolicitud.getFecha())
                        .formParam("perfil", formularioSolicitud.getPerfil())
                        .formParam("crid", numeroCredito)
                        .formParam("pasoSol", formularioSolicitud.getPasoSol())
                        .formParam("txtAsesor", formularioSolicitud.getAsesor())
                        .formParam("txtCiuC", formularioSolicitud.getCiuC())
                        .formParam("txtCalf", formularioSolicitud.getCalf())
                        .formParam("txtTSol", formularioSolicitud.getTSol())
                        .formParam("a_vinculacion", formularioSolicitud.getAVinculacion())
                        .formParam("txtVin", formularioSolicitud.getVin())
                        .formParam("txtMonto", formularioSolicitud.getMonto())
                        .formParam("txtLinea", formularioSolicitud.getLinea())
                        .formParam("cuota", formularioSolicitud.getCuota())
                        .formParam("txtPlaz", formularioSolicitud.getPlaz())
                        .formParam("tasaI", formularioSolicitud.getTasaI())
                        .formParam("tasaM", formularioSolicitud.getTasaM())
                        .formParam("tasaMax", formularioSolicitud.getTasaMax())
                        .formParam("txtPApellido", formularioSolicitud.getPApellido())
                        .formParam("txtSApellido", formularioSolicitud.getSApellido())
                        .formParam("txtPNombre", formularioSolicitud.getPNombre())
                        .formParam("txtSNombre", formularioSolicitud.getSNombre())
                        .formParam("cmbTipoDoc", formularioSolicitud.getTipoDoc())
                        .formParam("txtNoDoc", credito.getNumeroDocumento())
                        .formParam("txtLugarExp", formularioSolicitud.getLugarExp())
                        .formParam("txtFechaExp", formularioSolicitud.getFechaExp())
                        .formParam("txtFechaNac", formularioSolicitud.getFechaNac())
                        .formParam("cmbSexo", formularioSolicitud.getSexo())
                        .formParam("txtLugarNac", formularioSolicitud.getLugarNac())
                        .formParam("cmbEstCivil", formularioSolicitud.getEstCivil())
                        .formParam("txtPais", formularioSolicitud.getPais())
                        .formParam("cmbCiudad", formularioSolicitud.getCiudad())
                        .formParam("cmbTipoViv", formularioSolicitud.getTipoViv())
                        .formParam("txtEstrato", formularioSolicitud.getEstrato())
                        .formParam("txtArrend", formularioSolicitud.getArrend())
                        .formParam("txtTelArr", formularioSolicitud.getTelArr())
                        .formParam("dirCa", formularioSolicitud.getDirCa())
                        .formParam("txtBarrio", formularioSolicitud.getBarrio())
                        .formParam("txtTel", formularioSolicitud.getTel())
                        .formParam("txtCel", formularioSolicitud.getCel())
                        .formParam("cmbCorrespondencia", formularioSolicitud.getCorrespondencia())
                        .formParam("txtEmail", formularioSolicitud.getEmail())
                        .formParam("txtAnios", formularioSolicitud.getAnios())
                        .formParam("txtMeses", formularioSolicitud.getMeses())
                        .formParam("txtEps", formularioSolicitud.getEps())
                        .formParam("txtAdulto", formularioSolicitud.getAdulto())
                        .formParam("txtMenor18", formularioSolicitud.getMenor18())
                        .formParam("cmbNivelEst", formularioSolicitud.getNivelEst())
                        .formParam("cmbProfesion", formularioSolicitud.getProfesion())
                        .formParam("rdOcupacion", formularioSolicitud.getRdOcupacion())
                        .formParam("txtDeRenta", formularioSolicitud.getDeRenta())
                        .formParam("txtDesicionCargo", formularioSolicitud.getDesicionCargo())
                        .formParam("txtrecPublicos", formularioSolicitud.getrecPublicos())
                        .formParam("txtPerPubl", formularioSolicitud.getPerPubl())
                        .formParam("txtEmpresa", formularioSolicitud.getEmpresa())
                        .formParam("txtCargo", formularioSolicitud.getCargo())
                        .formParam("txtFechaVinculacion", formularioSolicitud.getFechaVinculacion())
                        .formParam("dirTrabajo", formularioSolicitud.getDirTrabajo())
                        .formParam("cmbCiudad2", formularioSolicitud.getCiudad2())
                        .formParam("txtNitEmpresa", formularioSolicitud.getNitEmpresa())
                        .formParam("txtTelEmpresa", formularioSolicitud.getTelEmpresa())
                        .formParam("txtExt", formularioSolicitud.getExt())
                        .formParam("cmbTipoEmp", formularioSolicitud.getTipoEmp())
                        .formParam("cmbActEcon", formularioSolicitud.getActEcon())
                        .formParam("cmbTipoContrato", formularioSolicitud.getTipoContrato())
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
                        .formParam("razon", formularioSolicitud.getRazon())
                        .formParam("txtPNConyugue", formularioSolicitud.getPNConyugue())
                        .formParam("txtSNConyugue", formularioSolicitud.getSNConyugue())
                        .formParam("txtPAConyugue", formularioSolicitud.getPAConyugue())
                        .formParam("txtSAConyugue", formularioSolicitud.getSAConyugue())
                        .formParam("cmbTipoDocCony", formularioSolicitud.getTipoDocCony())
                        .formParam("txtDocConyugue", formularioSolicitud.getDocConyugue())
                        .formParam("txtFechaExpCon", formularioSolicitud.getFechaExpCon())
                        .formParam("txtLugarExpCon", formularioSolicitud.getLugarExpCon())
                        .formParam("txtFechaNacCon", formularioSolicitud.getFechaNacCon())
                        .formParam("txtLugarNacCon", formularioSolicitud.getLugarNacCon())
                        .formParam("txtLugarNacCon", formularioSolicitud.getLugarNacCon())
                        .formParam("cmbSexoCon", formularioSolicitud.getSexoCon())
                        .formParam("txtLugTrabCon", formularioSolicitud.getLugTrabCon())
                        .formParam("rdOcupacionCon", formularioSolicitud.getRdOcupacionCon())
                        .formParam("txtDepEco", formularioSolicitud.getDepEco())
                        .formParam("txtFecIngr", formularioSolicitud.getFecIngr())
                        .formParam("txtCargoCon", formularioSolicitud.getCargoCon())
                        .formParam("txtTIngCon", formularioSolicitud.getTIngCon())
                        .formParam("txtTEgrCon", formularioSolicitud.getTEgrCon())
                        .formParam("txtEpsConyuge", formularioSolicitud.getEpsConyuge())
                        .formParam("cmbNivelEstCon", formularioSolicitud.getNivelEstCon())
                        .formParam("txtCelCon", formularioSolicitud.getCelCon())
                        .formParam("ref_familiar_nombre", formularioSolicitud.getRefFamiliarNombre())
                        .formParam("ref_familiar_par", formularioSolicitud.getRefFamiliarPar())
                        .formParam("ref_familiar_tel", formularioSolicitud.getRefFamiliarTel())
                        .formParam("cmbCiudadRefFam", formularioSolicitud.getCiudadRefFam())
                        .formParam("txtCelRFam", formularioSolicitud.getCelRFam())
                        .formParam("dirFamiliar", formularioSolicitud.getDirFamiliar())
                        .formParam("ref_personal_nombre", formularioSolicitud.getRefPersonalNombre())
                        .formParam("ref_personal_par", formularioSolicitud.getRefPersonalPar())
                        .formParam("ref_personal_tel", formularioSolicitud.getRefPersonalTel())
                        .formParam("cmbCiudadRefPer", formularioSolicitud.getCiudadRefPer())
                        .formParam("txtCelRPer", formularioSolicitud.getCelRPer())
                        .formParam("dirPersonal", formularioSolicitud.getDirPersonal())
                        .formParam("txtNEntFin", formularioSolicitud.getNEntFin())
                        .formParam("txtSucursal", formularioSolicitud.getSucursal())
                        .formParam("cmbTipoProd", formularioSolicitud.getTipoProd())
                        .formParam("cmbSatisfaccionC", formularioSolicitud.getSatisfaccionC())
                        .formParam("txtPorqueSatic", formularioSolicitud.getPorqueSatic())
                        .formParam("cmbConocioFinsocial", formularioSolicitud.getConocioFinsocial())
                        .formParam("txtOtroConocer", formularioSolicitud.getOtroConocer())
                        .formParam("rdtransaccion_ext", formularioSolicitud.getRdtransaccionExt())
                        .formParam("rdCuentasExt", formularioSolicitud.getRdCuentasExt())
                ));
        assertThat(SerenityRest.lastResponse().statusCode(), equalTo(200));
    }
}
