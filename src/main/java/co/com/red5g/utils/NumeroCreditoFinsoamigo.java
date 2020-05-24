package co.com.red5g.utils;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("98781"),
    APROBACION_CREDITO_RIESGO_ESTANDAR("98905"),
    APROBACION_CREDITO_RIESGO_50_IVA("98908"),
    APROBACION_CREDITO_RIESGO_150_IVA("98919");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

