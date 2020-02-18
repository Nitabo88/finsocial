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

    private Seleccionar(final String opcion, final Target btnLista, final Target lista) {
        this.opcion = opcion;
        this.btnLista = btnLista;
        this.lista = lista;
    }

    public static Seleccionar opcionLista(final String opcion, final Target btnLista, final Target lista) {
        return new Seleccionar(opcion, btnLista, lista);
    }


    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Click.on(this.btnLista)
        );
      this.lista.resolveFor(actor).find(By.xpath("//li[contains(.,'" + this.opcion + "')]")).click();
    }
}
