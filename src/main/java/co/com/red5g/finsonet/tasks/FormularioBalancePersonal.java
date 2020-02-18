package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.InformacionBalancePersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;

public class FormularioBalancePersonal implements Task {
    private final InformacionBalancePersonal informacionBalancePersonal;

    public FormularioBalancePersonal(final InformacionBalancePersonal informacionBalancePersonal) {
        this.informacionBalancePersonal = informacionBalancePersonal;
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Enter.theValue(this.informacionBalancePersonal.getActivosCorrientes()).into(TXT_ACTIVOS_CORRIENTES),
                Enter.theValue(this.informacionBalancePersonal.getActivosFijos()).into(TXT_ACTIVOS_FIJOS),
                Enter.theValue(this.informacionBalancePersonal.getOtrosActivos()).into(TXT_OTROS_ACTIVOS),
                Enter.theValue(this.informacionBalancePersonal.getRazonOtrosActivos()).into(TXT_CUALES_ACTIVOS),
                Enter.theValue(this.informacionBalancePersonal.getPasivosFinancieros()).into(TXT_PASIVOS_FINANCIEROS),
                Enter.theValue(this.informacionBalancePersonal.getPasivosCorrientes()).into(TXT_OTROS_PASIVOS),
                Enter.theValue(this.informacionBalancePersonal.getRazonOtrosPasivos()).into(TXT_CUALES_PASIVOS)
        );
    }
}
