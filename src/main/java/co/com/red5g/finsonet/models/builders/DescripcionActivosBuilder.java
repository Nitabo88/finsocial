package co.com.red5g.finsonet.models.builders;

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
      tipoInmueble = "";
      valorComercialInmueble = "";
      hipotecadoA = "";
      direccion = "";
      saldoCreditoInmueble = "";
      vehiculoClase = "";
      valorComercialVehiculo = "";
      marcaModelo = "";
      numeroPlaca = "";
      saldoCreditoVehiculo = "";
      prendaAFavor = "";
    }

    public static DescripcionActivosBuilder por() {
        return new DescripcionActivosBuilder();
    }

    @Override
    public DescripcionActivos build() {
        return new DescripcionActivos(this);
    }

    public String getTipoInmueble() {
        return this.tipoInmueble;
    }

    public String getValorComercialInmueble() {
        return this.valorComercialInmueble;
    }

    public String getHipotecadoA() {
        return this.hipotecadoA;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getSaldoCreditoInmueble() {
        return this.saldoCreditoInmueble;
    }

    public String getVehiculoClase() {
        return this.vehiculoClase;
    }

    public String getValorComercialVehiculo() {
        return this.valorComercialVehiculo;
    }

    public String getMarcaModelo() {
        return this.marcaModelo;
    }

    public String getNumeroPlaca() {
        return this.numeroPlaca;
    }

    public String getSaldoCreditoVehiculo() {
        return this.saldoCreditoVehiculo;
    }

    public String getPrendaAFavor() {
        return this.prendaAFavor;
    }

    public DescripcionActivos laPersona() {
      conTipoInmueble("Casa");
      conValorComercialInmueble("120000000");
      conHipotecadoA("Banco");
      conDireccion("CL 80 35 20");
      conSaldoCreditoInmueble("50000000");
      conVehiculoClase("Swift");
      conValorComercialVehiculo("51000000");
      conMarcaModelo("2018");
      conNumeroPlaca("EFY260");
      conSaldoCreditoVehiculo("38000000");
      conPrendaAFavor("No");
        return build();
    }

    private DescripcionActivosBuilder conPrendaAFavor(final String prendaAFavor) {
        this.prendaAFavor = prendaAFavor;
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoVehiculo(final String saldoCreditoVehiculo) {
        this.saldoCreditoVehiculo = saldoCreditoVehiculo;
        return this;
    }

    private DescripcionActivosBuilder conNumeroPlaca(final String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
        return this;
    }

    private DescripcionActivosBuilder conMarcaModelo(final String marcaModelo) {
        this.marcaModelo = marcaModelo;
        return this;
    }

    private DescripcionActivosBuilder conValorComercialVehiculo(final String valorComercialVehiculo) {
        this.valorComercialVehiculo = valorComercialVehiculo;
        return this;
    }

    private DescripcionActivosBuilder conVehiculoClase(final String vehiculoClase) {
        this.vehiculoClase = vehiculoClase;
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoInmueble(final String saldoCreditoInmueble) {
        this.saldoCreditoInmueble = saldoCreditoInmueble;
        return this;
    }

    private DescripcionActivosBuilder conDireccion(final String direccion) {
        this.direccion = direccion;
        return this;
    }

    private DescripcionActivosBuilder conHipotecadoA(final String hipotecadoA) {
        this.hipotecadoA = hipotecadoA;
        return this;
    }

    private DescripcionActivosBuilder conValorComercialInmueble(final String valorComercialInmueble) {
        this.valorComercialInmueble = valorComercialInmueble;
        return this;
    }

    private DescripcionActivosBuilder conTipoInmueble(final String tipoInmueble) {
        this.tipoInmueble = tipoInmueble;
        return this;
    }
}
