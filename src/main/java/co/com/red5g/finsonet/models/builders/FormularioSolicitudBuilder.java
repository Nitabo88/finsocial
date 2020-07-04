package co.com.red5g.finsonet.models.builders;

import static co.com.red5g.utils.string.UtileriaFechas.fechaActual;

import co.com.red5g.finsonet.models.FormularioSolicitud;
import co.com.red5g.utils.Builder;

public class FormularioSolicitudBuilder implements Builder<FormularioSolicitud> {

  private String numeroPaso;
  private String fecha;
  private String perfil;
  private String pasoSolucion;
  private String asesor;
  private String ciudadCredito;
  private String calificacion;
  private String tipoSolicitud;
  private String agenciaVinculacion;
  private String vinculacion;
  private String monto;
  private String linea;
  private String cuota;
  private String plazo;
  private String tasaInteres;
  private String tasaMora;
  private String tasaMaxima;
  private String primerApellido;
  private String segundoApellido;
  private String primerNombre;
  private String segundoNombre;
  private String tipoDocumento;
  private String lugarExpedicion;
  private String fechaExpedicion;
  private String fechaNacimiento;
  private String sexo;
  private String lugarNacimiento;
  private String estadoCivil;
  private String pais;
  private String ciudadDepartamento;
  private String tipoVivienda;
  private String estrato;
  private String arrendatario;
  private String telefonoArrendador;
  private String direccionResidencia;
  private String barrio;
  private String telefonoResidencia;
  private String celular;
  private String correspondenciaA;
  private String email;
  private String anios;
  private String meses;
  private String eps;
  private String adulto;
  private String menor18;
  private String nivelEstudio;
  private String profesion;
  private String ocupacion;
  private String declaraRenta;
  private String decisionCargo;
  private String recursosPublicos;
  private String personajePublico;
  private String empresa;
  private String cargo;
  private String fechaVinculacion;
  private String direccionTrabajo;
  private String ciudadTrabajo;
  private String nitEmpresa;
  private String telefonoEmpresa;
  private String extension;
  private String tipoEmpresa;
  private String actividadEconomica;
  private String tipoContrato;
  private String activosCorrientes;
  private String activosFijos;
  private String otrosActivos;
  private String cualesActivos;
  private String totalActivos;
  private String pasivosFinancieros;
  private String pasivosCorrientes;
  private String otrosPasivos;
  private String cualesPasivos;
  private String totalPasivos;
  private String tipoInmueble;
  private String valorComercialInmueble;
  private String hipotecadoA;
  private String direccion;
  private String saldoCreditoInmueble;
  private String vehiculoClase;
  private String valorComercialVehiculo;
  private String marcaModelo;
  private String placa;
  private String saldoCreditoVehiculo;
  private String prendaAFavor;
  private String salarioFijo;
  private String salarioVariableComisiones;
  private String arrendamiento;
  private String rendimientosFinancieros;
  private String honorarios;
  private String otrosIngresos;
  private String cualesIngresos;
  private String totalIngresos;
  private String arriendos;
  private String gastosPersonales;
  private String prestamosDiferentes;
  private String deducciones;
  private String tarjetaCredito;
  private String otrosGastos;
  private String cualesGastos;
  private String totalEgresos;
  private String pagoHipoteca;
  private String valorComercialVivienda;
  private String dondeVivir;
  private String quiereComprar;
  private String cupoExtra;
  private String razonCredito;
  private String detalleRazon;
  private String primerNombreConyugue;
  private String segundoNombreConyugue;
  private String primerApellidoConyugue;
  private String segundoApellidoConyugue;
  private String tipoDocumentoConyugue;
  private String documentoConyugue;
  private String fechaExpedicionConyugue;
  private String lugarExpedicionConyugue;
  private String fechaNacimientoConyugue;
  private String lugarNacimientoConyugue;
  private String sexoConyugue;
  private String lugarTrabajoConyugue;
  private String ocupacionConyugue;
  private String dependenciaEconomica;
  private String fechaIngreso;
  private String cargoConyugue;
  private String totalIngresosConyugue;
  private String totalEgresosConyugue;
  private String epsConyugue;
  private String nivelEstudioConyugue;
  private String celularConyugue;
  private String nombreReferenciaFamiliar;
  private String parentescoReferenciaFamiliar;
  private String telefonoReferenciaFamiliar;
  private String ciudadReferenciaFamiliar;
  private String celularReferenciaFamiliar;
  private String direccionReferenciaFamiliar;
  private String nombreReferenciaPersonal;
  private String parentescoReferenciaPersonal;
  private String telefonoReferenciaPersonal;
  private String ciudadReferenciaPersonal;
  private String celularReferenciaPersonal;
  private String direccionPersonal;
  private String entidadFinanciera;
  private String sucursal;
  private String tipoProducto;
  private String calificacionAtencion;
  private String razonCalificacion;
  private String conocioFinsocial;
  private String razonConocio;
  private String monedaExtranjera;
  private String transaccionMonedaExtranjera;
  private String cuentaExterior;

