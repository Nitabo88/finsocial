package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.AccionCdasBuilder;

public class AccionCdas {

    private String seleccionarGestion;
    private String detalleGestion;

    public AccionCdas(AccionCdasBuilder accionCdasBuilder) {
        this.seleccionarGestion = accionCdasBuilder.getSeleccionarGestion();
        this.detalleGestion = accionCdasBuilder.getDetalleGestion();
    }

    public String getSeleccionarGestion() {
        return seleccionarGestion;
    }

    public String getDetalleGestion() {
        return detalleGestion;
    }
}
