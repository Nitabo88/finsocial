package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.DocumentoRequeridosBuilder;

public class DocumentosRequeridos {
    private final String strTipoSolicitud;
    private final String strCiudad;
    private final String strAgenciaVinculacion;
    private final String strCalificacion;
    private final String strVinculacion;

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
