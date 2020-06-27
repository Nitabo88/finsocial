package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.utils.string.UtileriaFechas.fechaActual;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import co.com.red5g.utils.Builder;

public class FormularioSolicitudBuilder implements Builder<FormularioSolicitud> {

  private String numPaso;
  private String txtFecha;
  private int perfil;
  private int pasoSol;
  private String txtAsesor;
  private int txtCiuC;
  private int txtCalf;
  private String txtTSol;
  private int a_vinculacion;
  private String txtVin;
  private int txtMonto;
  private String txtLinea;
  private int cuota;
  private int txtPlaz;
  private int tasaI;
  private int tasaM;
  private int tasaMax;
  private String txtPApellido;
  private String txtSApellido;
  private String txtPNombre;
  private String txtSNombre;
  private int cmbTipoDoc;
  private int txtLugarExp;
  private String txtFechaExp;
  private String txtFechaNac;
  private String cmbSexo;
  private int txtLugarNac;
  private String cmbEstCivil;
  private String txtPais;
  private int cmbCiudad;
  private String cmbTipoViv;
  private int txtEstrato;
  private String txtArrend;
  private int txtTelArr;
  private String dirCa;
  private String txtBarrio;
  private int txtTel;
  private int txtCel;
  private String cmbCorrespondencia;
  private String txtEmail;
  private int txtAnios;
  private int txtMeses;
  private String txtEps;
  private int txtAdulto;
  private int txtMenor18;
  private int cmbNivelEst;
  private int cmbProfesion;
  private int rdOcupacion;
  private String txtDeRenta;
  private String txtDesicionCargo;
  private int txtrecPublicos;
  private int txtPerPubl;
  private int txtEmpresa;
  private String txtCargo;
  private String txtFechaVinculacion;
  private String dirTrabajo;
  private int cmbCiudad2;
  private String txtNitEmpresa;
  private int txtTelEmpresa;
  private int txtExt;
  private int cmbTipoEmp;
  private int cmbActEcon;
  private int cmbTipoContrato;
  private int activos_corrientes;
  private int activos_fijos;
  private int otros_activos;
  private String cuales_activos;
  private int total_activos;
  private int pasivos_financieros;
  private int pasivos_corrientes;
  private int otros_pasivos;
  private String cuales_pasivos;
  private int total_pasivos;
  private String txtTipoInm;
  private int txtValorComInm;
  private String txtHipotecado;
  private String dirBienes;
  private int txtSaldoCredInm;
  private String txtVehCls;
  private int txtValorComVeh;
  private String txtMarcaVeh;
  private String txtPlacaVeh;
  private int txtSaldoCredVeh;
  private String txtPrendaFavVeh;
  private int txtSueldoFijo;
  private int txtSalVarCom;
  private int txtArrendamiento;
  private int txtRenFin;
  private int txtHonorarios;
  private int txtOtrosIng;
  private String txtCualesIng;
  private int txtTIngresos;
  private int txtArriendos;
  private int txtGastosPer;
  private int txtPresDfFin;
  private int txtDeducciones;
  private int txtTarjCred;
  private int txtOtrosGastos;
  private String txtCualesGastos;
  private int txtTEgresos;
  private int txtPagHip;
  private int txtVlrComViv;
  private String txtGustaVivir;
  private int rdCompViv;
  private int rdCupoExtra;
  private String cmbRazondecredito;
  private String razon;
  private String txtPNConyugue;
  private String txtSNConyugue;
  private String txtPAConyugue;
  private String txtSAConyugue;
  private int cmbTipoDocCony;
  private int txtDocConyugue;
  private String txtFechaExpCon;
  private String txtLugarExpCon;
  private String txtFechaNacCon;
  private String txtLugarNacCon;
  private String cmbSexoCon;
  private String txtLugTrabCon;
  private int rdOcupacionCon;
  private int txtDepEco;
  private String txtFecIngr;
  private String txtCargoCon;
  private String txtTIngCon;
  private String txtTEgrCon;
  private String txtEpsConyuge;
  private String cmbNivelEstCon;
  private int txtCelCon;
  private String ref_familiar_nombre;
  private String ref_familiar_par;
  private int ref_familiar_tel;
  private int cmbCiudadRefFam;
  private int txtCelRFam;
  private String dirFamiliar;
  private String ref_personal_nombre;
  private String ref_personal_par;
  private int ref_personal_tel;
  private int cmbCiudadRefPer;
  private long txtCelRPer;
  private String dirPersonal;
  private String txtNEntFin;
  private String txtSucursal;
  private int cmbTipoProd;
  private String cmbSatisfaccionC;
  private String txtPorqueSatic;
  private String cmbConocioFinsocial;
  private String txtOtroConocer;
  private int rdtransaccion_ext;
  private int rdCuentasExt;


