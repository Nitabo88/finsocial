package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.interacions.Subir;
import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.ClickOnBy;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.*;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isEnabled;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;


public class SeAutentica implements Task {
    private Credenciales cliente;

    public SeAutentica(Credenciales cliente) {
        this.cliente = cliente;
    }

    public static Performable conCredenciales(Credenciales credenciales) {
        return instrumented(SeAutentica.class, credenciales);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(cliente.getUsuario()).into(TXT_USUARIO),
                Enter.theValue(cliente.getContrasena()).into(TXT_CONTRASENA),
                Click.on(LoginFinsonetPage.BTN_ACCESO),
                WaitUntil.the(TXT_CODIGO,isCurrentlyEnabled()).forNoMoreThan(3).seconds(),
                Enter.theValue(cliente.getCodigo()).into(TXT_CODIGO),
                Click.on(LoginFinsonetPage.BTN_ENVIAR),
                WaitUntil.the(LNK_ORIGINACION,isEnabled()).forNoMoreThan(20).seconds(),
                Click.on(LNK_ORIGINACION)
        );
        getProxiedDriver().findElement(By.xpath("//div[@class='table-responsive']//td[contains(.,'10000060')]//parent::tr//td[contains(.,'2019-12-16 06:50')]//parent::tr//child::td//a[contains(.,'MARTINEZ CARLOS ANDRES')]")).click();
        Subir.losArchivos();
    }
}