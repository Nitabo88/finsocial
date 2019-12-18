package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ReferenciasBuilder;

public class Referencias {
    private String nombreCompletoReferencia;
    private String parentescoReferencia;
    private String telefonoFijoReferencia;
    private String ciudadReferencia;
    private String celularReferencia;
    private String direccionReferencia;
    private String nombreEntidadFinanciera;
    private String sucursal;
    private String tipoProducto;

    public Referencias(ReferenciasBuilder referenciasBuilder) {
        this.nombreCompletoReferencia = referenciasBuilder.getNombreCompletoReferencia();
        this.parentescoReferencia = referenciasBuilder.getParentescoReferencia();
        this.telefonoFijoReferencia = referenciasBuilder.getTelefonoFijoReferencia();
        this.ciudadReferencia = referenciasBuilder.getCiudadReferencia();
        this.celularReferencia = referenciasBuilder.getCelularReferencia();
        this.direccionReferencia = referenciasBuilder.getDireccionReferencia();
        this.nombreEntidadFinanciera = referenciasBuilder.getNombreEntidadFinanciera();
        this.sucursal = referenciasBuilder.getSucursal();
        this.tipoProducto = referenciasBuilder.getTipoProducto();
    }

    public String getNombreCompletoReferencia() {
        return nombreCompletoReferencia;
    }

    public String getParentescoReferencia() {
        return parentescoReferencia;
    }

    public String getTelefonoFijoReferencia() {
        return telefonoFijoReferencia;
    }

    public String getCiudadReferencia() {
        return ciudadReferencia;
    }

    public String getDireccionReferencia() {
        return direccionReferencia;
    }

    public String getNombreEntidadFinanciera() {
        return nombreEntidadFinanciera;
    }

    public String getSucursal() {
        return sucursal;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public String getCelularReferencia() {
        return celularReferencia;
    }
}