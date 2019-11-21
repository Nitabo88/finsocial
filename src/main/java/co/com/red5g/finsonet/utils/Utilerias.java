package co.com.red5g.finsonet.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Utilerias {
    private static final String LEFT = "left";
    private static final String RIGHT = "right";

    private Utilerias() {
    }

    public static Double suma(List<WebElementFacade> lstValores) {
       double suma = 0.0;
         for (WebElementFacade lstValore : lstValores) {
             suma = suma + Double.parseDouble(lstValore.getText().replaceAll("[^\\d]", ""));
         }
         return suma;
     }

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }

    public static Integer desplazamientoAnios(int year, int minYear) {
        if (year < minYear) {
            year = (minYear - year) / 10;
        } else {
            year = (year - minYear) / 10;
        }
        return year;
    }

    public static String direccionDesplazamiento(int year, int minYear){
        String desplazamiento = "";
        if (year < minYear) {
            desplazamiento = LEFT;
        } else {
            desplazamiento = RIGHT;
        }
        return desplazamiento;
    }
}