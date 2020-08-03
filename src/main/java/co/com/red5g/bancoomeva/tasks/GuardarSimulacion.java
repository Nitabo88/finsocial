package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_BANCA_SEGURO;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_CUOTA_CREDITO;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_CUOTA_SEGURO_VIDA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_TASA_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LBL_VALOR_CREDITO;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.LST_PLAZO_LIBRANZA;
import static co.com.red5g.bancoomeva.userinterfaces.SimulacionPage.TXT_MONTO;
import static co.com.red5g.utils.data.Constantes.VALORES;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.ArrayList;
import java.util.regex.Pattern;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class GuardarSimulacion implements Task {

  ArrayList<String> valoresSimulacion = new ArrayList<>();
  private static final Pattern FORMATO = Pattern.compile("[^\\d]");

  public static Performable guardaValoresSimulacion() {
    return instrumented(GuardarSimulacion.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    valoresSimulacion.add(0, FORMATO.matcher(TXT_MONTO.resolveFor(actor).getValue()).replaceAll(""));
    valoresSimulacion.add(1, FORMATO.matcher(LST_PLAZO_LIBRANZA.resolveFor(actor).getValue()).replaceAll(""));
    valoresSimulacion.add(2, LBL_TASA_LIBRANZA.resolveFor(actor).getValue());
    valoresSimulacion.add(3, FORMATO.matcher(LBL_CUOTA_CREDITO.resolveFor(actor).getText()).replaceAll(""));
    valoresSimulacion.add(4, FORMATO.matcher(LBL_CUOTA_SEGURO_VIDA.resolveFor(actor).getText()).replaceAll(""));
    valoresSimulacion.add(5, FORMATO.matcher(LBL_VALOR_CREDITO.resolveFor(actor).getText()).replaceAll(""));
    valoresSimulacion.add(6, FORMATO.matcher(LBL_BANCA_SEGURO.resolveFor(actor).getText()).replaceAll(""));
    actor.remember(VALORES, valoresSimulacion);
  }
}
