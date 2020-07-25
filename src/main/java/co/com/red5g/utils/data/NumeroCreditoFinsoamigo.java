package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("104098"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("104573"),
    APROBACION_CREDITO_RIESGO_50_IVA("104498"),
    APROBACION_CREDITO_RIESGO_150_IVA("104638"),
    APROBACION_CREDITO_RIESGO_50_FR("104596"),
    APROBACION_CREDITO_RIESGO_150_FR("104614");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

