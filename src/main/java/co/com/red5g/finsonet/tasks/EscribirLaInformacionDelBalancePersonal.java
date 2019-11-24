package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException;
import co.com.red5g.finsonet.models.InformacionBalancePersonal;
import co.com.red5g.finsonet.questions.ReporteAntecartera;
import co.com.red5g.finsonet.questions.TotalActivos;
import co.com.red5g.finsonet.questions.TotalPasivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.red5g.finsonet.exceptions.ElDetalleNoCorrespondeException.MENSAJE_REPORTE;
import static co.com.red5g.finsonet.userinterfaces.FormularioSolicitudPaso4Page.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class EscribirLaInformacionDelBalancePersonal implements Task {
    private InformacionBalancePersonal informacionBalancePersonal;

    public EscribirLaInformacionDelBalancePersonal(InformacionBalancePersonal informacionBalancePersonal) {
        this.informacionBalancePersonal = informacionBalancePersonal;
    }


    public static Performable de(InformacionBalancePersonal informacionBalancePersonal) {
        return instrumented(EscribirLaInformacionDelBalancePersonal.class, informacionBalancePersonal );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(informacionBalancePersonal.getActivosCorrientes()).into(TXT_ACTIVOS_CORRIENTES),
                Enter.theValue(informacionBalancePersonal.getActivosFijos()).into(TXT_ACTIVOS_FIJOS),
                Enter.theValue(informacionBalancePersonal.getOtrosActivos()).into(TXT_OTROS_ACTIVOS),
                Enter.theValue(informacionBalancePersonal.getRazonOtrosActivos()).into(TXT_CUALES_ACTIVOS));
        theActorInTheSpotlight().should(seeThat(TotalActivos.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));
        actor.attemptsTo(
                Enter.theValue(informacionBalancePersonal.getPasivosFinancieros()).into(TXT_PASIVOS_FINANCIEROS),
                Enter.theValue(informacionBalancePersonal.getPasivosCorrientes()).into(TXT_OTROS_PASIVOS),
                Enter.theValue(informacionBalancePersonal.getRazonOtrosPasivos()).into(TXT_CUALES_PASIVOS)
        );
        theActorInTheSpotlight().should(seeThat(TotalPasivos.esCorrecto()).orComplainWith(ElDetalleNoCorrespondeException.class, MENSAJE_REPORTE));

    }
}
