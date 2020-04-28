package co.com.red5g.models.finsonet;

import co.com.red5g.models.builders.finsonet.InformacionPrestamoBuilder;

public class InformacionPrestamo {
    private final String strMonto;
    private final String strTasaInteres;
    private final String strCuota;
    private final String strTasaMora;
    private final String strPlazo;
    private final String strTasaMaximaInteresVigente;

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
