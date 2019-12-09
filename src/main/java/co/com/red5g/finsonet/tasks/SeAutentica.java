package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credenciales;
import co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Alert;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.*;
import static co.com.red5g.finsonet.userinterfaces.LoginFinsonetPage.*;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_HOME;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.LNK_ORIGINACION;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
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
                WaitUntil.the(LNK_ORIGINACION, isClickable()).forNoMoreThan(20).seconds(),
                Click.on(LNK_ORIGINACION),
                JavaScriptClick.on(LST_CHEQUEO_DOCUMENTOS_NOMBRE.of("10000060", "2019-12-06 09:41", "MARTINEZ CARLOS ANDRES"))
        );

        getProxiedDriver().findElement(By.xpath("//tr[@id='doc-43']//button[@class='bg-square-button white bg-green']")).click();
// enter the filename
        getProxiedDriver().findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\files\\prueba.pdf");
        BTN_CERRAR.resolveFor(actor).click();
        getProxiedDriver().findElement(By.xpath("//tr[@id='doc-54']//button[@class='bg-square-button white bg-green']")).click();
// enter the filename
        getProxiedDriver().findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\Licet\\Documents\\sqa_code\\src\\test\\resources\\files\\prueba.pdf");
        BTN_CERRAR.resolveFor(actor).click();
        BTN_GUARDAR.resolveFor(actor).click();
      
        actor.attemptsTo(
                WaitUntil.the(LNK_HOME,isClickable())
        );
    }
}