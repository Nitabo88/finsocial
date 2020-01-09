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
        this.nombreCompletoReferencia = "";
        this.parentescoReferencia = "";
        this.telefonoFijoReferencia = "";
        this.ciudadReferencia = "";
        this.celularReferencia = "";
        this.direccionReferencia = "";
        this.nombreEntidadFinanciera = "";
        this.sucursal = "";
        this.tipoProducto = "";
    }

    public static ReferenciasBuilder es() {
        return new ReferenciasBuilder();
    }

    @Override
    public Referencias build() {
        return new Referencias(this);
    }

    public Referencias informacionReferenciaPersonal() {
        this.conNombreCompletoReferencia("Laura Mejia");
        this.conParentescoReferencia("Compañera del Trabajo");
        this.conTelefonoFijoReferencia("2505050");
        this.conCiudadReferencia("BARRANQUILLA");
        this.conCelularReferencia("3002809010");
        this.conDireccionReferencia("CL 99 35 90");
        return this.build();
    }

    private ReferenciasBuilder conDireccionReferencia(String direccionReferencia) {
        this.direccionReferencia = direccionReferencia;
        return this;
    }

    private ReferenciasBuilder conCiudadReferencia(String ciudadReferencia) {
        this.ciudadReferencia = ciudadReferencia;
        return this;
    }

    private ReferenciasBuilder conTelefonoFijoReferencia(String telefonoFijoReferencia) {
        this.telefonoFijoReferencia = telefonoFijoReferencia;
        return this;
    }

    private ReferenciasBuilder conParentescoReferencia(String parentescoReferencia) {
        this.parentescoReferencia = parentescoReferencia;
        return this;
    }

    private ReferenciasBuilder conNombreCompletoReferencia(String nombreCompletoReferencia) {
        this.nombreCompletoReferencia = nombreCompletoReferencia;
        return this;
    }

    public Referencias informacionReferenciaFamiliar() {
        this.conNombreCompletoReferencia("Cristian Morales");
        this.conParentescoReferencia("Hermano");
        this.conTelefonoFijoReferencia("2606060");
        this.conCiudadReferencia("BARRANQUILLA");
        this.conCelularReferencia("3002005656");
        this.conDireccionReferencia("CR 99 90 90");
        return this.build();
    }

    private ReferenciasBuilder conCelularReferencia(String celularReferencia) {
        this.celularReferencia = celularReferencia;
        return this;
    }

    public Referencias informacionReferenciaFinanciera() {
        this.conNombreEntidadFinanciera("BANCOMEVA");
        this.conSucursal("Cali");
        this.conTipoProducto("AHORROS");
        return this.build();
    }

    private ReferenciasBuilder conTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
        return this;
    }

    private ReferenciasBuilder conSucursal(String sucursal) {
        this.sucursal = sucursal;
        return this;
    }

    private ReferenciasBuilder conNombreEntidadFinanciera(String nombreEntidadFinanciera) {
        this.nombreEntidadFinanciera = nombreEntidadFinanciera;
        return this;
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

    public String getCelularReferencia() {
        return celularReferencia;
    }
}
