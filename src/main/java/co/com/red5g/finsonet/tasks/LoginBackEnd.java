package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.Credenciales;
import io.restassured.http.ContentType;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Post;

public class LoginBackEnd implements Task {

  private static final String REST_API_URL = "http://10.10.1.59";
  private Credenciales credenciales;

  public static final String COOKIE = "Cookie";

  public LoginBackEnd(Credenciales credenciales) {
    this.credenciales = credenciales;
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.whoCan(CallAnApi.at(REST_API_URL));
    actor.attemptsTo(
        Post.to("/login.php")
            .with(requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                .formParam("user", credenciales.getUsuario())
                .formParam("pass", credenciales.getContrasena())),
        Post.to("/login_codigo.php")
            .with(requestSpecification -> requestSpecification.contentType(ContentType.URLENC)
                .formParam("codigo", credenciales.getCodigo())
                .formParam("usuario", credenciales.getCodigoUsuario())));
    actor.remember(COOKIE, SerenityRest.lastResponse().getCookie("PHPSESSID"));
  }
}