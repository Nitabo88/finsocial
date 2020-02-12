package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionConyugue;
import co.com.red5g.finsonet.utils.Builder;

public class InformacionConyugueBuilder implements Builder<InformacionConyugue> {
    private String lugarDondeTrabaja;
    private String ocupacion;
    private String dependenciaEconomica;
    private String fechaIngreso;
    private String cargoActual;
    private String totalIngresos;
    private String totalEgresos;

    private InformacionConyugueBuilder() {
      lugarDondeTrabaja = "";
      ocupacion = "";
      dependenciaEconomica = "";
      fechaIngreso = "";
      cargoActual = "";
      totalIngresos = "";
      totalEgresos = "";
    }

    public static InformacionConyugueBuilder e() {
        return new InformacionConyugueBuilder();
    }

    @Override
    public InformacionConyugue build() {
        return new InformacionConyugue(this);
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

    public InformacionConyugue informacionLaboralConyugue() {
      conLugarDondeTrabaja("Accenture");
      conOcupacion("Empleado");
      conDependenciaEconomica("NO");
      conFechaIngreso("2018-May-2");
      conCargoActual("Sicologa");
      conTotalIngresos("2000000");
      conTotalEgresos("1500000");
        return build();
    }

    private InformacionConyugueBuilder conTotalEgresos(final String totalEgresos) {
        this.totalEgresos = totalEgresos;
        return this;
    }

    private InformacionConyugueBuilder conTotalIngresos(final String totalIngresos) {
        this.totalIngresos = totalIngresos;
        return this;
    }

    private InformacionConyugueBuilder conCargoActual(final String cargoActual) {
        this.cargoActual = cargoActual;
        return this;
    }

    private InformacionConyugueBuilder conFechaIngreso(final String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return this;
    }

    private InformacionConyugueBuilder conDependenciaEconomica(final String dependenciaEconomica) {
        this.dependenciaEconomica = dependenciaEconomica;
        return this;
    }

    private InformacionConyugueBuilder conOcupacion(final String ocupacion) {
        this.ocupacion = ocupacion;
        return this;
    }

    private InformacionConyugueBuilder conLugarDondeTrabaja(final String lugarDondeTrabaja) {
        this.lugarDondeTrabaja = lugarDondeTrabaja;
        return this;
    }
}
