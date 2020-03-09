package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_MONTO_ASESOR;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MontoAsesor implements Question<Long> {

  private final String nombreAsesor;

  public MontoAsesor(String nombreAsesor) {
    this.nombreAsesor = nombreAsesor;
  }

  public static Question<Long> montoAsesor(final String nombreAsesor) {
    return new MontoAsesor(nombreAsesor);
  }

  @Override
  public Long answeredBy(final Actor actor) {
    final List<WebElementFacade> lstMontoAsesor = (LST_MONTO_ASESOR.of(this.nombreAsesor)).resolveAllFor(actor);
    lstMontoAsesor.remove(0);
    return suma(lstMontoAsesor);
  }
}
