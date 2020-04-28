package co.com.red5g.models.builders.finsonet;

import co.com.red5g.models.finsonet.DescripcionActivos;
import co.com.red5g.utils.Builder;

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
      this.conTipoInmueble();
      this.conValorComercialInmueble();
      this.conHipotecadoA();
      this.conDireccion();
      this.conSaldoCreditoInmueble();
      this.conVehiculoClase();
      this.conValorComercialVehiculo();
      this.conMarcaModelo();
      this.conNumeroPlaca();
      this.conSaldoCreditoVehiculo();
      this.conPrendaAFavor();
        return this.build();
    }

    private DescripcionActivosBuilder conPrendaAFavor() {
        this.prendaAFavor = "No";
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoVehiculo() {
        this.saldoCreditoVehiculo = "38000000";
        return this;
    }

    private DescripcionActivosBuilder conNumeroPlaca() {
        this.numeroPlaca = "EFY260";
        return this;
    }

    private DescripcionActivosBuilder conMarcaModelo() {
        this.marcaModelo = "2018";
        return this;
    }

    private DescripcionActivosBuilder conValorComercialVehiculo() {
        this.valorComercialVehiculo = "51000000";
        return this;
    }

    private DescripcionActivosBuilder conVehiculoClase() {
        this.vehiculoClase = "Swift";
        return this;
    }

    private DescripcionActivosBuilder conSaldoCreditoInmueble() {
        this.saldoCreditoInmueble = "50000000";
        return this;
    }

    private DescripcionActivosBuilder conDireccion() {
        this.direccion = "CL 80 35 20";
        return this;
    }

    private DescripcionActivosBuilder conHipotecadoA() {
        this.hipotecadoA = "Banco";
        return this;
    }

    private DescripcionActivosBuilder conValorComercialInmueble() {
        this.valorComercialInmueble = "120000000";
        return this;
    }

    private DescripcionActivosBuilder conTipoInmueble() {
        this.tipoInmueble = "Casa";
        return this;
    }
}
