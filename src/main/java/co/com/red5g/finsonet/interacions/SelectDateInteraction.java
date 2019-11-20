package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.*;
import static co.com.red5g.finsonet.utils.UtileriaFechas.separarFecha;
import static co.com.red5g.finsonet.utils.Utilerias.*;

public class SelectDateInteraction implements Interaction {

    private Target calendar;
    private Target year;
    private Target month;
    private Target day;
    private Target arrowLeft;
    private Target arrowRight;
    private String[] dateText;
    private String optionYear;
    private String optionMonth;
    private String optionDay;


    public SelectDateInteraction(Target calendar, String date, Target year, Target month, Target day, Target arrowLeft, Target arrowRight) {
        this.calendar = calendar;
        this.year = year;
        this.month = month;
        this.day = day;
        this.arrowLeft = arrowLeft;
        this.arrowRight = arrowRight;
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
                Click.on(BTN_DATA_PICKER_MONTH));
        String[] anios = separarFecha(BTN_DATA_PICKER_YEAR.resolveFor(actor).getText());
        if (between(Integer.parseInt(optionYear), Integer.parseInt(anios[0]), Integer.parseInt(anios[1]))) {
            actor.attemptsTo(Click.on(year.of(optionYear)));
        } else {
            Integer numeroMovimientos = desplazamientoAnios(Integer.parseInt(optionYear), Integer.parseInt(anios[0]), Integer.parseInt(anios[1]));
            String desplazamiento = direccionDesplazamiento(Integer.parseInt(optionYear), Integer.parseInt(anios[0]));
            actor.attemptsTo(
                    SelectTheYear.list(arrowLeft, arrowRight, numeroMovimientos, desplazamiento),
                    Click.on(year.of(optionYear)));
        }
        actor.attemptsTo(
                Click.on(month.of(optionMonth)),
                Click.on(day.of(optionDay)));
    }

    public static SelectDateInteraction ofConsult(Target calendar, String date, Target year, Target month, Target day, Target arrowLeft, Target arrowRight) {
        return new SelectDateInteraction(calendar, date, year, month, day, arrowLeft, arrowRight);
    }
}