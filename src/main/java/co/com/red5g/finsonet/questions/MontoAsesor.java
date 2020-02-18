package co.com.red5g.finsonet.questions;

import static co.com.red5g.finsonet.userinterfaces.LiquidadorComisionesPage.LST_MONTO_ASESOR;
import static co.com.red5g.finsonet.utils.Utilerias.suma;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class MontoAsesor implements Question<Long> {

  private String nombreAsesor;

  public MontoAsesor(final String nombreAsesor) {
    this.nombreAsesor = nombreAsesor;
  }

  public static Question<Long> montoAsesor(String nombreAsesor) {
    return new MontoAsesor(nombreAsesor);
  }

  @Override
  public Long answeredBy(Actor actor) {
    List<WebElementFacade> lstMontoAsesor = (LST_MONTO_ASESOR.of(nombreAsesor)).resolveAllFor(actor);
    lstMontoAsesor.remove(0);
    return suma(lstMontoAsesor);
  }
}
