package co.com.red5g.finsonet.utils;

public enum DocumentosRequeridos {
    DOCUMENTOS_REQUERIDOS_SOLICITANTE ("Solicitante","MEDELLIN - ANTIOQUIA","Institucional Medellin","660","Sí");

    private String strTipoSolicitud;
    private String strCiudad;
    private String strAgenciaVinculacion;
    private String strCalificacion;
    private String strVinculacion;

    DocumentosRequeridos(String strTipoSolicitud, String strCiudad, String strAgenciaVinculacion, String strCalificacion, String strVinculacion) {
        this.strTipoSolicitud = strTipoSolicitud;
        this.strCiudad = strCiudad;
        this.strAgenciaVinculacion = strAgenciaVinculacion;
        this.strCalificacion = strCalificacion;
        this.strVinculacion = strVinculacion;
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
