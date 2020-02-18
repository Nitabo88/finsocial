package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder;

public class EquipoSatisfaccion {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;
    private String asuntoEquipoSatisfaccion;


    public EquipoSatisfaccion(EquipoSatisfaccionBuilder equipoSatisfaccionBuilder) {
        this.documentoEquipoSatisfaccion = equipoSatisfaccionBuilder.getDocumentoEquipoSatisfaccion();
        this.detalleEquipoSatisfaccion = equipoSatisfaccionBuilder.getDetalleEquipoSatisfaccion();
        this.asuntoEquipoSatisfaccion = equipoSatisfaccionBuilder.getAsuntoEquipoSatisfaccion();
    }

    public String getAsuntoEquipoSatisfaccion() {
        return asuntoEquipoSatisfaccion;
    }

    public String getDocumentoEquipoSatisfaccion() {
        return documentoEquipoSatisfaccion;
    }

    public String getDetalleEquipoSatisfaccion() {
        return detalleEquipoSatisfaccion;
    }
}
