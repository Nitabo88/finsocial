package co.com.red5g.finsonet.tasks;

import co.com.devco.automation.mobile.actions.WaitFor;
import co.com.red5g.finsonet.models.Credito;
import co.com.red5g.finsonet.tasks.factories.Asignarse;
import co.com.red5g.finsonet.tasks.factories.Consulta;
import co.com.red5g.finsonet.tasks.factories.Diligencia;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.red5g.finsonet.userinterfaces.BusquedaGestionPage.LBL_BUSQUEDA_GESTION;
import static co.com.red5g.finsonet.userinterfaces.ChequeoDocumentosPage.LBL_CHEQUEO_DOCUMENTOS;
import static co.com.red5g.finsonet.userinterfaces.ModulosAdministracionPage.*;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_HAMBURGUESA;
import static co.com.red5g.finsonet.userinterfaces.OriginacionPage.MNM_ORIGINACION;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class TesoreriaCrediHuy implements Task {
    private static final String TESORERIA = "Tesorería";
    private static final int TIEMPO = 60;
    private Credito credito;

    public TesoreriaCrediHuy(Credito credito) {
        this.credito = credito;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Consulta.elCreditoEnFormalizacionCrediHuy(credito),
                Diligencia.laAprobacionDelCreditoEnFormalizacionCrediHuy(),
                Click.on(MNM_HAMBURGUESA),
                Click.on(IMG_FINSONET),
                WaitFor.seconds(3),
                WaitUntil.the(LNK_LLAMADAS, isClickable()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(LNK_LLAMADAS),
                Asignarse.laLlamadaCrediHuy(),
                Gestionar.laLlamada(),
                WaitUntil.the(LBL_BUSQUEDA_GESTION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(IMG_FINSONET),
                WaitUntil.the(LBL_MODULOS_ADMINISTRACION, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                WaitUntil.the(LNK_ORIGINACION, isClickable()).forNoMoreThan(TIEMPO).seconds(),
                WaitFor.seconds(3),
                Click.on(LNK_ORIGINACION),
                WaitUntil.the(LBL_CHEQUEO_DOCUMENTOS, isVisible()).forNoMoreThan(TIEMPO).seconds(),
                Click.on(MNM_ORIGINACION.of(TESORERIA))
        );
    }
}
