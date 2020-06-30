package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("101551"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("102454"),
    APROBACION_CREDITO_RIESGO_50_IVA("101890"),
    APROBACION_CREDITO_RIESGO_150_IVA("102473"),
    APROBACION_CREDITO_RIESGO_50_FR("102473"),
    APROBACION_CREDITO_RIESGO_150_FR("102473");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

