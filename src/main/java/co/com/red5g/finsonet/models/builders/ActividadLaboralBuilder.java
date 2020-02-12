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
      impactoDecision = "";
      ocupacion = "";
      declaraRenta = "";
      personaPublica = "";
      manejoRecursosPublicos = "";
      empresa = "";
      direccionTrabajo = "";
      nit = "";
      tipoEmpresa = "";
      cargo = "";
      ciudadTrabajo = "";
      telefonoTrabajo = "";
      actividadEconomica = "";
      fechaVinculacion = "";
      extension = "";
      tipoContrato = "";
    }

    @Override
    public ActividadLaboral build() {
        return new ActividadLaboral(this);
    }

    public static ActividadLaboralBuilder es() {
        return new ActividadLaboralBuilder();
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

    public ActividadLaboral actividadLaboral() {
      conOcupacion("Pensionado");
      conDeclaracionRenta("SI");
      conImpactoDecision("NO");
      conPersonaPublica("NO");
      conManejoRecursosPublicos("NO");
      conEmpresa("COLPENSIONES");
      conCargo("Profesor");
      conFechaVinculacion("2018-Mar-5");
      conDireccionTrabajo("BRR CALASANZ");
      conCiudadTrabajo("BARRANQUILLA - ATLANTICO");
      conNit("900336604-7");
      conTelefonoTrabajo("2306060");
      conExtension("0");
      conTipoEmpresa("MIXTA");
      conActividadEconomica("OTRA");
      conTipoContrato("INDEFINIDO");
        return build();
    }

    private ActividadLaboralBuilder conActividadEconomica(final String actividadEconomica) {
        this.actividadEconomica = actividadEconomica;
        return this;
    }

    private ActividadLaboralBuilder conExtension(final String extension) {
        this.extension = extension;
        return this;
    }

    private ActividadLaboralBuilder conTipoContrato(final String tipoContrato) {
        this.tipoContrato = tipoContrato;
        return this;
    }

    private ActividadLaboralBuilder conTipoEmpresa(final String tipoEmpresa) {
        this.tipoEmpresa = tipoEmpresa;
        return this;
    }

    private ActividadLaboralBuilder conTelefonoTrabajo(final String telefonoTrabajo) {
        this.telefonoTrabajo = telefonoTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conNit(final String nit) {
        this.nit = nit;
        return this;
    }

    private ActividadLaboralBuilder conCiudadTrabajo(final String ciudadTrabajo) {
        this.ciudadTrabajo = ciudadTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conDireccionTrabajo(final String direccionTrabajo) {
        this.direccionTrabajo = direccionTrabajo;
        return this;
    }

    private ActividadLaboralBuilder conFechaVinculacion(final String fechaVinculacion) {
        this.fechaVinculacion = fechaVinculacion;
        return this;
    }

    private ActividadLaboralBuilder conCargo(final String cargo) {
        this.cargo = cargo;
        return this;
    }

    private ActividadLaboralBuilder conEmpresa(final String empresa) {
        this.empresa = empresa;
        return this;
    }

    private ActividadLaboralBuilder conManejoRecursosPublicos(final String manejoRecursosPublicos) {
        this.manejoRecursosPublicos = manejoRecursosPublicos;
        return this;
    }

    private ActividadLaboralBuilder conPersonaPublica(final String personaPublica) {
        this.personaPublica = personaPublica;
        return this;
    }

    private ActividadLaboralBuilder conImpactoDecision(final String impactoDecision) {
        this.impactoDecision = impactoDecision;
        return this;
    }

    private ActividadLaboralBuilder conDeclaracionRenta(final String declaraRenta) {
        this.declaraRenta = declaraRenta;
        return this;
    }

    private ActividadLaboralBuilder conOcupacion(final String ocupacion) {
        this.ocupacion = ocupacion;
        return this;
    }
}