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

    private DocumentoRequeridosBuilder conTipoSolicitud() {
        this.strTipoSolicitud = "Solicitante";
        return this;
    }

    private DocumentoRequeridosBuilder conCiudad() {
        this.strCiudad = "MEDELLIN - ANTIOQUIA";
        return this;
    }

    private DocumentoRequeridosBuilder conCalificacion() {
        this.strCalificacion = "660";
        return this;
    }

    private DocumentoRequeridosBuilder conAgenciaVinculacion() {
        this.strAgenciaVinculacion = "Institucional Medellin";
        return this;
    }

    private DocumentoRequeridosBuilder conVinculacion() {
        this.strVinculacion = "Sí";
        return this;
    }

    public DocumentosRequeridos documentosSolicitante() {
      this.conTipoSolicitud();
      this.conCiudad();
      this.conAgenciaVinculacion();
      this.conCalificacion();
      this.conVinculacion();
        return this.build();
    }

    @Override
    public DocumentosRequeridos build() {
        return new DocumentosRequeridos(this);
    }
}