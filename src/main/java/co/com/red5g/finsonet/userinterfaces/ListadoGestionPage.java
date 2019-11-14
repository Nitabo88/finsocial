package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ListadoGestionPage {
   public static final Target TXT_BUSQUEDA_DOCUMENTO = Target.the("el campo de busqueda").located(By.id("searchDoc"));
}
