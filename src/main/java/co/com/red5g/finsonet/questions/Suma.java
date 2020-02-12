package co.com.red5g.finsonet.questions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import java.util.List;

public class Suma implements Question<String> {
    private final List<WebElementFacade> lstValores;

    public Suma(final List<WebElementFacade> lstValores) {
        this.lstValores = lstValores;
    }

    public static Question<String> deLosValores(final List<WebElementFacade> lstValores) {
        return new Suma(lstValores);
    }

    @Override
    public String answeredBy(final Actor actor) {
        double suma = 0.0;
        for (final WebElementFacade lstValore : this.lstValores) {
            suma = suma + Double.parseDouble(lstValore.getText().replaceAll("[^\\d]", ""));
        }
        return String.valueOf(suma);
    }
}
