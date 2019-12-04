package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.utils.Builder;

public class ChequeoDocumentoBuilder  implements Builder<ChequeoDocumento> {
    private String puntajeCifin;
    private String aciertaDatacredito;

    public ChequeoDocumentoBuilder() {
        this.puntajeCifin = "";
        this.aciertaDatacredito = "";
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
}
