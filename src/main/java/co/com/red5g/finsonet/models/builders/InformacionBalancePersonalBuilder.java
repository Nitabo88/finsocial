package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionBalancePersonal;
import co.com.red5g.finsonet.utils.Builder;

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
      this.conActivosCorrientes("25000000");
      this.conActivosFijos("48000000");
      this.conOtrosActivos("800000");
      this.conRazonOtrosActivos("Arriendos");
      this.conPasivosFinancieros("15000000");
      this.conPasivosCorrientes("0");
      this.conOtrosPasivos("250000");
      this.conRazonOtrosPasivos("Manuntencion");
        return this.build();
    }

    private InformacionBalancePersonalBuilder conRazonOtrosPasivos(String razonOtrosPasivos) {
        this.razonOtrosPasivos = razonOtrosPasivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosPasivos(String otrosPasivos) {
        this.otrosPasivos = otrosPasivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosCorrientes(String pasivosCorrientes) {
        this.pasivosCorrientes = pasivosCorrientes;
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosFinancieros(String pasivosFinancieros) {
        this.pasivosFinancieros = pasivosFinancieros;
        return this;
    }

    private InformacionBalancePersonalBuilder conRazonOtrosActivos(String razonOtrosActivos) {
        this.razonOtrosActivos = razonOtrosActivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosActivos(String otrosActivos) {
        this.otrosActivos = otrosActivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosFijos(String activosFijos) {
        this.activosFijos = activosFijos;
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosCorrientes(String activosCorrientes) {
        this.activosCorrientes = activosCorrientes;
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