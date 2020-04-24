package co.com.red5g.finsonet.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtileriaFechas {

    private static String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
    private static String year = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));

    private UtileriaFechas() {
        throw new IllegalStateException("Utileria Fechas");
    }

    public static String formatearFechaServidorUTC() {
        Date fecha = new Date(System.currentTimeMillis());
        DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd HH:");
        return fechaFormateada.format(fecha);
    }

    public static String[] separarFecha(String fecha) {
        return fecha.split("-");
    }

    public static String obtenerPeriodoActual() {
        if (mes.length() < 2) {
            mes = "0" + mes;
        }
        return UtileriaFechas.year + "-" + UtileriaFechas.mes;
    }
}