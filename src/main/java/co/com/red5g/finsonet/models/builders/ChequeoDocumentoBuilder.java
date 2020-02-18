package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.utils.Builder;

public class ChequeoDocumentoBuilder  implements Builder<ChequeoDocumento> {
    private String puntajeCifin;
    private String aciertaDatacredito;
    private String seleccionMotivo;
    private String razonMotivo;

    private ChequeoDocumentoBuilder() {
      puntajeCifin = "";
      aciertaDatacredito = "";
      seleccionMotivo = "";
      razonMotivo = "";
    }

    public static ChequeoDocumentoBuilder con() {
        return new ChequeoDocumentoBuilder();
    }

    @Override
    public ChequeoDocumento build() {
        return new ChequeoDocumento(this);
    }

    public String getPuntajeCifin() {
        return this.puntajeCifin;
    }

    public String getAciertaDatacredito() {
        return this.aciertaDatacredito;
    }

    public ChequeoDocumento centralesDeRiesgo(){
      conPuntajeCifin("660");
      conAciertaDatacredito("880");
        return build();

    }

    private ChequeoDocumentoBuilder conAciertaDatacredito(final String puntajeCifin) {
        this.puntajeCifin = puntajeCifin;
        return this;
    }

    private ChequeoDocumentoBuilder conPuntajeCifin(final String aciertaDatacredito) {
        this.aciertaDatacredito = aciertaDatacredito;
        return this;
    }

    public ChequeoDocumento motivo() {
      conSeleccionMotivo("Datos incompleto");
      conRazonMotivo("El usuario tiene los documentos incompletos");
        return build();
    }

    private ChequeoDocumentoBuilder conRazonMotivo(final String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    private ChequeoDocumentoBuilder conSeleccionMotivo(final String seleccionMotivo) {
        this.seleccionMotivo = seleccionMotivo;
        return this;
    }

    public String getSeleccionMotivo() {
        return this.seleccionMotivo;
    }

    public String getRazonMotivo() {
        return this.razonMotivo;
    }
}
