package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.models.Prestamo;
import co.com.red5g.finsonet.utils.Builder;

public class PrestamoBuilder implements Builder<Prestamo> {
    private String strMonto;
    private String strTasaInteres;
    private String strCuota;
    private String strTasaMora;
    private String strPlazo;
    private String strTasaMaximaInteresVigente;

    private PrestamoBuilder() {
        this.strMonto = "";
        this.strTasaInteres = "";
        this.strCuota = "";
        this.strTasaMora = "";
        this.strPlazo = "";
        this.strTasaMaximaInteresVigente = "";
    }

    public static PrestamoBuilder con() {
        return new PrestamoBuilder();
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

    private PrestamoBuilder conMonto(String strMonto) {
        this.strMonto = strMonto;
        return this;
    }

    private PrestamoBuilder conTasaInteres(String strTasaInteres) {
        this.strTasaInteres = strTasaInteres;
        return this;
    }

    private PrestamoBuilder conCuota(String strCuota) {
        this.strCuota = strCuota;
        return this;
    }

    private PrestamoBuilder conTasaMora(String strTasaMora) {
        this.strTasaMora = strTasaMora;
        return this;
    }

    private PrestamoBuilder conPlazo(String strPlazo) {
        this.strPlazo = strPlazo;
        return this;
    }

    private PrestamoBuilder conTasaMaxima(String strTasaMaximaInteresVigente) {
        this.strTasaMaximaInteresVigente = strTasaMaximaInteresVigente;
        return this;
    }

    public Prestamo informacionPrestamo() {
        this.conMonto("7680000");
        this.conTasaInteres("2");
        this.conCuota("160000");
        this.conTasaMora("23");
        this.conPlazo("48");
        this.conTasaMaxima("23");
        return this.build();
    }

    @Override
    public Prestamo build() {
        return new Prestamo(this);
    }
}
