package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CreditoOriginacionReportePage {
    public static final Target LBL_VALOR_DOCUMENTOS = Target.the("el valor de los creditos en documentos").located(By.id("valor_docs"));
    public static final Target LBL_CREDITOS_DOCUMENTOS = Target.the("el numero de los creditos en documentos").located(By.id("cantidad_docs"));
    public static final Target LBL_VALOR_CONFIRMACION = Target.the("el valor de los creditos en confirmacion").located(By.id("valor_confirmacion"));
    public static final Target LBL_CREDITOS_CONFIRMACION = Target.the("el numero de los creditos en confirmacion").located(By.id("cantidad_confirmacion"));
    public static final Target LBL_VALOR_APROBACION = Target.the("el valor de los creditos en aprobacion").located(By.id("valor_aprobacion"));
    public static final Target LBL_CREDITOS_APROBACION = Target.the("el numero de los creditos en aprobacion").located(By.id("cantidad_aprobacion"));
    public static final Target LBL_VALOR_INCORPORACION = Target.the("el valor de los creditos en incorporacion").located(By.id("valor_incorporacion"));
    public static final Target LBL_CREDITOS_INCORPORACION = Target.the("el numero de los creditos en incorporacion").located(By.id("cantidad_incorporacion"));
    public static final Target LBL_VALOR_TESORERIA = Target.the("el valor de los creditos en tesoreria").located(By.id("valor_tesoreria"));
    public static final Target LBL_CREDITOS_TESORERIA = Target.the("el numero de los creditos en tesoreria").located(By.id("cantidad_tesoreria"));
    public static final Target LBL_VALOR_REPROCESOS = Target.the("el valor de los creditos en reprocesos").located(By.id("valor_reproceso"));
    public static final Target LBL_CREDITOS_REPROCESOS = Target.the("el numero de los creditos en reprocesos").located(By.id("cantidad_reproceso"));
}