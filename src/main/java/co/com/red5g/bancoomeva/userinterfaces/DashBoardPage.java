package co.com.red5g.bancoomeva.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DashBoardPage {

  public static final Target LBL_MENSAJE_DASHBOARD = Target.the("El mensaje de bienvenida del dashboard").located(By.xpath("//strong[contains(text(),'Dashboard - Banca Express +')]"));
  public static final Target LNK_CALL_CENTER = Target.the("link a call center").located(By.xpath("//strong[text()='Call center']"));
  public static final Target LNK_OFICINA = Target.the("link a oficina").located(By.xpath("//strong[text()='Oficina']"));
  public static final Target LNK_CONFIGURACION = Target.the("link a configuracion").located(By.xpath("//strong[text()='Configuración']"));
  public static final Target LNK_REPORTES = Target.the("link a reportes").located(By.xpath("//strong[text()='Reportes']"));
  public static final Target LNK_GARANTE = Target.the("link a garante").located(By.xpath("//strong[text()='Garante']"));

}
