package co.com.red5g.finsonet.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class UtileriaFechas {

    private static String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
    private static String anio = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));

    private UtileriaFechas() {
        throw new IllegalStateException("Utileria Fechas");
    }

    public static String masUnMinuto(String minuto) {
        String[] hora = minuto.split(":");
        if (Integer.parseInt(hora[1]) + 1 < 10) {
            return hora[0] + ":0" + (Integer.parseInt(hora[1]) + 1);
        } else
            return hora[0] + ":" + (Integer.parseInt(hora[1]) + 1);
    }

    public static String formatearFechaServidorUTC(){
        Date fecha = new Date(System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(10));
        DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        fechaFormateada.setTimeZone(TimeZone.getTimeZone("Etc/GMT+10"));
        return fechaFormateada.format(fecha);
    }

    public static String[] separarFecha(String fecha){
      return  fecha.split("-");
    }

    public static String obtenerPeriodoActual() {
        if (mes.length() < 2) {
            mes = "0" + mes;
        }
        return "2019" + "-" + "10";
    }
}