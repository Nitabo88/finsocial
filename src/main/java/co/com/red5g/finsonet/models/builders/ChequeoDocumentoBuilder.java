package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.utils.Builder;

public class ChequeoDocumentoBuilder  implements Builder<ChequeoDocumento> {
    private String puntajeCifin;
    private String aciertaDatacredito;
    private String seleccionMotivo;
    private String razonMotivo;

    private ChequeoDocumentoBuilder() {
        this.puntajeCifin = "";
        this.aciertaDatacredito = "";
        this.seleccionMotivo = "";
        this.razonMotivo = "";
    }

    public static ChequeoDocumentoBuilder con() {
        return new ChequeoDocumentoBuilder();
    }

    @Override
    public ChequeoDocumento build() {
        return new ChequeoDocumento(this);
    }

    public String getPuntajeCifin() {
        return puntajeCifin;
    }

    public String getAciertaDatacredito() {
        return aciertaDatacredito;
    }

    public ChequeoDocumento centralesDeRiesgo(){
        this.conPuntajeCifin ("660");
        this.conAciertaDatacredito ("880");
        return this.build();

    }

    private ChequeoDocumentoBuilder conAciertaDatacredito(String puntajeCifin) {
        this.puntajeCifin = puntajeCifin;
        return this;
    }

    private ChequeoDocumentoBuilder conPuntajeCifin(String aciertaDatacredito) {
        this.aciertaDatacredito = aciertaDatacredito;
        return this;
    }

    public ChequeoDocumento motivo() {
        this.conSeleccionMotivo("Datos incompleto");
        this.conRazonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }

    private ChequeoDocumentoBuilder conRazonMotivo(String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    private ChequeoDocumentoBuilder conSeleccionMotivo(String seleccionMotivo) {
        this.seleccionMotivo = seleccionMotivo;
        return this;
    }

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }
}
