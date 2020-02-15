package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.DocumentoRequeridosBuilder;

public class DocumentosRequeridos {
    private String strTipoSolicitud;
    private String strCiudad;
    private String strAgenciaVinculacion;
    private String strCalificacion;
    private String strVinculacion;

    public DocumentosRequeridos(DocumentoRequeridosBuilder documentosRequeridosBuilder) {
        this.strTipoSolicitud = documentosRequeridosBuilder.getStrTipoSolicitud();
        this.strCiudad = documentosRequeridosBuilder.getStrCiudad();
        this.strAgenciaVinculacion = documentosRequeridosBuilder.getStrAgenciaVinculacion();
        this.strCalificacion = documentosRequeridosBuilder.getStrCalificacion();
        this.strVinculacion = documentosRequeridosBuilder.getStrVinculacion();
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
}
