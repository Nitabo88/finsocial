package co.com.red5g.finsonet.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.questions.SeleccionarFila.seleccionarFila;
import static co.com.red5g.finsonet.tasks.FormularioSolicitudCredito.FECHA_SOLICITUD_CREDITO;
import static co.com.red5g.finsonet.tasks.InformacionCredito.CEDULA_ACTOR;
import static co.com.red5g.finsonet.userinterfaces.ConfirmacionPage.LST_FILA_CONFIRMACION;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNU_ORIGINACION;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getProxiedDriver;

public class ElCredito implements Question <Boolean> {
    private static final String CONFIRMACION ="Confirmación";

    public static ElCredito enConfirmacion() {
        return new ElCredito();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        getProxiedDriver().switchTo().activeElement().sendKeys(Keys.ESCAPE);
        actor.attemptsTo(
                Click.on(MNU_ORIGINACION.of(CONFIRMACION)));
        SeleccionarFila lstFila = seleccionarFila(LST_FILA_CONFIRMACION, actor.recall(CEDULA_ACTOR), actor.recall(FECHA_SOLICITUD_CREDITO));
        return lstFila.answeredBy(actor).isPresent();    }
}
