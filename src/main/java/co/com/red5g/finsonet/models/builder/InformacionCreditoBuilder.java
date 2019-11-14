package co.com.red5g.finsonet.models.builder;

import co.com.red5g.finsonet.tasks.Ingresa;
import net.serenitybdd.screenplay.Performable;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InformacionCreditoBuilder {
    private String strNumeroDocumento;
    private String strValorCuota;

    public InformacionCreditoBuilder(String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
    }

    public InformacionCreditoBuilder suDocumento(String strNumeroDocumento) {
        this.strNumeroDocumento = strNumeroDocumento;
        return this;
    }

    public InformacionCreditoBuilder conValor(String strValorCuota) {
        this.strValorCuota = strValorCuota;
        return this;
    }

    public Performable a(String strPlazo) {
        return instrumented(Ingresa.class, this.strNumeroDocumento, this.strValorCuota, strPlazo);
    }
}