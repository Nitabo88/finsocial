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

    public InformacionFinanciera(InformacionFinancieraBuilder informacionFinancieraBuilder) {
      this.salarioFijo = informacionFinancieraBuilder.getSalarioFijo();
      this.salarioVariableComisiones = informacionFinancieraBuilder.getSalarioVariableComisiones();
      this.arrendamientoIngresos = informacionFinancieraBuilder.getArrendamientoIngresos();
      this.rendimientosFinancieros = informacionFinancieraBuilder.getRendimientosFinancieros();
      this.honorarios = informacionFinancieraBuilder.getHonorarios();
      this.otrosIngresos = informacionFinancieraBuilder.getOtrosIngresos();
      this.cualesIngresos = informacionFinancieraBuilder.getCualesIngresos();
      this.arriendosEgresos = informacionFinancieraBuilder.getArriendosEgresos();
      this.gastosPersonalesFamiliares = informacionFinancieraBuilder.getGastosPersonalesFamiliares();
      this.prestamosDiferentesFinsocial = informacionFinancieraBuilder.getPrestamosDiferentesFinsocial();
      this.deduccionesNomina = informacionFinancieraBuilder.getDeduccionesNomina();
      this.tarjetasCredito = informacionFinancieraBuilder.getTarjetasCredito();
      this.otrosGastos = informacionFinancieraBuilder.getOtrosGastos();
      this.cualesGastos = informacionFinancieraBuilder.getCualesGastos();
      this.pagoHipoteca = informacionFinancieraBuilder.getPagoHipoteca();
      this.valorComercialVivienda = informacionFinancieraBuilder.getValorComercialVivienda();
      this.dondeVivir = informacionFinancieraBuilder.getDondeVivir();
      this.comprarVivienda = informacionFinancieraBuilder.getComprarVivienda();
      this.cupoExtraLibranza = informacionFinancieraBuilder.getCupoExtraLibranza();
      this.usoCredito = informacionFinancieraBuilder.getUsoCredito();
      this.razonOtros = informacionFinancieraBuilder.getRazonOtros();
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

    public String getRazonOtros() {
        return razonOtros;
    }

    public String getCualesGastos() {
        return cualesGastos;
    }
}


