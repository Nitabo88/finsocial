package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("103242"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("103247"),
    APROBACION_CREDITO_RIESGO_50_IVA("103256"),
    APROBACION_CREDITO_RIESGO_150_IVA("103265"),
    APROBACION_CREDITO_RIESGO_50_FR("103275"),
    APROBACION_CREDITO_RIESGO_150_FR("103280");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

