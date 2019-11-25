package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.DescripcionActivos;
import co.com.red5g.finsonet.utils.Builder;

public class DescripcionActivosBuilder implements Builder<DescripcionActivos> {
    private String tipoInmueble;
    private String valorComercialInmueble;
    private String hipotecadoA;
    private String direccion;
    private String saldoCreditoInmueble;
    private String vehiculoClase;
    private String valorComercialVehiculo;
    private String marcaModelo;
    private String numeroPlaca;
    private String saldoCreditoVehiculo;
    private String prendaAFavor;

    public DescripcionActivosBuilder() {
        this.tipoInmueble = "";
        this.valorComercialInmueble = "";
        this.hipotecadoA = "";
        this.direccion = "";
        this.saldoCreditoInmueble = "";
        this.vehiculoClase = "";
        this.valorComercialVehiculo = "";
        this.marcaModelo = "";
        this.numeroPlaca = "";
        this.saldoCreditoVehiculo = "";
        this.prendaAFavor = "";
    }

    public static DescripcionActivosBuilder por() {
        return new DescripcionActivosBuilder();
    }

    @Override
    public DescripcionActivos build() {
        return new DescripcionActivos(this);
    }

    public String getTipoInmueble() {
        return tipoInmueble;
    }

    public String getValorComercialInmueble() {
        return valorComercialInmueble;
    }

    public String getHipotecadoA() {
        return hipotecadoA;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSaldoCreditoInmueble() {
        return saldoCreditoInmueble;
    }

    public String getVehiculoClase() {
        return vehiculoClase;
    }

    public String getValorComercialVehiculo() {
        return valorComercialVehiculo;
    }

    public String getMarcaModelo() {
        return marcaModelo;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public String getSaldoCreditoVehiculo() {
        return saldoCreditoVehiculo;
    }

    public String getPrendaAFavor() {
        return prendaAFavor;
    }

    public DescripcionActivos laPersona() {
        this.conTipoInmueble("Casa");
        this.conValorComercialInmueble("120000000");
        this.conHipotecadoA("Banco");
        this.conDireccion("CL 80 35 20");
        this.conSaldoCreditoInmueble("50000000");
        this.conVehiculoClase("Swift");
        this.conValorComercialVehiculo("51000000");
        this.conMarcaModelo("2018");
        this.conNumeroPlaca("EFY260");
        this.conSaldoCreditoVehiculo("38000000");
        this.conPrendaAFavor("No");
        return this.build();
    }

    private DescripcionActivosBuilder conPrendaAFavor(String prendaAFavor) {
        this.prendaAFavor = prendaAFavor;
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoVehiculo(String saldoCreditoVehiculo) {
        this.saldoCreditoVehiculo = saldoCreditoVehiculo;
        return this;
    }

    private DescripcionActivosBuilder conNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
        return this;
    }

    private DescripcionActivosBuilder conMarcaModelo(String marcaModelo) {
        this.marcaModelo = marcaModelo;
        return this;
    }

    private DescripcionActivosBuilder conValorComercialVehiculo(String valorComercialVehiculo) {
        this.valorComercialVehiculo = valorComercialVehiculo;
        return this;
    }

    private DescripcionActivosBuilder conVehiculoClase(String vehiculoClase) {
        this.vehiculoClase = vehiculoClase;
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoInmueble(String saldoCreditoInmueble) {
        this.saldoCreditoInmueble = saldoCreditoInmueble;
        return this;
    }

    private DescripcionActivosBuilder conDireccion(String direccion) {
        this.direccion = direccion;
        return this;
    }

    private DescripcionActivosBuilder conHipotecadoA(String hipotecadoA) {
        this.hipotecadoA = hipotecadoA;
        return this;
    }

    private DescripcionActivosBuilder conValorComercialInmueble(String valorComercialInmueble) {
        this.valorComercialInmueble = valorComercialInmueble;
        return this;
    }

    private DescripcionActivosBuilder conTipoInmueble(String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
        return this;
    }
}
