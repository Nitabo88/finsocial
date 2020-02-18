package co.com.red5g.finsonet.tasks;

import static co.com.red5g.finsonet.userinterfaces.BusquedaVetadosPage.CHK_CRITERIO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.BusquedaVetadosPage.TXT_PARAMETRO_BUSQUEDA;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNU_BUSQUEDA_VETADOS;
import static co.com.red5g.finsonet.userinterfaces.VetadosPage.MNU_RIESGOS;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import co.com.red5g.finsonet.models.Vetados;
import co.com.red5g.finsonet.tasks.factories.Ubicarse;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;

public class Eliminar implements Task {

    private static final String TIPO_DOCUMENTO = "Cédula";
    Vetados vetados;

    public Eliminar(final Vetados vetados) {
        this.vetados = vetados;
    }

    public static Eliminar elVeto(Vetados vetados) {
        return instrumented(Eliminar.class, vetados);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Ubicarse.enVetados(),
            Click.on(MNU_RIESGOS),
            Click.on(MNU_BUSQUEDA_VETADOS),
            JavaScriptClick.on(CHK_CRITERIO_BUSQUEDA.of(TIPO_DOCUMENTO)),
            Enter.theValue(vetados.getDocumentoVetados()).into(TXT_PARAMETRO_BUSQUEDA));
    }
}
