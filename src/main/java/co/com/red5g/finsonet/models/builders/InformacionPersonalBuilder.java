package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionPersonal;
import co.com.red5g.finsonet.utils.Builder;

public final class InformacionPersonalBuilder implements Builder<InformacionPersonal> {
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

    private InformacionPersonalBuilder() {
      this.primerApellido = "";
      this.segundoApellido = "";
      this.primerNombre = "";
      this.segundoNombre = "";
      this.tipoDocumento = "";
      this.numeroDocumento = "";
      this.lugarExpedicion = "";
      this.fechaExpedicion = "";
      this.fechaNacimiento = "";
      this.sexo = "";
      this.lugarNacimiento = "";
      this.estadoCivil = "";
      this.ciudadDepartamento = "";
      this.tipoVivienda = "";
      this.estrato = "";
      this.direccion = "";
      this.barrio = "";
      this.telefono = "";
      this.celular = "";
      this.correpondencia = "";
      this.correoElectronico = "";
      this.tiempoResidenciaAnios = "";
      this.tiempoResidenciaMeses = "";
      this.adultosCargo = "";
      this.menoresCargo = "";
      this.eps = "";
      this.nivelEstudios = "";
      this.profesion = "";
    }

    @Override
    public InformacionPersonal build() {
        return new InformacionPersonal(this);
    }

    public static InformacionPersonalBuilder cualEs() {
        return new InformacionPersonalBuilder();
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

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
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

    public String getCorrepondencia() {
        return correpondencia;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
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

    public String getEps() {
        return eps;
    }

    public InformacionPersonal informacionPersonalConyugue(){
      this.conPrimerApellido("Cardona");
      this.conSegundoApellido("Lopez");
      this.conPrimerNombre("Andres");
      this.conSegundoNombre("Juan");
      this.conTipoDocumento();
      this.conNumeroDocumento("10101020");
      this.conFechaExpedicion("1999-Jan-28");
      this.conLugarExpedicion("ARENAL - BOLIVAR");
      this.conFechaNacimiento("1900-Dec-25");
      this.conLugarNacimiento("ARENAL - BOLIVAR");
      this.conSexo("M");
      this.conEps();
      this.conNivelEstudios();
      this.conCelular("3005656231");
        return this.build();
    }

    public InformacionPersonal informacionPersonal() {
      this.conPrimerApellido("Morales");
      this.conSegundoApellido("Carmona");
      this.conPrimerNombre("Maria");
      this.conSegundoNombre("Jose");
      this.conTipoDocumento();
      this.conNumeroDocumento("10000060");
      this.conLugarExpedicion("BOLIVAR - ANTIOQUIA");
      this.conFechaExpedicion("2002-Mar-1");
      this.conFechaNacimiento("1990-Mar-1");
      this.conSexo("Femenino");
      this.conLugarNacimiento("AMAGA - ANTIOQUIA");
      this.conEstadoCivil();
      this.conCiudadDepartamento();
      this.conTipoVivienda();
      this.conEstrato();
      this.conDireccion();
      this.conBarrio();
      this.conTelefono();
      this.conCelular("3002002020");
      this.conCorreoElectronico();
      this.conCorrespondencia();
      this.conTiempoResidenciaAnios();
      this.conTiempoResidenciaMeses();
      this.conAdultosCargo();
      this.conMenoresCargo();
      this.conEps();
      this.conNivelEstudios();
      this.conProfesion();
        return this.build();
    }

    private InformacionPersonalBuilder conProfesion() {
        this.profesion = "ARQUITECTO";
        return this;
    }

    private InformacionPersonalBuilder conNivelEstudios() {
        this.nivelEstudios = "Universitario";
        return this;
    }

    private InformacionPersonalBuilder conEps() {
        this.eps = "Salud Total";
        return this;
    }

    private InformacionPersonalBuilder conMenoresCargo() {
        this.menoresCargo = "0";
        return this;
    }

    private InformacionPersonalBuilder conAdultosCargo() {
        this.adultosCargo = "0";
        return this;
    }

    private InformacionPersonalBuilder conTiempoResidenciaMeses() {
        this.tiempoResidenciaMeses = "2";
        return this;
    }

    private InformacionPersonalBuilder conTiempoResidenciaAnios() {
        this.tiempoResidenciaAnios = "5";
        return this;
    }

    private InformacionPersonalBuilder conCorrespondencia() {
        this.correpondencia = "E-mail";
        return this;
    }

    private InformacionPersonalBuilder conCorreoElectronico() {
        this.correoElectronico = "risetzu@gmail.com";
        return this;
    }

    private InformacionPersonalBuilder conCelular(String celular) {
        this.celular = celular;
        return this;
    }

    private InformacionPersonalBuilder conTelefono() {
        this.telefono = "2800000";
        return this;
    }

    private InformacionPersonalBuilder conBarrio() {
        this.barrio = "Estadio";
        return this;
    }

    private InformacionPersonalBuilder conDireccion() {
        this.direccion = "CL 80 35 20";
        return this;
    }

    private InformacionPersonalBuilder conEstrato() {
        this.estrato = "4";
        return this;
    }

    private InformacionPersonalBuilder conCiudadDepartamento() {
        this.ciudadDepartamento = "MEDELLIN - ANTIOQUIA";
        return this;
    }

    private InformacionPersonalBuilder conEstadoCivil() {
        this.estadoCivil = "UNIÓN LIBRE";
        return this;
    }

    private InformacionPersonalBuilder conLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
        return this;
    }

    private InformacionPersonalBuilder conTipoVivienda() {
        this.tipoVivienda = "Familiar";
        return this;
    }

    private InformacionPersonalBuilder conSexo(String sexo) {
        this.sexo = sexo;
        return this;
    }

    private InformacionPersonalBuilder conFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    private InformacionPersonalBuilder conFechaExpedicion(String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
        return this;
    }

    private InformacionPersonalBuilder conLugarExpedicion(String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
        return this;
    }

    private InformacionPersonalBuilder conNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    private InformacionPersonalBuilder conTipoDocumento() {
        this.tipoDocumento = "CC";
        return this;
    }

    private InformacionPersonalBuilder conSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
        return this;
    }

    private InformacionPersonalBuilder conPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
        return this;
    }

    private InformacionPersonalBuilder conSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
        return this;
    }

    private InformacionPersonalBuilder conPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
        return this;
    }
}