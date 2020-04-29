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
        this.conDocumentoEquipoSatisfaccion("32630669");
        this.conDetalleEquipoSatisfaccion("Detalle de la nueva solicitud contact");
        this.conAsunto("SOLICITUD DE DETALLE DE CRÉDITO");
        this.conProtocolo("Envio detalle de credito");
        return this.build();
    }

    private EquipoSatisfaccionBuilder conDetalleEquipoSatisfaccion(String detalleEquipoSatisfaccion) {
        this.detalleEquipoSatisfaccion = detalleEquipoSatisfaccion;
        return this;
    }

    private EquipoSatisfaccionBuilder conDocumentoEquipoSatisfaccion(String documentoEquipoSatisfaccion) {
        this.documentoEquipoSatisfaccion = documentoEquipoSatisfaccion;
        return this;
    }

    private EquipoSatisfaccionBuilder conAsunto(String asunto) {
        this.asunto = asunto;
        return this;
    }

    private EquipoSatisfaccionBuilder conProtocolo(String protocolo) {
        this.protocolo = protocolo;
        return this;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getProtocolo() {
        return protocolo;
    }
}
