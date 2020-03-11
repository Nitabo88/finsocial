package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.AccionCdas;
import co.com.red5g.finsonet.utils.Builder;

public class AccionCdasBuilder implements Builder<AccionCdas> {

    private String seleccionarGestion;
    private String detalleGestion;

    public AccionCdasBuilder() {
        this.seleccionarGestion = "";
        this.detalleGestion = "";
    }

    public static AccionCdasBuilder con() {
        return new AccionCdasBuilder();
    }

    @Override
    public AccionCdas build() {
        return new AccionCdas(this);
    }

    public AccionCdas vistoBueno() {
        this.seleccionarGestion("Visto bueno");
        this.detalleGestion("Prueba visto bueno");
        return this.build();
    }

    public AccionCdas excepcion() {
        this.seleccionarGestion("Excepción");
        this.detalleGestion("Prueba Excepción");
        return this.build();
    }

    public AccionCdas incompleto() {
        this.seleccionarGestion("Incompleto");
        this.detalleGestion("Prueba Incompleto");
        return this.build();
    }

    private AccionCdasBuilder seleccionarGestion(String seleccionarGestion) {
        this.seleccionarGestion = seleccionarGestion;
        return this;
    }

    private AccionCdasBuilder detalleGestion(String detalleGestion) {
        this.detalleGestion = detalleGestion;
        return this;
    }


    public String getSeleccionarGestion() {
        return seleccionarGestion;
    }

    public String getDetalleGestion() {
        return detalleGestion;
    }
}
