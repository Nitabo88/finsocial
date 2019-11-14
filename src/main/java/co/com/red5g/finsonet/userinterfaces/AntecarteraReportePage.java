package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class AntecarteraReportePage {
    public static final Target LBL_VALOR_LIBERADOS = Target.the("el valor de los creditos liberador").located(By.id("valor_liberado"));
    public static final Target LBL_CREDITOS_LIBERADOS = Target.the("el numero de los creditos liberados").located(By.id("cantidad_liberado"));
    public static final Target LBL_VALOR_SIN_LIBERAR = Target.the("el valor de los creditos sin liberar").located(By.id("valor_sin_lib"));
    public static final Target LBL_CREDITOS_SIN_LIBERAR = Target.the("el numero de los creditos sin liberar").located(By.id("cantidad_sin_lib"));
    public static final Target LBL_VALOR_EN_ORIGINACION = Target.the("el valor de los creditos en originacion").located(By.id("valor_originacion"));
    public static final Target LBL_CREDITOS_EN_ORIGINACION = Target.the("el numero de los creditos en originacion").located(By.id("cantidad_originacion"));
    public static final Target LBL_VALOR_NEGADOS = Target.the("el valor de los creditos negados").located(By.id("valor_negado"));
    public static final Target LBL_CREDITOS_NEGADOS = Target.the("el numero de los creditos negados").located(By.id("cantidad_negado"));
}