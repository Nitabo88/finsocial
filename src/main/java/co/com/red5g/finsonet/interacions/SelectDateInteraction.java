package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.*;
import static co.com.red5g.finsonet.utils.UtileriaFechas.separarFecha;
import static co.com.red5g.finsonet.utils.Utilerias.*;

public class SelectDateInteraction implements Interaction {

    private Target calendar;
    private String[] dateText;
    private String optionYear;
    private String optionMonth;
    private String optionDay;


    public SelectDateInteraction(Target calendar, String date) {
        this.calendar = calendar;
        this.dateText = date.split("-");
        this.optionDay = dateText[2];
        this.optionMonth = dateText[1];
        this.optionYear = dateText[0];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(calendar),
                Click.on(BTN_DATA_PICKER_DAY),
                Click.on(BTN_DATA_PICKER_MONTH)
        );
        String[] anios = separarFecha(BTN_DATA_PICKER_YEAR.resolveFor(actor).getText());
        int numeroMovimientos = desplazamientoAnios(Integer.parseInt(optionYear), Integer.parseInt(anios[0]));
        String desplazamiento = direccionDesplazamiento(Integer.parseInt(optionYear), Integer.parseInt(anios[0]));
        actor.attemptsTo(
                Check.whether(between(Integer.parseInt(optionYear), Integer.parseInt(anios[0]), Integer.parseInt(anios[1])))
                        .andIfSo(
                                Click.on(DATA_PICKER_YEAR.of(optionYear)))
                        .otherwise(
                                SelectTheYear.list(BTN_ARROW_LEFT, BTN_ARROW_RIGHT, numeroMovimientos, desplazamiento),
                                Click.on(DATA_PICKER_YEAR.of(optionYear))),
                Click.on(DATA_PICKER_MONTH.of(optionMonth)),
                Click.on(DATA_PICKER_DAY.of(optionDay)));
    }

    public static SelectDateInteraction ofConsult(Target calendar, String date) {
        return new SelectDateInteraction(calendar, date);
    }
}