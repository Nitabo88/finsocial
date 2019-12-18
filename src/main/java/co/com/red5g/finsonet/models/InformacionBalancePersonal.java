package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionBalancePersonalBuilder;

public class InformacionBalancePersonal {
    private String activosCorrientes;
    private String activosFijos;
    private String otrosActivos;
    private String razonOtrosActivos;
    private String pasivosFinancieros;
    private String pasivosCorrientes;
    private String otrosPasivos;
    private String razonOtrosPasivos;

    public InformacionBalancePersonal(InformacionBalancePersonalBuilder informacionBalancePersonalBuilder) {
        this.activosCorrientes = informacionBalancePersonalBuilder.getActivosCorrientes();
        this.activosFijos = informacionBalancePersonalBuilder.getActivosFijos();
        this.otrosActivos = informacionBalancePersonalBuilder.getOtrosActivos();
        this.razonOtrosActivos = informacionBalancePersonalBuilder.getRazonOtrosActivos();
        this.pasivosFinancieros = informacionBalancePersonalBuilder.getPasivosFinancieros();
        this.pasivosCorrientes = informacionBalancePersonalBuilder.getPasivosCorrientes();
        this.otrosPasivos = informacionBalancePersonalBuilder.getOtrosPasivos();
        this.razonOtrosPasivos = informacionBalancePersonalBuilder.getRazonOtrosPasivos();
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

    public String getRazonOtrosActivos() {
        return razonOtrosActivos;
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

    public String getRazonOtrosPasivos() {
        return razonOtrosPasivos;
    }
}
