package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.utils.Builder;

public class ConfirmacionBuilder implements Builder<Confirmacion> {

    private String razonMotivo;

    private ConfirmacionBuilder() {
        this.razonMotivo = "";
    }

    public static ConfirmacionBuilder con() {
        return new ConfirmacionBuilder();
    }

    @Override
    public Confirmacion build() {
        return new Confirmacion(this);
    }

    public Confirmacion motivo() {
        this.razonMotivo("El usuario tiene los documentos incompletos");
        return this.build();
    }

    private ConfirmacionBuilder razonMotivo(String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }
}
