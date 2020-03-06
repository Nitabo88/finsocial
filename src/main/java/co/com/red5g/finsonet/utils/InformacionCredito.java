package co.com.red5g.finsonet.utils;

public enum InformacionCredito {
    INFORMACION_CREDITO ("10000060" ,"1200000", "48");

    private final String numeroDocumento;
    private final String valorCuota;
    private final String numerdoCuotas;

    InformacionCredito(String numeroDocumento, String valorCuota, String numerdoCuotas) {
        this.numeroDocumento = numeroDocumento;
        this.valorCuota = valorCuota;
        this.numerdoCuotas = numerdoCuotas;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getValorCuota() {
        return valorCuota;
    }

    public String getNumeroCuotas() {
        return numerdoCuotas;
    }
}
