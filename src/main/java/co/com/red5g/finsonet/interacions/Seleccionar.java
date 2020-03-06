package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Seleccionar implements Interaction {
    private final String opcion;
    private final Target btnLista;
    private final Target lista;

    private Seleccionar(String opcion, Target btnLista, Target lista) {
        this.opcion = opcion;
        this.btnLista = btnLista;
        this.lista = lista;
    }

    public static Seleccionar opcionLista(String opcion, Target btnLista, Target lista) {
        return new Seleccionar(opcion, btnLista, lista);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(btnLista)
        );
      lista.resolveFor(actor).find(By.xpath("//li[contains(.,'" + opcion + "')]")).click();
    }
}
