package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.ActividadLaboralBuilder;

public class ActividadLaboral {
    private final String ocupacion;
    private final String declaraRenta;
    private final String impactoDecision;
    private final String personaPublica;
    private final String manejoRecursosPublicos;
    private final String empresa;
    private final String direccionTrabajo;
    private final String tipoEmpresa;
    private final String cargo;
    private final String ciudadTrabajo;
    private final String telefonoTrabajo;
    private final String actividadEconomica;
    private final String fechaVinculacion;
    private final String extension;
    private final String tipoContrato;

    public ActividadLaboral(ActividadLaboralBuilder actividadLaboralBuilder) {
      this.ocupacion = actividadLaboralBuilder.getOcupacion();
      this.declaraRenta = actividadLaboralBuilder.getDeclaraRenta();
      this.impactoDecision = actividadLaboralBuilder.getImpactoDecision();
      this.personaPublica = actividadLaboralBuilder.getPersonaPublica();
      this.manejoRecursosPublicos = actividadLaboralBuilder.getManejoRecursosPublicos();
      this.empresa = actividadLaboralBuilder.getEmpresa();
      this.direccionTrabajo = actividadLaboralBuilder.getDireccionTrabajo();
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