  private FormularioSolicitudBuilder() {
    this.numPaso = "";
    this.txtFecha = "";
    this.perfil = 0;
    this.pasoSol = 0;
    this.txtAsesor = "";
    this.txtCiuC = 0;
    this.txtCalf = 0;
    this.txtTSol = "";
    this.a_vinculacion = 0;
    this.txtVin = "";
    this.txtMonto = 0;
    this.txtLinea = "";
    this.cuota = 0;
    this.txtPlaz = 0;
    this.tasaI = 0;
    this.tasaM = 0;
    this.tasaMax = 0;
    this.txtPApellido = "";
    this.txtSApellido = "";
    this.txtPNombre = "";
    this.txtSNombre = "";
    this.cmbTipoDoc = 0;
    this.txtLugarExp = 0;
    this.txtFechaExp = "";
    this.txtFechaNac = "";
    this.cmbSexo = "";
    this.txtLugarNac = 0;
    this.cmbEstCivil = "";
    this.txtPais = "";
    this.cmbCiudad = 0;
    this.cmbTipoViv = "";
    this.txtEstrato = 0;
    this.txtArrend = "";
    this.txtTelArr = 0;
    this.dirCa = "";
    this.txtBarrio = "";
    this.txtTel = 0;
    this.txtCel = 0;
    this.cmbCorrespondencia = "";
    this.txtEmail = "";
    this.txtAnios = 0;
    this.txtMeses = 0;
    this.txtEps = "";
    this.txtAdulto = 0;
    this.txtMenor18 = 0;
    this.cmbNivelEst = 0;
    this.cmbProfesion = 0;
    this.rdOcupacion = 0;
    this.txtDeRenta = "";
    this.txtDesicionCargo = "";
    this.txtrecPublicos = 0;
    this.txtPerPubl = 0;
    this.txtEmpresa = 0;
    this.txtCargo = "";
    this.txtFechaVinculacion = "";
    this.dirTrabajo = "";
    this.cmbCiudad2 = 0;
    this.txtNitEmpresa = "";
    this.txtTelEmpresa = 0;
    this.txtExt = 0;
    this.cmbTipoEmp = 0;
    this.cmbActEcon = 0;
    this.cmbTipoContrato = 0;
    this.activos_corrientes = 0;
    this.activos_fijos = 0;
    this.otros_activos = 0;
    this.cuales_activos = "";
    this.total_activos = 0;
    this.pasivos_financieros = 0;
    this.pasivos_corrientes = 0;
    this.otros_pasivos = 0;
    this.cuales_pasivos = "";
    this.total_pasivos = 0;
    this.txtTipoInm = "";
    this.txtValorComInm = 0;
    this.txtHipotecado = "";
    this.dirBienes = "";
    this.txtSaldoCredInm = 0;
    this.txtVehCls = "";
    this.txtValorComVeh = 0;
    this.txtMarcaVeh = "";
    this.txtPlacaVeh = "";
    this.txtSaldoCredVeh = 0;
    this.txtPrendaFavVeh = "";
    this.txtSueldoFijo = 0;
    this.txtSalVarCom = 0;
    this.txtArrendamiento = 0;
    this.txtRenFin = 0;
    this.txtHonorarios = 0;
    this.txtOtrosIng = 0;
    this.txtCualesIng = "";
    this.txtTIngresos = 0;
    this.txtArriendos = 0;
    this.txtGastosPer = 0;
    this.txtPresDfFin = 0;
    this.txtDeducciones = 0;
    this.txtTarjCred = 0;
    this.txtOtrosGastos = 0;
    this.txtCualesGastos = "";
    this.txtTEgresos = 0;
    this.txtPagHip = 0;
    this.txtVlrComViv = 0;
    this.txtGustaVivir = "";
    this.rdCompViv = 0;
    this.rdCupoExtra = 0;
    this.cmbRazondecredito = "";
    this.razon = "";
    this.txtPNConyugue = "";
    this.txtSNConyugue = "";
    this.txtPAConyugue = "";
    this.txtSAConyugue = "";
    this.cmbTipoDocCony = 0;
    this.txtDocConyugue = 0;
    this.txtFechaExpCon = "";
    this.txtLugarExpCon = "";
    this.txtFechaNacCon = "";
    this.txtLugarNacCon = "";
    this.cmbSexoCon = "";
    this.txtLugTrabCon = "";
    this.rdOcupacionCon = 0;
    this.txtDepEco = 0;
    this.txtFecIngr = "";
    this.txtCargoCon = "";
    this.txtTIngCon = "";
    this.txtTEgrCon = "";
    this.txtEpsConyuge = "";
    this.cmbNivelEstCon = "";
    this.txtCelCon = 0;
    this.ref_familiar_nombre = "";
    this.ref_familiar_par = "";
    this.ref_familiar_tel = 0;
    this.cmbCiudadRefFam = 0;
    this.txtCelRFam = 0;
    this.dirFamiliar = "";
    this.ref_personal_nombre = "";
    this.ref_personal_par = "";
    this.ref_personal_tel = 0;
    this.cmbCiudadRefPer = 0;
    this.txtCelRPer = 0;
    this.dirPersonal = "";
    this.txtNEntFin = "";
    this.txtSucursal = "";
    this.cmbTipoProd = 0;
    this.cmbSatisfaccionC = "";
    this.txtPorqueSatic = "";
    this.cmbConocioFinsocial = "";
    this.txtOtroConocer = "";
    this.rdtransaccion_ext = 0;
    this.rdCuentasExt = 0;
  }

