package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.PersonaBuilder;

public class Persona {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correoElectronico;
    private String ciudad;
    private String numeroTelefonico;

    public Persona() {
    }

    public Persona(PersonaBuilder personaBuilder) {
        this.nombre = personaBuilder.getNombre();
        this.apellido = personaBuilder.getApellido();
        this.tipoDocumento = personaBuilder.getTipoDocumento();
        this.numeroDocumento = personaBuilder.getNumeroDocumento();
        this.correoElectronico = personaBuilder.getCorreoElectronico();
        this.ciudad = personaBuilder.getCiudad();
        this.numeroTelefonico = personaBuilder.getNumeroTelefonico();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
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

    public String getCiudad() {
        return ciudad;
    }

    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
}

