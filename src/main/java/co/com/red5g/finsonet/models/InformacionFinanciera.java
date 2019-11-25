package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.InformacionFinancieraBuilder;

public class InformacionFinanciera {
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


