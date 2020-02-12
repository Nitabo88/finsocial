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
      activosCorrientes = "";
      activosFijos = "";
      otrosActivos = "";
      razonOtrosActivos = "";
      pasivosFinancieros = "";
      pasivosCorrientes = "";
      otrosPasivos = "";
      razonOtrosPasivos = "";
    }

    public InformacionBalancePersonal persona() {
      conActivosCorrientes("25000000");
      conActivosFijos("48000000");
      conOtrosActivos("800000");
      conRazonOtrosActivos("Arriendos");
      conPasivosFinancieros("15000000");
      conPasivosCorrientes("0");
      conOtrosPasivos("250000");
      conRazonOtrosPasivos("Manuntencion");
        return build();
    }

    private InformacionBalancePersonalBuilder conRazonOtrosPasivos(final String razonOtrosPasivos) {
        this.razonOtrosPasivos = razonOtrosPasivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosPasivos(final String otrosPasivos) {
        this.otrosPasivos = otrosPasivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosCorrientes(final String pasivosCorrientes) {
        this.pasivosCorrientes = pasivosCorrientes;
        return this;
    }

    private InformacionBalancePersonalBuilder conPasivosFinancieros(final String pasivosFinancieros) {
        this.pasivosFinancieros = pasivosFinancieros;
        return this;
    }

    private InformacionBalancePersonalBuilder conRazonOtrosActivos(final String razonOtrosActivos) {
        this.razonOtrosActivos = razonOtrosActivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conOtrosActivos(final String otrosActivos) {
        this.otrosActivos = otrosActivos;
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosFijos(final String activosFijos) {
        this.activosFijos = activosFijos;
        return this;
    }

    private InformacionBalancePersonalBuilder conActivosCorrientes(final String activosCorrientes) {
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