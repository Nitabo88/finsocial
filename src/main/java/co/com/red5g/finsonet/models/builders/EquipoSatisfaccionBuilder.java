package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.EquipoSatisfaccion;

public class EquipoSatisfaccionBuilder {
    private String documentoEquipoSatisfaccion;
    private String detalleEquipoSatisfaccion;
    private String asuntoEquipoSatisfaccion;

    public EquipoSatisfaccionBuilder() {
        this.documentoEquipoSatisfaccion = "";
        this.detalleEquipoSatisfaccion = "";
        this.asuntoEquipoSatisfaccion = "";
    }

    public static EquipoSatisfaccionBuilder a() {
        return new EquipoSatisfaccionBuilder();
    }

    public EquipoSatisfaccion build(){
        return  new EquipoSatisfaccion(this);
    }

    public String getDocumentoEquipoSatisfaccion() { return documentoEquipoSatisfaccion;    }

    public String getDetalleEquipoSatisfaccion() { return detalleEquipoSatisfaccion;    }

    public String getAsuntoEquipoSatisfaccion() { return asuntoEquipoSatisfaccion;    }

    public EquipoSatisfaccion unUsuario() {
        this.condocumentoEquipoSatisfaccion("10040048");
        this.condetalleEquipoSatisfaccion("Detalle de la nueva solicitud contact");
        this.conasuntoEquipoSatisfaccion("");
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

    private EquipoSatisfaccionBuilder conasuntoEquipoSatisfaccion(String asuntoEquipoSatisfaccion) {
        this.asuntoEquipoSatisfaccion = asuntoEquipoSatisfaccion;
        return this;
    }
}
