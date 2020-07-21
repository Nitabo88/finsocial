package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("104026"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("103540"),
    APROBACION_CREDITO_RIESGO_50_IVA("103662"),
    APROBACION_CREDITO_RIESGO_150_IVA("103809"),
    APROBACION_CREDITO_RIESGO_50_FR("103814"),
    APROBACION_CREDITO_RIESGO_150_FR("103819");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

