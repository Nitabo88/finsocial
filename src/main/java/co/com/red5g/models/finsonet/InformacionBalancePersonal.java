package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.InformacionBalancePersonalBuilder;

public class InformacionBalancePersonal {
    private final String activosCorrientes;
    private final String activosFijos;
    private final String otrosActivos;
    private final String razonOtrosActivos;
    private final String pasivosFinancieros;
    private final String pasivosCorrientes;
  private final String razonOtrosPasivos;

    public InformacionBalancePersonal(InformacionBalancePersonalBuilder informacionBalancePersonalBuilder) {
      this.activosCorrientes = informacionBalancePersonalBuilder.getActivosCorrientes();
      this.activosFijos = informacionBalancePersonalBuilder.getActivosFijos();
      this.otrosActivos = informacionBalancePersonalBuilder.getOtrosActivos();
      this.razonOtrosActivos = informacionBalancePersonalBuilder.getRazonOtrosActivos();
      this.pasivosFinancieros = informacionBalancePersonalBuilder.getPasivosFinancieros();
      this.pasivosCorrientes = informacionBalancePersonalBuilder.getPasivosCorrientes();
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

  public String getRazonOtrosPasivos() {
    return razonOtrosPasivos;
  }
}
