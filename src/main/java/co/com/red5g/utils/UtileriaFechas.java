package co.com.red5g.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtileriaFechas {

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
        String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
        if (mes.length() < 2) {
            mes = "0" + mes;
        }
        return UtileriaFechas.year + "-" + mes;
    }

    public static String obtenerPeriodoAnterior() {
        String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH));
        if (mes.length() < 2) {
            mes = "0" + mes;
        }
        return UtileriaFechas.year + "-" + mes;
    }

    public static String sumarRestarDias(int dias) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.DAY_OF_YEAR, dias);
        DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MMM-d");
        String fecha = fechaFormateada.format(calendar.getTime());
        return fecha.substring(0, 6).toUpperCase() + fecha.substring(6);
    }
}