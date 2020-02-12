package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.DescripcionActivosBuilder;

public class DescripcionActivos {
    private final String tipoInmueble;
    private final String valorComercialInmueble;
    private final String hipotecadoA;
    private final String direccion;
    private final String saldoCreditoInmueble;
    private final String vehiculoClase;
    private final String valorComercialVehiculo;
    private final String marcaModelo;
    private final String numeroPlaca;
    private final String saldoCreditoVehiculo;
    private final String prendaAFavor;


    public DescripcionActivos(final DescripcionActivosBuilder descripcionActivosBuilder) {
      tipoInmueble = descripcionActivosBuilder.getTipoInmueble();
      valorComercialInmueble = descripcionActivosBuilder.getValorComercialInmueble();
      hipotecadoA = descripcionActivosBuilder.getHipotecadoA();
      direccion = descripcionActivosBuilder.getDireccion();
      saldoCreditoInmueble = descripcionActivosBuilder.getSaldoCreditoInmueble();
      vehiculoClase = descripcionActivosBuilder.getVehiculoClase();
      valorComercialVehiculo = descripcionActivosBuilder.getValorComercialVehiculo();
      marcaModelo = descripcionActivosBuilder.getMarcaModelo();
      numeroPlaca = descripcionActivosBuilder.getNumeroPlaca();
      saldoCreditoVehiculo = descripcionActivosBuilder.getSaldoCreditoVehiculo();
      prendaAFavor = descripcionActivosBuilder.getPrendaAFavor();
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
}