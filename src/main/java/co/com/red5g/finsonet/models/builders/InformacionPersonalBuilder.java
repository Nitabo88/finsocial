package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionPersonal;
import co.com.red5g.finsonet.utils.Builder;

public class InformacionPersonalBuilder implements Builder<InformacionPersonal> {
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
      primerApellido = "";
      segundoApellido = "";
      primerNombre = "";
      segundoNombre = "";
      tipoDocumento = "";
      numeroDocumento = "";
      lugarExpedicion = "";
      fechaExpedicion = "";
      fechaNacimiento = "";
      sexo = "";
      lugarNacimiento = "";
      estadoCivil = "";
      ciudadDepartamento = "";
      tipoVivienda = "";
      estrato = "";
      direccion = "";
      barrio = "";
      telefono = "";
      celular = "";
      correpondencia = "";
      correoElectronico = "";
      tiempoResidenciaAnios = "";
      tiempoResidenciaMeses = "";
      adultosCargo = "";
      menoresCargo = "";
      eps = "";
      nivelEstudios = "";
      profesion = "";
    }

    @Override
    public InformacionPersonal build() {
        return new InformacionPersonal(this);
    }

    public static InformacionPersonalBuilder cualEs() {
        return new InformacionPersonalBuilder();
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

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public String getNumeroDocumento() {
        return this.numeroDocumento;
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

    public String getCorrepondencia() {
        return this.correpondencia;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
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

    public String getEps() {
        return this.eps;
    }

    public InformacionPersonal informacionPersonalConyugue(){
      conPrimerApellido("Cardona");
      conSegundoApellido("Lopez");
      conPrimerNombre("Andres");
      conSegundoNombre("Juan");
      conTipoDocumento("CC");
      conNumeroDocumento("10101020");
      conFechaExpedicion("1999-Jan-28");
      conLugarExpedicion("ARENAL - BOLIVAR");
      conFechaNacimiento("1879-Dec-25");
      conLugarNacimiento("ARENAL - BOLIVAR");
      conSexo("M");
      conEps("Salud Total");
      conNivelEstudios("Universitario");
      conCelular("3005656231");
        return build();
    }

    public InformacionPersonal informacionPersonal() {
      conPrimerApellido("Morales");
      conSegundoApellido("Carmona");
      conPrimerNombre("Maria");
      conSegundoNombre("Jose");
      conTipoDocumento("CC");
      conNumeroDocumento("10000060");
      conLugarExpedicion("BOLIVAR - ANTIOQUIA");
      conFechaExpedicion("2002-Mar-1");
      conFechaNacimiento("1990-Mar-1");
      conSexo("Femenino");
      conLugarNacimiento("AMAGA - ANTIOQUIA");
      conEstadoCivil("UNIÓN LIBRE");
      conCiudadDepartamento("MEDELLIN - ANTIOQUIA");
      conTipoVivienda("Familiar");
      conEstrato("4");
      conDireccion("CL 80 35 20");
      conBarrio("Estadio");
      conTelefono("2800000");
      conCelular("3002002020");
      conCorreoElectronico("risetzu@gmail.com");
      conCorrespondencia("E-mail");
      conTiempoResidenciaAnios("5");
      conTiempoResidenciaMeses("2");
      conAdultosCargo("0");
      conMenoresCargo("0");
      conEps("Salud Total");
      conNivelEstudios("Universitario");
      conProfesion("ARQUITECTO");
        return build();
    }

    private InformacionPersonalBuilder conProfesion(final String profesion) {
        this.profesion = profesion;
        return this;
    }

    private InformacionPersonalBuilder conNivelEstudios(final String nivelEstudios) {
        this.nivelEstudios = nivelEstudios;
        return this;
    }

    private InformacionPersonalBuilder conEps(final String eps) {
        this.eps = eps;
        return this;
    }

    private InformacionPersonalBuilder conMenoresCargo(final String menoresCargo) {
        this.menoresCargo = menoresCargo;
        return this;
    }

    private InformacionPersonalBuilder conAdultosCargo(final String adultosCargo) {
        this.adultosCargo = adultosCargo;
        return this;
    }

    private InformacionPersonalBuilder conTiempoResidenciaMeses(final String tiempoResidenciaMeses) {
        this.tiempoResidenciaMeses = tiempoResidenciaMeses;
        return this;
    }

    private InformacionPersonalBuilder conTiempoResidenciaAnios(final String tiempoResidenciaAnios) {
        this.tiempoResidenciaAnios = tiempoResidenciaAnios;
        return this;
    }

    private InformacionPersonalBuilder conCorrespondencia(final String correpondencia) {
        this.correpondencia = correpondencia;
        return this;
    }

    private InformacionPersonalBuilder conCorreoElectronico(final String correoElectronico) {
        this.correoElectronico = correoElectronico;
        return this;
    }

    private InformacionPersonalBuilder conCelular(final String celular) {
        this.celular = celular;
        return this;
    }

    private InformacionPersonalBuilder conTelefono(final String telefono) {
        this.telefono = telefono;
        return this;
    }

    private InformacionPersonalBuilder conBarrio(final String barrio) {
        this.barrio = barrio;
        return this;
    }

    private InformacionPersonalBuilder conDireccion(final String direccion) {
        this.direccion = direccion;
        return this;
    }

    private InformacionPersonalBuilder conEstrato(final String estrato) {
        this.estrato = estrato;
        return this;
    }

    private InformacionPersonalBuilder conCiudadDepartamento(final String ciudadDepartamento) {
        this.ciudadDepartamento = ciudadDepartamento;
        return this;
    }

    private InformacionPersonalBuilder conEstadoCivil(final String estadoCivil) {
        this.estadoCivil = estadoCivil;
        return this;
    }

    private InformacionPersonalBuilder conLugarNacimiento(final String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
        return this;
    }

    private InformacionPersonalBuilder conTipoVivienda(final String tipoVivienda) {
        this.tipoVivienda = tipoVivienda;
        return this;
    }

    private InformacionPersonalBuilder conSexo(final String sexo) {
        this.sexo = sexo;
        return this;
    }

    private InformacionPersonalBuilder conFechaNacimiento(final String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
        return this;
    }

    private InformacionPersonalBuilder conFechaExpedicion(final String fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
        return this;
    }

    private InformacionPersonalBuilder conLugarExpedicion(final String lugarExpedicion) {
        this.lugarExpedicion = lugarExpedicion;
        return this;
    }

    private InformacionPersonalBuilder conNumeroDocumento(final String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
        return this;
    }

    private InformacionPersonalBuilder conTipoDocumento(final String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
        return this;
    }

    private InformacionPersonalBuilder conSegundoNombre(final String segundoNombre) {
        this.segundoNombre = segundoNombre;
        return this;
    }

    private InformacionPersonalBuilder conPrimerNombre(final String primerNombre) {
        this.primerNombre = primerNombre;
        return this;
    }

    private InformacionPersonalBuilder conSegundoApellido(final String segundoApellido) {
        this.segundoApellido = segundoApellido;
        return this;
    }

    private InformacionPersonalBuilder conPrimerApellido(final String primerApellido) {
        this.primerApellido = primerApellido;
        return this;
    }
}