package co.com.red5g.utils.data;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("95399"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("98868"),
    APROBACION_CREDITO_RIESGO_50_IVA("98937"),
    APROBACION_CREDITO_RIESGO_150_IVA("98939"),
    NUMERO_CREDITO_FINSOAMIGO("95390");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

