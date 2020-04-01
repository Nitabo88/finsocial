package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ChequeoDocumentoBuilder;

public class ChequeoDocumento {

    private final String puntajeCifin;
    private final String aciertaDatacredito;
    private final String seleccionMotivo;
    private final String razonMotivo;
    private final String papeleria;
    private final String afianzado;

    public ChequeoDocumento(ChequeoDocumentoBuilder chequeoDocumentoBuilder) {
        this.puntajeCifin = chequeoDocumentoBuilder.getPuntajeCifin();
        this.aciertaDatacredito = chequeoDocumentoBuilder.getAciertaDatacredito();
        this.seleccionMotivo = chequeoDocumentoBuilder.getSeleccionMotivo();
        this.razonMotivo = chequeoDocumentoBuilder.getRazonMotivo();
        this.papeleria = chequeoDocumentoBuilder.getPapeleria();
        this.afianzado = chequeoDocumentoBuilder.getAfianzado();
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

    public String getPapeleria() {
        return papeleria;
    }

    public String getAfianzado() {
        return afianzado;
    }
}
