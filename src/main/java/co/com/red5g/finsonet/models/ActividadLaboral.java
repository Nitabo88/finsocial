package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.ActividadLaboralBuilder;

public class ActividadLaboral {
    private final String ocupacion;
    private final String declaraRenta;
    private final String impactoDecision;
    private final String personaPublica;
    private final String manejoRecursosPublicos;
    private final String empresa;
    private final String direccionTrabajo;
    private final String nit;
    private final String tipoEmpresa;
    private final String cargo;
    private final String ciudadTrabajo;
    private final String telefonoTrabajo;
    private final String actividadEconomica;
    private final String fechaVinculacion;
    private final String extension;
    private final String tipoContrato;

    public ActividadLaboral(final ActividadLaboralBuilder actividadLaboralBuilder) {
      ocupacion = actividadLaboralBuilder.getOcupacion();
      declaraRenta = actividadLaboralBuilder.getDeclaraRenta();
      impactoDecision = actividadLaboralBuilder.getImpactoDecision();
      personaPublica = actividadLaboralBuilder.getPersonaPublica();
      manejoRecursosPublicos = actividadLaboralBuilder.getManejoRecursosPublicos();
      empresa = actividadLaboralBuilder.getEmpresa();
      direccionTrabajo = actividadLaboralBuilder.getDireccionTrabajo();
      nit = actividadLaboralBuilder.getNit();
      tipoEmpresa = actividadLaboralBuilder.getTipoEmpresa();
      cargo = actividadLaboralBuilder.getCargo();
      ciudadTrabajo = actividadLaboralBuilder.getCiudadTrabajo();
      telefonoTrabajo = actividadLaboralBuilder.getTelefonoTrabajo();
      actividadEconomica = actividadLaboralBuilder.getActividadEconomica();
      fechaVinculacion = actividadLaboralBuilder.getFechaVinculacion();
      extension = actividadLaboralBuilder.getExtension();
      tipoContrato = actividadLaboralBuilder.getTipoContrato();
    }

    public String getOcupacion() {
        return this.ocupacion;
    }

    public String getDeclaraRenta() {
        return this.declaraRenta;
    }

    public String getImpactoDecision() {
        return this.impactoDecision;
    }

    public String getPersonaPublica() {
        return this.personaPublica;
    }

    public String getManejoRecursosPublicos() {
        return this.manejoRecursosPublicos;
    }

    public String getEmpresa() {
        return this.empresa;
    }

    public String getDireccionTrabajo() {
        return this.direccionTrabajo;
    }

    public String getNit() {
        return this.nit;
    }

    public String getTipoEmpresa() {
        return this.tipoEmpresa;
    }

    public String getCargo() {
        return this.cargo;
    }

    public String getCiudadTrabajo() {
        return this.ciudadTrabajo;
    }

    public String getTelefonoTrabajo() {
        return this.telefonoTrabajo;
    }

    public String getActividadEconomica() {
        return this.actividadEconomica;
    }

    public String getFechaVinculacion() {
        return this.fechaVinculacion;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getTipoContrato() {
        return this.tipoContrato;
    }
}
