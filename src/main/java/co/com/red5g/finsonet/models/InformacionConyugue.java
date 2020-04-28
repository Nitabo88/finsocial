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

    public InformacionConyugue(InformacionConyugueBuilder informacionConyugueBuilder) {
      this.lugarDondeTrabaja = informacionConyugueBuilder.getLugarDondeTrabaja();
      this.ocupacion = informacionConyugueBuilder.getOcupacion();
      this.dependenciaEconomica = informacionConyugueBuilder.getDependenciaEconomica();
      this.fechaIngreso = informacionConyugueBuilder.getFechaIngreso();
      this.cargoActual = informacionConyugueBuilder.getCargoActual();
      this.totalIngresos = informacionConyugueBuilder.getTotalIngresos();
      this.totalEgresos = informacionConyugueBuilder.getTotalEgresos();
    }

    public String getLugarDondeTrabaja() {
        return lugarDondeTrabaja;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getDependenciaEconomica() {
        return dependenciaEconomica;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public String getCargoActual() {
        return cargoActual;
    }

    public String getTotalIngresos() {
        return totalIngresos;
    }

    public String getTotalEgresos() {
        return totalEgresos;
    }
}