package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.AprobacionCredito;
import co.com.red5g.finsonet.utils.Builder;

public class AprobacionCreditoBuilder implements Builder<AprobacionCredito> {

    private String seleccionMotivo;
    private String razonMotivo;
    private String perfilRiesgo;

    public String getSeleccionMotivo() {
        return seleccionMotivo;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

    public String getPerfilRiesgo() {
        return perfilRiesgo;
    }

    private AprobacionCreditoBuilder() {
        this.razonMotivo = "";
        this.seleccionMotivo = "";
        this.perfilRiesgo = "";
    }

    public static AprobacionCreditoBuilder con() {
        return new AprobacionCreditoBuilder();
    }

    @Override
    public AprobacionCredito build() {
        return new AprobacionCredito(this);
    }

    public AprobacionCredito motivoRegreso() {
        this.conRazonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }

    public AprobacionCredito motivoPendiente() {
        this.conSeleccionMotivo("Pendiente Certificaciones");
        this.conRazonMotivo("El usuario aun no entrega los certificados");
        return this.build();
    }

    public AprobacionCredito aprobacion() {
        this.conPerfilRiesgo("BRONCE");
        return this.build();
    }

    private AprobacionCreditoBuilder conRazonMotivo(String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    private AprobacionCreditoBuilder conSeleccionMotivo(String seleccionMotivo) {
        this.seleccionMotivo = seleccionMotivo;
        return this;
    }

    private AprobacionCreditoBuilder conPerfilRiesgo(String perfilRiesgo) {
        this.perfilRiesgo = perfilRiesgo;
        return this;
    }


}