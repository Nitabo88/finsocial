package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.EquipoSatisfaccion;

public class EquipoSatisfaccionBuilder {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;
    private String asunto;
    private String protocolo;

    public EquipoSatisfaccionBuilder() {
        this.documentoEquipoSatisfaccion = "";
        this.detalleEquipoSatisfaccion = "";
        this.asunto = "";
        this.protocolo = "";
    }

    public static EquipoSatisfaccionBuilder aUn() {
        return new EquipoSatisfaccionBuilder();
    }

    public EquipoSatisfaccion build(){
        return  new EquipoSatisfaccion(this);
    }

    public String getDocumentoEquipoSatisfaccion() { return documentoEquipoSatisfaccion;    }

    public String getDetalleEquipoSatisfaccion() { return detalleEquipoSatisfaccion;    }

    public EquipoSatisfaccion cliente() {
        this.conDocumentoEquipoSatisfaccion();
        this.conDetalleEquipoSatisfaccion();
        this.conAsunto();
        this.conProtocolo();
        return this.build();
    }

    private EquipoSatisfaccionBuilder conDetalleEquipoSatisfaccion() {
        this.detalleEquipoSatisfaccion = "Detalle de la nueva solicitud contact";
        return this;
    }

    private EquipoSatisfaccionBuilder conDocumentoEquipoSatisfaccion() {
        this.documentoEquipoSatisfaccion = "32630669";
        return this;
    }

    private EquipoSatisfaccionBuilder conAsunto() {
        this.asunto = "SOLICITUD DE DETALLE DE CRÉDITO";
        return this;
    }

    private EquipoSatisfaccionBuilder conProtocolo() {
        this.protocolo = "Envio detalle de credito";
        return this;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getProtocolo() {
        return protocolo;
    }
}
