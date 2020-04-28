package co.com.red5g.models.builders.finsonet;

import co.com.red5g.models.finsonet.InformacionConyugue;
import co.com.red5g.utils.Builder;

public class InformacionConyugueBuilder implements Builder<InformacionConyugue> {
    private String lugarDondeTrabaja;
    private String ocupacion;
    private String dependenciaEconomica;
    private String fechaIngreso;
    private String cargoActual;
    private String totalIngresos;
    private String totalEgresos;

    private InformacionConyugueBuilder() {
      this.lugarDondeTrabaja = "";
      this.ocupacion = "";
      this.dependenciaEconomica = "";
      this.fechaIngreso = "";
      this.cargoActual = "";
      this.totalIngresos = "";
      this.totalEgresos = "";
    }

    public static InformacionConyugueBuilder e() {
        return new InformacionConyugueBuilder();
    }

    @Override
    public InformacionConyugue build() {
        return new InformacionConyugue(this);
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

    public InformacionConyugue informacionLaboralConyugue() {
      this.conLugarDondeTrabaja();
      this.conOcupacion();
      this.conDependenciaEconomica();
      this.conFechaIngreso();
      this.conCargoActual();
      this.conTotalIngresos();
      this.conTotalEgresos();
        return this.build();
    }

    private InformacionConyugueBuilder conTotalEgresos() {
        this.totalEgresos = "1500000";
        return this;
    }

    private InformacionConyugueBuilder conTotalIngresos() {
        this.totalIngresos = "2000000";
        return this;
    }

    private InformacionConyugueBuilder conCargoActual() {
        this.cargoActual = "Sicologa";
        return this;
    }

    private InformacionConyugueBuilder conFechaIngreso() {
        this.fechaIngreso = "2018-May-2";
        return this;
    }

    private InformacionConyugueBuilder conDependenciaEconomica() {
        this.dependenciaEconomica = "NO";
        return this;
    }

    private InformacionConyugueBuilder conOcupacion() {
        this.ocupacion = "Empleado";
        return this;
    }

    private InformacionConyugueBuilder conLugarDondeTrabaja() {
        this.lugarDondeTrabaja = "Accenture";
        return this;
    }
}
