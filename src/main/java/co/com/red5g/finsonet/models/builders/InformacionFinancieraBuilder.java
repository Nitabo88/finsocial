package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionFinanciera;
import co.com.red5g.finsonet.utils.Builder;

public class InformacionFinancieraBuilder implements Builder<InformacionFinanciera> {
    private String salarioFijo;
    private String salarioVariableComisiones;
    private String arrendamientoIngresos;
    private String rendimientosFinancieros;
    private String honorarios;
    private String otrosIngresos;
    private String cualesIngresos;
    private String arriendosEgresos;
    private String gastosPersonalesFamiliares;
    private String prestamosDiferentesFinsocial;
    private String deduccionesNomina;
    private String tarjetasCredito;
    private String otrosGastos;
    private String pagoHipoteca;
    private String valorComercialVivienda;
    private String dondeVivir;
    private String comprarVivienda;
    private String cupoExtraLibranza;
    private String usoCredito;

    public InformacionFinancieraBuilder() {
      this.salarioFijo = "";
      this.salarioVariableComisiones = "";
      this.arrendamientoIngresos = "";
      this.rendimientosFinancieros = "";
      this.honorarios = "";
      this.otrosIngresos = "";
      this.cualesIngresos = "";
      this.arriendosEgresos = "";
      this.gastosPersonalesFamiliares = "";
      this.prestamosDiferentesFinsocial = "";
      this.deduccionesNomina = "";
      this.tarjetasCredito = "";
      this.otrosGastos = "";
      this.pagoHipoteca = "";
      this.valorComercialVivienda = "";
      this.dondeVivir = "";
      this.comprarVivienda = "";
      this.cupoExtraLibranza = "";
      this.usoCredito = "";
    }

    public static InformacionFinancieraBuilder la() {
        return new InformacionFinancieraBuilder();
    }

    @Override
    public InformacionFinanciera build() {
        return new InformacionFinanciera(this);
    }

    public String getSalarioFijo() {
        return salarioFijo;
    }

    public String getSalarioVariableComisiones() {
        return salarioVariableComisiones;
    }

    public String getArrendamientoIngresos() {
        return arrendamientoIngresos;
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

    public String getArriendosEgresos() {
        return arriendosEgresos;
    }

    public String getGastosPersonalesFamiliares() {
        return gastosPersonalesFamiliares;
    }

    public String getPrestamosDiferentesFinsocial() {
        return prestamosDiferentesFinsocial;
    }

    public String getDeduccionesNomina() {
        return deduccionesNomina;
    }

    public String getTarjetasCredito() {
        return tarjetasCredito;
    }

    public String getOtrosGastos() {
        return otrosGastos;
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

    public String getComprarVivienda() {
        return comprarVivienda;
    }

    public String getCupoExtraLibranza() {
        return cupoExtraLibranza;
    }

    public String getUsoCredito() {
        return usoCredito;
    }

    public InformacionFinanciera persona() {
        this.conSalarioFijo("4500000");
        this.conSalarioVariableComisiones("0");
        this.conArrendamientoIngresos("500000");
        this.conRendimientosFinancieros("0");
        this.conHonorarios("0");
        this.conOtrosIngresos("0");
        this.conCualesIngresos("No aplica");
        this.conArriendosEgresos("800000");
        this.conGastosPersonalesFamiliares("1000000");
        this.conPrestamosDiferentesFinsocial("0");
        this.conDeduccionesNomina("0");
        this.conTarjetasCredito("0");
        this.conOtrosGastos("0");
        this.conPagoHipoteca("SI");
        this.conValorComercialVivienda("120000000");
        this.conDondeVivir("Bogota");
        this.conComprarVivienda("NO");
        this.conCupoExtraLibranza("SI");
        this.conUsoCredito("Deudas");
        return this.build();
    }

    private InformacionFinancieraBuilder conDondeVivir(String dondeVivir) {
        this.dondeVivir = dondeVivir;
        return this;
    }

    private InformacionFinancieraBuilder conComprarVivienda(String comprarVivienda) {
        this.comprarVivienda = comprarVivienda;
        return this;
    }

    private InformacionFinancieraBuilder conCupoExtraLibranza(String cupoExtraLibranza) {
        this.cupoExtraLibranza = cupoExtraLibranza;
        return this;
    }

    private InformacionFinancieraBuilder conUsoCredito(String usoCredito) {
        this.usoCredito = usoCredito;
        return this;
    }

    private InformacionFinancieraBuilder conPagoHipoteca(String pagoHipoteca) {
        this.pagoHipoteca = pagoHipoteca;
        return this;
    }

    private InformacionFinancieraBuilder conValorComercialVivienda(String valorComercialVivienda) {
        this.valorComercialVivienda = valorComercialVivienda;
        return this;
    }

    private InformacionFinancieraBuilder conOtrosGastos(String otrosGastos) {
        this.otrosGastos = otrosGastos;
        return this;
    }

    private InformacionFinancieraBuilder conTarjetasCredito(String tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
        return this;
    }

    private InformacionFinancieraBuilder conDeduccionesNomina(String deduccionesNomina) {
        this.deduccionesNomina = deduccionesNomina;
        return this;
    }

    private InformacionFinancieraBuilder conPrestamosDiferentesFinsocial(String prestamosDiferentesFinsocial) {
        this.prestamosDiferentesFinsocial = prestamosDiferentesFinsocial;
        return this;
    }

    private InformacionFinancieraBuilder conGastosPersonalesFamiliares(String gastosPersonalesFamiliares) {
        this.gastosPersonalesFamiliares = gastosPersonalesFamiliares;
        return this;
    }

    private InformacionFinancieraBuilder conArriendosEgresos(String arriendosEgresos) {
        this.arriendosEgresos = arriendosEgresos;
        return this;
    }

    private InformacionFinancieraBuilder conCualesIngresos(String cualesIngresos) {
        this.cualesIngresos = cualesIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conOtrosIngresos(String otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conHonorarios(String honorarios) {
        this.honorarios = honorarios;
        return this;
    }

    private InformacionFinancieraBuilder conRendimientosFinancieros(String rendimientosFinancieros) {
        this.rendimientosFinancieros = rendimientosFinancieros;
        return this;
    }

    private InformacionFinancieraBuilder conArrendamientoIngresos(String arrendamientoIngresos) {
        this.arrendamientoIngresos = arrendamientoIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conSalarioVariableComisiones(String salarioVariableComisiones) {
        this.salarioVariableComisiones = salarioVariableComisiones;
        return this;
    }

    private InformacionFinancieraBuilder conSalarioFijo(String salarioFijo) {
        this.salarioFijo = salarioFijo;
        return this;
    }
}