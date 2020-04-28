package co.com.red5g.userinterfaces.finsonet;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class ListadoGestionPage {
   public static final Target TXT_BUSQUEDA_DOCUMENTO = Target.the("el campo de busqueda").located(By.id("searchDoc"));

   private ListadoGestionPage() {
      throw new IllegalStateException("Utility class");
   }
}
