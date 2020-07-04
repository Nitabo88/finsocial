package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder;

public class FormularioSolicitud {

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
  private String direccionReferenciaPersonal;
  private String entidadFinanciera;
  private String sucursal;
  private String tipoProducto;
  private String calificacionAtencion;
  private String razonCalificacion;
  private String conocioFinsocial;
  private String razonConocio;
  private String transaccionMonedaExtranjera;
  private String cuentaExterior;

  public FormularioSolicitud(FormularioSolicitudBuilder formularioSolicitudBuilder) {
    this.numeroPaso = formularioSolicitudBuilder.getNumeroPaso();
    this.fecha = formularioSolicitudBuilder.getFecha();
    this.perfil = formularioSolicitudBuilder.getPerfil();
    this.pasoSolucion = formularioSolicitudBuilder.getPasoSolucion();
    this.asesor = formularioSolicitudBuilder.getAsesor();
    this.ciudadCredito = formularioSolicitudBuilder.getCiudadCredito();
    this.calificacion = formularioSolicitudBuilder.getCalificacion();
    this.tipoSolicitud = formularioSolicitudBuilder.getTipoSolicitud();
    this.agenciaVinculacion = formularioSolicitudBuilder.getAgenciaVinculacion();
    this.vinculacion = formularioSolicitudBuilder.getVinculacion();
    this.monto = formularioSolicitudBuilder.getMonto();
    this.linea = formularioSolicitudBuilder.getLinea();
    this.cuota = formularioSolicitudBuilder.getCuota();
    this.plazo = formularioSolicitudBuilder.getPlazo();
    this.tasaInteres = formularioSolicitudBuilder.getTasaInteres();
    this.tasaMora = formularioSolicitudBuilder.getTasaMora();
    this.tasaMaxima = formularioSolicitudBuilder.getTasaMaxima();
    this.primerApellido = formularioSolicitudBuilder.getPrimerApellido();
    this.segundoApellido = formularioSolicitudBuilder.getSegundoApellido();
    this.primerNombre = formularioSolicitudBuilder.getPrimerNombre();
    this.segundoNombre = formularioSolicitudBuilder.getSegundoNombre();
    this.tipoDocumento = formularioSolicitudBuilder.getTipoDocumento();
    this.lugarExpedicion = formularioSolicitudBuilder.getLugarExpedicion();
    this.fechaExpedicion = formularioSolicitudBuilder.getFechaExpedicion();
    this.fechaNacimiento = formularioSolicitudBuilder.getFechaNacimiento();
    this.sexo = formularioSolicitudBuilder.getSexo();
    this.lugarNacimiento = formularioSolicitudBuilder.getLugarNacimiento();
    this.estadoCivil = formularioSolicitudBuilder.getEstadoCivil();
    this.pais = formularioSolicitudBuilder.getPais();
    this.ciudadDepartamento = formularioSolicitudBuilder.getCiudadDepartamento();
    this.tipoVivienda = formularioSolicitudBuilder.getTipoVivienda();
    this.estrato = formularioSolicitudBuilder.getEstrato();
    this.arrendatario = formularioSolicitudBuilder.getArrendatario();
    this.telefonoArrendador = formularioSolicitudBuilder.getTelefonoArrendador();
    this.direccionResidencia = formularioSolicitudBuilder.getDireccionResidencia();
    this.barrio = formularioSolicitudBuilder.getBarrio();
    this.telefonoResidencia = formularioSolicitudBuilder.getTelefonoResidencia();
    this.celular = formularioSolicitudBuilder.getCelular();
    this.correspondenciaA = formularioSolicitudBuilder.getCorrespondenciaA();
    this.email = formularioSolicitudBuilder.getEmail();
    this.anios = formularioSolicitudBuilder.getAnios();
    this.meses = formularioSolicitudBuilder.getMeses();
    this.eps = formularioSolicitudBuilder.getEps();
    this.adulto = formularioSolicitudBuilder.getAdulto();
    this.menor18 = formularioSolicitudBuilder.getMenor18();
    this.nivelEstudio = formularioSolicitudBuilder.getNivelEstudio();
    this.profesion = formularioSolicitudBuilder.getProfesion();
    this.ocupacion = formularioSolicitudBuilder.getOcupacion();
    this.declaraRenta = formularioSolicitudBuilder.getDeclaraRenta();
    this.decisionCargo = formularioSolicitudBuilder.getDecisionCargo();
    this.recursosPublicos = formularioSolicitudBuilder.getRecursosPublicos();
    this.personajePublico = formularioSolicitudBuilder.getPersonajePublico();
    this.empresa = formularioSolicitudBuilder.getEmpresa();
    this.cargo = formularioSolicitudBuilder.getCargo();
    this.fechaVinculacion = formularioSolicitudBuilder.getFechaVinculacion();
    this.direccionTrabajo = formularioSolicitudBuilder.getDireccionTrabajo();
    this.ciudadTrabajo = formularioSolicitudBuilder.getCiudadTrabajo();
    this.nitEmpresa = formularioSolicitudBuilder.getNitEmpresa();
    this.telefonoEmpresa = formularioSolicitudBuilder.getTelefonoEmpresa();
    this.extension = formularioSolicitudBuilder.getExtension();
    this.tipoEmpresa = formularioSolicitudBuilder.getTipoEmpresa();
    this.actividadEconomica = formularioSolicitudBuilder.getActividadEconomica();
    this.tipoContrato = formularioSolicitudBuilder.getTipoContrato();
    this.activosCorrientes = formularioSolicitudBuilder.getActivosCorrientes();
    this.activosFijos = formularioSolicitudBuilder.getActivosFijos();
    this.otrosActivos = formularioSolicitudBuilder.getOtrosActivos();
    this.cualesActivos = formularioSolicitudBuilder.getCualesActivos();
    this.totalActivos = formularioSolicitudBuilder.getTotalActivos();
    this.pasivosFinancieros = formularioSolicitudBuilder.getPasivosFinancieros();
    this.pasivosCorrientes = formularioSolicitudBuilder.getPasivosCorrientes();
    this.otrosPasivos = formularioSolicitudBuilder.getOtrosPasivos();
    this.cualesPasivos = formularioSolicitudBuilder.getCualesPasivos();
    this.totalPasivos = formularioSolicitudBuilder.getTotalPasivos();
    this.tipoInmueble = formularioSolicitudBuilder.getTipoInmueble();
    this.valorComercialInmueble = formularioSolicitudBuilder.getValorComercialInmueble();
    this.hipotecadoA = formularioSolicitudBuilder.getHipotecadoA();
    this.direccion = formularioSolicitudBuilder.getDireccion();
    this.saldoCreditoInmueble = formularioSolicitudBuilder.getSaldoCreditoInmueble();
    this.vehiculoClase = formularioSolicitudBuilder.getVehiculoClase();
    this.valorComercialVehiculo = formularioSolicitudBuilder.getValorComercialVehiculo();
    this.marcaModelo = formularioSolicitudBuilder.getMarcaModelo();
    this.placa = formularioSolicitudBuilder.getPlaca();
    this.saldoCreditoVehiculo = formularioSolicitudBuilder.getSaldoCreditoVehiculo();
    this.prendaAFavor = formularioSolicitudBuilder.getPrendaAFavor();
    this.salarioFijo = formularioSolicitudBuilder.getSalarioFijo();
    this.salarioVariableComisiones = formularioSolicitudBuilder.getSalarioVariableComisiones();
    this.arrendamiento = formularioSolicitudBuilder.getArrendamiento();
    this.rendimientosFinancieros = formularioSolicitudBuilder.getRendimientosFinancieros();
    this.honorarios = formularioSolicitudBuilder.getHonorarios();
    this.otrosIngresos = formularioSolicitudBuilder.getOtrosIngresos();
    this.cualesIngresos = formularioSolicitudBuilder.getCualesIngresos();
    this.totalIngresos = formularioSolicitudBuilder.getTotalIngresos();
    this.arriendos = formularioSolicitudBuilder.getArriendos();
    this.gastosPersonales = formularioSolicitudBuilder.getGastosPersonales();
    this.prestamosDiferentes = formularioSolicitudBuilder.getPrestamosDiferentes();
    this.deducciones = formularioSolicitudBuilder.getDeducciones();
    this.tarjetaCredito = formularioSolicitudBuilder.getTarjetaCredito();
    this.otrosGastos = formularioSolicitudBuilder.getOtrosGastos();
    this.cualesGastos = formularioSolicitudBuilder.getCualesGastos();
    this.totalEgresos = formularioSolicitudBuilder.getTotalEgresos();
    this.pagoHipoteca = formularioSolicitudBuilder.getPagoHipoteca();
    this.valorComercialVivienda = formularioSolicitudBuilder.getValorComercialVivienda();
    this.dondeVivir = formularioSolicitudBuilder.getDondeVivir();
    this.quiereComprar = formularioSolicitudBuilder.getQuiereComprar();
    this.cupoExtra = formularioSolicitudBuilder.getCupoExtra();
    this.razonCredito = formularioSolicitudBuilder.getRazonCredito();
    this.detalleRazon = formularioSolicitudBuilder.getDetalleRazon();
    this.primerNombreConyugue = formularioSolicitudBuilder.getPrimerNombreConyugue();
    this.segundoNombreConyugue = formularioSolicitudBuilder.getSegundoNombreConyugue();
    this.primerApellidoConyugue = formularioSolicitudBuilder.getPrimerApellidoConyugue();
    this.segundoApellidoConyugue = formularioSolicitudBuilder.getSegundoApellidoConyugue();
    this.tipoDocumentoConyugue = formularioSolicitudBuilder.getTipoDocumentoConyugue();
    this.documentoConyugue = formularioSolicitudBuilder.getDocumentoConyugue();
    this.fechaExpedicionConyugue = formularioSolicitudBuilder.getFechaExpedicionConyugue();
    this.lugarExpedicionConyugue = formularioSolicitudBuilder.getLugarExpedicionConyugue();
    this.fechaNacimientoConyugue = formularioSolicitudBuilder.getFechaNacimientoConyugue();
    this.lugarNacimientoConyugue = formularioSolicitudBuilder.getLugarNacimientoConyugue();
    this.sexoConyugue = formularioSolicitudBuilder.getSexoConyugue();
    this.lugarTrabajoConyugue = formularioSolicitudBuilder.getLugarTrabajoConyugue();
    this.ocupacionConyugue = formularioSolicitudBuilder.getOcupacionConyugue();
    this.dependenciaEconomica = formularioSolicitudBuilder.getDependenciaEconomica();
    this.fechaIngreso = formularioSolicitudBuilder.getFechaIngreso();
    this.cargoConyugue = formularioSolicitudBuilder.getCargoConyugue();
    this.totalIngresosConyugue = formularioSolicitudBuilder.getTotalIngresosConyugue();
    this.totalEgresosConyugue = formularioSolicitudBuilder.getTotalEgresosConyugue();
    this.epsConyugue = formularioSolicitudBuilder.getEpsConyugue();
    this.nivelEstudioConyugue = formularioSolicitudBuilder.getNivelEstudioConyugue();
    this.celularConyugue = formularioSolicitudBuilder.getCelularConyugue();
    this.nombreReferenciaFamiliar = formularioSolicitudBuilder.getNombreReferenciaFamiliar();
    this.parentescoReferenciaFamiliar = formularioSolicitudBuilder.getParentescoReferenciaFamiliar();
    this.telefonoReferenciaFamiliar = formularioSolicitudBuilder.getTelefonoReferenciaFamiliar();
    this.ciudadReferenciaFamiliar = formularioSolicitudBuilder.getCiudadReferenciaFamiliar();
    this.celularReferenciaFamiliar = formularioSolicitudBuilder.getCelularReferenciaFamiliar();
    this.direccionReferenciaFamiliar = formularioSolicitudBuilder.getDireccionReferenciaFamiliar();
    this.nombreReferenciaPersonal = formularioSolicitudBuilder.getNombreReferenciaPersonal();
    this.parentescoReferenciaPersonal = formularioSolicitudBuilder.getParentescoReferenciaPersonal();
    this.telefonoReferenciaPersonal = formularioSolicitudBuilder.getTelefonoReferenciaPersonal();
    this.ciudadReferenciaPersonal = formularioSolicitudBuilder.getCiudadReferenciaPersonal();
    this.celularReferenciaPersonal = formularioSolicitudBuilder.getCelularReferenciaPersonal();
    this.direccionReferenciaPersonal = formularioSolicitudBuilder.getEntidadFinanciera();
    this.entidadFinanciera = formularioSolicitudBuilder.getEntidadFinanciera();
    this.sucursal = formularioSolicitudBuilder.getSucursal();
    this.tipoProducto = formularioSolicitudBuilder.getTipoProducto();
    this.calificacionAtencion = formularioSolicitudBuilder.getCalificacionAtencion();
    this.razonCalificacion = formularioSolicitudBuilder.getRazonCalificacion();
    this.conocioFinsocial = formularioSolicitudBuilder.getConocioFinsocial();
    this.razonConocio = formularioSolicitudBuilder.getRazonConocio();
    this.transaccionMonedaExtranjera = formularioSolicitudBuilder.getTransaccionMonedaExtranjera();
    this.cuentaExterior = formularioSolicitudBuilder.getCuentaExterior();
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

  public String getDireccionReferenciaPersonal() {
    return direccionReferenciaPersonal;
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

  public String getCuentaExterior() {
    return cuentaExterior;
  }

  public String getCiudadReferenciaPersonal() {
    return ciudadReferenciaPersonal;
  }

  public String getTransaccionMonedaExtranjera() {
    return transaccionMonedaExtranjera;
  }
}
