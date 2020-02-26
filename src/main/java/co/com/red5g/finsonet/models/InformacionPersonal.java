package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionPersonalBuilder;

public class InformacionPersonal {
    private String primerApellido;
    private String segundoApellido;
    private String primerNombre;
    private String segundoNombre;
    private String tipoDocumento;
    private String numeroDocumento;
    private String lugarExpedicion;
    private String fechaExpedicion;
    private String fechaNacimiento;
    private String sexo;
    private String lugarNacimiento;
    private String estadoCivil;
    private String ciudadDepartamento;
    private String tipoVivienda;
    private String estrato;
    private String direccion;
    private String barrio;
    private String telefono;
    private String celular;
    private String correpondencia;
    private String correoElectronico;
    private String tiempoResidenciaAnios;
    private String tiempoResidenciaMeses;
    private String adultosCargo;
    private String menoresCargo;
    private String eps;
    private String nivelEstudios;
    private String profesion;

    public InformacionPersonal() {
    }

    public InformacionPersonal(final InformacionPersonalBuilder informacionPersonalBuilder) {
      primerApellido = informacionPersonalBuilder.getPrimerApellido();
      segundoApellido = informacionPersonalBuilder.getSegundoApellido();
      primerNombre = informacionPersonalBuilder.getPrimerNombre();
      segundoNombre = informacionPersonalBuilder.getSegundoNombre();
      tipoDocumento = informacionPersonalBuilder.getTipoDocumento();
      numeroDocumento = informacionPersonalBuilder.getNumeroDocumento();
      lugarExpedicion = informacionPersonalBuilder.getLugarExpedicion();
      fechaExpedicion = informacionPersonalBuilder.getFechaExpedicion();
      fechaNacimiento = informacionPersonalBuilder.getFechaNacimiento();
      sexo = informacionPersonalBuilder.getSexo();
      lugarNacimiento = informacionPersonalBuilder.getLugarNacimiento();
      estadoCivil = informacionPersonalBuilder.getEstadoCivil();
      ciudadDepartamento = informacionPersonalBuilder.getCiudadDepartamento();
      tipoVivienda = informacionPersonalBuilder.getTipoVivienda();
      estrato = informacionPersonalBuilder.getEstrato();
      direccion = informacionPersonalBuilder.getDireccion();
      barrio = informacionPersonalBuilder.getBarrio();
      telefono = informacionPersonalBuilder.getTelefono();
      celular = informacionPersonalBuilder.getCelular();
      correpondencia = informacionPersonalBuilder.getCorrepondencia();
      correoElectronico = informacionPersonalBuilder.getCorreoElectronico();
      tiempoResidenciaAnios = informacionPersonalBuilder.getTiempoResidenciaAnios();
      tiempoResidenciaMeses = informacionPersonalBuilder.getTiempoResidenciaMeses();
      adultosCargo = informacionPersonalBuilder.getAdultosCargo();
      menoresCargo = informacionPersonalBuilder.getMenoresCargo();
      eps = informacionPersonalBuilder.getEps();
      nivelEstudios = informacionPersonalBuilder.getNivelEstudios();
      profesion = informacionPersonalBuilder.getProfesion();
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public String getLugarExpedicion() {
        return this.lugarExpedicion;
    }

    public String getFechaExpedicion() {
        return this.fechaExpedicion;
    }

    public String getFechaNacimiento() {
        return this.fechaNacimiento;
    }

    public String getSexo() {
        return this.sexo;
    }

    public String getLugarNacimiento() {
        return this.lugarNacimiento;
    }

    public String getEstadoCivil() {
        return this.estadoCivil;
    }

    public String getCiudadDepartamento() {
        return this.ciudadDepartamento;
    }

    public String getTipoVivienda() {
        return this.tipoVivienda;
    }

    public String getEstrato() {
        return this.estrato;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public String getBarrio() {
        return this.barrio;
    }

    public String getTelefono() {
        return this.telefono;
    }

    public String getCelular() {
        return this.celular;
    }

    public String getTiempoResidenciaAnios() {
        return this.tiempoResidenciaAnios;
    }

    public String getTiempoResidenciaMeses() {
        return this.tiempoResidenciaMeses;
    }

    public String getAdultosCargo() {
        return this.adultosCargo;
    }

    public String getMenoresCargo() {
        return this.menoresCargo;
    }

    public String getNivelEstudios() {
        return this.nivelEstudios;
    }

    public String getProfesion() {
        return this.profesion;
    }

    public String getCorrepondencia() {
        return this.correpondencia;
    }

    public String getEps() {
        return this.eps;
    }
}