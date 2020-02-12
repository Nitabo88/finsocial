package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import co.com.red5g.finsonet.utils.Builder;

public class DocumentoRequeridosBuilder implements Builder <DocumentosRequeridos> {
    private String strTipoSolicitud;
    private String strCiudad;
    private String strAgenciaVinculacion;
    private String strCalificacion;
    private String strVinculacion;

    private DocumentoRequeridosBuilder() {
      strTipoSolicitud = "";
      strCiudad = "";
      strAgenciaVinculacion = "";
      strCalificacion = "";
      strVinculacion = "";
    }

    public static DocumentoRequeridosBuilder los(){
        return new DocumentoRequeridosBuilder();
    }

    public String getStrTipoSolicitud() {
        return this.strTipoSolicitud;
    }

    public String getStrCiudad() {
        return this.strCiudad;
    }

    public String getStrAgenciaVinculacion() {
        return this.strAgenciaVinculacion;
    }

    public String getStrCalificacion() {
        return this.strCalificacion;
    }

    public String getStrVinculacion() {
        return this.strVinculacion;
    }

    private DocumentoRequeridosBuilder conTipoSolicitud(final String strTipoSolicitud) {
        this.strTipoSolicitud = strTipoSolicitud;
        return this;
    }

    private DocumentoRequeridosBuilder conCiudad(final String strCiudad) {
        this.strCiudad = strCiudad;
        return this;
    }

    private DocumentoRequeridosBuilder conCalificacion(final String strCalificacion) {
        this.strCalificacion = strCalificacion;
        return this;
    }

    private DocumentoRequeridosBuilder conAgenciaVinculacion(final String strAgenciaVinculacion) {
        this.strAgenciaVinculacion = strAgenciaVinculacion;
        return this;
    }

    private DocumentoRequeridosBuilder conVinculacion(final String strVinculacion) {
        this.strVinculacion = strVinculacion;
        return this;
    }

    public DocumentosRequeridos documentosSolicitante() {
      conTipoSolicitud("Solicitante");
      conCiudad("MEDELLIN - ANTIOQUIA");
      conAgenciaVinculacion("Institucional Medellin");
      conCalificacion("660");
      conVinculacion("Sí");
        return build();
    }

    @Override
    public DocumentosRequeridos build() {
        return new DocumentosRequeridos(this);
    }
}