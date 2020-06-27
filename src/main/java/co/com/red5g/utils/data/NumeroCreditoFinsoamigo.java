package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("95399"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("101190"),
    APROBACION_CREDITO_RIESGO_50_IVA("101201"),
    APROBACION_CREDITO_RIESGO_150_IVA("101262");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

