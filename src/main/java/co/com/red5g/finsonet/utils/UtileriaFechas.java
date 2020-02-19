package co.com.red5g.finsonet.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class UtileriaFechas {

    private static String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
    private static final String anio = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));

    private UtileriaFechas() {
        throw new IllegalStateException("Utileria Fechas");
    }

    public static String masUnMinuto(final String minuto) {
        final String[] hora = minuto.split(":");
        return Integer.parseInt(hora[1]) + 1 < 10 ? hora[0] + ":0" + (Integer.parseInt(hora[1]) + 1) : hora[0] + ":" + (Integer.parseInt(hora[1]) + 1);
    }

    public static String formatearFechaServidorUTC(){
        final Date fecha = new Date(System.currentTimeMillis());
        final DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        return fechaFormateada.format(fecha);
    }

    public static String[] separarFecha(final String fecha){
      return  fecha.split("-");
    }

    public static String obtenerPeriodoActual() {
        if (UtileriaFechas.mes.length() < 2) {
          UtileriaFechas.mes = "0" + UtileriaFechas.mes;
        }
        return "2019" + "-" + "12";
    }
}