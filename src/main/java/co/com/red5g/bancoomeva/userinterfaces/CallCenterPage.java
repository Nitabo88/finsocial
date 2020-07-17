package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CallCenterPage {

  public static final Target LNK_CALL_CENTER = Target.the("el link a call center").located(By.id("comercial"));
  public static final Target LNK_FLUJO_CALL_CENTER = Target.the("el link a flujo de call center").located(By.id("creditoNew"));

}
