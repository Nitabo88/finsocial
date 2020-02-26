package co.com.red5g.finsonet.utils;

import java.util.List;
import java.util.regex.Pattern;
import net.serenitybdd.core.pages.WebElementFacade;

public class Utilerias {

  private static final Pattern FORMATO_NUMERO = Pattern.compile("[^\\d-]");

  private Utilerias() {
    }

    public static long suma(final List<WebElementFacade> lstValores) {
       long suma = 0;
         for (final WebElementFacade lstValore : lstValores) {
           suma += Long.parseLong((Utilerias.FORMATO_NUMERO.matcher(lstValore.getText()).replaceAll("")));
         }
         return suma;
     }

    public static boolean between(final int i, final int minValueInclusive, final int maxValueInclusive) {
        return i >= minValueInclusive && i <= maxValueInclusive;
    }
}