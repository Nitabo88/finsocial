package co.com.red5g.utils.data;

public enum InformacionCreditoLibranza {
    INFORMACION_FORMULARIO_LIBRANZA("1129573950", "1300000", "75"),
    INFORMACION_CHEQUEO_LIBRANZA("7447352", "1200000", "80"),
    INFORMACION_CONFIRMACION_LIBRANZA("40035573", "400000", "75"),
    INFORMACION_APROBACION_LIBRANZA("6808119", "80000", "80"),
    INFORMACION_INCORPORACION_LIBRANZA("12370816", "750000", "75"),
    INFORMACION_FORMALIZACION_LIBRANZA("32658816", "1300000", "80"),
    INFORMACION_TESORERIA_LIBRANZA("4390231", "580000", "75"),
    INFORMACION_CDAS_INCOMPLETO_LIBRANZA("30730756", "102000", "80"),
    INFORMACION_CDAS_COMPLETO_LIBRANZA("359982", "1050000", "75"),
    INFORMACION_LLAMADA_LIBRANZA("49741623", "97000", "80");

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
