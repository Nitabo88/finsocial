package co.com.red5g.finsonet.utils;

public enum InformacionCredito {
    INFORMACION_CREDITO ();

    private final String numeroDocumento;
    private final String valorCuota;
    private final String numerdoCuotas;

    InformacionCredito() {
        this.numeroDocumento = "10040048";
        this.valorCuota = "1200000";
        this.numerdoCuotas = "48";
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
