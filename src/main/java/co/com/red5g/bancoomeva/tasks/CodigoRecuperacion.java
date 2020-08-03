package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.buscarCorreo;
import static co.com.red5g.bancoomeva.tasks.LoginGmail.ingresarEnGmail;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CodigoRecuperacion implements Task {

  private static final String BUSQUEDA_CODIGO_FIRMA = "bancoomeva_en_linea@coomeva.com.co";

  public static Performable obtenerCodigoDeRecuperacion() {
    return instrumented(CodigoRecuperacion.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA),
        buscarCorreo(BUSQUEDA_CODIGO_FIRMA)
    );
  }
}
