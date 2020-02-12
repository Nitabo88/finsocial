package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormularioSolicitudPaso4Page {
    public static final Target TXT_ACTIVOS_CORRIENTES = Target.the("el valor de activos corrientes").located(By.id("activos_corrientes"));
    public static final Target TXT_ACTIVOS_FIJOS = Target.the("el valor de activos fijos").located(org.openqa.selenium.By.id("activos_fijos"));
    public static final Target TXT_OTROS_ACTIVOS = Target.the("el valor de otros activos").located(org.openqa.selenium.By.id("otros_activos"));
    public static final Target TXT_CUALES_ACTIVOS = Target.the("cuales activos?").located(org.openqa.selenium.By.id("cuales_activos"));
    public static final Target TXT_PASIVOS_CORRIENTES = Target.the("El valor de pasivos corrientes").located(org.openqa.selenium.By.id("pasivos_corrientes"));
    public static final Target TXT_PASIVOS_FINANCIEROS = Target.the("El valor de pasivos financieros").located(org.openqa.selenium.By.id("pasivos_financieros"));
    public static final Target TXT_OTROS_PASIVOS = Target.the("El valor de otros pasivos").located(org.openqa.selenium.By.id("pasivos_corrientes"));
    public static final Target TXT_CUALES_PASIVOS = Target.the("cuales pasivos").located(org.openqa.selenium.By.id("cuales_pasivos"));
    public static final Target TXT_TOTAL_ACTIVOS = Target.the("El valor total activos").located(org.openqa.selenium.By.id("total_activos"));
    public static final Target TXT_TOTAL_PASIVOS = Target.the("El valor total pasivos").located(org.openqa.selenium.By.id("total_pasivos"));
    public static final Target RBN_COMPRAR_VIVIENDA = Target.the("la opcion de comprar vivienda").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdCompViv']");
    public static final Target RBN_CUPO_EXTRA_LIBRANZA = Target.the("la opcion de cupo de libranza").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdCupoExtra']");
    public static final Target LST_USO_CREDITO = Target.the("como va utilizar el dinero").located(org.openqa.selenium.By.id("cmbRazondecredito"));
    public static final Target TXT_TIPO_INMUEBLE = Target.the("el tipo de inmueble").located(org.openqa.selenium.By.id("txtTipoInm"));
    public static final Target TXT_VALOR_COMERCIAL_INMUEBLE = Target.the("el valor comercial").located(org.openqa.selenium.By.id("txtValorComInm"));
    public static final Target TXT_HIPOTECADO = Target.the("hipotecado a").located(org.openqa.selenium.By.id("txtHipotecado"));
    public static final Target TXT_DIRECCION = Target.the("direccion").located(org.openqa.selenium.By.id("dirBienes"));
    public static final Target BTN_CERRAR_DIRECCION = Target.the("cerrar direccion del trabajo").located(org.openqa.selenium.By.xpath("//button[@class='btn btn-default']"));
    public static final Target TXT_SALDO_CREDITO_INMUEBLE = Target.the("el saldo del credito de inmueble").located(org.openqa.selenium.By.id("txtSaldoCredInm"));
    public static final Target TXT_VEHICULO_CLASE = Target.the("la clase del vehiculo").located(org.openqa.selenium.By.id("txtVehCls"));
    public static final Target TXT_VALOR_COMERCIAL_VEHICULO = Target.the("el valor comercial del vehiculo").located(org.openqa.selenium.By.id("txtValorComVeh"));
    public static final Target TXT_SALDO_CREDITO_VEHICULO = Target.the("el saldo del credito del vehiculo").located(org.openqa.selenium.By.id("txtSaldoCredVeh"));
    public static final Target TXT_PLACA_NUMERO = Target.the("el numero de placa").located(org.openqa.selenium.By.id("txtPlacaVeh"));
    public static final Target TXT_MARCA_MODELO = Target.the("la marca y modelo del vehiculo").located(org.openqa.selenium.By.id("txtMarcaVeh"));
    public static final Target TXT_PRENDA_A_FAVOR = Target.the("la prenda a favor").located(org.openqa.selenium.By.id("txtPrendaFavVeh"));
    public static final Target TXT_SALARIO_FIJO = Target.the("el salario fijo").located(org.openqa.selenium.By.id("txtSueldoFijo"));
    public static final Target TXT_SALARIO_VARIABLES_COMISIONES = Target.the("el salario variable o comisiones").located(org.openqa.selenium.By.id("txtSalVarCom"));
    public static final Target TXT_ARRENDAMIENTO = Target.the("el arriendo").located(org.openqa.selenium.By.id("txtArrendamiento"));
    public static final Target TXT_RENDIMENTO_FINANCIERO = Target.the("el rendimiento financiero").located(org.openqa.selenium.By.id("txtRenFin"));
    public static final Target TXT_HONORARIOS = Target.the("los honorarios").located(org.openqa.selenium.By.id("txtHonorarios"));
    public static final Target TXT_OTRO_INGRESOS = Target.the("otros ingresos").located(org.openqa.selenium.By.id("txtOtrosIng"));
    public static final Target TXT_CUALES_INGRESOS = Target.the("cuales ingresos").located(org.openqa.selenium.By.id("txtCualesIng"));
    public static final Target TXT_TOTAL_INGRESOS = Target.the("el total de ingresos").located(org.openqa.selenium.By.id("txtTIngresos"));
    public static final Target TXT_ARRIENDOS = Target.the("el total de arriendos").located(org.openqa.selenium.By.id("txtArriendos"));
    public static final Target TXT_GASTOS_PERSONALES = Target.the("los gastos personales").located(org.openqa.selenium.By.id("txtGastosPer"));
    public static final Target TXT_PRESTAMOS_DIFERENTES = Target.the("los prestamos en otras instituciones").located(org.openqa.selenium.By.id("txtPresDfFin"));
    public static final Target TXT_DEDUCCION_NOMINA = Target.the("deducciones de nomina").located(org.openqa.selenium.By.id("txtDeducciones"));
    public static final Target TXT_TARJETAS_CREDITO = Target.the("tarjetas de credito").located(org.openqa.selenium.By.id("txtTarjCred"));
    public static final Target TXT_OTROS_GASTOS = Target.the("otros gastos").located(org.openqa.selenium.By.id("txtOtrosGastos"));
    public static final Target TXT_CUALES_GASTOS = Target.the("cuales gastos").located(org.openqa.selenium.By.id("txtCualesGastos"));
    public static final Target TXT_PAGO_HIPOTECA = Target.the("pago hipoteca").located(org.openqa.selenium.By.id("txtPagHip"));
    public static final Target TXT_VALOR_COMERCIAL_VIVIENDA = Target.the("el valor de la vivienda").located(org.openqa.selenium.By.id("txtVlrComViv"));
    public static final Target TXT_DONDE_VIVIR = Target.the("donde le gustaria vivir").located(org.openqa.selenium.By.id("txtGustaVivir"));
    public static final Target BTN_RAZON_CREDITO = Target.the("la razon del credito").located(org.openqa.selenium.By.xpath("//button[@data-id='cmbRazondecredito']"));
    public static final Target LST_RAZON_CREDITO = Target.the("la razon del credito").locatedBy("//div[@class='btn-group bootstrap-select input-form requerir dropup open']//ul[@class='dropdown-menu inner']");
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(org.openqa.selenium.By.id("btnRegresar_4"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(org.openqa.selenium.By.id("btnEnviar_4"));

    private FormularioSolicitudPaso4Page() {
        throw new IllegalStateException("Utility class");
    }
}
