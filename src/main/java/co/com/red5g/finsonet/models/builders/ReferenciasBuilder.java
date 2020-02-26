package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.Referencias;
import co.com.red5g.finsonet.utils.Builder;

public class ReferenciasBuilder implements Builder<Referencias> {
    private String nombreCompletoReferencia;
    private String parentescoReferencia;
    private String telefonoFijoReferencia;
    private String ciudadReferencia;
    private String celularReferencia;
    private String direccionReferencia;
    private String nombreEntidadFinanciera;
    private String sucursal;
    private String tipoProducto;

    public ReferenciasBuilder() {
      nombreCompletoReferencia = "";
      parentescoReferencia = "";
      telefonoFijoReferencia = "";
      ciudadReferencia = "";
      celularReferencia = "";
      direccionReferencia = "";
      nombreEntidadFinanciera = "";
      sucursal = "";
      tipoProducto = "";
    }

    public static ReferenciasBuilder es() {
        return new ReferenciasBuilder();
    }

    @Override
    public Referencias build() {
        return new Referencias(this);
    }

    public Referencias informacionReferenciaPersonal() {
      conNombreCompletoReferencia("Laura Mejia");
      conParentescoReferencia("Compañera del Trabajo");
      conTelefonoFijoReferencia("2505050");
      conCiudadReferencia("BARRANQUILLA");
      conCelularReferencia("3002809010");
      conDireccionReferencia("CL 99 35 90");
        return build();
    }

    private ReferenciasBuilder conDireccionReferencia(final String direccionReferencia) {
        this.direccionReferencia = direccionReferencia;
        return this;
    }

    private ReferenciasBuilder conCiudadReferencia(final String ciudadReferencia) {
        this.ciudadReferencia = ciudadReferencia;
        return this;
    }

    private ReferenciasBuilder conTelefonoFijoReferencia(final String telefonoFijoReferencia) {
        this.telefonoFijoReferencia = telefonoFijoReferencia;
        return this;
    }

    private ReferenciasBuilder conParentescoReferencia(final String parentescoReferencia) {
        this.parentescoReferencia = parentescoReferencia;
        return this;
    }

    private ReferenciasBuilder conNombreCompletoReferencia(final String nombreCompletoReferencia) {
        this.nombreCompletoReferencia = nombreCompletoReferencia;
        return this;
    }

    public Referencias informacionReferenciaFamiliar() {
      conNombreCompletoReferencia("Cristian Morales");
      conParentescoReferencia("Hermano");
      conTelefonoFijoReferencia("2606060");
      conCiudadReferencia("BARRANQUILLA");
      conCelularReferencia("3002005656");
      conDireccionReferencia("CR 99 90 90");
        return build();
    }

    private ReferenciasBuilder conCelularReferencia(final String celularReferencia) {
        this.celularReferencia = celularReferencia;
        return this;
    }

    public Referencias informacionReferenciaFinanciera() {
      conNombreEntidadFinanciera("BANCOMEVA");
      conSucursal("Cali");
      conTipoProducto("AHORROS");
        return build();
    }

    private ReferenciasBuilder conTipoProducto(final String tipoProducto) {
        this.tipoProducto = tipoProducto;
        return this;
    }

    private ReferenciasBuilder conSucursal(final String sucursal) {
        this.sucursal = sucursal;
        return this;
    }

    private ReferenciasBuilder conNombreEntidadFinanciera(final String nombreEntidadFinanciera) {
        this.nombreEntidadFinanciera = nombreEntidadFinanciera;
        return this;
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

    public String getCelularReferencia() {
        return this.celularReferencia;
    }
}
