package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.ChequeoDocumentoBuilder;

public class ChequeoDocumento {
    private String puntajeCifin;
    private String aciertaDatacredito;

    public ChequeoDocumento(ChequeoDocumentoBuilder chequeoDocumentoBuilder) {
        this.puntajeCifin = chequeoDocumentoBuilder.getPuntajeCifin();
        this.aciertaDatacredito = chequeoDocumentoBuilder.getAciertaDatacredito();
    }

    public String getPuntajeCifin() {
        return puntajeCifin;
    }

    public String getAciertaDatacredito() {
        return aciertaDatacredito;
    }
}
