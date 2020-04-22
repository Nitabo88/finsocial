package co.com.red5g.finsonet.utils;

public enum InformacionCreditoHuy {
    INFORMACION_CREDITO_HUY("10000622", "40000000", "72"),
    INFORMACION_CHEQUEO_HUY("25765220", "25000000", "72"),
    INFORMACION_APROBACION_HUY("21101486", "10000000", "72"),
    INFORMACION_LLAMADA_HUY("40800155", "15000000", "72");


    private final String numeroDocumento;
    private final String valorCredito;
    private final String numeroCuotas;

    InformacionCreditoHuy(String numeroDocumento, String valorCredito, String numeroCuotas) {
        this.numeroDocumento = numeroDocumento;
        this.valorCredito = valorCredito;
        this.numeroCuotas = numeroCuotas;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public String getValorCredito() {
        return this.valorCredito;
    }

    public String getNumeroCuotas() {
        return this.numeroCuotas;
    }
}