  private FormularioSolicitudBuilder() {
    this.numeroPaso = "";
    this.fecha = "";
    this.perfil = "";
    this.pasoSolucion = "";
    this.asesor = "";
    this.ciudadCredito = "";
    this.calificacion = "";
    this.tipoSolicitud = "";
    this.agenciaVinculacion = "";
    this.vinculacion = "";
    this.monto = "";
    this.linea = "";
    this.cuota = "";
    this.plazo = "";
    this.tasaInteres = "";
    this.tasaMora = "";
    this.tasaMaxima = "";
    this.primerApellido = "";
    this.segundoApellido = "";
    this.primerNombre = "";
    this.segundoNombre = "";
    this.tipoDocumento = "";
    this.lugarExpedicion = "";
    this.fechaExpedicion = "";
    this.fechaNacimiento = "";
    this.sexo = "";
    this.lugarNacimiento = "";
    this.estadoCivil = "";
    this.pais = "";
    this.ciudadDepartamento = "";
    this.tipoVivienda = "";
    this.estrato = "";
    this.arrendatario = "";
    this.telefonoArrendador = "";
    this.direccionResidencia = "";
    this.barrio = "";
    this.telefonoResidencia = "";
    this.celular = "";
    this.correspondenciaA = "";
    this.email = "";
    this.anios = "";
    this.meses = "";
    this.eps = "";
    this.adulto = "";
    this.menor18 = "";
    this.nivelEstudio = "";
    this.profesion = "";
    this.ocupacion = "";
    this.declaraRenta = "";
    this.decisionCargo = "";
    this.recursosPublicos = "";
    this.personajePublico = "";
    this.empresa = "";
    this.cargo = "";
    this.fechaVinculacion = "";
    this.direccionTrabajo = "";
    this.ciudadTrabajo = "";
    this.nitEmpresa = "";
    this.telefonoEmpresa = "";
    this.extension = "";
    this.tipoEmpresa = "";
    this.actividadEconomica = "";
    this.tipoContrato = "";
    this.activosCorrientes = "0";
    this.activosFijos = "0";
    this.otrosActivos = "0";
    this.cualesActivos = "";
    this.totalActivos = "0";
    this.pasivosFinancieros = "0";
    this.pasivosCorrientes = "0";
    this.otrosPasivos = "0";
    this.cualesPasivos = "";
    this.totalPasivos = "0";
    this.tipoInmueble = "";
    this.valorComercialInmueble = "0";
    this.hipotecadoA = "";
    this.direccion = "";
    this.saldoCreditoInmueble = "0";
    this.vehiculoClase = "";
    this.valorComercialVehiculo = "0";
    this.marcaModelo = "";
    this.placa = "";
    this.saldoCreditoVehiculo = "0";
    this.prendaAFavor = "";
    this.salarioFijo = "0";
    this.salarioVariableComisiones = "0";
    this.arrendamiento = "0";
    this.rendimientosFinancieros = "0";
    this.honorarios = "0";
    this.otrosIngresos = "0";
    this.cualesIngresos = "";
    this.totalIngresos = "0";
    this.arriendos = "0";
    this.gastosPersonales = "0";
    this.prestamosDiferentes = "0";
    this.deducciones = "0";
    this.tarjetaCredito = "0";
    this.otrosGastos = "0";
    this.cualesGastos = "";
    this.totalEgresos = "0";
    this.pagoHipoteca = "0";
    this.valorComercialVivienda = "0";
    this.dondeVivir = "";
    this.quiereComprar = "0";
    this.cupoExtra = "0";
    this.razonCredito = "";
    this.detalleRazon = "";
    this.primerNombreConyugue = "";
    this.segundoNombreConyugue = "";
    this.primerApellidoConyugue = "";
    this.segundoApellidoConyugue = "";
    this.tipoDocumentoConyugue = "0";
    this.documentoConyugue = "0";
    this.fechaExpedicionConyugue = "";
    this.lugarExpedicionConyugue = "";
    this.fechaNacimientoConyugue = "";
    this.lugarNacimientoConyugue = "";
    this.sexoConyugue = "";
    this.lugarTrabajoConyugue = "";
    this.ocupacionConyugue = "0";
    this.dependenciaEconomica = "0";
    this.fechaIngreso = "";
    this.cargoConyugue = "";
    this.totalIngresosConyugue = "";
    this.totalEgresosConyugue = "";
    this.epsConyugue = "";
    this.nivelEstudioConyugue = "";
    this.celularConyugue = "0";
    this.nombreReferenciaFamiliar = "";
    this.parentescoReferenciaFamiliar = "";
    this.telefonoReferenciaFamiliar = "0";
    this.ciudadReferenciaFamiliar = "0";
    this.celularReferenciaFamiliar = "0";
    this.direccionReferenciaFamiliar = "";
    this.nombreReferenciaPersonal = "";
    this.parentescoReferenciaPersonal = "";
    this.telefonoReferenciaPersonal = "0";
    this.celularReferenciaPersonal = "0";
    this.direccionPersonal = "0";
    this.entidadFinanciera = "";
    this.sucursal = "";
    this.tipoProducto = "";
    this.calificacionAtencion = "0";
    this.razonCalificacion = "";
    this.conocioFinsocial = "";
    this.razonConocio = "";
    this.monedaExtranjera = "";
    this.transaccionMonedaExtranjera = "0";
    this.cuentaExterior = "0";
  }

  public static FormularioSolicitudBuilder con() {
    return new FormularioSolicitudBuilder();
  }

  @Override
  public FormularioSolicitud build() {
    return new FormularioSolicitud(this);
  }

  private FormularioSolicitudBuilder numeroPaso(String numPaso) {
    this.numeroPaso = numPaso;
    return this;
  }

