package co.com.red5g.finsonet.models.builder;

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
        this.conLugarDondeTrabaja("Accenture");
        this.conOcupacion("Empleado");
        this.conDependenciaEconomica("NO");
        this.conFechaIngreso("2018-May-2");
        this.conCargoActual("Sicologa");
        this.conTotalIngresos("2000000");
        this.conTotalEgresos("1500000");
        return this.build();
    }

    private InformacionConyugueBuilder conTotalEgresos(String totalEgresos) {
        this.totalEgresos = totalEgresos;
        return this;
    }

    private InformacionConyugueBuilder conTotalIngresos(String totalIngresos) {
        this.totalIngresos = totalIngresos;
        return this;
    }

    private InformacionConyugueBuilder conCargoActual(String cargoActual) {
        this.cargoActual = cargoActual;
        return this;
    }

    private InformacionConyugueBuilder conFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
        return this;
    }

    private InformacionConyugueBuilder conDependenciaEconomica(String dependenciaEconomica) {
        this.dependenciaEconomica = dependenciaEconomica;
        return this;
    }

    private InformacionConyugueBuilder conOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
        return this;
    }

    private InformacionConyugueBuilder conLugarDondeTrabaja(String lugarDondeTrabaja) {
        this.lugarDondeTrabaja = lugarDondeTrabaja;
        return this;
    }
}
