package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.utils.Builder;

public class ChequeoDocumentoBuilder implements Builder<ChequeoDocumento> {

    private static final String PAPELERIA_NUEVA = "Papelería Nueva";
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
        this.conPapeleria(PAPELERIA_NUEVA);
        return this.build();
    }

    public ChequeoDocumento finsoalivio() {
        this.conPuntajeCifin("950");
        this.conAciertaDatacredito("1200");
        this.conPapeleria(PAPELERIA_NUEVA);
        return this.build();
    }

    public ChequeoDocumento finsotienda() {
        this.conPuntajeCifin("1001");
        this.conAciertaDatacredito("300");
        this.conPapeleria(PAPELERIA_NUEVA);
        return this.build();
    }


    public ChequeoDocumento finsoproductivo() {
        this.conPuntajeCifin("1200");
        this.conAciertaDatacredito("1200");
        this.conPapeleria(PAPELERIA_NUEVA);
        return this.build();
    }

    public ChequeoDocumento libranzaDigital() {
        this.conPuntajeCifin("920");
        this.conAciertaDatacredito("920");
        this.conPapeleria(PAPELERIA_NUEVA);
        return this.build();
    }

    public ChequeoDocumento huy() {
        this.conPuntajeCifin("900");
        this.conAciertaDatacredito("900");
        this.conPapeleria(PAPELERIA_NUEVA);
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

    public ChequeoDocumento motivoLibranza() {
        this.conSeleccionMotivo("Datos incompleto");
        this.conRazonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }


    public ChequeoDocumento motivoCrediHuy() {
        this.conSeleccionMotivo("Certificaciones vencidas");
        this.conRazonMotivo("Se deben actualizar las certificaciones");
        return this.build();
    }

    public ChequeoDocumento motivoNegacionCrediHuy() {
        this.conPapeleria(PAPELERIA_NUEVA);
        this.conSeleccionMotivo("INCONSISTENCIA PAPELERIA");
        this.conRazonMotivo("Se deben revisar la papeleria");
        return this.build();
    }

    public ChequeoDocumento motivoNegacionCreditoLibranza() {
        this.conPapeleria("Papelería Antigua");
        this.conAfianzado();
        this.conSeleccionMotivo("CREDITO MAL RADICADO");
        this.conRazonMotivo("Se debe radicar de nuevo el credito");
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

    private ChequeoDocumentoBuilder conPapeleria(String papeleria) {
        this.papeleria = papeleria;
        return this;
    }

    private ChequeoDocumentoBuilder conAfianzado() {
        this.afianzado = "Coophumana";
        return this;
    }

    private ChequeoDocumentoBuilder conCodigoPapeleria() {
        this.codigoPapeleria = "L-191128";
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
