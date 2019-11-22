package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builder.InformacionPrestamoBuilder;

public class InformacionPrestamo {
    private String strMonto;
    private String strTasaInteres;
    private String strCuota;
    private String strTasaMora;
    private String strPlazo;
    private String strTasaMaximaInteresVigente;

    public InformacionPrestamo(InformacionPrestamoBuilder prestamoBuilder) {
        this.strMonto = prestamoBuilder.getStrMonto();
        this.strTasaInteres = prestamoBuilder.getStrTasaInteres();
        this.strCuota = prestamoBuilder.getStrCuota();
        this.strTasaMora = prestamoBuilder.getStrTasaMora();
        this.strPlazo = prestamoBuilder.getStrPlazo();
        this.strTasaMaximaInteresVigente = prestamoBuilder.getStrTasaMaximaInteresVigente();
    }

    public String getStrMonto() {
        return strMonto;
    }

    public String getStrTasaInteres() {
        return strTasaInteres;
    }

    public String getStrCuota() {
        return strCuota;
    }

    public String getStrTasaMora() {
        return strTasaMora;
    }

    public String getStrPlazo() {
        return strPlazo;
    }

    public String getStrTasaMaximaInteresVigente() {
        return strTasaMaximaInteresVigente;
    }
}
