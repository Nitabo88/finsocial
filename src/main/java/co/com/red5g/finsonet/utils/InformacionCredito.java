package co.com.red5g.finsonet.utils;

public enum InformacionCredito {
    INFORMACION_CREDITO ("10040048" ,"1200000", "48");

    private final String numeroDocumento;
    private final String valorCuota;
    private final String numerdoCuotas;

    InformacionCredito(final String numeroDocumento, final String valorCuota, final String numerdoCuotas) {
        this.numeroDocumento = numeroDocumento;
        this.valorCuota = valorCuota;
        this.numerdoCuotas = numerdoCuotas;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public String getValorCuota() {
        return this.valorCuota;
    }

    public String getNumeroCuotas() {
        return this.numerdoCuotas;
    }
}
