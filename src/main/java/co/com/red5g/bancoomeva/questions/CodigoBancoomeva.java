package co.com.red5g.bancoomeva.questions;

import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LBL_CORREO_CODIGO;
import static co.com.red5g.bancoomeva.userinterfaces.GmailHomePage.LBL_CORREO_NOTIFICACION;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class CodigoBancoomeva implements Question<String> {

  String busqueda;

  public CodigoBancoomeva(String busqueda) {
    this.busqueda = busqueda;
  }

  public static Question<String> numeroCodigo(String busqueda) {
    return new CodigoBancoomeva(busqueda);
  }

  @Override
  public String answeredBy(Actor actor) {
    String codigo;
    switch (busqueda) {
      case "bancoomeva_en_linea@coomeva.com.co":
        codigo = LBL_CORREO_CODIGO.resolveAllFor(actor).get(0).getTextContent().split(": ")[1].substring(0, 9);
        break;
      case "notificaciones_sms@coomeva.com.co":
        codigo = LBL_CORREO_NOTIFICACION.resolveAllFor(actor).get(0).getTextContent().split("transacción es ")[1].substring(0, 7);
        break;
      default:
        codigo = "";
        break;
    }
    return codigo;
  }
}
