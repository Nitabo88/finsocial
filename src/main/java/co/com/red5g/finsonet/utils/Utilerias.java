package co.com.red5g.finsonet.utils;

import java.util.List;
import net.serenitybdd.core.pages.WebElementFacade;

public class Utilerias {

    private Utilerias() {
    }

    public static long suma(List<WebElementFacade> lstValores) {
       long suma = 0;
         for (WebElementFacade lstValore : lstValores) {
             suma = suma + Long.parseLong(lstValore.getText().replaceAll("[^\\d]", ""));
         }
         return suma;
     }

    public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }
}