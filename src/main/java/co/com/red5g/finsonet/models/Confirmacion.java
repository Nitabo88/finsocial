package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ConfirmacionBuilder;

public class Confirmacion {

    private String razonMotivo;

    public Confirmacion(ConfirmacionBuilder confirmacionBuilder) {
        this.razonMotivo = confirmacionBuilder.getRazonMotivo();
    }

    public String getRazonMotivo() {
        return razonMotivo;
    }

}