  private FormularioSolicitudBuilder fecha() {
    this.fecha = fechaActual();
    return this;
  }

  private FormularioSolicitudBuilder perfil(String perfil) {
    this.perfil = perfil;
    return this;
  }

  private FormularioSolicitudBuilder pasoSolicitud(String pasoSol) {
    this.pasoSolucion = pasoSol;
    return this;
  }

  private FormularioSolicitudBuilder asesor() {
    this.asesor = "ORLANDO NICOLAS CHINCHILLA VEGA";
    return this;
  }

  private FormularioSolicitudBuilder ciudadSolicitud(String txtCiuC) {
    this.ciudadCredito = txtCiuC;
    return this;
  }

  private FormularioSolicitudBuilder calificacion(String txtCalf) {
    this.calificacion = txtCalf;
    return this;
  }

  private FormularioSolicitudBuilder tipoSolicitud(String txtTSol) {
    this.tipoSolicitud = txtTSol;
    return this;
  }

  private FormularioSolicitudBuilder agenciaVinculacion(String agenciaVinculacion) {
    this.agenciaVinculacion = agenciaVinculacion;
    return this;
  }

  private FormularioSolicitudBuilder vinculacion(String txtVin) {
    this.vinculacion = txtVin;
    return this;
  }

  private FormularioSolicitudBuilder linea(String txtLinea) {
    this.linea = txtLinea;
    return this;
  }

  private FormularioSolicitudBuilder primerApellido(String txtPApellido) {
    this.primerApellido = txtPApellido;
    return this;
  }

  private FormularioSolicitudBuilder segundoApellido(String txtSApellido) {
    this.segundoApellido = txtSApellido;
    return this;
  }

  private FormularioSolicitudBuilder primerNombre(String txtPNombre) {
    this.primerNombre = txtPNombre;
    return this;
  }

  private FormularioSolicitudBuilder tipoDocumento(String cmbTipoDoc) {
    this.tipoDocumento = cmbTipoDoc;
    return this;
  }

  private FormularioSolicitudBuilder lugarExpedicion(String txtLugarExp) {
    this.lugarExpedicion = txtLugarExp;
    return this;
  }

  private FormularioSolicitudBuilder fechaExpedicion(String txtFechaExp) {
    this.fechaExpedicion = txtFechaExp;
    return this;
  }

  private FormularioSolicitudBuilder fechaNacimiento(String txtFechaNac) {
    this.fechaNacimiento = txtFechaNac;
    return this;
  }

  private FormularioSolicitudBuilder sexo(String cmbSexo) {
    this.sexo = cmbSexo;
    return this;
  }

  private FormularioSolicitudBuilder lugarNacimiento(String txtLugarNac) {
    this.lugarNacimiento = txtLugarNac;
    return this;
  }

  private FormularioSolicitudBuilder estadoCivil(String cmbEstCivil) {
    this.estadoCivil = cmbEstCivil;
    return this;
  }

  private FormularioSolicitudBuilder pais(String txtPais) {
    this.pais = txtPais;
    return this;
  }

  private FormularioSolicitudBuilder ciudadResidencia(String cmbCiudad) {
    this.ciudadDepartamento = cmbCiudad;
    return this;
  }

  private FormularioSolicitudBuilder tipoVivienda(String cmbTipoViv) {
    this.tipoVivienda = cmbTipoViv;
    return this;
  }

  private FormularioSolicitudBuilder estrato(String txtEstrato) {
    this.estrato = txtEstrato;
    return this;
  }

  private FormularioSolicitudBuilder nombreArrendatario(String txtArrend) {
    this.arrendatario = txtArrend;
    return this;
  }

  private FormularioSolicitudBuilder telefonoArrendador(String txtTelArr) {
    this.telefonoArrendador = txtTelArr;
    return this;
  }

  private FormularioSolicitudBuilder direccionResidencia(String dirCa) {
    this.direccionResidencia = dirCa;
    return this;
  }

  private FormularioSolicitudBuilder barrio(String txtBarrio) {
    this.barrio = txtBarrio;
    return this;
  }

  private FormularioSolicitudBuilder telefonoResidencia(String txtTel) {
    this.telefonoResidencia = txtTel;
    return this;
  }

  private FormularioSolicitudBuilder celular(String txtCel) {
    this.celular = txtCel;
    return this;
  }

  private FormularioSolicitudBuilder correspondenciaA(String cmbCorrespondencia) {
    this.correspondenciaA = cmbCorrespondencia;
    return this;
  }

  private FormularioSolicitudBuilder email(String txtEmail) {
    this.email = txtEmail;
    return this;
  }

  private FormularioSolicitudBuilder tiempoResidenciaAnios(String txtAnios) {
    this.anios = txtAnios;
    return this;
  }

  private FormularioSolicitudBuilder tiempoResidenciaMeses(String txtMeses) {
    this.meses = txtMeses;
    return this;
  }

  private FormularioSolicitudBuilder nombreEps(String txtEps) {
    this.eps = txtEps;
    return this;
  }

  private FormularioSolicitudBuilder adultosACargo(String txtAdulto) {
    this.adulto = txtAdulto;
    return this;
  }

  private FormularioSolicitudBuilder menoresACargo(String txtMenor18) {
    this.menor18 = txtMenor18;
    return this;
  }

