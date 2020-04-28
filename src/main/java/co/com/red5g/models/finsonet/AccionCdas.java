package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.AccionCdasBuilder;

public class AccionCdas {

    private final String seleccionarGestion;
    private final String detalleGestion;

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
