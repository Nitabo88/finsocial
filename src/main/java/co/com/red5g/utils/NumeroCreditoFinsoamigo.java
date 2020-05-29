package co.com.red5g.utils;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("98891"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("98895"),
    APROBACION_CREDITO_RIESGO_50_IVA("98900"),
    APROBACION_CREDITO_RIESGO_150_IVA("98902"),
    TESORERIA("92178");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

