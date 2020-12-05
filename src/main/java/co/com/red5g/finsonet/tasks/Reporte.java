package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LBL_TITULO_DETALLE;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.LST_PERIODO;
import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_ELIPSE;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.red5g.utils.string.UtileriaFechas;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class Reporte implements Task {

  Target lnkVerDetalle;

  public Reporte(Target lnkVerDetalle) {
    this.lnkVerDetalle = lnkVerDetalle;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        SelectFromOptions.byVisibleText(UtileriaFechas.obtenerPeriodoAnterior()).from(LST_PERIODO),
        WaitUntil.the(SPN_ELIPSE, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Click.on(lnkVerDetalle),
        WaitUntil.the(SPN_ELIPSE, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Scroll.to(LBL_TITULO_DETALLE).andAlignToBottom());
  }
}
