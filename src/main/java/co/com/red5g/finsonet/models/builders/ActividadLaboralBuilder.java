package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.ActividadLaboral;
import co.com.red5g.utils.Builder;

public class ActividadLaboralBuilder implements Builder<ActividadLaboral> {
    private String ocupacion;
    private String declaraRenta;
    private String impactoDecision;
    private String personaPublica;
    private String manejoRecursosPublicos;
    private String empresa;
    private String direccionTrabajo;
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

    private ActividadLaboralBuilder conActividadEconomica() {
        this.actividadEconomica = "OTRA";
        return this;
    }

    private ActividadLaboralBuilder conExtension() {
        this.extension = "0";
        return this;
    }

    private ActividadLaboralBuilder conTipoContrato() {
        this.tipoContrato = "INDEFINIDO";
        return this;
    }

    private ActividadLaboralBuilder conTipoEmpresa() {
        this.tipoEmpresa = "MIXTA";
        return this;
    }

    private ActividadLaboralBuilder conTelefonoTrabajo() {
        this.telefonoTrabajo = "2306060";
        return this;
    }

    private ActividadLaboralBuilder conCiudadTrabajo() {
        this.ciudadTrabajo = "BARRANQUILLA - ATLANTICO";
        return this;
    }

    private ActividadLaboralBuilder conDireccionTrabajo() {
        this.direccionTrabajo = "BRR CALASANZ";
        return this;
    }

    private ActividadLaboralBuilder conFechaVinculacion() {
        this.fechaVinculacion = "2018-Mar-5";
        return this;
    }

    private ActividadLaboralBuilder conCargo() {
        this.cargo = "Profesor";
        return this;
    }

    private ActividadLaboralBuilder conEmpresa() {
        this.empresa = "COLPENSIONES";
        return this;
    }

    private ActividadLaboralBuilder conManejoRecursosPublicos() {
        this.manejoRecursosPublicos = "NO";
        return this;
    }

    private ActividadLaboralBuilder conPersonaPublica() {
        this.personaPublica = "NO";
        return this;
    }

    private ActividadLaboralBuilder conImpactoDecision() {
        this.impactoDecision = "NO";
        return this;
    }

    private ActividadLaboralBuilder conDeclaracionRenta() {
        this.declaraRenta = "SI";
        return this;
    }

    private ActividadLaboralBuilder conOcupacion() {
        this.ocupacion = "Pensionado";
        return this;
    }

    public ActividadLaboral actividadLaboral() {
        this.conOcupacion();
        this.conDeclaracionRenta();
        this.conImpactoDecision();
        this.conPersonaPublica();
        this.conManejoRecursosPublicos();
        this.conEmpresa();
        this.conCargo();
        this.conFechaVinculacion();
        this.conDireccionTrabajo();
        this.conCiudadTrabajo();
        this.conTelefonoTrabajo();
        this.conExtension();
        this.conTipoEmpresa();
        this.conActividadEconomica();
        this.conTipoContrato();
        return this.build();
    }
}