  public static FormularioSolicitudBuilder con() {
    return new FormularioSolicitudBuilder();
  }

  @Override
  public FormularioSolicitud build() {
    return new FormularioSolicitud(this);
  }

  private FormularioSolicitudBuilder numeroPaso(String numPaso) {
    this.numPaso = numPaso;
    return this;
  }

  private FormularioSolicitudBuilder fecha() {
    this.txtFecha = fechaActual();
    return this;
  }

  private FormularioSolicitudBuilder perfil(int perfil) {
    this.perfil = perfil;
    return this;
  }

  private FormularioSolicitudBuilder pasoSolicitud(int pasoSol) {
    this.pasoSol = pasoSol;
    return this;
  }

  private FormularioSolicitudBuilder asesor() {
    this.txtAsesor = "ORLANDO NICOLAS CHINCHILLA VEGA";
    return this;
  }

  private FormularioSolicitudBuilder ciudadSolicitud(int txtCiuC) {
    this.txtCiuC = txtCiuC;
    return this;
  }

  private FormularioSolicitudBuilder calificacion(int txtCalf) {
    this.txtCalf = txtCalf;
    return this;
  }

  private FormularioSolicitudBuilder tipoSolicitud(String txtTSol) {
    this.txtTSol = txtTSol;
    return this;
  }

  private FormularioSolicitudBuilder agenciaVinculacion(int a_vinculacion) {
    this.a_vinculacion = a_vinculacion;
    return this;
  }

  private FormularioSolicitudBuilder vinculacion(String txtVin) {
    this.txtVin = txtVin;
    return this;
  }

  private FormularioSolicitudBuilder linea(String txtLinea) {
    this.txtLinea = txtLinea;
    return this;
  }

  private FormularioSolicitudBuilder primerApellido(String txtPApellido) {
    this.txtPApellido = txtPApellido;
    return this;
  }

  private FormularioSolicitudBuilder segundoApellido(String txtSApellido) {
    this.txtSApellido = txtSApellido;
    return this;
  }

  private FormularioSolicitudBuilder primerNombre(String txtPNombre) {
    this.txtPNombre = txtPNombre;
    return this;
  }

  private FormularioSolicitudBuilder tipoDocumento(int cmbTipoDoc) {
    this.cmbTipoDoc = cmbTipoDoc;
    return this;
  }

  private FormularioSolicitudBuilder lugarExpedicion(int txtLugarExp) {
    this.txtLugarExp = txtLugarExp;
    return this;
  }

  private FormularioSolicitudBuilder fechaExpedicion(String txtFechaExp) {
    this.txtFechaExp = txtFechaExp;
    return this;
  }

  private FormularioSolicitudBuilder fechaNacimiento(String txtFechaNac) {
    this.txtFechaNac = txtFechaNac;
    return this;
  }

  private FormularioSolicitudBuilder sexo(String cmbSexo) {
    this.cmbSexo = cmbSexo;
    return this;
  }

  private FormularioSolicitudBuilder lugarNacimiento(int txtLugarNac) {
    this.txtLugarNac = txtLugarNac;
    return this;
  }

  private FormularioSolicitudBuilder estadoCivil(String cmbEstCivil) {
    this.cmbEstCivil = cmbEstCivil;
    return this;
  }

  private FormularioSolicitudBuilder pais(String txtPais) {
    this.txtPais = txtPais;
    return this;
  }

  private FormularioSolicitudBuilder ciudadResidencia(int cmbCiudad) {
    this.cmbCiudad = cmbCiudad;
    return this;
  }

  private FormularioSolicitudBuilder tipoVivienda(String cmbTipoViv) {
    this.cmbTipoViv = cmbTipoViv;
    return this;
  }

  private FormularioSolicitudBuilder estrato(int txtEstrato) {
    this.txtEstrato = txtEstrato;
    return this;
  }

  private FormularioSolicitudBuilder nombreArrendatario(String txtArrend) {
    this.txtArrend = txtArrend;
    return this;
  }

  private FormularioSolicitudBuilder telefonoArrendador(int txtTelArr) {
    this.txtTelArr = txtTelArr;
    return this;
  }

  private FormularioSolicitudBuilder direccionResidencia(String dirCa) {
    this.dirCa = dirCa;
    return this;
  }

