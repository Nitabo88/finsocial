package co.com.red5g.finsonet.utils;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;
import net.serenitybdd.core.pages.WebElementFacade;

public final class Utilerias {

  private static final Pattern FORMATO_NUMERO = Pattern.compile("[^\\d-]");

  private Utilerias() {
    }

    public static long suma(List<WebElementFacade> lstValores) {
      long suma = 0;
      for (WebElementFacade lstValore : lstValores) {
        suma += Long.parseLong((FORMATO_NUMERO.matcher(lstValore.getText()).replaceAll("")));
      }
      return suma;
    }

  public static boolean between(int i, int minValueInclusive, int maxValueInclusive) {
    return i >= minValueInclusive && i <= maxValueInclusive;
  }

  public static int random(int valorMinimo, int valorMaximo) {
    return ThreadLocalRandom.current().nextInt(valorMinimo, valorMaximo);
  }
}