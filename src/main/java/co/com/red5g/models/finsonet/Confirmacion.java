package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.ConfirmacionBuilder;

public class Confirmacion {

    private final String razonMotivo;
    private final String accion;
    private final String motivo;

    public Confirmacion(ConfirmacionBuilder confirmacionBuilder) {
      this.accion = confirmacionBuilder.getAccion();
      this.razonMotivo = confirmacionBuilder.getRazonMotivo();
      this.motivo = confirmacionBuilder.getMotivo();
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