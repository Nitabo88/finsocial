package co.com.red5g.bancoomeva.tasks;

import static co.com.red5g.bancoomeva.tasks.IngresarCorreo.buscarCorreo;
import static co.com.red5g.bancoomeva.tasks.LoginGmail.ingresarEnGmail;
import static co.com.red5g.general.interactions.CerrarPestana.cerrarPestana;
import static co.com.red5g.utils.data.Emails.OTP_BANCOMEVA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class CodigoVerificacionFirma implements Task {

  private static final String BUSQUEDA_NOTIFICACION_SMS = "notificaciones_sms@coomeva.com.co";

  public static Performable obtenerCodigoVerificacionFirma() {
    return instrumented(CodigoVerificacionFirma.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        ingresarEnGmail(OTP_BANCOMEVA),
        buscarCorreo(BUSQUEDA_NOTIFICACION_SMS),
        cerrarPestana());
  }
}
