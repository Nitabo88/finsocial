package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionFinancieraBuilder;

public class InformacionFinanciera {
    private final String salarioFijo;
    private final String salarioVariableComisiones;
    private final String arrendamientoIngresos;
    private final String rendimientosFinancieros;
    private final String honorarios;
    private final String otrosIngresos;
    private final String cualesIngresos;
    private final String arriendosEgresos;
    private final String gastosPersonalesFamiliares;
    private final String prestamosDiferentesFinsocial;
    private final String deduccionesNomina;
    private final String tarjetasCredito;
    private final String otrosGastos;
    private final String cualesGastos;
    private final String pagoHipoteca;
    private final String valorComercialVivienda;
    private final String dondeVivir;
    private final String comprarVivienda;
    private final String cupoExtraLibranza;
    private final String usoCredito;
    private final String razonOtros;

    public InformacionFinanciera(final InformacionFinancieraBuilder informacionFinancieraBuilder) {
      salarioFijo = informacionFinancieraBuilder.getSalarioFijo();
      salarioVariableComisiones = informacionFinancieraBuilder.getSalarioVariableComisiones();
      arrendamientoIngresos = informacionFinancieraBuilder.getArrendamientoIngresos();
      rendimientosFinancieros = informacionFinancieraBuilder.getRendimientosFinancieros();
      honorarios = informacionFinancieraBuilder.getHonorarios();
      otrosIngresos = informacionFinancieraBuilder.getOtrosIngresos();
      cualesIngresos = informacionFinancieraBuilder.getCualesIngresos();
      arriendosEgresos = informacionFinancieraBuilder.getArriendosEgresos();
      gastosPersonalesFamiliares = informacionFinancieraBuilder.getGastosPersonalesFamiliares();
      prestamosDiferentesFinsocial = informacionFinancieraBuilder.getPrestamosDiferentesFinsocial();
      deduccionesNomina = informacionFinancieraBuilder.getDeduccionesNomina();
      tarjetasCredito = informacionFinancieraBuilder.getTarjetasCredito();
      otrosGastos = informacionFinancieraBuilder.getOtrosGastos();
      cualesGastos = informacionFinancieraBuilder.getCualesGastos();
      pagoHipoteca = informacionFinancieraBuilder.getPagoHipoteca();
      valorComercialVivienda = informacionFinancieraBuilder.getValorComercialVivienda();
      dondeVivir = informacionFinancieraBuilder.getDondeVivir();
      comprarVivienda = informacionFinancieraBuilder.getComprarVivienda();
      cupoExtraLibranza = informacionFinancieraBuilder.getCupoExtraLibranza();
      usoCredito = informacionFinancieraBuilder.getUsoCredito();
      razonOtros = informacionFinancieraBuilder.getRazonOtros();
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

    public String getCualesGastos() {
        return this.cualesGastos;
    }
}


