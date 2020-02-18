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
    private String cualesGastos;
    private String pagoHipoteca;
    private String valorComercialVivienda;
    private String dondeVivir;
    private String comprarVivienda;
    private String cupoExtraLibranza;
    private String usoCredito;
    private String razonOtros;

    public InformacionFinancieraBuilder() {
      salarioFijo = "";
      salarioVariableComisiones = "";
      arrendamientoIngresos = "";
      rendimientosFinancieros = "";
      honorarios = "";
      otrosIngresos = "";
      cualesIngresos = "";
      arriendosEgresos = "";
      gastosPersonalesFamiliares = "";
      prestamosDiferentesFinsocial = "";
      deduccionesNomina = "";
      tarjetasCredito = "";
      otrosGastos = "";
      cualesGastos = "";
      pagoHipoteca = "";
      valorComercialVivienda = "";
      dondeVivir = "";
      comprarVivienda = "";
      cupoExtraLibranza = "";
      usoCredito = "";
      razonOtros = "";
    }

    public static InformacionFinancieraBuilder la() {
        return new InformacionFinancieraBuilder();
    }

    @Override
    public InformacionFinanciera build() {
        return new InformacionFinanciera(this);
    }

    public String getSalarioFijo() {
        return this.salarioFijo;
    }

    public String getSalarioVariableComisiones() {
        return this.salarioVariableComisiones;
    }

    public String getArrendamientoIngresos() {
        return this.arrendamientoIngresos;
    }

    public String getRendimientosFinancieros() {
        return this.rendimientosFinancieros;
    }

    public String getHonorarios() {
        return this.honorarios;
    }

    public String getOtrosIngresos() {
        return this.otrosIngresos;
    }

    public String getCualesIngresos() {
        return this.cualesIngresos;
    }

    public String getArriendosEgresos() {
        return this.arriendosEgresos;
    }

    public String getGastosPersonalesFamiliares() {
        return this.gastosPersonalesFamiliares;
    }

    public String getPrestamosDiferentesFinsocial() {
        return this.prestamosDiferentesFinsocial;
    }

    public String getDeduccionesNomina() {
        return this.deduccionesNomina;
    }

    public String getTarjetasCredito() {
        return this.tarjetasCredito;
    }

    public String getOtrosGastos() {
        return this.otrosGastos;
    }

    public String getPagoHipoteca() {
        return this.pagoHipoteca;
    }

    public String getValorComercialVivienda() {
        return this.valorComercialVivienda;
    }

    public String getDondeVivir() {
        return this.dondeVivir;
    }

    public String getComprarVivienda() {
        return this.comprarVivienda;
    }

    public String getCupoExtraLibranza() {
        return this.cupoExtraLibranza;
    }

    public String getUsoCredito() {
        return this.usoCredito;
    }

    public String getRazonOtros() {
        return this.razonOtros;
    }


    public InformacionFinanciera persona() {
      conSalarioFijo("4500000");
      conSalarioVariableComisiones("0");
      conArrendamientoIngresos("500000");
      conRendimientosFinancieros("0");
      conHonorarios("0");
      conOtrosIngresos("0");
      conCualesIngresos("No aplica");
      conArriendosEgresos("800000");
      conGastosPersonalesFamiliares("1000000");
      conPrestamosDiferentesFinsocial("0");
      conDeduccionesNomina("0");
      conTarjetasCredito("0");
      conOtrosGastos("0");
      conCualesGastos("No aplica");
      conPagoHipoteca("SI");
      conValorComercialVivienda("120000000");
      conDondeVivir("Bogota");
      conComprarVivienda("NO");
      conCupoExtraLibranza("SI");
      conUsoCredito("Deudas");
      conRazonOtros("");
        return build();
    }

    private InformacionFinancieraBuilder conCualesGastos(final String cualesGastos) {
        this.cualesGastos = cualesGastos;
        return this;
    }

    private InformacionFinancieraBuilder conDondeVivir(final String dondeVivir) {
        this.dondeVivir = dondeVivir;
        return this;
    }

    private InformacionFinancieraBuilder conComprarVivienda(final String comprarVivienda) {
        this.comprarVivienda = comprarVivienda;
        return this;
    }

    private InformacionFinancieraBuilder conCupoExtraLibranza(final String cupoExtraLibranza) {
        this.cupoExtraLibranza = cupoExtraLibranza;
        return this;
    }

    private InformacionFinancieraBuilder conUsoCredito(final String usoCredito) {
        this.usoCredito = usoCredito;
        return this;
    }

    private InformacionFinancieraBuilder conRazonOtros(final String razonOtros) {
        this.razonOtros = razonOtros;
        return this;
    }

    private InformacionFinancieraBuilder conPagoHipoteca(final String pagoHipoteca) {
        this.pagoHipoteca = pagoHipoteca;
        return this;
    }

    private InformacionFinancieraBuilder conValorComercialVivienda(final String valorComercialVivienda) {
        this.valorComercialVivienda = valorComercialVivienda;
        return this;
    }

    private InformacionFinancieraBuilder conOtrosGastos(final String otrosGastos) {
        this.otrosGastos = otrosGastos;
        return this;
    }

    private InformacionFinancieraBuilder conTarjetasCredito(final String tarjetasCredito) {
        this.tarjetasCredito = tarjetasCredito;
        return this;
    }

    private InformacionFinancieraBuilder conDeduccionesNomina(final String deduccionesNomina) {
        this.deduccionesNomina = deduccionesNomina;
        return this;
    }

    private InformacionFinancieraBuilder conPrestamosDiferentesFinsocial(final String prestamosDiferentesFinsocial) {
        this.prestamosDiferentesFinsocial = prestamosDiferentesFinsocial;
        return this;
    }

    private InformacionFinancieraBuilder conGastosPersonalesFamiliares(final String gastosPersonalesFamiliares) {
        this.gastosPersonalesFamiliares = gastosPersonalesFamiliares;
        return this;
    }

    private InformacionFinancieraBuilder conArriendosEgresos(final String arriendosEgresos) {
        this.arriendosEgresos = arriendosEgresos;
        return this;
    }

    private InformacionFinancieraBuilder conCualesIngresos(final String cualesIngresos) {
        this.cualesIngresos = cualesIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conOtrosIngresos(final String otrosIngresos) {
        this.otrosIngresos = otrosIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conHonorarios(final String honorarios) {
        this.honorarios = honorarios;
        return this;
    }

    private InformacionFinancieraBuilder conRendimientosFinancieros(final String rendimientosFinancieros) {
        this.rendimientosFinancieros = rendimientosFinancieros;
        return this;
    }

    private InformacionFinancieraBuilder conArrendamientoIngresos(final String arrendamientoIngresos) {
        this.arrendamientoIngresos = arrendamientoIngresos;
        return this;
    }

    private InformacionFinancieraBuilder conSalarioVariableComisiones(final String salarioVariableComisiones) {
        this.salarioVariableComisiones = salarioVariableComisiones;
        return this;
    }

    private InformacionFinancieraBuilder conSalarioFijo(final String salarioFijo) {
        this.salarioFijo = salarioFijo;
        return this;
    }

    public String getCualesGastos() {
        return this.cualesGastos;
    }
}