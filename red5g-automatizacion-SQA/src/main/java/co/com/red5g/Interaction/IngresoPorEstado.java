package co.com.red5g.Interaction;

import co.com.red5g.task.AbrirEstadoOrig;
import co.com.red5g.userinterfaces.OriginacionPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresoPorEstado implements Interaction {
    private String estadoOrig;
    public IngresoPorEstado(String estadoOrig) {
        this.estadoOrig = estadoOrig;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(getElement())
        );
    }
    public Target getElement(){
        if ("Chequeo Documentos".equals(estadoOrig)) {
            return OriginacionPage.LINK_CHEQUEO_DOCUMENTOS;
        }else if ("Confirmación".equals(estadoOrig)) {
            return OriginacionPage.LINK_CONFIRMACION;
        }else if ("Aprobación de Créditos".equals(estadoOrig)) {
            return OriginacionPage.LINK_APROBACION;
        } else if ("Incorporación".equals(estadoOrig)) {
            return OriginacionPage.LINK_INCORPORACION;
        }else if ("Formalización".equals(estadoOrig)) {
            return OriginacionPage.LINK_FORMALIZACION;
        }else if ("Tesorería".equals(estadoOrig)) {
            return OriginacionPage.LINK_TESORERIA;
        }else if ("A.Cartera".equals(estadoOrig)) {
            return OriginacionPage.LINK_ANTECARTERA;
        }else if ("Giros".equals(estadoOrig)) {
            return OriginacionPage.LINK_GIROS;
        }else if ("Cartera".equals(estadoOrig)) {
            return OriginacionPage.LINK_CARTERA;
        }else {
            return  OriginacionPage.LINK_CHEQUEO_DOCUMENTOS;
        }
    }
    public static IngresoPorEstado elIngreso(String estadoOrig) {
        return instrumented(IngresoPorEstado.class, estadoOrig);
    }
}
