package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionConyugueBuilder;

public class InformacionConyugue {
    private final String lugarDondeTrabaja;
    private final String ocupacion;
    private final String dependenciaEconomica;
    private final String fechaIngreso;
    private final String cargoActual;
    private final String totalIngresos;
    private final String totalEgresos;

    public InformacionConyugue(final InformacionConyugueBuilder informacionConyugueBuilder) {
      lugarDondeTrabaja = informacionConyugueBuilder.getLugarDondeTrabaja();
      ocupacion = informacionConyugueBuilder.getOcupacion();
      dependenciaEconomica = informacionConyugueBuilder.getDependenciaEconomica();
      fechaIngreso = informacionConyugueBuilder.getFechaIngreso();
      cargoActual = informacionConyugueBuilder.getCargoActual();
      totalIngresos = informacionConyugueBuilder.getTotalIngresos();
      totalEgresos = informacionConyugueBuilder.getTotalEgresos();
    }

    public String getLugarDondeTrabaja() {
        return this.lugarDondeTrabaja;
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public String getDependenciaEconomica() {
        return this.dependenciaEconomica;
    }

    public String getFechaIngreso() {
        return this.fechaIngreso;
    }

    public String getCargoActual() {
        return this.cargoActual;
    }

    public String getTotalIngresos() {
        return this.totalIngresos;
    }

    public String getTotalEgresos() {
        return this.totalEgresos;
    }
}