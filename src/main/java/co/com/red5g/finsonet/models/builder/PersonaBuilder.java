package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.Persona;
import co.com.red5g.finsonet.utils.Builder;

public class PersonaBuilder implements Builder<Persona> {
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private String numeroDocumento;
    private String correoElectronico;
    private String ciudad;
    private String numeroTelefonico;

    @Override
    public Persona build() {
        return new Persona(this);
    }

    private PersonaBuilder() {
        this.nombre = "";
        this.apellido = "";
        this.tipoDocumento = "";
        this.numeroDocumento = "";
        this.correoElectronico = "";
        this.ciudad = "";
        this.numeroTelefonico = "";
    }

    public static PersonaBuilder con() {
        return new PersonaBuilder();
    }

    public PersonaBuilder conNombre() {
        this.nombre = "Licet";
        return this;
    }

    public PersonaBuilder conApellido() {
        this.apellido = "Estrada";
        return this;
    }

    public PersonaBuilder conTipoDeDocumento() {
        this.tipoDocumento = "NIT";
        return this;
    }

    public PersonaBuilder conNumeroDeDocumento() {
        this.numeroDocumento = "1";
        return this;
    }

    public PersonaBuilder conCorreoElectronico() {
        this.correoElectronico = "rr@gmail.com";
        return this;
    }

    public PersonaBuilder conCiudad() {
        this.ciudad = "Medellin";
        return this;
    }

    public PersonaBuilder conNumeroDeTelefono() {
        this.numeroTelefonico = "1";
        return this;
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