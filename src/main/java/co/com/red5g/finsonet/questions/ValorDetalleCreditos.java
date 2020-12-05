package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.ReporteVentasPage.SPN_ELIPSE;
import static co.com.red5g.utils.Utilerias.suma;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_1;
import static co.com.red5g.utils.data.ConstantesTiempo.TIEMPO_60;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

import co.com.devco.automation.mobile.actions.WaitFor;
import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class ValorDetalleCreditos implements Question<String> {

  Target valorDetalle;
  Target btnDetalle;

  public ValorDetalleCreditos(Target btnDetalle, Target valorDetalle) {
    this.valorDetalle = valorDetalle;
    this.btnDetalle = btnDetalle;
  }


  @Override
  public String answeredBy(Actor actor) {
    actor.attemptsTo(
        WaitUntil.the(SPN_ELIPSE, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        Scroll.to(btnDetalle).andAlignToBottom(),
        Click.on(btnDetalle),
        WaitUntil.the(SPN_ELIPSE, isNotVisible()).forNoMoreThan(TIEMPO_60).seconds(),
        WaitFor.seconds(TIEMPO_1)
    );
    List<WebElementFacade> lstValorDetalle = valorDetalle.resolveAllFor(actor);
    lstValorDetalle.remove(0);
    return String.valueOf(suma(lstValorDetalle));
  }
}
