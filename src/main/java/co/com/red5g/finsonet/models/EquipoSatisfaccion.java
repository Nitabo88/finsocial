package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder;

public class EquipoSatisfaccion {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;
    private String asunto;
    private String protocolo;


    public EquipoSatisfaccion(EquipoSatisfaccionBuilder equipoSatisfaccionBuilder) {
        this.documentoEquipoSatisfaccion = equipoSatisfaccionBuilder.getDocumentoEquipoSatisfaccion();
        this.detalleEquipoSatisfaccion = equipoSatisfaccionBuilder.getDetalleEquipoSatisfaccion();
        this.asunto = equipoSatisfaccionBuilder.getAsunto();
        this.asunto = equipoSatisfaccionBuilder.getProtocolo();
    }

    public String getDocumentoEquipoSatisfaccion() {
        return documentoEquipoSatisfaccion;
    }

    public String getDetalleEquipoSatisfaccion() {
        return detalleEquipoSatisfaccion;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getProtocolo() {
        return protocolo;
    }
}
