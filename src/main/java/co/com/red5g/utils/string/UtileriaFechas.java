package co.com.red5g.utils.string;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
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

    public static String fechaPdf(String fechaBaseDeDatos) {
        String fechaBD = fechaBaseDeDatos.substring(0, 10);
        String[] fechaPdf = fechaBD.split("-");
        return fechaPdf[2] + " " + fechaPdf[1] + " " + fechaPdf[0];
    }

    public static String fechaPdfSolicitud(String fechaBaseDeDatos) {
        String fechaBD = fechaBaseDeDatos.substring(0, 11);
        String[] fecha = fechaBD.split("-");
        fechaBD = " " + fecha[2] + " " + fecha[1] + " " + fecha[0];
        fechaBD = fechaBD.replace(" ", "");
        return fechaBD.replace("", " ").trim();
    }

    public static String fechaPdfFormatoSlash(String fechaBaseDeDatos) {
        String fechaBD = fechaBaseDeDatos.substring(0, 10);
        String[] fechaPdf = fechaBD.split("-");
        return fechaPdf[0] + "/" + fechaPdf[1] + "/" + fechaPdf[2];
    }

    public static String fechaPdfFormatoLinea(String fechaBaseDeDatos) {
        return fechaBaseDeDatos.substring(0, 10);
    }


    public static String edad(String fechaNacimiento) {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate fechaNac = LocalDate.parse(fechaNacimiento, formato);
        LocalDate ahora = LocalDate.now();
        Period edad = Period.between(fechaNac, ahora);
        return String.valueOf(edad.getYears());
    }
}