package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.ActividadLaboralBuilder;

public class ActividadLaboral {
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

    public ActividadLaboral(ActividadLaboralBuilder actividadLaboralBuilder) {
        this.ocupacion = actividadLaboralBuilder.getOcupacion();
        this.declaraRenta = actividadLaboralBuilder.getDeclaraRenta();
        this.impactoDecision = actividadLaboralBuilder.getImpactoDecision();
        this.personaPublica = actividadLaboralBuilder.getPersonaPublica();
        this.manejoRecursosPublicos = actividadLaboralBuilder.getManejoRecursosPublicos();
        this.empresa = actividadLaboralBuilder.getEmpresa();
        this.direccionTrabajo = actividadLaboralBuilder.getDireccionTrabajo();
        this.nit = actividadLaboralBuilder.getNit();
        this.tipoEmpresa = actividadLaboralBuilder.getTipoEmpresa();
        this.cargo = actividadLaboralBuilder.getCargo();
        this.ciudadTrabajo = actividadLaboralBuilder.getCiudadTrabajo();
        this.telefonoTrabajo = actividadLaboralBuilder.getTelefonoTrabajo();
        this.actividadEconomica = actividadLaboralBuilder.getActividadEconomica();
        this.fechaVinculacion = actividadLaboralBuilder.getFechaVinculacion();
        this.extension = actividadLaboralBuilder.getExtension();
        this.tipoContrato = actividadLaboralBuilder.getTipoContrato();
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
}
