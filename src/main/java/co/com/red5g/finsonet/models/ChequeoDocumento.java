package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.ChequeoDocumentoBuilder;

public class ChequeoDocumento {
    private String puntajeCifin;
    private String aciertaDatacredito;
    private String seleccionMotivo;
    private String razonMotivo;

    public ChequeoDocumento(ChequeoDocumentoBuilder chequeoDocumentoBuilder) {
        this.puntajeCifin = chequeoDocumentoBuilder.getPuntajeCifin();
        this.aciertaDatacredito = chequeoDocumentoBuilder.getAciertaDatacredito();
        this.seleccionMotivo = chequeoDocumentoBuilder.getSeleccionMotivo();
        this.razonMotivo = chequeoDocumentoBuilder.getRazonMotivo();
    }

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

    public String getPuntajeCifin() {
        return puntajeCifin;
    }

    public String getAciertaDatacredito() {
        return aciertaDatacredito;
    }
}
