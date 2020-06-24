package co.com.red5g.finsonet.tasks;

import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import net.serenitybdd.screenplay.rest.interactions.Get;
import net.serenitybdd.screenplay.rest.interactions.Post;

import static co.com.red5g.finsonet.interacions.Ingresar.NUMERO_CREDITO;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SolicitudCreditoBack implements Task {

    private static final String restApiUrl = "http://192.168.0.18:82";

    @Override
    public <T extends Actor> void performAs(T actor) {
        String numeroCredito = actor.recall(NUMERO_CREDITO);
        actor.whoCan(CallAnApi.at(restApiUrl));
        actor.attemptsTo(
                Post.to("/login.php")
                        .with(
                                request ->
                                        request
                                                .header("Content-Type", "application/x-www-form-urlencoded")
                                                .header("Connection", "keep-alive")
                                                .body("{\"user\": \"ochinchilla\",\"pass\": \"Nicolas32@\"}")));
        String cookie = SerenityRest.lastResponse().getCookie("PHPSESSID");
        actor.attemptsTo(
                Get.resource("/login_codigo.php?codigo=a").with(request ->
                        request.header("Cookie", "PHPSESSID=" + cookie)
                                .header("Connection", "keep-alive")));
        actor.attemptsTo(
                Post.to("/ajax/ajxFormSolicitud.php")
                        .with(
                                request ->
                                        request
                                                .header("Content-Type", "application/json")
                                                .header("Cookie", "PHPSESSID=" + cookie)
                                                .header("Connection", "keep-alive")
                                                .body(
                                                        String.format(
                                                                "{\"id_cred\": \"%s\","
                                                                        + "\"numPaso\": \"step-1\", "
                                                                        + "\"txtFecha\": \"2020-06-23\", "
                                                                        + "\"perfil\": \"3\", "
                                                                        + "\"crid\": \"%s\","
                                                                        + "\"'pasoSol\": \" \", "
                                                                        + "\"txtAsesor\": \"ORLANDO NICOLAS CHINCHILLA VEGA\", "
                                                                        + "\"txtCiuC\": \"5001\", "
                                                                        + "\"txtCalf\": \"660\", "
                                                                        + "\"txtTSol\": \"S\", "
                                                                        + "\"a_vinculacion\": \"160\","
                                                                        + "\"txtVin\": \"S\","
                                                                        + "\"'txtMonto\": \" \","
                                                                        + "\"txtLinea\": \"LIBRANZA\","
                                                                        + "\"cuota\":\" \","
                                                                        + "\"txtPlaz\": \" \","
                                                                        + "\"tasaI\": \" \","
                                                                        + "\"tasaM\": \" \","
                                                                        + "\"tasaMax\":\" \"}",
                                                                numeroCredito, numeroCredito))));
        assertThat(SerenityRest.lastResponse().statusCode(), equalTo(200));

    }
}
