package co.com.red5g.bancoomeva.interactions;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Actualizar implements Interaction {

  String cedula;
  String email;

  public Actualizar(String cedula, String email) {
    this.cedula = cedula;
    this.email = email;
  }

  public static Performable informacionCliente(String cedula, String email) {
    return instrumented(Actualizar.class,cedula,email);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    String url= "http://10.10.1.55:8082/test/testSP.php?t=28&doc="+cedula+"&celular=3014573510&email="+email;
    BrowseTheWeb.as(actor).getDriver().navigate().to(url);
    BrowseTheWeb.as(actor).getDriver().navigate().back();
  }
}
