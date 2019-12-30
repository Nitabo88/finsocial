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
    public static final Target LST_NUMERO_CREDITOS= Target.the("numero de creditos").located(By.xpath("//p[contains(.,'Cr')]"));
    public static final Target LST_VALOR_CREDITOS= Target.the("valor de creditos").located(By.xpath("//p[@class='colocacion']"));
    public static final Target BTN_DETALLE_CREDITOS = Target.the("numero de creditos").locatedBy("//p[contains(.,'{0}')]//parent::div//parent::div//child::button");
    public static final Target LST_TOTALES_NUMERO_CREDITOS= Target.the("numero de creditos").located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div//div[@class='grid-vertical-center'][contains(text(),'TOTALES')]//..//p[contains(.,'Cantidad')]//following-sibling::p[@class='qty']"));
    public static final Target LST_TOTALES_VALORES_CREDITOS= Target.the("valor consolidado de creditos").located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div//div[@class='grid-vertical-center'][contains(text(),'TOTALES')]//..//p[contains(.,'Monto')]//following-sibling::p[@class='val']"));
    public static final Target LBL_CIUDAD_DETALLE = Target.the("nombre del departamento o asesor").located(By.xpath("//div[@class='tarjeta-info']//p[@class='nom']"));
    public static final Target BTN_CERRAR_DETALLE= Target.the("nombre del departamento o asesor").locatedBy("//h2[contains(.,'{0}')]//parent::div");
}