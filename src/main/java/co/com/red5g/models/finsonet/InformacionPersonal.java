package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.InformacionPersonalBuilder;

public class InformacionPersonal {
    private final String primerApellido;
    private final String segundoApellido;
    private final String primerNombre;
    private final String segundoNombre;
    private final String tipoDocumento;
    private final String numeroDocumento;
    private final String lugarExpedicion;
    private final String fechaExpedicion;
    private final String fechaNacimiento;
    private final String sexo;
    private final String lugarNacimiento;
    private final String estadoCivil;
    private final String ciudadDepartamento;
    private final String tipoVivienda;
    private final String estrato;
    private final String direccion;
    private final String barrio;
    private final String telefono;
    private final String celular;
    private final String correpondencia;
    private final String correoElectronico;
    private final String tiempoResidenciaAnios;
    private final String tiempoResidenciaMeses;
    private final String adultosCargo;
    private final String menoresCargo;
    private final String eps;
    private final String nivelEstudios;
    private final String profesion;

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