  private FormularioSolicitudBuilder barrio(String txtBarrio) {
    this.txtBarrio = txtBarrio;
    return this;
  }

  private FormularioSolicitudBuilder telefonoResidencia(int txtTel) {
    this.txtTel = txtTel;
    return this;
  }

  private FormularioSolicitudBuilder celular(int txtCel) {
    this.txtCel = txtCel;
    return this;
  }

  private FormularioSolicitudBuilder correspondenciaA(String cmbCorrespondencia) {
    this.cmbCorrespondencia = cmbCorrespondencia;
    return this;
  }

  private FormularioSolicitudBuilder email(String txtEmail) {
    this.txtEmail = txtEmail;
    return this;
  }

  private FormularioSolicitudBuilder tiempoResidenciaAnios(int txtAnios) {
    this.txtAnios = txtAnios;
    return this;
  }

  private FormularioSolicitudBuilder tiempoResidenciaMeses(int txtMeses) {
    this.txtMeses = txtMeses;
    return this;
  }

  private FormularioSolicitudBuilder nombreEps(String txtEps) {
    this.txtEps = txtEps;
    return this;
  }

  private FormularioSolicitudBuilder adultosACargo(int txtAdulto) {
    this.txtAdulto = txtAdulto;
    return this;
  }

  private FormularioSolicitudBuilder menoresACargo(int txtMenor18) {
    this.txtMenor18 = txtMenor18;
    return this;
  }

  private FormularioSolicitudBuilder nivelEstudio(int cmbNivelEst) {
    this.cmbNivelEst = cmbNivelEst;
    return this;
  }

  private FormularioSolicitudBuilder profesion(int cmbProfesion) {
    this.cmbProfesion = cmbProfesion;
    return this;
  }

  private FormularioSolicitudBuilder ocupacion(int rdOcupacion) {
    this.rdOcupacion = rdOcupacion;
    return this;
  }

  private FormularioSolicitudBuilder renta(String txtDeRenta) {
    this.txtDeRenta = txtDeRenta;
    return this;
  }

  private FormularioSolicitudBuilder decisionCargo(String txtDesicionCargo) {
    this.txtDesicionCargo = txtDesicionCargo;
    return this;
  }

  private FormularioSolicitudBuilder recursosPublicos(int txtrecPublicos) {
    this.txtrecPublicos = txtrecPublicos;
    return this;
  }

  private FormularioSolicitudBuilder personajePublico(int txtPerPubl) {
    this.txtPerPubl = txtPerPubl;
    return this;
  }

