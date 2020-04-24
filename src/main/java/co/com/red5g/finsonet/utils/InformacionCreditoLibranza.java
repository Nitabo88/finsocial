package co.com.red5g.finsonet.utils;

public enum InformacionCreditoLibranza {
    INFORMACION_FORMULARIO_LIBRANZA("19362753", "1300000", "48"),
    INFORMACION_CHEQUEO_LIBRANZA("7447352", "1200000", "48"),
    INFORMACION_CONFIRMACION_LIBRANZA("1129573950", "400000", "72"),
    INFORMACION_APROBACION_LIBRANZA("19186577", "80000", "60"),
    INFORMACION_INCORPORACION_LIBRANZA("12370816", "750000", "50"),
    INFORMACION_FORMALIZACION_LIBRANZA("7428152", "1300000", "60"),
    INFORMACION_TESORERIA_LIBRANZA("6615550", "580000", "57"),
    INFORMACION_CDAS_INCOMPLETO_LIBRANZA("30730756", "102000", "60"),
    INFORMACION_CDAS_COMPLETO_LIBRANZA("359982", "1050000", "55"),
    INFORMACION_LLAMADA_LIBRANZA("24313904", "97000", "48");


    private final String numeroDocumento;
    private final String valorCuota;
    private final String numeroCuotas;

    InformacionCreditoLibranza(String numeroDocumento, String valorCuota, String numeroCuotas) {
        this.numeroDocumento = numeroDocumento;
        this.valorCuota = valorCuota;
        this.numeroCuotas = numeroCuotas;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public String getValorCuota() {
        return this.valorCuota;
    }

    public String getNumeroCuotas() {
        return this.numeroCuotas;
    }
}
