package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.DescripcionActivosBuilder;

public class DescripcionActivos {
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


    public DescripcionActivos(DescripcionActivosBuilder descripcionActivosBuilder) {
        this.tipoInmueble = descripcionActivosBuilder.getTipoInmueble();
        this.valorComercialInmueble = descripcionActivosBuilder.getValorComercialInmueble();
        this.hipotecadoA = descripcionActivosBuilder.getHipotecadoA();
        this.direccion = descripcionActivosBuilder.getDireccion();
        this.saldoCreditoInmueble = descripcionActivosBuilder.getSaldoCreditoInmueble();
        this.vehiculoClase = descripcionActivosBuilder.getVehiculoClase();
        this.valorComercialVehiculo = descripcionActivosBuilder.getValorComercialVehiculo();
        this.marcaModelo = descripcionActivosBuilder.getMarcaModelo();
        this.numeroPlaca = descripcionActivosBuilder.getNumeroPlaca();
        this.saldoCreditoVehiculo = descripcionActivosBuilder.getSaldoCreditoVehiculo();
        this.prendaAFavor = descripcionActivosBuilder.getPrendaAFavor();
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
}