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
      this.strMonto = "";
      this.strTasaInteres = "";
      this.strCuota = "";
      this.strTasaMora = "";
      this.strPlazo = "";
      this.strTasaMaximaInteresVigente = "";
    }

    public static InformacionPrestamoBuilder la() {
        return new InformacionPrestamoBuilder();
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

    private InformacionPrestamoBuilder conMonto(String strMonto) {
        this.strMonto = strMonto;
        return this;
    }

    private InformacionPrestamoBuilder conTasaInteres(String strTasaInteres) {
        this.strTasaInteres = strTasaInteres;
        return this;
    }

    private InformacionPrestamoBuilder conCuota(String strCuota) {
        this.strCuota = strCuota;
        return this;
    }

    private InformacionPrestamoBuilder conTasaMora(String strTasaMora) {
        this.strTasaMora = strTasaMora;
        return this;
    }

    private InformacionPrestamoBuilder conPlazo(String strPlazo) {
        this.strPlazo = strPlazo;
        return this;
    }

    private InformacionPrestamoBuilder conTasaMaxima(String strTasaMaximaInteresVigente) {
        this.strTasaMaximaInteresVigente = strTasaMaximaInteresVigente;
        return this;
    }

    public InformacionPrestamo informacionPrestamo() {
      this.conMonto("7680000");
      this.conTasaInteres("2");
      this.conCuota("160000");
      this.conTasaMora("23");
      this.conPlazo("48");
      this.conTasaMaxima("23");
        return this.build();
    }

    @Override
    public InformacionPrestamo build() {
        return new InformacionPrestamo(this);
    }
}
