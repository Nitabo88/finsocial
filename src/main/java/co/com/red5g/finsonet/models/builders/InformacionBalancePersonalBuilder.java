package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionBalancePersonal;
import co.com.red5g.utils.Builder;

public class InformacionBalancePersonalBuilder implements Builder<InformacionBalancePersonal> {
    private String activosCorrientes;
    private String activosFijos;
    private String otrosActivos;
    private String razonOtrosActivos;
    private String pasivosFinancieros;
    private String pasivosCorrientes;
    private String otrosPasivos;
    private String razonOtrosPasivos;

    public InformacionBalancePersonalBuilder() {
      this.activosCorrientes = "";
      this.activosFijos = "";
      this.otrosActivos = "";
      this.razonOtrosActivos = "";
      this.pasivosFinancieros = "";
      this.pasivosCorrientes = "";
      this.otrosPasivos = "";
      this.razonOtrosPasivos = "";
    }

    public InformacionBalancePersonal persona() {
      this.conActivosCorrientes();
      this.conActivosFijos();
      this.conOtrosActivos();
      this.conRazonOtrosActivos();
      this.conPasivosFinancieros();
      this.conPasivosCorrientes();
      this.conOtrosPasivos();
      this.conRazonOtrosPasivos();
        return this.build();
    }

    private InformacionBalancePersonalBuilder conRazonOtrosPasivos() {
        this.razonOtrosPasivos = "Manuntencion";
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosPasivos() {
        this.otrosPasivos = "250000";
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosCorrientes() {
        this.pasivosCorrientes = "0";
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosFinancieros() {
        this.pasivosFinancieros = "15000000";
        return this;
    }

    private InformacionBalancePersonalBuilder conRazonOtrosActivos() {
        this.razonOtrosActivos = "Arriendos";
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosActivos() {
        this.otrosActivos = "800000";
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosFijos() {
        this.activosFijos = "48000000";
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosCorrientes() {
        this.activosCorrientes = "25000000";
        return this;
    }

    public static InformacionBalancePersonalBuilder la() {
        return new InformacionBalancePersonalBuilder();
    }

    @Override
    public InformacionBalancePersonal build() {
        return new InformacionBalancePersonal(this);
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