package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.EquipoSatisfaccion;

public class EquipoSatisfaccionBuilder {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;

    public EquipoSatisfaccionBuilder() {
        this.documentoEquipoSatisfaccion = "";
        this.detalleEquipoSatisfaccion = "";
    }

    public static EquipoSatisfaccionBuilder aUn() {
        return new EquipoSatisfaccionBuilder();
    }

    public EquipoSatisfaccion build(){
        return  new EquipoSatisfaccion(this);
    }

    public String getDocumentoEquipoSatisfaccion() { return documentoEquipoSatisfaccion;    }

    public String getDetalleEquipoSatisfaccion() { return detalleEquipoSatisfaccion;    }

    public EquipoSatisfaccion Cliente() {
        this.condocumentoEquipoSatisfaccion("10040048");
        this.condetalleEquipoSatisfaccion("Detalle de la nueva solicitud contact");
        return this.build();
    }

    private EquipoSatisfaccionBuilder condetalleEquipoSatisfaccion(String detalleEquipoSatisfaccion) {
        this.detalleEquipoSatisfaccion = detalleEquipoSatisfaccion;
        return this;
    }
    private EquipoSatisfaccionBuilder condocumentoEquipoSatisfaccion(String documentoEquipoSatisfaccion) {
        this.documentoEquipoSatisfaccion = documentoEquipoSatisfaccion;
        return this;
    }

}
