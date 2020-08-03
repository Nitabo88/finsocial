package co.com.red5g.bancoomeva.tasks;

import co.com.red5g.bancoomeva.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

public class CreditoLinea implements Task {

  String sql;

  public CreditoLinea(String sql) {
    this.sql = sql;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Diligencia.laValidacion(sql),
        Diligencia.laSimulacion()
    );
  }
}
