package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ReferenciasBuilder;

public class Referencias {
    private final String nombreCompletoReferencia;
    private final String parentescoReferencia;
    private final String telefonoFijoReferencia;
    private final String ciudadReferencia;
    private final String celularReferencia;
    private final String direccionReferencia;
    private final String nombreEntidadFinanciera;
    private final String sucursal;
    private final String tipoProducto;

    public Referencias(final ReferenciasBuilder referenciasBuilder) {
      nombreCompletoReferencia = referenciasBuilder.getNombreCompletoReferencia();
      parentescoReferencia = referenciasBuilder.getParentescoReferencia();
      telefonoFijoReferencia = referenciasBuilder.getTelefonoFijoReferencia();
      ciudadReferencia = referenciasBuilder.getCiudadReferencia();
      celularReferencia = referenciasBuilder.getCelularReferencia();
      direccionReferencia = referenciasBuilder.getDireccionReferencia();
      nombreEntidadFinanciera = referenciasBuilder.getNombreEntidadFinanciera();
      sucursal = referenciasBuilder.getSucursal();
      tipoProducto = referenciasBuilder.getTipoProducto();
    }

    public String getNombreCompletoReferencia() {
        return this.nombreCompletoReferencia;
    }

    public String getParentescoReferencia() {
        return this.parentescoReferencia;
    }

    public String getTelefonoFijoReferencia() {
        return this.telefonoFijoReferencia;
    }

    public String getCiudadReferencia() {
        return this.ciudadReferencia;
    }

    public String getDireccionReferencia() {
        return this.direccionReferencia;
    }

    public String getNombreEntidadFinanciera() {
        return this.nombreEntidadFinanciera;
    }

    public String getSucursal() {
        return this.sucursal;
    }

    public String getTipoProducto() {
        return this.tipoProducto;
    }

    public String getCelularReferencia() {
        return this.celularReferencia;
    }
}