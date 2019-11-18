package co.com.red5g.finsonet.utils;

import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;

public class Utilidades {
    private Utilidades() {
    }

    public static Double suma(List<WebElementFacade> lstValores) {
       double suma = 0.0;
         for (WebElementFacade lstValore : lstValores) {
             suma = suma + Double.parseDouble(lstValore.getText().replaceAll("[^\\d]", ""));
         }
         return suma;
     }
}