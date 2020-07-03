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
    this.ciudadCredito = formularioSolicitudBuilder.getCiuC();
    this.calificacion = formularioSolicitudBuilder.getCalf();
    this.tipoSolicitud = formularioSolicitudBuilder.getTSol();
    this.agenciaVinculacion = formularioSolicitudBuilder.getAVinculacion();
    this.vinculacion = formularioSolicitudBuilder.getVin();
    this.monto = formularioSolicitudBuilder.getMonto();
    this.linea = formularioSolicitudBuilder.getLinea();
    this.cuota = formularioSolicitudBuilder.getCuota();
    this.plazo = formularioSolicitudBuilder.getPlaz();
    this.tasaInteres = formularioSolicitudBuilder.getTasaInteres();
    this.tasaMora = formularioSolicitudBuilder.getTasaMora();
    this.tasaMaxima = formularioSolicitudBuilder.getTasaMaxima();
    this.primerApellido = formularioSolicitudBuilder.getPApellido();
    this.segundoApellido = formularioSolicitudBuilder.getSApellido();
    this.primerNombre = formularioSolicitudBuilder.getPNombre();
    this.segundoNombre = formularioSolicitudBuilder.getSNombre();
    this.tipoDocumento = formularioSolicitudBuilder.getTipoDoc();
    this.lugarExpedicion = formularioSolicitudBuilder.getLugarExp();
    this.fechaExpedicion = formularioSolicitudBuilder.getFechaExp();
    this.fechaNacimiento = formularioSolicitudBuilder.getFechaNac();
    this.sexo = formularioSolicitudBuilder.getSexo();
    this.lugarNacimiento = formularioSolicitudBuilder.getLugarNac();
    this.estadoCivil = formularioSolicitudBuilder.getEstCivil();
    this.pais = formularioSolicitudBuilder.getPais();
    this.ciudadDepartamento = formularioSolicitudBuilder.getCiudad();
    this.tipoVivienda = formularioSolicitudBuilder.getTipoViv();
    this.estrato = formularioSolicitudBuilder.getEstrato();
    this.arrendatario = formularioSolicitudBuilder.getArrend();
    this.telefonoArrendador = formularioSolicitudBuilder.getTelArr();
    this.direccionResidencia = formularioSolicitudBuilder.getDireccionResidencia();
    this.barrio = formularioSolicitudBuilder.getBarrio();
    this.telefonoResidencia = formularioSolicitudBuilder.getTel();
    this.celular = formularioSolicitudBuilder.getCel();
    this.correspondenciaA = formularioSolicitudBuilder.getCorrespondencia();
    this.email = formularioSolicitudBuilder.getEmail();
    this.anios = formularioSolicitudBuilder.getAnios();
    this.meses = formularioSolicitudBuilder.getMeses();
    this.eps = formularioSolicitudBuilder.getEps();
    this.adulto = formularioSolicitudBuilder.getAdulto();
    this.menor18 = formularioSolicitudBuilder.getMenor18();
    this.nivelEstudio = formularioSolicitudBuilder.getNivelEst();
    this.profesion = formularioSolicitudBuilder.getProfesion();
    this.ocupacion = formularioSolicitudBuilder.getOcupacion();
    this.declaraRenta = formularioSolicitudBuilder.getDeRenta();
    this.decisionCargo = formularioSolicitudBuilder.getDesicionCargo();
    this.recursosPublicos = formularioSolicitudBuilder.getrecPublicos();
    this.personajePublico = formularioSolicitudBuilder.getPerPubl();
    this.empresa = formularioSolicitudBuilder.getEmpresa();
    this.cargo = formularioSolicitudBuilder.getCargo();
    this.fechaVinculacion = formularioSolicitudBuilder.getFechaVinculacion();
    this.direccionTrabajo = formularioSolicitudBuilder.getDireccionTrabajo();
    this.ciudadTrabajo = formularioSolicitudBuilder.getCiudad2();
    this.nitEmpresa = formularioSolicitudBuilder.getNitEmpresa();
    this.telefonoEmpresa = formularioSolicitudBuilder.getTelEmpresa();
    this.extension = formularioSolicitudBuilder.getExt();
    this.tipoEmpresa = formularioSolicitudBuilder.getTipoEmp();
    this.actividadEconomica = formularioSolicitudBuilder.getActEcon();
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
    this.tipoInmueble = formularioSolicitudBuilder.getTipoInm();
    this.valorComercialInmueble = formularioSolicitudBuilder.getValorComInm();
    this.hipotecadoA = formularioSolicitudBuilder.getHipotecado();
    this.direccion = formularioSolicitudBuilder.getDireccion();
    this.saldoCreditoInmueble = formularioSolicitudBuilder.getSaldoCredInm();
    this.vehiculoClase = formularioSolicitudBuilder.getVehCls();
    this.valorComercialVehiculo = formularioSolicitudBuilder.getValorComVeh();
    this.marcaModelo = formularioSolicitudBuilder.getMarcaVeh();
    this.placa = formularioSolicitudBuilder.getPlacaVeh();
    this.saldoCreditoVehiculo = formularioSolicitudBuilder.getSaldoCredVeh();
    this.prendaAFavor = formularioSolicitudBuilder.getPrendaFavVeh();
    this.salarioFijo = formularioSolicitudBuilder.getSueldoFijo();
    this.salarioVariableComisiones = formularioSolicitudBuilder.getSalVarCom();
    this.arrendamiento = formularioSolicitudBuilder.getArrendamiento();
    this.rendimientosFinancieros = formularioSolicitudBuilder.getRenFin();
    this.honorarios = formularioSolicitudBuilder.getHonorarios();
    this.otrosIngresos = formularioSolicitudBuilder.getOtrosIng();
    this.cualesIngresos = formularioSolicitudBuilder.getCualesIng();
    this.totalIngresos = formularioSolicitudBuilder.getTIngresos();
    this.arriendos = formularioSolicitudBuilder.getArriendos();
    this.gastosPersonales = formularioSolicitudBuilder.getGastosPer();
    this.prestamosDiferentes = formularioSolicitudBuilder.getPresDfFin();
    this.deducciones = formularioSolicitudBuilder.getDeducciones();
    this.tarjetaCredito = formularioSolicitudBuilder.getTarjCred();
    this.otrosGastos = formularioSolicitudBuilder.getOtrosGastos();
    this.cualesGastos = formularioSolicitudBuilder.getCualesGastos();
    this.totalEgresos = formularioSolicitudBuilder.getTEgresos();
    this.pagoHipoteca = formularioSolicitudBuilder.getPagHip();
    this.valorComercialVivienda = formularioSolicitudBuilder.getVlrComViv();
    this.dondeVivir = formularioSolicitudBuilder.getGustaVivir();
    this.quiereComprar = formularioSolicitudBuilder.getQuiereComprar();
    this.cupoExtra = formularioSolicitudBuilder.getCupoExtra();
    this.razonCredito = formularioSolicitudBuilder.getRazondecredito();
    this.detalleRazon = formularioSolicitudBuilder.getDetalleRazon();
    this.primerNombreConyugue = formularioSolicitudBuilder.getPNConyugue();
    this.segundoNombreConyugue = formularioSolicitudBuilder.getSNConyugue();
    this.primerApellidoConyugue = formularioSolicitudBuilder.getPAConyugue();
    this.segundoApellidoConyugue = formularioSolicitudBuilder.getSAConyugue();
    this.tipoDocumentoConyugue = formularioSolicitudBuilder.getTipoDocCony();
    this.documentoConyugue = formularioSolicitudBuilder.getDocConyugue();
    this.fechaExpedicionConyugue = formularioSolicitudBuilder.getFechaExpCon();
    this.lugarExpedicionConyugue = formularioSolicitudBuilder.getLugarExpCon();
    this.fechaNacimientoConyugue = formularioSolicitudBuilder.getFechaNacCon();
    this.lugarNacimientoConyugue = formularioSolicitudBuilder.getLugarNacCon();
    this.sexoConyugue = formularioSolicitudBuilder.getSexoCon();
    this.lugarTrabajoConyugue = formularioSolicitudBuilder.getLugTrabCon();
    this.ocupacionConyugue = formularioSolicitudBuilder.getOcupacionConyugue();
    this.dependenciaEconomica = formularioSolicitudBuilder.getDepEco();
    this.fechaIngreso = formularioSolicitudBuilder.getFecIngr();
    this.cargoConyugue = formularioSolicitudBuilder.getCargoCon();
    this.totalIngresosConyugue = formularioSolicitudBuilder.getTIngCon();
    this.totalEgresosConyugue = formularioSolicitudBuilder.getTEgrCon();
    this.epsConyugue = formularioSolicitudBuilder.getEpsConyuge();
    this.nivelEstudioConyugue = formularioSolicitudBuilder.getNivelEstCon();
    this.celularConyugue = formularioSolicitudBuilder.getCelCon();
    this.nombreReferenciaFamiliar = formularioSolicitudBuilder.getRefFamiliarNombre();
    this.parentescoReferenciaFamiliar = formularioSolicitudBuilder.getRefFamiliarPar();
    this.telefonoReferenciaFamiliar = formularioSolicitudBuilder.getRefFamiliarTel();
    this.ciudadReferenciaFamiliar = formularioSolicitudBuilder.getCiudadRefFam();
    this.celularReferenciaFamiliar = formularioSolicitudBuilder.getCelRFam();
    this.direccionReferenciaFamiliar = formularioSolicitudBuilder.getDireccionReferenciaFamiliar();
    this.nombreReferenciaPersonal = formularioSolicitudBuilder.getRefPersonalNombre();
    this.parentescoReferenciaPersonal = formularioSolicitudBuilder.getRefPersonalPar();
    this.telefonoReferenciaPersonal = formularioSolicitudBuilder.getRefPersonalTel();
    this.ciudadReferenciaPersonal = formularioSolicitudBuilder.getCiudadRefPer();
    this.celularReferenciaPersonal = formularioSolicitudBuilder.getCelRPer();
    this.direccionReferenciaPersonal = formularioSolicitudBuilder.getEntidadFinanciera();
    this.entidadFinanciera = formularioSolicitudBuilder.getNEntFin();
    this.sucursal = formularioSolicitudBuilder.getSucursal();
    this.tipoProducto = formularioSolicitudBuilder.getTipoProd();
    this.calificacionAtencion = formularioSolicitudBuilder.getSatisfaccionC();
    this.razonCalificacion = formularioSolicitudBuilder.getPorqueSatic();
    this.conocioFinsocial = formularioSolicitudBuilder.getConocioFinsocial();
    this.razonConocio = formularioSolicitudBuilder.getOtroConocer();
    this.transaccionMonedaExtranjera = formularioSolicitudBuilder.getRdransaccionExt();
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
