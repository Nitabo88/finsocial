package co.com.red5g.finsonet.interacions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.red5g.finsonet.userinterfaces.DataPickerPage.*;
import static co.com.red5g.finsonet.utils.UtileriaFechas.separarFecha;
import static co.com.red5g.finsonet.utils.Utilerias.*;

public class SeleccionarFecha implements Interaction {
    private static final String IZQUIERDA = "izquierda";
    private static final String DERECHA = "derecha";
    private final Target fecha;
    private final String opcionAnio;
    private final String opcionMes;
    private final String opcionDia;


    private SeleccionarFecha(final Target calendar, final String date) {
      fecha = calendar;
        final String[] separadorFecha = date.split("-");
      opcionDia = separadorFecha[2];
      opcionMes = separadorFecha[1];
      opcionAnio = separadorFecha[0];
    }

    @Override
    public <T extends Actor> void performAs(final T actor) {
        actor.attemptsTo(
                Click.on(this.fecha),
                Click.on(BTN_DIA),
                Click.on(BTN_MES)
        );
        final String[] anios = separarFecha(BTN_ANIO.resolveFor(actor).getText());
        final int numeroMovimientos = SeleccionarFecha.desplazamientoAnios(Integer.parseInt(this.opcionAnio), Integer.parseInt(anios[0]));
        final String desplazamiento = SeleccionarFecha.direccionDesplazamiento(Integer.parseInt(this.opcionAnio), Integer.parseInt(anios[0]));
        actor.attemptsTo(
                Check.whether(between(Integer.parseInt(this.opcionAnio), Integer.parseInt(anios[0]), Integer.parseInt(anios[1])))
                        .andIfSo(
                                Click.on(DTP_ANIO.of(this.opcionAnio)))
                        .otherwise(
                                SeleccionarElAnio.list(BTN_FLECHA_IZQUIERDA, BTN_FLECHA_DERECHA, numeroMovimientos, desplazamiento),
                                Click.on(DTP_ANIO.of(this.opcionAnio))),
                Click.on(DTP_MES.of(this.opcionMes)),
                Click.on(DTP_DIA.of(this.opcionDia)));
    }

    public static SeleccionarFecha ofConsult(final Target calendar, final String date) {
        return new SeleccionarFecha(calendar, date);
    }

    private static Integer desplazamientoAnios(int year, final int minYear) {
        if (year <= minYear) {
            final int modulo = (minYear - year) % 10;
            if (modulo != 0) {
                year = (minYear - year) / 10 + 1;
            }
            year = (minYear - year) / 10;
        } else {
            year = (year - minYear) / 10;
        }
        return year;
    }

    private static String direccionDesplazamiento(final int year, final int minYear) {
        final String desplazamiento;
        if (year <= minYear) {
            desplazamiento = SeleccionarFecha.IZQUIERDA;
        } else {
            desplazamiento = SeleccionarFecha.DERECHA;
        }
        return desplazamiento;
    }
}