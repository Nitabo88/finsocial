package co.com.red5g.finsonet.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class UtileriaFechas {

    private static String dia = Integer.toString(Calendar.getInstance().get(Calendar.DATE));
    private static String mes = Integer.toString(Calendar.getInstance().get(Calendar.MONTH) + 1);
    private static String anio = Integer.toString(Calendar.getInstance().get(Calendar.YEAR));
    
    private UtileriaFechas() {
        throw new IllegalStateException("Utileria Fechas");
      }

    public static String obtenerFechaConSlash() {
        if (mes.length() < 2)
            mes = "0" + mes;
        if (dia.length() < 2)
            dia = "0" + dia;
        return dia + "/" + mes + "/" + anio;
    }

    public static String  obtenerFechaSinDiaConGuion(){
        if (mes.length() < 2)
            mes = "0" + mes;
        return anio + "-" + mes;
    }

    public static String obtenerFechaConSlashAnioDosDigitos() {
        if (mes.length() < 2)
            mes = "0" + mes;
        if (dia.length() < 2)
            dia = "0" + dia;
        return dia + "/" + mes + "/" + anio.substring(2);
    }

    public static String obtenerFechaConGuion() {
        if (mes.length() < 2)
            mes = "0" + mes;
        if (dia.length() < 2)
            dia = "0" + dia;
        return anio + "-" + mes + "-" + dia;
    }

    public static String obtenerFechaActual() {
        if (mes.length() < 2)
            mes = "0" + mes;
        if (dia.length() < 2)
            dia = "0" + dia;
        return dia + "" + mes + "" + anio;
    }

    public static String obtenerFechaPosteriorConSlash() {
        if (mes.length() < 2)
            mes = "0" + mes;
        int diaPosterior = Integer.parseInt(dia) + 1;
        String stringDia = Integer.toString(diaPosterior);
        if (stringDia.length() < 2)
            stringDia = "0" + stringDia;
        return stringDia + "/" + mes + "/" + anio;
    }

    private static String darFormatoHora(String hora, String meridiano) {
        int horaEntera = Integer.parseInt(hora);
        String auxiliar;
        if (horaEntera < 12 && meridiano.contains("PM"))
            auxiliar = Integer.toString(horaEntera + 12);
        else if ((horaEntera > 9 && meridiano.contains("AM")) || (horaEntera == 12 && meridiano.contains("PM")))
            auxiliar = hora;
        else
            auxiliar = "0" + hora;
        return auxiliar;
    }

    public static String menosUnMinuto(String minuto) {
        String []hora = minuto.split(":");
        if (Integer.parseInt(hora[1]) - 1 < 10)
            return hora[0] + ":0" + (Integer.parseInt(hora[1]) - 1);
        else
            return hora[0] + ":" + (Integer.parseInt(hora[1]) - 1);
    }

    public static String masUnMinuto(String minuto){
        String []hora = minuto.split(":");
        if (Integer.parseInt(hora[1]) + 1 < 10)
            return hora[0] + ":0" + (Integer.parseInt(hora[1]) + 1);
        else
            return hora[0] + ":" + (Integer.parseInt(hora[1]) + 1);
    }

    public static String formatearFechaServidorUTC(){
        Date fecha = new Date(System.currentTimeMillis() - TimeUnit.MINUTES.toMillis(10));
        DateFormat fechaFormateada = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        fechaFormateada.setTimeZone(TimeZone.getTimeZone("Etc/GMT-2"));
        return fechaFormateada.format(fecha);
    }
}