package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://192.168.0.48:82/liquidadorComisiones.php")

public class LiquidadorComisionesPage extends PageObject {

    public static final Target LST_PERIODO = Target.the("periodo del reporte").located(By.id("periodoPadre"));
    public static final Target LST_CICLO = Target.the("ciclo del reporte").located(By.id("periodoHijo"));
    public static final Target LBL_TOTAL_CREDITOS_VENTA_NUEVA = Target.the("total numero de creditos venta nueva").located(By.id("cantidad_vn"));
    public static final Target LBL_TOTAL_CREDITOS_VENTA_LIBERADA = Target.the("total numero de creditos venta liberada").located(By.id("cantidad_lib"));
    public static final Target LBL_TOTAL_VENTA_NUEVA = Target.the("total del valor de comisiones de venta directa").located(By.id("valor_vn"));
    public static final Target LBL_TOTAL_VENTA_LIBERADA = Target.the("total del valor de comisiones de venta directa").located(By.id("valor_lib"));
    public static final Target LST_NUMERO_CREDITOS = Target.the("numero de creditos").located(By.xpath("//p[contains(.,'Cr')]"));
    public static final Target LST_VALOR_CREDITOS = Target.the("valor de creditos").located(By.xpath("//p[@class='colocacion']"));
    public static final Target LST_VALOR_LIQUIDACION = Target.the("valor de la liquidacion de la comision").located(By.xpath("//p[@class='liq']"));
    public static final Target BTN_DETALLE_CREDITOS = Target.the("boton detalle de creditos")
        .locatedBy("//p[contains(.,'{0}')]//parent::div//parent::div//child::button");
    public static final Target LST_TOTALES_NUMERO_CREDITOS = Target.the("numero total de creditos")
        .located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div//div[@class='grid-vertical-center'][contains(text(),'TOTALES')]//..//p[contains(.,'Cantidad')]//following-sibling::p[@class='qty']"));
    public static final Target LST_TOTALES_VALORES_CREDITOS = Target.the("valor consolidado de creditos")
        .located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div//div[@class='grid-vertical-center'][contains(text(),'TOTALES')]//..//p[contains(.,'Monto')]//following-sibling::p[contains(@class,'val')]"));
    public static final Target LST_TOTAL_VALOR_LIQUIDACION = Target.the("valor total del pago de creditos").located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body "
        + "p-30']//div//div[@class='grid-vertical-center'][contains(text(),'TOTALES')]//parent::div//p[contains(.,'Total Semana')]//following-sibling::p"));
    public static final Target LST_MONTO_ASESOR = Target.the("los montos por asesor")
        .locatedBy("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div[@class='table-eyes-body'][contains(.,'{0}')]//p[contains(.,'Monto')]//following-sibling::p[@class='val']");
    public static final Target LST_NOMBRE_ASESOR = Target.the("El nombre del asesor")
        .located(By.xpath("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div[@class='table-eyes-body']//div[@class='grid-vertical-center']"));
    public static final Target LST_TOTALES_VALORES_LIQUIDACION = Target.the("valor consolidado de creditos")
        .locatedBy("//div[@data-card='open']//div[contains(text(),'{0}')]//parent::div[@class='table-eyes-body']//p[contains(text(),'Total Semana')]//following-sibling::p[@class='qty']");
    public static final Target LBL_CIUDAD_DETALLE = Target.the("nombre del departamento o asesor").located(By.xpath("//div[@class='tarjeta-info']//p[@class='nom']"));
    public static final Target BTN_CERRAR_DETALLE = Target.the("nombre del departamento o asesor").locatedBy("//div[@class='panel mt-10']//i[@class='fas fa-times rotate white']");
    public static final Target BTN_VER_DETALLE_LIQUIDACION = Target.the("detalle de la liquidacion")
        .locatedBy("//div[@class='panel mt-10']//div[@class='panel-body p-30']//div//div[@class='grid-vertical-center'][contains(.,'{0}')]//parent::div[@class='table-eyes-body']//div//p[contains(.,'Acción')]//parent::div//button");
    public static final Target BTN_ATRAS = Target.the("atras del detalle de la liquidacion").located(By.xpath("//i[@class='far fa-arrow-left fa-25']"));
    public static final Target LBL_PORCENTAJE_COMISION = Target.the("porcentaje comision").locatedBy("//td[@class='bg-td text-green fw-600'][contains(text(),'%')]");
}