package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://192.168.0.18:81/liquidadorComisiones.php")

public class LiquidadorComisionesPage extends PageObject {
    public static final Target LST_PERIODO = Target.the("periodo del reporte").located(By.id("periodoPadre"));
    public static final Target LST_CICLO = Target.the("ciclo del reporte").located(By.id("periodoHijo"));
    public static final Target LBL_TOTAL_CREDITOS_VENTA_NUEVA= Target.the("total numero de creditos venta nueva").located(By.id("cantidad_vn"));
    public static final Target LBL_TOTAL_CREDITOS_VENTA_LIBERADA= Target.the("total numero de creditos venta liberada").located(By.id("cantidad_lib"));
    public static final Target LBL_TOTAL_VENTA_NUEVA= Target.the("total del valor de comisiones de venta directa").located(By.id("valor_vn"));
    public static final Target LBL_TOTAL_VENTA_LIBERADA= Target.the("total del valor de comisiones de venta directa").located(By.id("valor_lib"));
    public static final Target LST_CREDITOS_VENTA_DIRECTA= Target.the("lista de comisiones de venta directa").located(By.xpath("//p[contains(.,'Cr')]"));


}