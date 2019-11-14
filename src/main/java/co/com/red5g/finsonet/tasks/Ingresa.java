package co.com.red5g.finsonet.tasks;

import co.com.red5g.finsonet.models.builder.InformacionCreditoBuilder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.red5g.finsonet.userinterfaces.NuevoCreditoPage.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

public class Ingresa implements Task {
    private String cedula;
    private String cuota;
    private String plazo;

    public Ingresa(String cedula, String cuota, String plazo) {
        this.cedula = cedula;
        this.cuota = cuota;
        this.plazo = plazo;
    }

    public static InformacionCreditoBuilder suDocumento(String strNumeroDocumento) {
        return new InformacionCreditoBuilder(strNumeroDocumento);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(TXT_DOCUMENTO, isCurrentlyEnabled()),
                Enter.theValue(this.cedula).into(TXT_DOCUMENTO).thenHit(Keys.ENTER),
                WaitUntil.the(TBL_INFORMACION_CREDITOS, isPresent()),
                Enter.theValue(this.cuota).into(TXT_VALOR_CUOTA).thenHit(Keys.TAB)
        );
        actor.attemptsTo(Click.on(TXT_PLAZO),
                Enter.theValue(this.plazo).into(TXT_PLAZO),
                WaitUntil.the(BTN_CREAR_CREDITO, isCurrentlyEnabled()),
                Click.on(BTN_CREAR_CREDITO),
                WaitUntil.the(FRM_EMERGENTE, isPresent()),
                Click.on(BTN_OK)
        );
    }
}