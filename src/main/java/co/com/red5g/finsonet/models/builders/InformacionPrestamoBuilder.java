package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionPrestamo;
import co.com.red5g.finsonet.utils.Builder;

public class InformacionPrestamoBuilder implements Builder<InformacionPrestamo> {
    private String strMonto;
    private String strTasaInteres;
    private String strCuota;
    private String strTasaMora;
    private String strPlazo;
    private String strTasaMaximaInteresVigente;

    private InformacionPrestamoBuilder() {
      strMonto = "";
      strTasaInteres = "";
      strCuota = "";
      strTasaMora = "";
      strPlazo = "";
      strTasaMaximaInteresVigente = "";
    }

    public static InformacionPrestamoBuilder la() {
        return new InformacionPrestamoBuilder();
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

    private InformacionPrestamoBuilder conMonto(final String strMonto) {
        this.strMonto = strMonto;
        return this;
    }

    private InformacionPrestamoBuilder conTasaInteres(final String strTasaInteres) {
        this.strTasaInteres = strTasaInteres;
        return this;
    }

    private InformacionPrestamoBuilder conCuota(final String strCuota) {
        this.strCuota = strCuota;
        return this;
    }

    private InformacionPrestamoBuilder conTasaMora(final String strTasaMora) {
        this.strTasaMora = strTasaMora;
        return this;
    }

    private InformacionPrestamoBuilder conPlazo(final String strPlazo) {
        this.strPlazo = strPlazo;
        return this;
    }

    private InformacionPrestamoBuilder conTasaMaxima(final String strTasaMaximaInteresVigente) {
        this.strTasaMaximaInteresVigente = strTasaMaximaInteresVigente;
        return this;
    }

    public InformacionPrestamo informacionPrestamo() {
      conMonto("7680000");
      conTasaInteres("2");
      conCuota("160000");
      conTasaMora("23");
      conPlazo("48");
      conTasaMaxima("23");
        return build();
    }

    @Override
    public InformacionPrestamo build() {
        return new InformacionPrestamo(this);
    }
}
