package co.com.red5g.finsonet.models.builders;

import co.com.red5g.finsonet.models.InformacionPrestamo;
import co.com.red5g.utils.Builder;

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

    private InformacionPrestamoBuilder conMonto() {
        this.strMonto = "7680000";
        return this;
    }

    private InformacionPrestamoBuilder conTasaInteres() {
        this.strTasaInteres = "2";
        return this;
    }

    private InformacionPrestamoBuilder conCuota() {
        this.strCuota = "160000";
        return this;
    }

    private InformacionPrestamoBuilder conTasaMora() {
        this.strTasaMora = "23";
        return this;
    }

    private InformacionPrestamoBuilder conPlazo() {
        this.strPlazo = "48";
        return this;
    }

    private InformacionPrestamoBuilder conTasaMaxima() {
        this.strTasaMaximaInteresVigente = "23";
        return this;
    }

    public InformacionPrestamo informacionPrestamo() {
      this.conMonto();
      this.conTasaInteres();
      this.conCuota();
      this.conTasaMora();
      this.conPlazo();
      this.conTasaMaxima();
        return this.build();
    }

    @Override
    public InformacionPrestamo build() {
        return new InformacionPrestamo(this);
    }
}
