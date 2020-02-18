package co.com.red5g.finsonet.models;

import co.com.red5g.finsonet.models.builders.InformacionPrestamoBuilder;

public class InformacionPrestamo {
    private final String strMonto;
    private final String strTasaInteres;
    private final String strCuota;
    private final String strTasaMora;
    private final String strPlazo;
    private final String strTasaMaximaInteresVigente;

    public InformacionPrestamo(final InformacionPrestamoBuilder prestamoBuilder) {
      strMonto = prestamoBuilder.getStrMonto();
      strTasaInteres = prestamoBuilder.getStrTasaInteres();
      strCuota = prestamoBuilder.getStrCuota();
      strTasaMora = prestamoBuilder.getStrTasaMora();
      strPlazo = prestamoBuilder.getStrPlazo();
      strTasaMaximaInteresVigente = prestamoBuilder.getStrTasaMaximaInteresVigente();
    }

    public String getStrMonto() {
        return this.strMonto;
    }

    public String getStrTasaInteres() {
        return this.strTasaInteres;
    }

    public String getStrCuota() {
        return this.strCuota;
    }

    public String getStrTasaMora() {
        return this.strTasaMora;
    }

    public String getStrPlazo() {
        return this.strPlazo;
    }

    public String getStrTasaMaximaInteresVigente() {
        return this.strTasaMaximaInteresVigente;
    }
}
