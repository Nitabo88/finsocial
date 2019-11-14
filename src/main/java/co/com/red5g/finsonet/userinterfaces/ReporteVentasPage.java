package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

import java.util.List;

public class ReporteVentasPage {
    public static final Target LST_PERIODO = Target.the("Fecha del reporte").located(By.id("periodo"));
    public static final Target LBL_VALOR_ORIGINACION = Target.the("el valor total de la originacion").located(By.id("valor_orig"));
    public static final Target LBL_NUMERO_CREDITOS_ORIGINACION = Target.the("el numero total de creditos en la originacion").located(By.id("cantidad_orig"));
    public static final Target LNK_VER_DETALLE_ORIGINACION = Target.the("el detalle de la originacion").located(By.xpath("//div[@id='cierre_orig']/following-sibling::button"));
    public static final Target LBL_VALOR_ANTECARTERA = Target.the("el valor total de la antecartera").located(By.id("valor_ac"));
    public static final Target LBL_NUMERO_CREDITOS_ANTECARTERA = Target.the("el numero total de creditos en antecartera").located(By.id("cantidad_ac"));
    public static final Target LNK_VER_DETALLE_ANTECARTERA = Target.the("el detalle de la antecartera").located(By.xpath("//div[@id='cierre_ac']/following-sibling::button"));
    public static final Target LBL_VALOR_VENTA_NUEVA = Target.the("el valor total de la venta nueva").located(By.id("valor_vn"));
    public static final Target LBL_NUMERO_CREDITOS_VENTA_NUEVA = Target.the("el numero total de creditos en la originacion").located(By.id("cantidad_vn"));
    public static final Target LNK_VER_DETALLE_VENTA_NUEVA = Target.the("el detalle de la originacion").located(By.xpath("//div[@id='cierre_vn']/following-sibling::button"));
    public static final Target LBL_VALOR_VENTA_LIBERADA = Target.the("el valor total de la venta liberada").located(By.id("valor_lib"));
    public static final Target LBL_NUMERO_CREDITOS_VENTA_LIBERADA = Target.the("el numero total de creditos en la venta liberda").located(By.id("cantidad_lib"));
    public static final Target LNK_VER_DETALLE_VENTA_LIBERADA = Target.the("el detalle de la venta liberada").located(By.xpath("//div[@id='cierre_lib']/following-sibling::button"));
    public static final Target SPN_CARGA = Target.the("el detalle de la venta liberada").located(By.xpath("//img[@class='finsocialLogo']"));
    public static final List<Target> LST_VALOR_DETALLE_ORIGINACION = (List<Target>) Target.the ("la lista de valores de originacion").located(By.xpath("//div[@class='table-Rventa02 table-Rventa-1-0']//p[contains(.,'$')]"));
}