  private FormularioSolicitudBuilder nombreEmpresa(int txtEmpresa) {
    this.txtEmpresa = txtEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder cargo(String txtCargo) {
    this.txtCargo = txtCargo;
    return this;
  }

  private FormularioSolicitudBuilder fechaVinculacion(String txtFechaVinculacion) {
    this.txtFechaVinculacion = txtFechaVinculacion;
    return this;
  }

  private FormularioSolicitudBuilder direccionTrabajo(String dirTrabajo) {
    this.dirTrabajo = dirTrabajo;
    return this;
  }

  private FormularioSolicitudBuilder ciudadTrabajo(int cmbCiudad2) {
    this.cmbCiudad2 = cmbCiudad2;
    return this;
  }

  private FormularioSolicitudBuilder nitEmpresa(String txtNitEmpresa) {
    this.txtNitEmpresa = txtNitEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder telefonoTrabajo(int txtTelEmpresa) {
    this.txtTelEmpresa = txtTelEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder extensionTrabajo(int txtExt) {
    this.txtExt = txtExt;
    return this;
  }

  private FormularioSolicitudBuilder tipoEmpresa(int cmbTipoEmp) {
    this.cmbTipoEmp = cmbTipoEmp;
    return this;
  }

  private FormularioSolicitudBuilder actividadEconomica(int cmbActEcon) {
    this.cmbActEcon = cmbActEcon;
    return this;
  }

  private FormularioSolicitudBuilder tipoContrato(int cmbTipoContrato) {
    this.cmbTipoContrato = cmbTipoContrato;
    return this;
  }

  private FormularioSolicitudBuilder activosCorrientes(int activos_corrientes) {
    this.activos_corrientes = activos_corrientes;
    return this;
  }

  private FormularioSolicitudBuilder activosFijos(int activos_fijos) {
    this.activos_fijos = activos_fijos;
    return this;
  }

  private FormularioSolicitudBuilder totalActivos(int total_activos) {
    this.total_activos = total_activos;
    return this;
  }

  private FormularioSolicitudBuilder pasivosFinancieros(int pasivos_financieros) {
    this.pasivos_financieros = pasivos_financieros;
    return this;
  }

  private FormularioSolicitudBuilder pasivosCorrientes(int pasivos_corrientes) {
    this.pasivos_corrientes = pasivos_corrientes;
    return this;
  }

  private FormularioSolicitudBuilder totalPasivos(int total_pasivos) {
    this.total_pasivos = total_pasivos;
    return this;
  }

  private FormularioSolicitudBuilder tipoVehiculo(String txtVehCls) {
    this.txtVehCls = txtVehCls;
    return this;
  }

  private FormularioSolicitudBuilder valorComercialVehiculo(int txtValorComVeh) {
    this.txtValorComVeh = txtValorComVeh;
    return this;
  }

  private FormularioSolicitudBuilder marcaVehiculo(String txtMarcaVeh) {
    this.txtMarcaVeh = txtMarcaVeh;
    return this;
  }

  private FormularioSolicitudBuilder placaVehiculo(String txtPlacaVeh) {
    this.txtPlacaVeh = txtPlacaVeh;
    return this;
  }

  private FormularioSolicitudBuilder saldoCreditoVehiculo(int txtSaldoCredVeh) {
    this.txtSaldoCredVeh = txtSaldoCredVeh;
    return this;
  }

  private FormularioSolicitudBuilder sueldoFijo(int txtSueldoFijo) {
    this.txtSueldoFijo = txtSueldoFijo;
    return this;
  }

  private FormularioSolicitudBuilder totalIngresos(int txtTIngresos) {
    this.txtTIngresos = txtTIngresos;
    return this;
  }

  private FormularioSolicitudBuilder comprarVivienda(int rdCompViv) {
    this.rdCompViv = rdCompViv;
    return this;
  }

  private FormularioSolicitudBuilder cupoExtra(int rdCupoExtra) {
    this.rdCupoExtra = rdCupoExtra;
    return this;
  }

  private FormularioSolicitudBuilder razonCredito(String cmbRazondecredito) {
    this.cmbRazondecredito = cmbRazondecredito;
    return this;
  }

  private FormularioSolicitudBuilder razonOtros(String razon) {
    this.razon = razon;
    return this;
  }

  private FormularioSolicitudBuilder tipoDocumentoConyugue(int cmbTipoDocCony) {
    this.cmbTipoDocCony = cmbTipoDocCony;
    return this;
  }

  private FormularioSolicitudBuilder ocupacionConyugue(int rdOcupacionCon) {
    this.rdOcupacionCon = rdOcupacionCon;
    return this;
  }

  private FormularioSolicitudBuilder dependenciaEconomicaConyugue(int txtDepEco) {
    this.txtDepEco = txtDepEco;
    return this;
  }

  private FormularioSolicitudBuilder nombreReferenciaFamiliar(String ref_familiar_nombre) {
    this.ref_familiar_nombre = ref_familiar_nombre;
    return this;
  }

  private FormularioSolicitudBuilder parentesco(String ref_familiar_par) {
    this.ref_familiar_par = ref_familiar_par;
    return this;
  }

  private FormularioSolicitudBuilder telefonoReferencia(int ref_familiar_tel) {
    this.ref_familiar_tel = ref_familiar_tel;
    return this;
  }

  private FormularioSolicitudBuilder ciudadReferenciaFamiliar(int cmbCiudadRefFam) {
    this.cmbCiudadRefFam = cmbCiudadRefFam;
    return this;
  }

  private FormularioSolicitudBuilder celularReferenciaFamiliar(int txtCelRFam) {
    this.txtCelRFam = txtCelRFam;
    return this;
  }

  private FormularioSolicitudBuilder direccionReferenciaFamiliar(String dirFamiliar) {
    this.dirFamiliar = dirFamiliar;
    return this;
  }

  private FormularioSolicitudBuilder nombreReferenciaPersonal(String ref_personal_nombre) {
    this.ref_personal_nombre = ref_personal_nombre;
    return this;
  }

  private FormularioSolicitudBuilder relacionReferenciaPersonal(String ref_personal_par) {
    this.ref_personal_par = ref_personal_par;
    return this;
  }

  private FormularioSolicitudBuilder telefonoReferenciaPersonal(int ref_personal_tel) {
    this.ref_personal_tel = ref_personal_tel;
    return this;
  }

  private FormularioSolicitudBuilder ciudadReferenciaPersonal(int cmbCiudadRefPer) {
    this.cmbCiudadRefPer = cmbCiudadRefPer;
    return this;
  }

  private FormularioSolicitudBuilder celularReferenciaPersonal(long txtCelRPer) {
    this.txtCelRPer = txtCelRPer;
    return this;
  }

  private FormularioSolicitudBuilder direccionReferenciaPersonal(String dirPersonal) {
    this.dirPersonal = dirPersonal;
    return this;
  }

  private FormularioSolicitudBuilder nombreEntidadBancaria(String txtNEntFin) {
    this.txtNEntFin = txtNEntFin;
    return this;
  }

  private FormularioSolicitudBuilder sucursalBancaria(String txtSucursal) {
    this.txtSucursal = txtSucursal;
    return this;
  }

  private FormularioSolicitudBuilder tipoProductoBancario(int cmbTipoProd) {
    this.cmbTipoProd = cmbTipoProd;
    return this;
  }


  private FormularioSolicitudBuilder operacionMonedaExtranjera(int rdtransaccion_ext) {
    this.rdtransaccion_ext = rdtransaccion_ext;
    return this;
  }

  private FormularioSolicitudBuilder cuentaExterior(int rdCuentasExt) {
    this.rdCuentasExt = rdCuentasExt;
    return this;
  }

  public FormularioSolicitud informacionLibranza() {
    this.numeroPaso("step-8");
    this.fecha();
    this.perfil(3);
    this.pasoSolicitud(8);
    this.asesor();
    this.ciudadSolicitud(5001);
    this.calificacion(660);
    this.tipoSolicitud("S");
    this.agenciaVinculacion(860);
    this.vinculacion("S");
    this.linea("LIBRANZA");
    this.primerApellido("Mora");
    this.segundoApellido("Camacho");
    this.primerNombre("Santiago");
    this.tipoDocumento(1);
    this.lugarExpedicion(5030);
    this.fechaExpedicion("2004-01-06");
    this.fechaNacimiento("1985-01-06");
    this.sexo("M");
    this.lugarNacimiento(5021);
    this.estadoCivil("S");
    this.pais("COLOMBIA");
    this.ciudadResidencia(5001);
    this.tipoVivienda("ARRENDADA");
    this.estrato(4);
    this.nombreArrendatario("Andres UzumaKi");
    this.telefonoArrendador(2211421);
    this.direccionResidencia("CL 80 A    53     25");
    this.barrio("Colores");
    this.telefonoResidencia(2808080);
    this.celular(300200202);
    this.correspondenciaA("CASA");
    this.email("prueba@gmail.com");
    this.tiempoResidenciaAnios(10);
    this.tiempoResidenciaMeses(2);
    this.nombreEps("Sura");
    this.adultosACargo(0);
    this.menoresACargo(0);
    this.nivelEstudio(5);
    this.profesion(122);
    this.ocupacion(1);
    this.renta("N");
    this.decisionCargo("N");
    this.recursosPublicos(1);
    this.personajePublico(1);
    this.nombreEmpresa(6);
    this.cargo("Ingeniero");
    this.fechaVinculacion("2009-12-16");
    this.direccionTrabajo("CL 80     55     60");
    this.ciudadTrabajo(8001);
    this.nitEmpresa("802014730-9");
    this.telefonoTrabajo(2012020);
    this.extensionTrabajo(123);
    this.tipoEmpresa(1);
    this.actividadEconomica(1);
    this.tipoContrato(1);
    this.activosCorrientes(38000000);
    this.activosFijos(51000000);
    this.totalActivos(89000000);
    this.pasivosFinancieros(33650000);
    this.pasivosCorrientes(3500000);
    this.totalPasivos(37150000);
    this.tipoVehiculo("Susuki swift");
    this.valorComercialVehiculo(51000000);
    this.marcaVehiculo("2018");
    this.placaVehiculo("EFY890");
    this.saldoCreditoVehiculo(33650000);
    this.sueldoFijo(4650000);
    this.totalIngresos(4650000);
    this.comprarVivienda(1);
    this.cupoExtra(1);
    this.razonCredito("VIVIENDA");
    this.razonOtros("-");
    this.tipoDocumentoConyugue(1);
    this.ocupacionConyugue(1);
    this.dependenciaEconomicaConyugue(1);
    this.nombreReferenciaFamiliar("Pablo Esteban Uzumaki");
    this.parentesco("Tio");
    this.telefonoReferencia(2202526);
    this.ciudadReferenciaFamiliar(8758);
    this.celularReferenciaFamiliar(300204252);
    this.direccionReferenciaFamiliar("CR 79     50  53");
    this.nombreReferenciaPersonal("Tatiana Borja");
    this.relacionReferenciaPersonal("Prima");
    this.telefonoReferenciaPersonal(2898989);
    this.ciudadReferenciaPersonal(5001);
    this.celularReferenciaPersonal(300200565);
    this.direccionReferenciaPersonal("CL 95     85  80");
    this.nombreEntidadBancaria("Bancolombia");
    this.sucursalBancaria("RutaN");
    this.tipoProductoBancario(1);
    this.operacionMonedaExtranjera(1);
    this.cuentaExterior(1);
    return this.build();
  }

  public String getNumPaso() {
    return numPaso;
  }

  public String getFecha() {
    return txtFecha;
  }

  public int getPerfil() {
    return perfil;
  }

  public int getPasoSol() {
    return pasoSol;
  }

  public String getAsesor() {
    return txtAsesor;
  }

  public int getCiuC() {
    return txtCiuC;
  }

  public int getCalf() {
    return txtCalf;
  }

  public String getTSol() {
    return txtTSol;
  }

  public int getAVinculacion() {
    return a_vinculacion;
  }

  public String getVin() {
    return txtVin;
  }

  public int getMonto() {
    return txtMonto;
  }

  public String getLinea() {
    return txtLinea;
  }

  public int getCuota() {
    return cuota;
  }

  public int getPlaz() {
    return txtPlaz;
  }

  public int getTasaI() {
    return tasaI;
  }

  public int getTasaM() {
    return tasaM;
  }

  public int getTasaMax() {
    return tasaMax;
  }

  public String getPApellido() {
    return txtPApellido;
  }

  public String getSApellido() {
    return txtSApellido;
  }

  public String getPNombre() {
    return txtPNombre;
  }

  public String getSNombre() {
    return txtSNombre;
  }

  public int getTipoDoc() {
    return cmbTipoDoc;
  }

  public int getLugarExp() {
    return txtLugarExp;
  }

  public String getFechaExp() {
    return txtFechaExp;
  }

  public String getFechaNac() {
    return txtFechaNac;
  }

  public String getSexo() {
    return cmbSexo;
  }

  public int getLugarNac() {
    return txtLugarNac;
  }

  public String getEstCivil() {
    return cmbEstCivil;
  }

  public String getPais() {
    return txtPais;
  }

  public int getCiudad() {
    return cmbCiudad;
  }

  public String getTipoViv() {
    return cmbTipoViv;
  }

  public int getEstrato() {
    return txtEstrato;
  }

  public String getArrend() {
    return txtArrend;
  }

  public int getTelArr() {
    return txtTelArr;
  }

  public String getDirCa() {
    return dirCa;
  }

  public String getBarrio() {
    return txtBarrio;
  }

  public int getTel() {
    return txtTel;
  }

  public int getCel() {
    return txtCel;
  }

  public String getCorrespondencia() {
    return cmbCorrespondencia;
  }

  public String getEmail() {
    return txtEmail;
  }

  public int getAnios() {
    return txtAnios;
  }

  public int getMeses() {
    return txtMeses;
  }

  public String getEps() {
    return txtEps;
  }

  public int getAdulto() {
    return txtAdulto;
  }

  public int getMenor18() {
    return txtMenor18;
  }

  public int getNivelEst() {
    return cmbNivelEst;
  }

  public int getProfesion() {
    return cmbProfesion;
  }

  public int getRdOcupacion() {
    return rdOcupacion;
  }

  public String getDeRenta() {
    return txtDeRenta;
  }

  public String getDesicionCargo() {
    return txtDesicionCargo;
  }

  public int getrecPublicos() {
    return txtrecPublicos;
  }

  public int getPerPubl() {
    return txtPerPubl;
  }

  public int getEmpresa() {
    return txtEmpresa;
  }

  public String getCargo() {
    return txtCargo;
  }

  public String getFechaVinculacion() {
    return txtFechaVinculacion;
  }

  public String getDirTrabajo() {
    return dirTrabajo;
  }

  public int getCiudad2() {
    return cmbCiudad2;
  }

  public String getNitEmpresa() {
    return txtNitEmpresa;
  }

  public int getTelEmpresa() {
    return txtTelEmpresa;
  }

  public int getExt() {
    return txtExt;
  }

  public int getTipoEmp() {
    return cmbTipoEmp;
  }

  public int getActEcon() {
    return cmbActEcon;
  }

  public int getTipoContrato() {
    return cmbTipoContrato;
  }

  public int getActivosCorrientes() {
    return activos_corrientes;
  }

  public int getActivosFijos() {
    return activos_fijos;
  }

  public int getOtrosActivos() {
    return otros_activos;
  }

  public String getCualesActivos() {
    return cuales_activos;
  }

  public int getTotalActivos() {
    return total_activos;
  }

  public int getPasivosFinancieros() {
    return pasivos_financieros;
  }

  public int getPasivosCorrientes() {
    return pasivos_corrientes;
  }

  public int getOtrosPasivos() {
    return otros_pasivos;
  }

  public String getCualesPasivos() {
    return cuales_pasivos;
  }

  public int getTotalPasivos() {
    return total_pasivos;
  }

  public String getTipoInm() {
    return txtTipoInm;
  }

  public int getValorComInm() {
    return txtValorComInm;
  }

  public String getHipotecado() {
    return txtHipotecado;
  }

  public String getDirBienes() {
    return dirBienes;
  }

  public int getSaldoCredInm() {
    return txtSaldoCredInm;
  }

  public String getVehCls() {
    return txtVehCls;
  }

  public int getValorComVeh() {
    return txtValorComVeh;
  }

  public String getMarcaVeh() {
    return txtMarcaVeh;
  }

  public String getPlacaVeh() {
    return txtPlacaVeh;
  }

  public int getSaldoCredVeh() {
    return txtSaldoCredVeh;
  }

  public String getPrendaFavVeh() {
    return txtPrendaFavVeh;
  }

  public int getSueldoFijo() {
    return txtSueldoFijo;
  }

  public int getSalVarCom() {
    return txtSalVarCom;
  }

  public int getArrendamiento() {
    return txtArrendamiento;
  }

  public int getRenFin() {
    return txtRenFin;
  }

  public int getHonorarios() {
    return txtHonorarios;
  }

  public int getOtrosIng() {
    return txtOtrosIng;
  }

  public String getCualesIng() {
    return txtCualesIng;
  }

  public int getTIngresos() {
    return txtTIngresos;
  }

  public int getArriendos() {
    return txtArriendos;
  }

  public int getGastosPer() {
    return txtGastosPer;
  }

  public int getPresDfFin() {
    return txtPresDfFin;
  }

  public int getDeducciones() {
    return txtDeducciones;
  }

  public int getTarjCred() {
    return txtTarjCred;
  }

  public int getOtrosGastos() {
    return txtOtrosGastos;
  }

  public String getCualesGastos() {
    return txtCualesGastos;
  }

  public int getTEgresos() {
    return txtTEgresos;
  }

  public int getPagHip() {
    return txtPagHip;
  }

  public int getVlrComViv() {
    return txtVlrComViv;
  }

  public String getGustaVivir() {
    return txtGustaVivir;
  }

  public int getRdCompViv() {
    return rdCompViv;
  }

  public int getRdCupoExtra() {
    return rdCupoExtra;
  }

  public String getRazondecredito() {
    return cmbRazondecredito;
  }

  public String getRazon() {
    return razon;
  }

  public String getPNConyugue() {
    return txtPNConyugue;
  }

  public String getSNConyugue() {
    return txtSNConyugue;
  }

  public String getPAConyugue() {
    return txtPAConyugue;
  }

  public String getSAConyugue() {
    return txtSAConyugue;
  }

  public int getTipoDocCony() {
    return cmbTipoDocCony;
  }

  public int getDocConyugue() {
    return txtDocConyugue;
  }

  public String getFechaExpCon() {
    return txtFechaExpCon;
  }

  public String getLugarExpCon() {
    return txtLugarExpCon;
  }

  public String getFechaNacCon() {
    return txtFechaNacCon;
  }

  public String getLugarNacCon() {
    return txtLugarNacCon;
  }

  public String getSexoCon() {
    return cmbSexoCon;
  }

  public String getLugTrabCon() {
    return txtLugTrabCon;
  }

  public int getRdOcupacionCon() {
    return rdOcupacionCon;
  }

  public int getDepEco() {
    return txtDepEco;
  }

  public String getFecIngr() {
    return txtFecIngr;
  }

  public String getCargoCon() {
    return txtCargoCon;
  }

  public String getTIngCon() {
    return txtTIngCon;
  }

  public String getTEgrCon() {
    return txtTEgrCon;
  }

  public String getEpsConyuge() {
    return txtEpsConyuge;
  }

  public String getNivelEstCon() {
    return cmbNivelEstCon;
  }

  public int getCelCon() {
    return txtCelCon;
  }

  public String getRefFamiliarNombre() {
    return ref_familiar_nombre;
  }

  public String getRefFamiliarPar() {
    return ref_familiar_par;
  }

  public int getRefFamiliarTel() {
    return ref_familiar_tel;
  }

  public int getCiudadRefFam() {
    return cmbCiudadRefFam;
  }

  public int getCelRFam() {
    return txtCelRFam;
  }

  public String getDirFamiliar() {
    return dirFamiliar;
  }

  public String getRefPersonalNombre() {
    return ref_personal_nombre;
  }

  public String getRefPersonalPar() {
    return ref_personal_par;
  }

  public int getRefPersonalTel() {
    return ref_personal_tel;
  }

  public int getCiudadRefPer() {
    return cmbCiudadRefPer;
  }

  public long getCelRPer() {
    return txtCelRPer;
  }

  public String getDirPersonal() {
    return dirPersonal;
  }

  public String getNEntFin() {
    return txtNEntFin;
  }

  public String getSucursal() {
    return txtSucursal;
  }

  public int getTipoProd() {
    return cmbTipoProd;
  }

  public String getSatisfaccionC() {
    return cmbSatisfaccionC;
  }

  public String getPorqueSatic() {
    return txtPorqueSatic;
  }

  public String getConocioFinsocial() {
    return cmbConocioFinsocial;
  }

  public String getOtroConocer() {
    return txtOtroConocer;
  }

  public int getRdransaccionExt() {
    return rdtransaccion_ext;
  }

  public int getRdCuentasExt() {
    return rdCuentasExt;
  }
}