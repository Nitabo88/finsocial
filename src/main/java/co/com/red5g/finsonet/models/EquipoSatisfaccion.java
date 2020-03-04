package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.EquipoSatisfaccionBuilder;

public class EquipoSatisfaccion {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;


    public EquipoSatisfaccion(EquipoSatisfaccionBuilder equipoSatisfaccionBuilder) {
        this.documentoEquipoSatisfaccion = equipoSatisfaccionBuilder.getDocumentoEquipoSatisfaccion();
        this.detalleEquipoSatisfaccion = equipoSatisfaccionBuilder.getDetalleEquipoSatisfaccion();
    }

    public String getDocumentoEquipoSatisfaccion() {
        return documentoEquipoSatisfaccion;
    }

    public String getDetalleEquipoSatisfaccion() {
        return detalleEquipoSatisfaccion;
    }
}
