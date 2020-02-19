package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ConfirmacionBuilder;

public class Confirmacion {

    private final String razonMotivo;

    public Confirmacion(final ConfirmacionBuilder confirmacionBuilder) {
      razonMotivo = confirmacionBuilder.getRazonMotivo();
    }

    public String getRazonMotivo() {
        return this.razonMotivo;
    }

}
