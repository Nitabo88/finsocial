package co.com.red5g.finsonet.interacions;

import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.BTN_ANIO;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.BTN_DIA;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.BTN_FLECHA_DERECHA;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.BTN_FLECHA_IZQUIERDA;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.BTN_MES;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.DTP_ANIO;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.DTP_DIA;
import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.DTP_MES;
import static co.com.red5g.finsonet.utils.UtileriaFechas.separarFecha;
import static co.com.red5g.finsonet.utils.Utilerias.between;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

public class SeleccionarFecha implements Interaction {
    private static final String IZQUIERDA = "izquierda";
    private static final String DERECHA = "derecha";
    private Target fecha;
    private String opcionAnio;
    private String opcionMes;
    private String opcionDia;


    private SeleccionarFecha(Target calendar, String date) {
        this.fecha = calendar;
        String[] separadorFecha = date.split("-");
        this.opcionDia = separadorFecha[2];
        this.opcionMes = separadorFecha[1];
        this.opcionAnio = separadorFecha[0];
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(fecha),
                Click.on(BTN_DIA),
                Click.on(BTN_MES)
        );
        String[] anios = separarFecha(BTN_ANIO.resolveFor(actor).getText());
        int numeroMovimientos = desplazamientoAnios(Integer.parseInt(opcionAnio), Integer.parseInt(anios[0]));
        String desplazamiento = direccionDesplazamiento(Integer.parseInt(opcionAnio), Integer.parseInt(anios[0]));
        actor.attemptsTo(
                Check.whether(between(Integer.parseInt(opcionAnio), Integer.parseInt(anios[0]), Integer.parseInt(anios[1])))
                        .andIfSo(
                                Click.on(DTP_ANIO.of(opcionAnio)))
                        .otherwise(
                                SeleccionarElAnio.list(BTN_FLECHA_IZQUIERDA, BTN_FLECHA_DERECHA, numeroMovimientos, desplazamiento),
                                Click.on(DTP_ANIO.of(opcionAnio))),
                Click.on(DTP_MES.of(opcionMes)),
                Click.on(DTP_DIA.of(opcionDia)));
    }

    public static SeleccionarFecha ofConsult(Target calendar, String date) {
        return new SeleccionarFecha(calendar, date);
    }

    private static Integer desplazamientoAnios(int year, int minYear) {
        if (year <= minYear) {
            int modulo = (minYear - year) % 10;
            if (modulo != 0) {
                year = (minYear - year) / 10 + 1;
            } else {
                year = (minYear - year) / 10;
            }
        } else {
            year = (year - minYear) / 10;
        }
        return year;
    }

    private static String direccionDesplazamiento(int year, int minYear) {
        String desplazamiento;
        if (year <= minYear) {
            desplazamiento = IZQUIERDA;
        } else {
            desplazamiento = DERECHA;
        }
        return desplazamiento;
    }
}