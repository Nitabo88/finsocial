package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder;

public class ChequeoDocumento {
    private final String puntajeCifin;
    private final String aciertaDatacredito;
    private final String seleccionMotivo;
    private final String razonMotivo;

    public ChequeoDocumento(final ChequeoDocumentoBuilder chequeoDocumentoBuilder) {
      puntajeCifin = chequeoDocumentoBuilder.getPuntajeCifin();
      aciertaDatacredito = chequeoDocumentoBuilder.getAciertaDatacredito();
      seleccionMotivo = chequeoDocumentoBuilder.getSeleccionMotivo();
      razonMotivo = chequeoDocumentoBuilder.getRazonMotivo();
    }

    public String getSeleccionMotivo() {
        return this.seleccionMotivo;
    }

    public String getRazonMotivo() {
        return this.razonMotivo;
    }

    public String getPuntajeCifin() {
        return this.puntajeCifin;
    }

    public String getAciertaDatacredito() {
        return this.aciertaDatacredito;
    }
}
