package co.com.red5g.finsonet.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Utilerias {

    private Utilerias() {
    }

    public static double suma(List<WebElementFacade> lstValores) {
       double suma = 0.0;
         for (WebElementFacade lstValore : lstValores) {
             suma = suma + Double.parseDouble(lstValore.getText().replaceAll("[^\\d]", ""));
         }
         return suma;
     }

     public static double sumaValores(List<String> lstValores){
        return lstValores.stream().mapToDouble(lstValore -> Double.parseDouble(lstValore.replaceAll("[^\\d]", ""))).sum();
     }

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }
}