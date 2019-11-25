package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.InformacionPersonalBuilder;

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

    public InformacionPersonal(InformacionPersonalBuilder informacionPersonalBuilder) {
        this.primerApellido = informacionPersonalBuilder.getPrimerApellido();
        this.segundoApellido = informacionPersonalBuilder.getSegundoApellido();
        this.primerNombre = informacionPersonalBuilder.getPrimerNombre();
        this.segundoNombre = informacionPersonalBuilder.getSegundoNombre();
        this.tipoDocumento = informacionPersonalBuilder.getTipoDocumento();
        this.numeroDocumento = informacionPersonalBuilder.getNumeroDocumento();
        this.lugarExpedicion = informacionPersonalBuilder.getLugarExpedicion();
        this.fechaExpedicion = informacionPersonalBuilder.getFechaExpedicion();
        this.fechaNacimiento = informacionPersonalBuilder.getFechaNacimiento();
        this.sexo = informacionPersonalBuilder.getSexo();
        this.lugarNacimiento = informacionPersonalBuilder.getLugarNacimiento();
        this.estadoCivil = informacionPersonalBuilder.getEstadoCivil();
        this.ciudadDepartamento = informacionPersonalBuilder.getCiudadDepartamento();
        this.tipoVivienda = informacionPersonalBuilder.getTipoVivienda();
        this.estrato = informacionPersonalBuilder.getEstrato();
        this.direccion = informacionPersonalBuilder.getDireccion();
        this.barrio = informacionPersonalBuilder.getBarrio();
        this.telefono = informacionPersonalBuilder.getTelefono();
        this.celular = informacionPersonalBuilder.getCelular();
        this.correpondencia = informacionPersonalBuilder.getCorrepondencia();
        this.correoElectronico = informacionPersonalBuilder.getCorreoElectronico();
        this.tiempoResidenciaAnios = informacionPersonalBuilder.getTiempoResidenciaAnios();
        this.tiempoResidenciaMeses = informacionPersonalBuilder.getTiempoResidenciaMeses();
        this.adultosCargo = informacionPersonalBuilder.getAdultosCargo();
        this.menoresCargo = informacionPersonalBuilder.getMenoresCargo();
        this.eps = informacionPersonalBuilder.getEps();
        this.nivelEstudios = informacionPersonalBuilder.getNivelEstudios();
        this.profesion = informacionPersonalBuilder.getProfesion();
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getSegundoNombre() {
        return segundoNombre;
    }

    public String getLugarExpedicion() {
        return lugarExpedicion;
    }

    public String getFechaExpedicion() {
        return fechaExpedicion;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public String getCiudadDepartamento() {
        return ciudadDepartamento;
    }

    public String getTipoVivienda() {
        return tipoVivienda;
    }

    public String getEstrato() {
        return estrato;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getTiempoResidenciaAnios() {
        return tiempoResidenciaAnios;
    }

    public String getTiempoResidenciaMeses() {
        return tiempoResidenciaMeses;
    }

    public String getAdultosCargo() {
        return adultosCargo;
    }

    public String getMenoresCargo() {
        return menoresCargo;
    }

    public String getNivelEstudios() {
        return nivelEstudios;
    }

    public String getProfesion() {
        return profesion;
    }

    public String getCorrepondencia() {
        return correpondencia;
    }

    public String getEps() {
        return eps;
    }
}