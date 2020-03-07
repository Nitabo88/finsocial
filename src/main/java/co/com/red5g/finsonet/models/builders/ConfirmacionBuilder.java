package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.utils.Builder;

public final class ConfirmacionBuilder implements Builder<Confirmacion> {
    private String accion;
    private String razonMotivo;
    private String motivo;

    private ConfirmacionBuilder() {
        this.razonMotivo = "";
        this.accion = "";
        this.motivo = "";
    }

    public static ConfirmacionBuilder con() {
        return new ConfirmacionBuilder();
    }

    @Override
    public Confirmacion build() {
        return new Confirmacion(this);
    }

    public Confirmacion motivoRegreso() {
        this.accion("Regresar");
        this.razonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }

    public Confirmacion motivoPendiente() {
        this.accion("Pendiente");
        this.motivo("Datos incompletos");
        this.razonMotivo("Contactar al usuario por documentos pendientes");
        return this.build();
    }

    private ConfirmacionBuilder razonMotivo(String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    private ConfirmacionBuilder motivo(String motivo) {
        this.motivo = motivo;
        return this;
    }

    private ConfirmacionBuilder accion(String accion) {
        this.accion = accion;
        return this;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

    public String getAccion() {
        return accion;
    }

    public String getMotivo() {
        return motivo;
    }
}
