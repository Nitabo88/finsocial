package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.DocumentoRequeridosBuilder;

public class DocumentosRequeridos {
    private final String strTipoSolicitud;
    private final String strCiudad;
    private final String strAgenciaVinculacion;
    private final String strCalificacion;
    private final String strVinculacion;

    public DocumentosRequeridos(final DocumentoRequeridosBuilder documentosRequeridosBuilder) {
      strTipoSolicitud = documentosRequeridosBuilder.getStrTipoSolicitud();
      strCiudad = documentosRequeridosBuilder.getStrCiudad();
      strAgenciaVinculacion = documentosRequeridosBuilder.getStrAgenciaVinculacion();
      strCalificacion = documentosRequeridosBuilder.getStrCalificacion();
      strVinculacion = documentosRequeridosBuilder.getStrVinculacion();
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
}