  private FormularioSolicitudBuilder nivelEstudio(String cmbNivelEst) {
    this.nivelEstudio = cmbNivelEst;
    return this;
  }

  private FormularioSolicitudBuilder profesion(String cmbProfesion) {
    this.profesion = cmbProfesion;
    return this;
  }

  private FormularioSolicitudBuilder ocupacion(String rdOcupacion) {
    this.ocupacion = rdOcupacion;
    return this;
  }

  private FormularioSolicitudBuilder renta(String txtDeRenta) {
    this.declaraRenta = txtDeRenta;
    return this;
  }

  private FormularioSolicitudBuilder decisionCargo(String txtDesicionCargo) {
    this.decisionCargo = txtDesicionCargo;
    return this;
  }

  private FormularioSolicitudBuilder recursosPublicos(String txtrecPublicos) {
    this.recursosPublicos = txtrecPublicos;
    return this;
  }

  private FormularioSolicitudBuilder personajePublico(String txtPerPubl) {
    this.personajePublico = txtPerPubl;
    return this;
  }

  private FormularioSolicitudBuilder nombreEmpresa(String txtEmpresa) {
    this.empresa = txtEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder cargo(String txtCargo) {
    this.cargo = txtCargo;
    return this;
  }

  private FormularioSolicitudBuilder fechaVinculacion(String txtFechaVinculacion) {
    this.fechaVinculacion = txtFechaVinculacion;
    return this;
  }

  private FormularioSolicitudBuilder direccionTrabajo(String dirTrabajo) {
    this.direccionTrabajo = dirTrabajo;
    return this;
  }

  private FormularioSolicitudBuilder ciudadTrabajo(String cmbCiudad2) {
    this.ciudadTrabajo = cmbCiudad2;
    return this;
  }

  private FormularioSolicitudBuilder nitEmpresa(String txtNitEmpresa) {
    this.nitEmpresa = txtNitEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder telefonoTrabajo(String txtTelEmpresa) {
    this.telefonoEmpresa = txtTelEmpresa;
    return this;
  }

  private FormularioSolicitudBuilder extensionTrabajo(String txtExt) {
    this.extension = txtExt;
    return this;
  }

  private FormularioSolicitudBuilder tipoEmpresa(String cmbTipoEmp) {
    this.tipoEmpresa = cmbTipoEmp;
    return this;
  }

  private FormularioSolicitudBuilder actividadEconomica(String cmbActEcon) {
    this.actividadEconomica = cmbActEcon;
    return this;
  }

  private FormularioSolicitudBuilder tipoContrato(String cmbTipoContrato) {
    this.tipoContrato = cmbTipoContrato;
    return this;
  }

  private FormularioSolicitudBuilder activosCorrientes(String activosCorrientes) {
    this.activosCorrientes = activosCorrientes;
    return this;
  }

  private FormularioSolicitudBuilder activosFijos(String activosFijos) {
    this.activosFijos = activosFijos;
    return this;
  }

  private FormularioSolicitudBuilder totalActivos(String totalActivos) {
    this.totalActivos = totalActivos;
    return this;
  }

  private FormularioSolicitudBuilder pasivosFinancieros(String pasivosFinancieros) {
    this.pasivosFinancieros = pasivosFinancieros;
    return this;
  }

  private FormularioSolicitudBuilder pasivosCorrientes(String pasivosCorrientes) {
    this.pasivosCorrientes = pasivosCorrientes;
    return this;
  }

  private FormularioSolicitudBuilder totalPasivos(String totalPasivos) {
    this.totalPasivos = totalPasivos;
    return this;
  }

  private FormularioSolicitudBuilder tipoVehiculo(String txtVehCls) {
    this.vehiculoClase = txtVehCls;
    return this;
  }

  private FormularioSolicitudBuilder valorComercialVehiculo(String txtValorComVeh) {
    this.valorComercialVehiculo = txtValorComVeh;
    return this;
  }

  private FormularioSolicitudBuilder marcaVehiculo(String txtMarcaVeh) {
    this.marcaModelo = txtMarcaVeh;
    return this;
  }

  private FormularioSolicitudBuilder placaVehiculo(String txtPlacaVeh) {
    this.placa = txtPlacaVeh;
    return this;
  }

  private FormularioSolicitudBuilder saldoCreditoVehiculo(String txtSaldoCredVeh) {
    this.saldoCreditoVehiculo = txtSaldoCredVeh;
    return this;
  }

  private FormularioSolicitudBuilder sueldoFijo(String txtSueldoFijo) {
    this.salarioFijo = txtSueldoFijo;
    return this;
  }

  private FormularioSolicitudBuilder totalIngresos(String txtTIngresos) {
    this.totalIngresos = txtTIngresos;
    return this;
  }

  private FormularioSolicitudBuilder comprarVivienda(String rdCompViv) {
    this.quiereComprar = rdCompViv;
    return this;
  }

  private FormularioSolicitudBuilder cupoExtra(String rdCupoExtra) {
    this.cupoExtra = rdCupoExtra;
    return this;
  }

  private FormularioSolicitudBuilder razonCredito(String cmbRazondecredito) {
    this.razonCredito = cmbRazondecredito;
    return this;
  }

  private FormularioSolicitudBuilder razonOtros(String razon) {
    this.detalleRazon = razon;
    return this;
  }

  private FormularioSolicitudBuilder tipoDocumentoConyugue(String cmbTipoDocCony) {
    this.tipoDocumentoConyugue = cmbTipoDocCony;
    return this;
  }

  private FormularioSolicitudBuilder ocupacionConyugue(String rdOcupacionCon) {
    this.ocupacionConyugue = rdOcupacionCon;
    return this;
  }

  private FormularioSolicitudBuilder dependenciaEconomicaConyugue(String txtDepEco) {
    this.dependenciaEconomica = txtDepEco;
    return this;
  }

  private FormularioSolicitudBuilder nombreReferenciaFamiliar(String refFamiliarNombre) {
    this.nombreReferenciaFamiliar = refFamiliarNombre;
    return this;
  }

  private FormularioSolicitudBuilder parentesco(String refFamiliarPar) {
    this.parentescoReferenciaFamiliar = refFamiliarPar;
    return this;
  }

  private FormularioSolicitudBuilder telefonoReferencia(String refFamiliarTel) {
    this.telefonoReferenciaFamiliar = refFamiliarTel;
    return this;
  }

  private FormularioSolicitudBuilder ciudadReferenciaFamiliar(String cmbCiudadRefFam) {
    this.ciudadReferenciaFamiliar = cmbCiudadRefFam;
    return this;
  }

  private FormularioSolicitudBuilder celularReferenciaFamiliar(String txtCelRFam) {
    this.celularReferenciaFamiliar = txtCelRFam;
    return this;
  }

  private FormularioSolicitudBuilder direccionReferenciaFamiliar(String dirFamiliar) {
    this.direccionReferenciaFamiliar = dirFamiliar;
    return this;
  }

  private FormularioSolicitudBuilder nombreReferenciaPersonal(String refPersonalNombre) {
    this.nombreReferenciaPersonal = refPersonalNombre;
    return this;
  }

  private FormularioSolicitudBuilder relacionReferenciaPersonal(String refPersonalPar) {
    this.parentescoReferenciaPersonal = refPersonalPar;
    return this;
  }

  private FormularioSolicitudBuilder telefonoReferenciaPersonal(String refPersonalTel) {
    this.telefonoReferenciaPersonal = refPersonalTel;
    return this;
  }

  private FormularioSolicitudBuilder ciudadReferenciaPersonal(String cmbCiudadRefPer) {
    this.celularReferenciaPersonal = cmbCiudadRefPer;
    return this;
  }

  private FormularioSolicitudBuilder celularReferenciaPersonal(String txtCelRPer) {
    this.direccionPersonal = txtCelRPer;
    return this;
  }

  private FormularioSolicitudBuilder direccionReferenciaPersonal(String dirPersonal) {
    this.entidadFinanciera = dirPersonal;
    return this;
  }

  private FormularioSolicitudBuilder nombreEntidadBancaria(String txtNEntFin) {
    this.sucursal = txtNEntFin;
    return this;
  }

  private FormularioSolicitudBuilder sucursalBancaria(String txtSucursal) {
    this.tipoProducto = txtSucursal;
    return this;
  }

  private FormularioSolicitudBuilder tipoProductoBancario(String cmbTipoProd) {
    this.calificacionAtencion = cmbTipoProd;
    return this;
  }

  private FormularioSolicitudBuilder operacionMonedaExtranjera(String rdtransaccionExt) {
    this.transaccionMonedaExtranjera = rdtransaccionExt;
    return this;
  }

  private FormularioSolicitudBuilder cuentaExterior(String rdCuentasExt) {
    this.cuentaExterior = rdCuentasExt;
    return this;
  }

  public FormularioSolicitud informacionLibranza() {
    this.numeroPaso("step-8");
    this.fecha();
    this.perfil("3");
    this.pasoSolicitud("8");
    this.asesor();
    this.ciudadSolicitud("5001");
    this.calificacion("660");
    this.tipoSolicitud("S");
    this.agenciaVinculacion("860");
    this.vinculacion("S");
    this.linea("LIBRANZA");
    this.primerApellido("Mora");
    this.segundoApellido("Camacho");
    this.primerNombre("Santiago");
    this.tipoDocumento("1");
    this.lugarExpedicion("5030");
    this.fechaExpedicion("2004-01-06");
    this.fechaNacimiento("1985-01-06");
    this.sexo("M");
    this.lugarNacimiento("5021");
    this.estadoCivil("S");
    this.pais("COLOMBIA");
    this.ciudadResidencia("5001");
    this.tipoVivienda("ARRENDADA");
    this.estrato("4");
    this.nombreArrendatario("Andres UzumaKi");
    this.telefonoArrendador("2211421");
    this.direccionResidencia("CL 80 A    53     25");
    this.barrio("Colores");
    this.telefonoResidencia("2808080");
    this.celular("300200202");
    this.correspondenciaA("CASA");
    this.email("prueba1@gmail.com");
    this.tiempoResidenciaAnios("10");
    this.tiempoResidenciaMeses("2");
    this.nombreEps("Salud Total");
    this.adultosACargo("0");
    this.menoresACargo("0");
    this.nivelEstudio("5");
    this.profesion("122");
    this.ocupacion("1");
    this.renta("N");
    this.decisionCargo("N");
    this.recursosPublicos("1");
    this.personajePublico("1");
    this.nombreEmpresa("6");
    this.cargo("Ingeniero");
    this.fechaVinculacion("2009-12-16");
    this.direccionTrabajo("CL 80     55     60");
    this.ciudadTrabajo("8001");
    this.nitEmpresa("802014730-9");
    this.telefonoTrabajo("2012020");
    this.extensionTrabajo("123");
    this.tipoEmpresa("1");
    this.actividadEconomica("1");
    this.tipoContrato("1");
    this.activosCorrientes("38000000");
    this.activosFijos("51000000");
    this.totalActivos("89000000");
    this.pasivosFinancieros("33650000");
    this.pasivosCorrientes("3500000");
    this.totalPasivos("37150000");
    this.tipoVehiculo("Susuki swift");
    this.valorComercialVehiculo("51000000");
    this.marcaVehiculo("2018");
    this.placaVehiculo("EFY890");
    this.saldoCreditoVehiculo("33650000");
    this.sueldoFijo("4650000");
    this.totalIngresos("4650000");
    this.comprarVivienda("1");
    this.cupoExtra("1");
    this.razonCredito("VIVIENDA");
    this.razonOtros("-");
    this.tipoDocumentoConyugue("1");
    this.ocupacionConyugue("1");
    this.dependenciaEconomicaConyugue("1");
    this.nombreReferenciaFamiliar("Pablo Esteban Uzumaki");
    this.parentesco("Tio");
    this.telefonoReferencia("2202526");
    this.ciudadReferenciaFamiliar("8758");
    this.celularReferenciaFamiliar("3002042521");
    this.direccionReferenciaFamiliar("CR 79     50  53");
    this.nombreReferenciaPersonal("Tatiana Borja");
    this.relacionReferenciaPersonal("Prima");
    this.telefonoReferenciaPersonal("2898989");
    this.ciudadReferenciaPersonal("5001");
    this.celularReferenciaPersonal("3002005654");
    this.direccionReferenciaPersonal("CL 95     85  80");
    this.nombreEntidadBancaria("Bancolombia");
    this.sucursalBancaria("RutaN");
    this.tipoProductoBancario("1");
    this.operacionMonedaExtranjera("1");
    this.cuentaExterior("1");
    return this.build();
  }

  public FormularioSolicitud informacionCredihuy() {
    this.numeroPaso("step-8");
    this.fecha();
    this.perfil("3");
    this.pasoSolicitud("");
    this.asesor();
    this.ciudadSolicitud("5021");
    this.calificacion("880");
    this.tipoSolicitud("S");
    this.agenciaVinculacion("1460");
    this.vinculacion("S");
    this.linea("LIBRANZA");
    this.primerApellido("Estrada");
    this.segundoApellido("Escobar");
    this.primerNombre("Maria");
    this.tipoDocumento("1");
    this.lugarExpedicion("5030");
    this.fechaExpedicion("2000-05-06");
    this.fechaNacimiento("1982-01-06");
    this.sexo("F");
    this.lugarNacimiento("5021");
    this.estadoCivil("S");
    this.pais("COLOMBIA");
    this.ciudadResidencia("5001");
    this.tipoVivienda("FAMILIAR");
    this.estrato("5");
    this.direccionResidencia("CL 81 A    53     25");
    this.barrio("Soledad");
    this.telefonoResidencia("2828080");
    this.celular("3002022105");
    this.correspondenciaA("CASA");
    this.email("prueba@gmail.com");
    this.tiempoResidenciaAnios("10");
    this.tiempoResidenciaMeses("2");
    this.nombreEps("Sura");
    this.adultosACargo("0");
    this.menoresACargo("0");
    this.nivelEstudio("2");
    this.profesion("3");
    this.ocupacion("1");
    this.renta("N");
    this.decisionCargo("N");
    this.recursosPublicos("1");
    this.personajePublico("1");
    this.nombreEmpresa("4");
    this.cargo("Profesor");
    this.fechaVinculacion("2009-12-16");
    this.direccionTrabajo("CL 80     55     60");
    this.ciudadTrabajo("8001");
    this.nitEmpresa("892280021-1");
    this.telefonoTrabajo("2012020");
    this.extensionTrabajo("123");
    this.tipoEmpresa("1");
    this.actividadEconomica("1");
    this.tipoContrato("1");
    this.sueldoFijo("1650000");
    this.totalIngresos("1650000");
    this.comprarVivienda("1");
    this.cupoExtra("1");
    this.razonCredito("EDUCACION");
    this.razonOtros("-");
    this.tipoDocumentoConyugue("1");
    this.ocupacionConyugue("1");
    this.dependenciaEconomicaConyugue("1");
    this.nombreReferenciaFamiliar("Pablo Alboran");
    this.parentesco("Tio");
    this.telefonoReferencia("2202525");
    this.ciudadReferenciaFamiliar("8758");
    this.celularReferenciaFamiliar("3002042555");
    this.direccionReferenciaFamiliar("CR 79     50  53");
    this.nombreReferenciaPersonal("Evaluna Montaner");
    this.relacionReferenciaPersonal("Amiga");
    this.telefonoReferenciaPersonal("2897989");
    this.ciudadReferenciaPersonal("5002");
    this.celularReferenciaPersonal("3002005585");
    this.direccionReferenciaPersonal("CL 95     85  80");
    this.nombreEntidadBancaria("Bancolombia");
    this.sucursalBancaria("RutaN");
    this.tipoProductoBancario("1");
    this.operacionMonedaExtranjera("1");
    this.cuentaExterior("1");
    return this.build();
  }

  public String getNumeroPaso() {
    return numeroPaso;
  }

  public String getFecha() {
    return fecha;
  }

  public String getPerfil() {
    return perfil;
  }

  public String getPasoSolucion() {
    return pasoSolucion;
  }

  public String getAsesor() {
    return asesor;
  }

  public String getCiudadCredito() {
    return ciudadCredito;
  }

  public String getCalificacion() {
    return calificacion;
  }

  public String getTipoSolicitud() {
    return tipoSolicitud;
  }

  public String getAgenciaVinculacion() {
    return agenciaVinculacion;
  }

  public String getVinculacion() {
    return vinculacion;
  }

  public String getMonto() {
    return monto;
  }

  public String getLinea() {
    return linea;
  }

  public String getCuota() {
    return cuota;
  }

  public String getPlazo() {
    return plazo;
  }

  public String getTasaInteres() {
    return tasaInteres;
  }

  public String getTasaMora() {
    return tasaMora;
  }

  public String getTasaMaxima() {
    return tasaMaxima;
  }

  public String getPrimerApellido() {
    return primerApellido;
  }

  public String getSegundoApellido() {
    return segundoApellido;
  }

  public String getPrimerNombre() {
    return primerNombre;
  }

  public String getSegundoNombre() {
    return segundoNombre;
  }

  public String getTipoDocumento() {
    return tipoDocumento;
  }

  public String getLugarExpedicion() {
    return lugarExpedicion;
  }

  public String getFechaExpedicion() {
    return fechaExpedicion;
  }

  public String getFechaNacimiento() {
    return fechaNacimiento;
  }

  public String getSexo() {
    return sexo;
  }

  public String getLugarNacimiento() {
    return lugarNacimiento;
  }

  public String getEstadoCivil() {
    return estadoCivil;
  }

  public String getPais() {
    return pais;
  }

  public String getCiudadDepartamento() {
    return ciudadDepartamento;
  }

  public String getTipoVivienda() {
    return tipoVivienda;
  }

  public String getEstrato() {
    return estrato;
  }

  public String getArrendatario() {
    return arrendatario;
  }

  public String getTelefonoArrendador() {
    return telefonoArrendador;
  }

  public String getDireccionResidencia() {
    return direccionResidencia;
  }

  public String getBarrio() {
    return barrio;
  }

  public String getTelefonoResidencia() {
    return telefonoResidencia;
  }

  public String getCelular() {
    return celular;
  }

  public String getCorrespondenciaA() {
    return correspondenciaA;
  }

  public String getEmail() {
    return email;
  }

  public String getAnios() {
    return anios;
  }

  public String getMeses() {
    return meses;
  }

  public String getEps() {
    return eps;
  }

  public String getAdulto() {
    return adulto;
  }

  public String getMenor18() {
    return menor18;
  }

  public String getNivelEstudio() {
    return nivelEstudio;
  }

  public String getProfesion() {
    return profesion;
  }

  public String getOcupacion() {
    return ocupacion;
  }

  public String getDeclaraRenta() {
    return declaraRenta;
  }

  public String getDecisionCargo() {
    return decisionCargo;
  }

  public String getRecursosPublicos() {
    return recursosPublicos;
  }

  public String getPersonajePublico() {
    return personajePublico;
  }

  public String getEmpresa() {
    return empresa;
  }

  public String getCargo() {
    return cargo;
  }

  public String getFechaVinculacion() {
    return fechaVinculacion;
  }

  public String getDireccionTrabajo() {
    return direccionTrabajo;
  }

  public String getCiudadTrabajo() {
    return ciudadTrabajo;
  }

  public String getNitEmpresa() {
    return nitEmpresa;
  }

  public String getTelefonoEmpresa() {
    return telefonoEmpresa;
  }

  public String getExtension() {
    return extension;
  }

  public String getTipoEmpresa() {
    return tipoEmpresa;
  }

  public String getActividadEconomica() {
    return actividadEconomica;
  }

  public String getTipoContrato() {
    return tipoContrato;
  }

  public String getActivosCorrientes() {
    return activosCorrientes;
  }

  public String getActivosFijos() {
    return activosFijos;
  }

  public String getOtrosActivos() {
    return otrosActivos;
  }

  public String getCualesActivos() {
    return cualesActivos;
  }

  public String getTotalActivos() {
    return totalActivos;
  }

  public String getPasivosFinancieros() {
    return pasivosFinancieros;
  }

  public String getPasivosCorrientes() {
    return pasivosCorrientes;
  }

  public String getOtrosPasivos() {
    return otrosPasivos;
  }

  public String getCualesPasivos() {
    return cualesPasivos;
  }

  public String getTotalPasivos() {
    return totalPasivos;
  }

  public String getTipoInmueble() {
    return tipoInmueble;
  }

  public String getValorComercialInmueble() {
    return valorComercialInmueble;
  }

  public String getHipotecadoA() {
    return hipotecadoA;
  }

  public String getDireccion() {
    return direccion;
  }

  public String getSaldoCreditoInmueble() {
    return saldoCreditoInmueble;
  }

  public String getVehiculoClase() {
    return vehiculoClase;
  }

  public String getValorComercialVehiculo() {
    return valorComercialVehiculo;
  }

  public String getMarcaModelo() {
    return marcaModelo;
  }

  public String getPlaca() {
    return placa;
  }

  public String getSaldoCreditoVehiculo() {
    return saldoCreditoVehiculo;
  }

  public String getPrendaAFavor() {
    return prendaAFavor;
  }

  public String getSalarioFijo() {
    return salarioFijo;
  }

  public String getSalarioVariableComisiones() {
    return salarioVariableComisiones;
  }

  public String getArrendamiento() {
    return arrendamiento;
  }

  public String getRendimientosFinancieros() {
    return rendimientosFinancieros;
  }

  public String getHonorarios() {
    return honorarios;
  }

  public String getOtrosIngresos() {
    return otrosIngresos;
  }

  public String getCualesIngresos() {
    return cualesIngresos;
  }

  public String getTotalIngresos() {
    return totalIngresos;
  }

  public String getArriendos() {
    return arriendos;
  }

  public String getGastosPersonales() {
    return gastosPersonales;
  }

  public String getPrestamosDiferentes() {
    return prestamosDiferentes;
  }

  public String getDeducciones() {
    return deducciones;
  }

  public String getTarjetaCredito() {
    return tarjetaCredito;
  }

  public String getOtrosGastos() {
    return otrosGastos;
  }

  public String getCualesGastos() {
    return cualesGastos;
  }

  public String getTotalEgresos() {
    return totalEgresos;
  }

  public String getPagoHipoteca() {
    return pagoHipoteca;
  }

  public String getValorComercialVivienda() {
    return valorComercialVivienda;
  }

  public String getDondeVivir() {
    return dondeVivir;
  }

  public String getQuiereComprar() {
    return quiereComprar;
  }

  public String getCupoExtra() {
    return cupoExtra;
  }

  public String getRazonCredito() {
    return razonCredito;
  }

  public String getDetalleRazon() {
    return detalleRazon;
  }

  public String getPrimerNombreConyugue() {
    return primerNombreConyugue;
  }

  public String getSegundoNombreConyugue() {
    return segundoNombreConyugue;
  }

  public String getPrimerApellidoConyugue() {
    return primerApellidoConyugue;
  }

  public String getSegundoApellidoConyugue() {
    return segundoApellidoConyugue;
  }

  public String getTipoDocumentoConyugue() {
    return tipoDocumentoConyugue;
  }

  public String getDocumentoConyugue() {
    return documentoConyugue;
  }

  public String getFechaExpedicionConyugue() {
    return fechaExpedicionConyugue;
  }

  public String getLugarExpedicionConyugue() {
    return lugarExpedicionConyugue;
  }

  public String getFechaNacimientoConyugue() {
    return fechaNacimientoConyugue;
  }

  public String getLugarNacimientoConyugue() {
    return lugarNacimientoConyugue;
  }

  public String getSexoConyugue() {
    return sexoConyugue;
  }

  public String getLugarTrabajoConyugue() {
    return lugarTrabajoConyugue;
  }

  public String getOcupacionConyugue() {
    return ocupacionConyugue;
  }

  public String getDependenciaEconomica() {
    return dependenciaEconomica;
  }

  public String getFechaIngreso() {
    return fechaIngreso;
  }

  public String getCargoConyugue() {
    return cargoConyugue;
  }

  public String getTotalIngresosConyugue() {
    return totalIngresosConyugue;
  }

  public String getTotalEgresosConyugue() {
    return totalEgresosConyugue;
  }

  public String getEpsConyugue() {
    return epsConyugue;
  }

  public String getNivelEstudioConyugue() {
    return nivelEstudioConyugue;
  }

  public String getCelularConyugue() {
    return celularConyugue;
  }

  public String getNombreReferenciaFamiliar() {
    return nombreReferenciaFamiliar;
  }

  public String getParentescoReferenciaFamiliar() {
    return parentescoReferenciaFamiliar;
  }

  public String getTelefonoReferenciaFamiliar() {
    return telefonoReferenciaFamiliar;
  }

  public String getCiudadReferenciaFamiliar() {
    return ciudadReferenciaFamiliar;
  }

  public String getCelularReferenciaFamiliar() {
    return celularReferenciaFamiliar;
  }

  public String getDireccionReferenciaFamiliar() {
    return direccionReferenciaFamiliar;
  }

  public String getNombreReferenciaPersonal() {
    return nombreReferenciaPersonal;
  }

  public String getParentescoReferenciaPersonal() {
    return parentescoReferenciaPersonal;
  }

  public String getTelefonoReferenciaPersonal() {
    return telefonoReferenciaPersonal;
  }

  public String getCelularReferenciaPersonal() {
    return celularReferenciaPersonal;
  }

  public String getDireccionPersonal() {
    return direccionPersonal;
  }

  public String getEntidadFinanciera() {
    return entidadFinanciera;
  }

  public String getSucursal() {
    return sucursal;
  }

  public String getTipoProducto() {
    return tipoProducto;
  }

  public String getCalificacionAtencion() {
    return calificacionAtencion;
  }

  public String getRazonCalificacion() {
    return razonCalificacion;
  }

  public String getConocioFinsocial() {
    return conocioFinsocial;
  }

  public String getRazonConocio() {
    return razonConocio;
  }

  public String getMonedaExtranjera() {
    return monedaExtranjera;
  }

  public String getTransaccionMonedaExtranjera() {
    return transaccionMonedaExtranjera;
  }

  public String getCuentaExterior() {
    return cuentaExterior;
  }

  public String getCiudadReferenciaPersonal() {
    return ciudadReferenciaPersonal;
  }
}