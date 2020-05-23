package co.com.red5g.utils;

public enum NumeroCreditoFinsoamigo {
    CHEQUEO_DOCUMENTO_EXITOSO("95122");

    private final String numeroCredito;

    NumeroCreditoFinsoamigo(String numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public String getNumeroCredito() {
        return numeroCredito;
    }
}

