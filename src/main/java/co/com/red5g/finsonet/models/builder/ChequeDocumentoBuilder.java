package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.ChequeoDocumento;
import co.com.red5g.finsonet.utils.Builder;

public class ChequeDocumentoBuilder implements Builder<ChequeoDocumento> {
    private String seleccionMotivo;
    private String razonMotivo;

    public static ChequeDocumentoBuilder con() {
        return new ChequeDocumentoBuilder();
    }

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

    public ChequeoDocumento motivo() {
        this.conSeleccionMotivo("Datos incompleto");
        this.conRazonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }

    private ChequeDocumentoBuilder conRazonMotivo(String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    private ChequeDocumentoBuilder conSeleccionMotivo(String seleccionMotivo) {
        this.seleccionMotivo = seleccionMotivo;
        return this;
    }

    @Override
    public ChequeoDocumento build() {
        return new ChequeoDocumento(this);
    }
}