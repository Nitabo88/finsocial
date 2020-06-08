package co.com.red5g.utils.string;

import java.text.NumberFormat;
import java.util.Locale;

public class UtileriasMoneda {

  private UtileriasMoneda() {
    throw new IllegalStateException("Utileria Fechas");
  }

  public static String formatoMoneda(String moneda) {
    Locale locale = new Locale("en", "US");
    NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(locale);
    String[] formato = currencyFormatter.format(Integer.parseInt(moneda)).split("\\.");
    return formato[0].replace(",", ".");
  }
}
