package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.DocumentosRequeridos;
import co.com.red5g.finsonet.utils.Builder;

import static co.com.red5g.finsonet.utils.DocumentosRequeridos.DOCUMENTOS_REQUERIDOS_SOLICITANTE;

public class DocumentoRequeridosBuilder implements Builder <DocumentosRequeridos> {
    private String strTipoSolicitud;
    private String strCiudad;
    private String strAgenciaVinculacion;
    private String strCalificacion;
    private String strVinculacion;

    public DocumentoRequeridosBuilder() {
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

    public DocumentoRequeridosBuilder conTipoSolicitud(String strTipoSolicitud){
        this.strTipoSolicitud = strTipoSolicitud;
        return this;
    }

    public DocumentoRequeridosBuilder conCiudad(String strCiudad){
        this.strCiudad = strCiudad;
        return this;
    }

    public DocumentoRequeridosBuilder conCalificacion(String strCalificacion){
        this.strCalificacion = strCalificacion;
        return this;
    }

    public DocumentoRequeridosBuilder conAgenciaVinculacion(String strAgenciaVinculacion){
        this.strAgenciaVinculacion = strAgenciaVinculacion;
        return this;
    }

    public DocumentoRequeridosBuilder conVinculacion(String strVinculacion){
        this.strVinculacion = strVinculacion;
        return this;
    }

    public DocumentosRequeridos documentosSolicitante() {
        this.conTipoSolicitud(DOCUMENTOS_REQUERIDOS_SOLICITANTE.getStrTipoSolicitud());
        this.conCiudad(DOCUMENTOS_REQUERIDOS_SOLICITANTE.getStrCiudad());
        this.conAgenciaVinculacion(DOCUMENTOS_REQUERIDOS_SOLICITANTE.getStrAgenciaVinculacion());
        this.conCalificacion(DOCUMENTOS_REQUERIDOS_SOLICITANTE.getStrCalificacion());
        this.conVinculacion(DOCUMENTOS_REQUERIDOS_SOLICITANTE.getStrVinculacion());
        return this.build();
    }

    @Override
    public DocumentosRequeridos build() {
        return new DocumentosRequeridos(this);
    }
}
