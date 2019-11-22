package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import co.com.red5g.finsonet.utils.Builder;

public class DocumentoRequeridosBuilder implements Builder <DocumentosRequeridos> {
    private String strTipoSolicitud;
    private String strCiudad;
    private String strAgenciaVinculacion;
    private String strCalificacion;
    private String strVinculacion;

    private DocumentoRequeridosBuilder() {
        this.strTipoSolicitud = "";
        this.strCiudad = "";
        this.strAgenciaVinculacion = "";
        this.strCalificacion = "";
        this.strVinculacion = "";
    }

    public static DocumentoRequeridosBuilder los(){
        return new DocumentoRequeridosBuilder();
    }

    public String getStrTipoSolicitud() {
        return strTipoSolicitud;
    }

    public String getStrCiudad() {
        return strCiudad;
    }

    public String getStrAgenciaVinculacion() {
        return strAgenciaVinculacion;
    }

    public String getStrCalificacion() {
        return strCalificacion;
    }

    public String getStrVinculacion() {
        return strVinculacion;
    }

    private DocumentoRequeridosBuilder conTipoSolicitud(String strTipoSolicitud) {
        this.strTipoSolicitud = strTipoSolicitud;
        return this;
    }

    private DocumentoRequeridosBuilder conCiudad(String strCiudad) {
        this.strCiudad = strCiudad;
        return this;
    }

    private DocumentoRequeridosBuilder conCalificacion(String strCalificacion) {
        this.strCalificacion = strCalificacion;
        return this;
    }

    private DocumentoRequeridosBuilder conAgenciaVinculacion(String strAgenciaVinculacion) {
        this.strAgenciaVinculacion = strAgenciaVinculacion;
        return this;
    }

    private DocumentoRequeridosBuilder conVinculacion(String strVinculacion) {
        this.strVinculacion = strVinculacion;
        return this;
    }

    public DocumentosRequeridos documentosSolicitante() {
        this.conTipoSolicitud("Solicitante");
        this.conCiudad("MEDELLIN - ANTIOQUIA");
        this.conAgenciaVinculacion("Institucional Medellin");
        this.conCalificacion("660");
        this.conVinculacion("Sí");
        return this.build();
    }

    @Override
    public DocumentosRequeridos build() {
        return new DocumentosRequeridos(this);
    }
}