package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.BTN_DETALLE_CREDITOS;
import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_TOTALES_NUMERO_CREDITOS;
import static co.com.red5g.finsonet.utils.Utilerias.suma;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

public class Obtener implements Interaction {

  private final WebElementFacade lstCreditos;
  private final String ciudad;
  private final List<String> valoresComparacion;

  public Obtener(final WebElementFacade lstCreditos, final String ciudad, final List<String> valoresComparacion) {
    this.lstCreditos = lstCreditos;
    this.ciudad = ciudad;
    this.valoresComparacion = valoresComparacion;
  }

  public static Obtener numeroCreditos(final WebElementFacade lstCreditos, final String ciudad, final List<String> valoresComparacion) {
    return instrumented(Obtener.class,lstCreditos, ciudad, valoresComparacion);
  }

  @Override
  public <T extends Actor> void performAs(final T actor) {
    final String numeroCreditos = this.lstCreditos.getText().replaceAll("[^\\d]", "");
    actor.attemptsTo(Click.on(BTN_DETALLE_CREDITOS.of(this.ciudad)));
    final String detalleCreditos = String.valueOf(suma(LST_TOTALES_NUMERO_CREDITOS.resolveAllFor(actor)));
    this.valoresComparacion.add(numeroCreditos);
    this.valoresComparacion.add(detalleCreditos);
  }
}
