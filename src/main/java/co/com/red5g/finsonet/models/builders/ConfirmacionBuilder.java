package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Confirmacion;
import co.com.red5g.finsonet.utils.Builder;

public class ConfirmacionBuilder implements Builder<Confirmacion> {

    private String razonMotivo;

    private ConfirmacionBuilder() {
      razonMotivo = "";
    }

    public static ConfirmacionBuilder con() {
        return new ConfirmacionBuilder();
    }

    @Override
    public Confirmacion build() {
        return new Confirmacion(this);
    }

    public Confirmacion motivo() {
      razonMotivo("El usuario tiene los documentos incompletos");
        return build();
    }

    private ConfirmacionBuilder razonMotivo(final String razonMotivo) {
        this.razonMotivo = razonMotivo;
        return this;
    }

    public String getRazonMotivo() {
        return this.razonMotivo;
    }
}
