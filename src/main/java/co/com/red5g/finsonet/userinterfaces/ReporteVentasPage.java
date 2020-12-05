package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public final class ReporteVentasPage {

    public static final Target LBL_TITULO_DETALLE = Target.the("El titulo del detalle de los reportes").located(By.xpath("//h2[text()='Detalle de créditos']"));
    public static final Target LST_PERIODO = Target.the("Fecha del reporte").located(By.id("periodo"));
    public static final Target LBL_VALOR_ORIGINACION = Target.the("el valor total de la originación").located(By.id("valor_orig"));
    public static final Target LBL_VALOR_FINSOAMIGO = Target.the("el valor total del reporte finsoamigo").located(By.id("valor_fa"));
    public static final Target LBL_NUMERO_CREDITOS_ORIGINACION = Target.the("el numero total de créditos en la originación").located(By.id("cantidad_orig"));
    public static final Target LBL_NUMERO_CREDITOS_FINSOAMIGO = Target.the("el numero total de créditos en finsoamigo").located(By.id("cantidad_fa"));
    public static final Target LNK_VER_DETALLE_ORIGINACION = Target.the("el detalle de la originación").located(By.xpath("//div[@id='cierre_orig']/following-sibling::button"));
    public static final Target LBL_NUMERO_CREDITOS_ANTECARTERA = Target.the("el numero total de créditos en antecartera").located(By.id("cantidad_ac"));
    public static final Target LBL_NUMERO_CREDITOS_RADICADOS = Target.the("el numero total de créditos radicados").located(By.id("cantRadicadosFc"));
    public static final Target LBL_NUMERO_CREDITOS_DOCUMENTOS = Target.the("el numero total de créditos de documentos").located(By.id("cantDocumentosFc"));
    public static final Target LBL_NUMERO_CREDITOS_CONFIRMACION = Target.the("el numero total de créditos de confirmación").located(By.id("cantConfirmacionFc"));
    public static final Target LBL_NUMERO_CREDITOS_APROBACION = Target.the("el numero total de créditos de aprobación").located(By.id("cantAprobacionFc"));
    public static final Target LBL_NUMERO_CREDITOS_INCORPORACION = Target.the("el numero total de créditos de incorporación").located(By.id("cantIncoFc"));
    public static final Target LBL_NUMERO_ANTECARTERA = Target.the("el numero total de créditos de antecartera").located(By.id("cantAcFc"));
    public static final Target LBL_VALOR_RADICADOS = Target.the("el valor total de radicados").located(By.id("radicadosFc"));
    public static final Target LBL_VALOR_DOCUMENTOS = Target.the("el valor total de documentos").located(By.id("documentosFc"));
    public static final Target LBL_VALOR_CONFIRMACION = Target.the("el valor total de confirmación").located(By.id("confirmacionFc"));
    public static final Target LBL_VALOR_APROBACION = Target.the("el valor total de aprobación").located(By.id("aprovacionFc"));
    public static final Target LBL_VALOR_INCORPORACION = Target.the("el valor total de incorporación").located(By.id("incorporacionFc"));
    public static final Target LBL_VALOR_ANTECARTERA = Target.the("el valor total de antecartera").located(By.id("antecarteraFc"));
    public static final Target LNK_VER_DETALLE_ANTECARTERA = Target.the("el detalle de la antecartera").located(By.xpath("//div[@id='cierre_ac']/following-sibling::button"));
    public static final Target LBL_VALOR_VENTA_NUEVA = Target.the("el valor total de la venta nueva").located(By.id("valor_vn"));
    public static final Target LBL_NUMERO_CREDITOS_VENTA_NUEVA = Target.the("el numero total de créditos en la originación").located(By.id("cantidad_vn"));
    public static final Target LNK_VER_DETALLE_VENTA_NUEVA = Target.the("el detalle de la originación").located(By.xpath("//div[@id='cierre_vn']/following-sibling::button"));
    public static final Target LBL_VALOR_VENTA_LIBERADA = Target.the("el valor total de la venta liberada").located(By.id("valor_lib"));
    public static final Target LBL_NUMERO_CREDITOS_VENTA_LIBERADA = Target.the("el numero total de créditos en la venta liberada").located(By.id("cantidad_lib"));
    public static final Target LNK_VER_DETALLE_VENTA_LIBERADA = Target.the("el detalle de la venta liberada").located(By.xpath("//div[@id='cierre_lib']/following-sibling::button"));
    public static final Target LNK_VER_DETALLE_VENTA_FINSOAMIGO = Target.the("el detalle de la venta finsoamigo").located(By.xpath("//div[@id='vivo_fa']/following-sibling::button"));
    public static final Target SPN_FINSONET = Target.the("el spiner de carga con el logo de finsonet").located(By.xpath("//img[@class='finsocialLogo']"));
    public static final Target SPN_CARGANDO = Target.the("el spiner de carga").located(By.xpath("//h1[@class='text-white'][contains(.,'Cargando')]"));
    public static final Target LST_VALOR_DETALLE_ORIGINACION = Target.the("la lista de valores de originacion").located(
        By.xpath("//div[@class='table-Rventa02 table-Rventa-1-0']//p[contains(.,'$')]"));
    public static final Target LST_VALOR_DETALLE_FINSOAMIGO = Target.the("la lista de valores de finsoamigo").located(
        By.id("val_vn_fa"));
    public static final Target LST_CREDITO_DETALLE_ORIGINACION = Target.the("la lista de créditos de originación").located(
        By.xpath("//div[@class='table-Rventa02 table-Rventa-1-0']//p[contains(.,'CR')]"));
    public static final Target LST_CREDITO_DETALLE_FINSOAMIGO = Target.the("la lista de créditos de finsoamigo").located(
        By.xpath("//label[@id='cant_vn_fa']"));
    public static final Target LST_CREDITO_DETALLE_ANTECARTERA = Target.the("la lista de créditos de antecartera").located(
        By.xpath("//div[@class='table-Rventa02 table-Rventa-2-0']//p[contains(.,'CR')]"));
    public static final Target LST_VALOR_DETALLE_VENTA_NUEVA = Target.the("la lista de valores de venta nueva").located(
        By.xpath("//div[@class='panel-body'][contains(.,'Detalle por oficina')]//p[contains(.,'$')]"));
    public static final Target LST_VALOR_DETALLE = Target.the("la lista de valores de los créditos").located(
        By.xpath("//span[@class='DOsuma']"));
    public static final Target LST_CREDITOS_DETALLE = Target.the("la lista del número de créditos").located(
        By.xpath("//span[@class='DOcantidad']"));
    public static final Target LST_CREDITO_DETALLE_VENTA_NUEVA = Target.the("la lista de créditos de venta nueva").located(
        By.xpath("//div[@class='panel-body'][contains(.,'Detalle por oficina')]//p//span[@class='DOcantidad']"));
    public static final Target LST_VALOR_DETALLE_VENTA_LIBERADA = Target.the("la lista de valores de venta liberada").located(
        By.xpath("//div[@class='panel-body'][contains(.,'Detalle por oficina')]//p[contains(.,'$')]"));
    public static final Target LST_CREDITO_DETALLE_VENTA_LIBERADA = Target.the("la lista de créditos de venta liberada").located(
        By.xpath("//div[@class='panel-body'][contains(.,'Detalle por oficina')]//p//span[@class='DOcantidad']"));
    public static final Target LNK_VER_DETALLE_FINSOCREDITO = Target.the("la lista de créditos de venta finsocrédito").located(
        By.xpath("//img[@alt='Finsocrédito']//ancestor::div[@class='card-custom card-purple']//span[text()='Ver detalle']"));
    public static final Target LNK_VER_DETALLE_FINSOAMIGO = Target.the("la lista de créditos de finsoamigo").located(
        By.xpath("//img[@alt='Finsoamigo']//ancestor::div[@class='card-custom card-purple']//span[text()='Ver detalle']"));
    public static final Target LNK_VER_DETALLE_FINSOPRODUCTIVO = Target.the("la lista de créditos de finsoproductivo").located(
        By.xpath("//img[@alt='Finsoproductivo']//ancestor::div[@class='card-custom card-purple']//span[text()='Ver detalle']"));
    public static final Target LNK_VER_DETALLE_FINSOALIVIO = Target.the("la lista de créditos de finsoalivio").located(
        By.xpath("//img[@alt='Finsoalivio']//ancestor::div[@class='card-custom card-purple']//span[text()='Ver detalle']"));
    public static final Target LNK_VER_DETALLE_FINSOTIENDA = Target.the("la lista de créditos de tienda en casa").located(
        By.xpath("//img[@alt='Finsotienda']//ancestor::div[@class='card-custom card-purple']//span[text()='Ver detalle']"));
    public static final Target SPN_ELIPSE = Target.the("el spinner de carga").located(By.id("Elipse_4"));
    public static final Target BTN_DETALLE_RADICADOS = Target.the("El botón detalle de radicados").located(By.xpath("//button[@onclick='btnRadicados(this)']"));
    public static final Target BTN_DETALLE_DOCUMENTOS = Target.the("El botón detalle de documentos").located(By.xpath("//button[@onclick='btnDocumentos(this)']"));
    public static final Target BTN_DETALLE_CONFIRMACION = Target.the("El botón detalle de confirmación").located(By.xpath("//button[@onclick='btnConfirmacion(this)']"));
    public static final Target BTN_DETALLE_APROBACION = Target.the("El botón detalle de aprobación").located(By.xpath("//button[@onclick='btnAprobacion(this)']"));
    public static final Target BTN_DETALLE_ANTECARTERA = Target.the("El botón detalle de antecartera").located(By.xpath("//button[@onclick='detAc(this)']"));
    public static final Target BTN_DETALLE_INCORPORACION = Target.the("El botón detalle de Incorporación").located(By.xpath("//button[@onclick='btnIncorporacion(this)']"));

    private ReporteVentasPage() {
        throw new IllegalStateException("Utility class");
    }
}
