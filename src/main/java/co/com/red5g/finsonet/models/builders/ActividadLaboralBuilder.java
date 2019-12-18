package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ActividadLaboral;
import co.com.red5g.finsonet.utils.Builder;

public class ActividadLaboralBuilder implements Builder<ActividadLaboral> {
    private String ocupacion;
    private String declaraRenta;
    private String impactoDecision;
    private String personaPublica;
    private String manejoRecursosPublicos;
    private String empresa;
    private String direccionTrabajo;
    private String nit;
    private String tipoEmpresa;
    private String cargo;
    private String ciudadTrabajo;
    private String telefonoTrabajo;
    private String actividadEconomica;
    private String fechaVinculacion;
    private String extension;
    private String tipoContrato;

    private ActividadLaboralBuilder() {
        this.impactoDecision = "";
        this.ocupacion = "";
        this.declaraRenta = "";
        this.personaPublica = "";
        this.manejoRecursosPublicos = "";
        this.empresa = "";
        this.direccionTrabajo = "";
        this.nit = "";
        this.tipoEmpresa = "";
        this.cargo = "";
        this.ciudadTrabajo = "";
        this.telefonoTrabajo = "";
        this.actividadEconomica = "";
        this.fechaVinculacion = "";
        this.extension = "";
        this.tipoContrato = "";
    }

    @Override
    public ActividadLaboral build() {
        return new ActividadLaboral(this);
    }

    public static ActividadLaboralBuilder es() {
        return new ActividadLaboralBuilder();
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public String getDeclaraRenta() {
        return declaraRenta;
    }

    public String getImpactoDecision() {
        return impactoDecision;
    }

    public String getPersonaPublica() {
        return personaPublica;
    }

    public String getManejoRecursosPublicos() {
        return manejoRecursosPublicos;
    }

    public String getEmpresa() {
        return empresa;
    }

    public String getDireccionTrabajo() {
        return direccionTrabajo;
    }

    public String getNit() {
        return nit;
    }

    public String getTipoEmpresa() {
        return tipoEmpresa;
    }

    public String getCargo() {
        return cargo;
    }

    public String getCiudadTrabajo() {
        return ciudadTrabajo;
    }

    public String getTelefonoTrabajo() {
        return telefonoTrabajo;
    }

    public String getActividadEconomica() {
        return actividadEconomica;
    }

    public String getFechaVinculacion() {
        return fechaVinculacion;
    }

    public String getExtension() {
        return extension;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public ActividadLaboral actividadLaboral() {
        this.conOcupacion("Pensionado");
        this.conDeclaracionRenta("SI");
        this.conImpactoDecision("NO");
        this.conPersonaPublica("NO");
        this.conManejoRecursosPublicos("NO");
        this.conEmpresa("COLPENSIONES");
        this.conCargo("Profesor");
        this.conFechaVinculacion("2018-Mar-5");
        this.conDireccionTrabajo("BRR CALASANZ");
        this.conCiudadTrabajo("BARRANQUILLA - ATLANTICO");
        this.conNit("900336604-7");
        this.conTelefonoTrabajo("2306060");
        this.conExtension("0");
        this.conTipoEmpresa("MIXTA");
        this.conActividadEconomica("OTRA");
        this.conTipoContrato("INDEFINIDO");
        return this.build();
    }

    private ActividadLaboralBuilder conActividadEconomica(String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
        return this;
    }

    private ActividadLaboralBuilder conExtension(String extension) {
        this.extension = extension;
        return this;
    }

    private ActividadLaboralBuilder conTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
        return this;
    }

    private ActividadLaboralBuilder conTipoEmpresa(String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
        return this;
    }

    private ActividadLaboralBuilder conTelefonoTrabajo(String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conNit(String nit) {
        this.nit = nit;
        return this;
    }

    private ActividadLaboralBuilder conCiudadTrabajo(String ciudadTrabajo) {
        this.ciudadTrabajo = ciudadTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conDireccionTrabajo(String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conFechaVinculacion(String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
        return this;
    }

    private ActividadLaboralBuilder conCargo(String cargo) {
        this.cargo = cargo;
        return this;
    }

    private ActividadLaboralBuilder conEmpresa(String empresa) {
        this.empresa = empresa;
        return this;
    }

    private ActividadLaboralBuilder conManejoRecursosPublicos(String manejoRecursosPublicos) {
        this.manejoRecursosPublicos = manejoRecursosPublicos;
        return this;
    }

    private ActividadLaboralBuilder conPersonaPublica(String personaPublica) {
        this.personaPublica = personaPublica;
        return this;
    }

    private ActividadLaboralBuilder conImpactoDecision(String impactoDecision) {
        this.impactoDecision = impactoDecision;
        return this;
    }

    private ActividadLaboralBuilder conDeclaracionRenta(String declaraRenta) {
        this.declaraRenta = declaraRenta;
        return this;
    }

    private ActividadLaboralBuilder conOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
        return this;
    }
}