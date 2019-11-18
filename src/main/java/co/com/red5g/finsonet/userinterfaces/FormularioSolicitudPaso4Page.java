package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FormularioSolicitudPaso4Page {
    public static final Target TXT_ACTIVOS_CORRIENTES = Target.the("el valor de activos corrientes").located(By.id("activos_corrientes"));
    public static final Target TXT_ACTIVOS_FIJOS = Target.the("el valor de activos fijos").located(By.id("activos_fijos"));
    public static final Target TXT_OTROS_ACTIVOS = Target.the("el valor de otros activos").located(By.id("otros_activos"));
    public static final Target TXT_PASIVOS_CORRIENTES = Target.the("El valor de pasivos corrientes").located(By.id("pasivos_corrientes"));
    public static final Target TXT_OTROS_PASIVOS = Target.the("El valor de otros pasivos").located(By.id("pasivos_corrientes"));
    public static final Target TXT_CUALES_PASIVOS = Target.the("cuales pasivos").located(By.id("cuales_pasivos"));
    public static final Target TXT_TOTAL_ACTIVOS = Target.the("El valor total activos").located(By.id("total_activos"));
    public static final Target TXT_TOTAL_PASIVOS = Target.the("El valor total pasivos").located(By.id("total_pasivos"));
    public static final Target RBN_COMPRAR_VIVIENDA = Target.the("la opcion de comprar vivienda").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdCompViv']");
    public static final Target RBN_CUPO_EXTRA_LIBRANZA = Target.the("la opcion de cupo de libranza").locatedBy("//label[@class='radio-inline'][contains(.,'{0}')]/input[@name='rdCupoExtra']");
    public static final Target LST_USO_CREDITO = Target.the("como va utilizar el dinero").located(By.id("cmbRazondecredito"));
    public static final Target TXT_TIPO_INMUEBLE = Target.the("el tipo de inmueble").located(By.id("txtTipoInm"));
    public static final Target TXT_VALOR_COMERCIAL_INMUEBLE = Target.the("el valor comercial").located(By.id("txtValorComInm"));
    public static final Target TXT_HIPOTECADO = Target.the("hipotecado a").located(By.id("txtHipotecado"));
    public static final Target TXT_DIRECCION = Target.the("direccion").located(By.id("dirBienes"));
    public static final Target TXT_SALDO_CREDITO_INMUEBLE = Target.the("el saldo del credito de inmueble").located(By.id("txtSaldoCredInm"));
    public static final Target TXT_VEHICULO_CLASE = Target.the("la clase del vehiculo").located(By.id("txtVehCls"));
    public static final Target TXT_VALOR_COMERCIAL_VEHICULO = Target.the("el valor comercial del vehiculo").located(By.id("txtValorComVeh"));
    public static final Target TXT_SALDO_CREDITO_VEHICULO = Target.the("el saldo del credito del vehiculo").located(By.id("txtSaldoCredVeh"));
    public static final Target TXT_PLACA_NUMERO = Target.the("el numero de placa").located(By.id("txtPlacaVeh"));
    public static final Target TXT_MARCA_MODELO = Target.the("la marca y modelo del vehiculo").located(By.id("txtMarcaVeh"));
    public static final Target TXT_SALARIO_FIJO = Target.the("el salario fijo").located(By.id("txtSueldoFijo"));
    public static final Target TXT_SALARIO_VARIABLES_COMISIONES = Target.the("el salario variable o comisiones").located(By.id("txtSalVarCom"));
    public static final Target TXT_ARRENDAMIENTO = Target.the("el arriendo").located(By.id("txtArrendamiento"));
    public static final Target TXT_RENDIMENTO_FINANCIERO = Target.the("el rendimiento financiero").located(By.id("txtRenFin"));
    public static final Target TXT_HONORARIOS = Target.the("los honorarios").located(By.id("txtHonorarios"));
    public static final Target TXT_OTRO_INGRESOS = Target.the("otros ingresos").located(By.id("txtOtrosIng"));
    public static final Target TXT_CUALES_INGRESOS = Target.the("cuales ingresos").located(By.id("txtCualesIng"));
    public static final Target TXT_TOTAL_INGRESOS = Target.the("el total de ingresos").located(By.id("txtTIngresos"));
    public static final Target TXT_ARRIENDOS = Target.the("el total de arriendos").located(By.id("txtArriendos"));
    public static final Target TXT_GASTOS_PERSONALES = Target.the("los gastos personales").located(By.id("txtGastosPer"));
    public static final Target TXT_PRESTAMOS_DIFERENTES = Target.the("los prestamos en otras instituciones").located(By.id("txtPresDfFin"));
    public static final Target TXT_DEDUCCION_NOMINA = Target.the("deducciones de nomina").located(By.id("txtDeducciones"));
    public static final Target TXT_TARJETAS_CREDITO = Target.the("tarjetas de credito").located(By.id("txtTarjCred"));
    public static final Target TXT_OTROS_GASTOS = Target.the("otros gastos").located(By.id("txtOtrosGastos"));
    public static final Target TXT_CUALES_GASTOS = Target.the("cuales gastos").located(By.id("txtCualesGastos"));
    public static final Target TXT_PAGO_HIPOTECA = Target.the("pago hipoteca").located(By.id("txtPagHip"));
    public static final Target TXT_VALOR_COMERCIAL_VIVIENDA = Target.the("el valor de la vivienda").located(By.id("txtVlrComViv"));
    public static final Target TXT_DONDE_VIVIR = Target.the("donde le gustaria vivir").located(By.id("txtGustaVivir"));
    public static final Target TXT_TOTAL_EGRESOS = Target.the("el total de egresos").located(By.id("txtGustaVivir"));
    public static final Target TXT_RAZON_CREDITO = Target.the("la razon del credito").located(By.id("razon"));
    public static final Target BTN_REGRESAR = Target.the("el boton regresar").located(By.id("btnRegresar_4"));
    public static final Target BTN_GUARDAR_CONTINUAR = Target.the("el boton guardar y continuar").located(By.id("btnEnviar_4"));

    private FormularioSolicitudPaso4Page() {
        throw new IllegalStateException("Utility class");
    }
}
