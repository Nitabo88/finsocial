package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.utils.Builder;

public class ChequeoDocumentoBuilder implements Builder<ChequeoDocumento> {

    private String puntajeCifin;
    private String aciertaDatacredito;
    private String seleccionMotivo;
    private String razonMotivo;
    private String papeleria;
    private String afianzado;
    private String codigoPapeleria;

    private ChequeoDocumentoBuilder() {
        this.puntajeCifin = "";
        this.aciertaDatacredito = "";
        this.seleccionMotivo = "";
        this.razonMotivo = "";
        this.papeleria = "";
        this.afianzado = "";
        this.codigoPapeleria = "";
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

    public ChequeoDocumento libranza() {
        this.conPuntajeCifin("900");
        this.conAciertaDatacredito("880");
        this.conPapeleria("Papelería Antigua");
        this.conAfianzado();
        this.conCodigoPapeleria();
        return this.build();
    }

    public ChequeoDocumento finsoamigo() {
        this.conPuntajeCifin("1000");
        this.conAciertaDatacredito("1000");
        this.conPapeleria("Papelería Nueva");
        return this.build();
    }

    public ChequeoDocumento huy() {
        this.conPuntajeCifin("900");
        this.conAciertaDatacredito("900");
        this.conPapeleria("Papelería Nueva");
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
      this.conSeleccionMotivo();
      this.conRazonMotivo();
        return this.build();
    }

    private ChequeoDocumentoBuilder conRazonMotivo() {
        this.razonMotivo = "El usuario tiene los documentos incompletos";
        return this;
    }

    private ChequeoDocumentoBuilder conSeleccionMotivo() {
        this.seleccionMotivo = "Datos incompleto";
        return this;
    }

    private ChequeoDocumentoBuilder conPapeleria(String papeleria) {
        this.papeleria = papeleria;
        return this;
    }

    private ChequeoDocumentoBuilder conAfianzado() {
        this.afianzado = "Coophumana";
        return this;
    }

    private ChequeoDocumentoBuilder conCodigoPapeleria() {
        this.codigoPapeleria = "No tiene";
        return this;
    }

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

    public String getPapeleria() {
        return papeleria;
    }

    public String getAfianzado() {
        return afianzado;
    }

    public String getCodigoPapeleria() {
        return codigoPapeleria;
    }
}
