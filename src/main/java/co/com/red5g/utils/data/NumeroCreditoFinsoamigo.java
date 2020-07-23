package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("104098"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("104327"),
    APROBACION_CREDITO_RIESGO_50_IVA("104245"),
    APROBACION_CREDITO_RIESGO_150_IVA("104311"),
    APROBACION_CREDITO_RIESGO_50_FR("104319"),
    APROBACION_CREDITO_RIESGO_150_FR("104488");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

