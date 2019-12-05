package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.ChequeDocumentoBuilder;

public class ChequeoDocumento {
    private String seleccionMotivo;
    private String razonMotivo;

    public ChequeoDocumento(ChequeDocumentoBuilder chequeDocumentoBuilder) {
        this.seleccionMotivo = chequeDocumentoBuilder.getSeleccionMotivo();
        this.razonMotivo = chequeDocumentoBuilder.getRazonMotivo();
    }

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

}
