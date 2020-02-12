package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionBalancePersonalBuilder;

public class InformacionBalancePersonal {
    private final String activosCorrientes;
    private final String activosFijos;
    private final String otrosActivos;
    private final String razonOtrosActivos;
    private final String pasivosFinancieros;
    private final String pasivosCorrientes;
    private final String otrosPasivos;
    private final String razonOtrosPasivos;

    public InformacionBalancePersonal(final InformacionBalancePersonalBuilder informacionBalancePersonalBuilder) {
      activosCorrientes = informacionBalancePersonalBuilder.getActivosCorrientes();
      activosFijos = informacionBalancePersonalBuilder.getActivosFijos();
      otrosActivos = informacionBalancePersonalBuilder.getOtrosActivos();
      razonOtrosActivos = informacionBalancePersonalBuilder.getRazonOtrosActivos();
      pasivosFinancieros = informacionBalancePersonalBuilder.getPasivosFinancieros();
      pasivosCorrientes = informacionBalancePersonalBuilder.getPasivosCorrientes();
      otrosPasivos = informacionBalancePersonalBuilder.getOtrosPasivos();
      razonOtrosPasivos = informacionBalancePersonalBuilder.getRazonOtrosPasivos();
    }

    public String getActivosCorrientes() {
        return this.activosCorrientes;
    }

    public String getActivosFijos() {
        return this.activosFijos;
    }

    public String getOtrosActivos() {
        return this.otrosActivos;
    }

    public String getRazonOtrosActivos() {
        return this.razonOtrosActivos;
    }

    public String getPasivosFinancieros() {
        return this.pasivosFinancieros;
    }

    public String getPasivosCorrientes() {
        return this.pasivosCorrientes;
    }

    public String getOtrosPasivos() {
        return this.otrosPasivos;
    }

    public String getRazonOtrosPasivos() {
        return this.razonOtrosPasivos;
    }
}
