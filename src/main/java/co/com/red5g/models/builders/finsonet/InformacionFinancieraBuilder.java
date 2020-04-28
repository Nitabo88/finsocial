package co.com.red5g.models.builders.finsonet;

import co.com.red5g.models.finsonet.InformacionFinanciera;
import co.com.red5g.utils.Builder;

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
        this.conSalarioFijo();
        this.conSalarioVariableComisiones();
        this.conArrendamientoIngresos();
        this.conRendimientosFinancieros();
        this.conHonorarios();
        this.conOtrosIngresos();
        this.conCualesIngresos();
        this.conArriendosEgresos();
        this.conGastosPersonalesFamiliares();
        this.conPrestamosDiferentesFinsocial();
        this.conDeduccionesNomina();
        this.conTarjetasCredito();
        this.conOtrosGastos();
        this.conPagoHipoteca();
        this.conValorComercialVivienda();
        this.conDondeVivir();
        this.conComprarVivienda();
        this.conCupoExtraLibranza();
        this.conUsoCredito();
        return this.build();
    }

    private InformacionFinancieraBuilder conDondeVivir() {
        this.dondeVivir = "Bogota";
        return this;
    }

    private InformacionFinancieraBuilder conComprarVivienda() {
        this.comprarVivienda = "NO";
        return this;
    }

    private InformacionFinancieraBuilder conCupoExtraLibranza() {
        this.cupoExtraLibranza = "SI";
        return this;
    }

    private InformacionFinancieraBuilder conUsoCredito() {
        this.usoCredito = "Deudas";
        return this;
    }

    private InformacionFinancieraBuilder conPagoHipoteca() {
        this.pagoHipoteca = "SI";
        return this;
    }

    private InformacionFinancieraBuilder conValorComercialVivienda() {
        this.valorComercialVivienda = "120000000";
        return this;
    }

    private InformacionFinancieraBuilder conOtrosGastos() {
        this.otrosGastos = "0";
        return this;
    }

    private InformacionFinancieraBuilder conTarjetasCredito() {
        this.tarjetasCredito = "0";
        return this;
    }

    private InformacionFinancieraBuilder conDeduccionesNomina() {
        this.deduccionesNomina = "0";
        return this;
    }

    private InformacionFinancieraBuilder conPrestamosDiferentesFinsocial() {
        this.prestamosDiferentesFinsocial = "0";
        return this;
    }

    private InformacionFinancieraBuilder conGastosPersonalesFamiliares() {
        this.gastosPersonalesFamiliares = "1000000";
        return this;
    }

    private InformacionFinancieraBuilder conArriendosEgresos() {
        this.arriendosEgresos = "800000";
        return this;
    }

    private InformacionFinancieraBuilder conCualesIngresos() {
        this.cualesIngresos = "No aplica";
        return this;
    }

    private InformacionFinancieraBuilder conOtrosIngresos() {
        this.otrosIngresos = "0";
        return this;
    }

    private InformacionFinancieraBuilder conHonorarios() {
        this.honorarios = "0";
        return this;
    }

    private InformacionFinancieraBuilder conRendimientosFinancieros() {
        this.rendimientosFinancieros = "0";
        return this;
    }

    private InformacionFinancieraBuilder conArrendamientoIngresos() {
        this.arrendamientoIngresos = "500000";
        return this;
    }

    private InformacionFinancieraBuilder conSalarioVariableComisiones() {
        this.salarioVariableComisiones = "0";
        return this;
    }

    private InformacionFinancieraBuilder conSalarioFijo() {
        this.salarioFijo = "4500000";
        return this;
    }
}