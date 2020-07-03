package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.FormularioSolicitudBuilder;

public class FormularioSolicitud {

  private String numPaso;
  private String txtFecha;
  private int perfil;
  private String pasoSol;
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


  public FormularioSolicitud(FormularioSolicitudBuilder formularioSolicitudBuilder) {
    this.numPaso = formularioSolicitudBuilder.getNumPaso();
    this.txtFecha = formularioSolicitudBuilder.getFecha();
    this.perfil = formularioSolicitudBuilder.getPerfil();
    this.pasoSol = formularioSolicitudBuilder.getPasoSol();
    this.txtAsesor = formularioSolicitudBuilder.getAsesor();
    this.txtCiuC = formularioSolicitudBuilder.getCiuC();
    this.txtCalf = formularioSolicitudBuilder.getCalf();
    this.txtTSol = formularioSolicitudBuilder.getTSol();
    this.a_vinculacion = formularioSolicitudBuilder.getAVinculacion();
    this.txtVin = formularioSolicitudBuilder.getVin();
    this.txtMonto = formularioSolicitudBuilder.getMonto();
    this.txtLinea = formularioSolicitudBuilder.getLinea();
    this.cuota = formularioSolicitudBuilder.getCuota();
    this.txtPlaz = formularioSolicitudBuilder.getPlaz();
    this.tasaI = formularioSolicitudBuilder.getTasaI();
    this.tasaM = formularioSolicitudBuilder.getTasaM();
    this.tasaMax = formularioSolicitudBuilder.getTasaMax();
    this.txtPApellido = formularioSolicitudBuilder.getPApellido();
    this.txtSApellido = formularioSolicitudBuilder.getSApellido();
    this.txtPNombre = formularioSolicitudBuilder.getPNombre();
    this.txtSNombre = formularioSolicitudBuilder.getSNombre();
    this.cmbTipoDoc = formularioSolicitudBuilder.getTipoDoc();
    this.txtLugarExp = formularioSolicitudBuilder.getLugarExp();
    this.txtFechaExp = formularioSolicitudBuilder.getFechaExp();
    this.txtFechaNac = formularioSolicitudBuilder.getFechaNac();
    this.cmbSexo = formularioSolicitudBuilder.getSexo();
    this.txtLugarNac = formularioSolicitudBuilder.getLugarNac();
    this.cmbEstCivil = formularioSolicitudBuilder.getEstCivil();
    this.txtPais = formularioSolicitudBuilder.getPais();
    this.cmbCiudad = formularioSolicitudBuilder.getCiudad();
    this.cmbTipoViv = formularioSolicitudBuilder.getTipoViv();
    this.txtEstrato = formularioSolicitudBuilder.getEstrato();
    this.txtArrend = formularioSolicitudBuilder.getArrend();
    this.txtTelArr = formularioSolicitudBuilder.getTelArr();
    this.dirCa = formularioSolicitudBuilder.getDirCa();
    this.txtBarrio = formularioSolicitudBuilder.getBarrio();
    this.txtTel = formularioSolicitudBuilder.getTel();
    this.txtCel = formularioSolicitudBuilder.getCel();
    this.cmbCorrespondencia = formularioSolicitudBuilder.getCorrespondencia();
    this.txtEmail = formularioSolicitudBuilder.getEmail();
    this.txtAnios = formularioSolicitudBuilder.getAnios();
    this.txtMeses = formularioSolicitudBuilder.getMeses();
    this.txtEps = formularioSolicitudBuilder.getEps();
    this.txtAdulto = formularioSolicitudBuilder.getAdulto();
    this.txtMenor18 = formularioSolicitudBuilder.getMenor18();
    this.cmbNivelEst = formularioSolicitudBuilder.getNivelEst();
    this.cmbProfesion = formularioSolicitudBuilder.getProfesion();
    this.rdOcupacion = formularioSolicitudBuilder.getRdOcupacion();
    this.txtDeRenta = formularioSolicitudBuilder.getDeRenta();
    this.txtDesicionCargo = formularioSolicitudBuilder.getDesicionCargo();
    this.txtrecPublicos = formularioSolicitudBuilder.getrecPublicos();
    this.txtPerPubl = formularioSolicitudBuilder.getPerPubl();
    this.txtEmpresa = formularioSolicitudBuilder.getEmpresa();
    this.txtCargo = formularioSolicitudBuilder.getCargo();
    this.txtFechaVinculacion = formularioSolicitudBuilder.getFechaVinculacion();
    this.dirTrabajo = formularioSolicitudBuilder.getDirTrabajo();
    this.cmbCiudad2 = formularioSolicitudBuilder.getCiudad2();
    this.txtNitEmpresa = formularioSolicitudBuilder.getNitEmpresa();
    this.txtTelEmpresa = formularioSolicitudBuilder.getTelEmpresa();
    this.txtExt = formularioSolicitudBuilder.getExt();
    this.cmbTipoEmp = formularioSolicitudBuilder.getTipoEmp();
    this.cmbActEcon = formularioSolicitudBuilder.getActEcon();
    this.cmbTipoContrato = formularioSolicitudBuilder.getTipoContrato();
    this.activos_corrientes = formularioSolicitudBuilder.getActivosCorrientes();
    this.activos_fijos = formularioSolicitudBuilder.getActivosFijos();
    this.otros_activos = formularioSolicitudBuilder.getOtrosActivos();
    this.cuales_activos = formularioSolicitudBuilder.getCualesActivos();
    this.total_activos = formularioSolicitudBuilder.getTotalActivos();
    this.pasivos_financieros = formularioSolicitudBuilder.getPasivosFinancieros();
    this.pasivos_corrientes = formularioSolicitudBuilder.getPasivosCorrientes();
    this.otros_pasivos = formularioSolicitudBuilder.getOtrosPasivos();
    this.cuales_pasivos = formularioSolicitudBuilder.getCualesPasivos();
    this.total_pasivos = formularioSolicitudBuilder.getTotalPasivos();
    this.txtTipoInm = formularioSolicitudBuilder.getTipoInm();
    this.txtValorComInm = formularioSolicitudBuilder.getValorComInm();
    this.txtHipotecado = formularioSolicitudBuilder.getHipotecado();
    this.dirBienes = formularioSolicitudBuilder.getDirBienes();
    this.txtSaldoCredInm = formularioSolicitudBuilder.getSaldoCredInm();
    this.txtVehCls = formularioSolicitudBuilder.getVehCls();
    this.txtValorComVeh = formularioSolicitudBuilder.getValorComVeh();
    this.txtMarcaVeh = formularioSolicitudBuilder.getMarcaVeh();
    this.txtPlacaVeh = formularioSolicitudBuilder.getPlacaVeh();
    this.txtSaldoCredVeh = formularioSolicitudBuilder.getSaldoCredVeh();
    this.txtPrendaFavVeh = formularioSolicitudBuilder.getPrendaFavVeh();
    this.txtSueldoFijo = formularioSolicitudBuilder.getSueldoFijo();
    this.txtSalVarCom = formularioSolicitudBuilder.getSalVarCom();
    this.txtArrendamiento = formularioSolicitudBuilder.getArrendamiento();
    this.txtRenFin = formularioSolicitudBuilder.getRenFin();
    this.txtHonorarios = formularioSolicitudBuilder.getHonorarios();
    this.txtOtrosIng = formularioSolicitudBuilder.getOtrosIng();
    this.txtCualesIng = formularioSolicitudBuilder.getCualesIng();
    this.txtTIngresos = formularioSolicitudBuilder.getTIngresos();
    this.txtArriendos = formularioSolicitudBuilder.getArriendos();
    this.txtGastosPer = formularioSolicitudBuilder.getGastosPer();
    this.txtPresDfFin = formularioSolicitudBuilder.getPresDfFin();
    this.txtDeducciones = formularioSolicitudBuilder.getDeducciones();
    this.txtTarjCred = formularioSolicitudBuilder.getTarjCred();
    this.txtOtrosGastos = formularioSolicitudBuilder.getOtrosGastos();
    this.txtCualesGastos = formularioSolicitudBuilder.getCualesGastos();
    this.txtTEgresos = formularioSolicitudBuilder.getTEgresos();
    this.txtPagHip = formularioSolicitudBuilder.getPagHip();
    this.txtVlrComViv = formularioSolicitudBuilder.getVlrComViv();
    this.txtGustaVivir = formularioSolicitudBuilder.getGustaVivir();
    this.rdCompViv = formularioSolicitudBuilder.getRdCompViv();
    this.rdCupoExtra = formularioSolicitudBuilder.getRdCupoExtra();
    this.cmbRazondecredito = formularioSolicitudBuilder.getRazondecredito();
    this.razon = formularioSolicitudBuilder.getRazon();
    this.txtPNConyugue = formularioSolicitudBuilder.getPNConyugue();
    this.txtSNConyugue = formularioSolicitudBuilder.getSNConyugue();
    this.txtPAConyugue = formularioSolicitudBuilder.getPAConyugue();
    this.txtSAConyugue = formularioSolicitudBuilder.getSAConyugue();
    this.cmbTipoDocCony = formularioSolicitudBuilder.getTipoDocCony();
    this.txtDocConyugue = formularioSolicitudBuilder.getDocConyugue();
    this.txtFechaExpCon = formularioSolicitudBuilder.getFechaExpCon();
    this.txtLugarExpCon = formularioSolicitudBuilder.getLugarExpCon();
    this.txtFechaNacCon = formularioSolicitudBuilder.getFechaNacCon();
    this.txtLugarNacCon = formularioSolicitudBuilder.getLugarNacCon();
    this.cmbSexoCon = formularioSolicitudBuilder.getSexoCon();
    this.txtLugTrabCon = formularioSolicitudBuilder.getLugTrabCon();
    this.rdOcupacionCon = formularioSolicitudBuilder.getRdOcupacionCon();
    this.txtDepEco = formularioSolicitudBuilder.getDepEco();
    this.txtFecIngr = formularioSolicitudBuilder.getFecIngr();
    this.txtCargoCon = formularioSolicitudBuilder.getCargoCon();
    this.txtTIngCon = formularioSolicitudBuilder.getTIngCon();
    this.txtTEgrCon = formularioSolicitudBuilder.getTEgrCon();
    this.txtEpsConyuge = formularioSolicitudBuilder.getEpsConyuge();
    this.cmbNivelEstCon = formularioSolicitudBuilder.getNivelEstCon();
    this.txtCelCon = formularioSolicitudBuilder.getCelCon();
    this.ref_familiar_nombre = formularioSolicitudBuilder.getRefFamiliarNombre();
    this.ref_familiar_par = formularioSolicitudBuilder.getRefFamiliarPar();
    this.ref_familiar_tel = formularioSolicitudBuilder.getRefFamiliarTel();
    this.cmbCiudadRefFam = formularioSolicitudBuilder.getCiudadRefFam();
    this.txtCelRFam = formularioSolicitudBuilder.getCelRFam();
    this.dirFamiliar = formularioSolicitudBuilder.getDirFamiliar();
    this.ref_personal_nombre = formularioSolicitudBuilder.getRefPersonalNombre();
    this.ref_personal_par = formularioSolicitudBuilder.getRefPersonalPar();
    this.ref_personal_tel = formularioSolicitudBuilder.getRefPersonalTel();
    this.cmbCiudadRefPer = formularioSolicitudBuilder.getCiudadRefPer();
    this.txtCelRPer = formularioSolicitudBuilder.getCelRPer();
    this.dirPersonal = formularioSolicitudBuilder.getDirPersonal();
    this.txtNEntFin = formularioSolicitudBuilder.getNEntFin();
    this.txtSucursal = formularioSolicitudBuilder.getSucursal();
    this.cmbTipoProd = formularioSolicitudBuilder.getTipoProd();
    this.cmbSatisfaccionC = formularioSolicitudBuilder.getSatisfaccionC();
    this.txtPorqueSatic = formularioSolicitudBuilder.getPorqueSatic();
    this.cmbConocioFinsocial = formularioSolicitudBuilder.getConocioFinsocial();
    this.txtOtroConocer = formularioSolicitudBuilder.getOtroConocer();
    this.rdtransaccion_ext = formularioSolicitudBuilder.getRdransaccionExt();
    this.rdCuentasExt = formularioSolicitudBuilder.getRdCuentasExt();
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

  public String getPasoSol() {
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

  public int getRdtransaccionExt() {
    return rdtransaccion_ext;
  }

  public int getRdCuentasExt() {
    return rdCuentasExt;
  }
}
