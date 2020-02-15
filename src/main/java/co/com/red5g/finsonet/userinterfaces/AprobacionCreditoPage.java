package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class AprobacionCreditoPage {

    public static final  Target TXT_INFOCLIENTE=Target.the("informacion de creditos en aprobacion").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/table/tbody/tr[1]/td[4]/a"));
    public static final  Target BTN_PENDIENTE = Target.the("boton de pendiente").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/table/tbody/tr[1]/td[11]/div/div/a[1]"));
    public static final  Target BTN_REGRESAR=Target.the("boton de regresar").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/table/tbody/tr[1]/td[11]/div/div/a[2]"));
    public static final Target LST_MOTIVOPEND = Target.the("motivo estado").located(By.id("motivo"));
    public static final Target TXT_DETALLE = Target.the("detalle de estado").located(By.id("area"));
    public static final Target TXT_ENVIAR = Target.the("enviar").located(By.id("boton2"));
    public static final Target TXT_CERRAR = Target.the("cerrar").located(By.id("cerrar"));

    public static final  Target TXT_INFOCLIENTEDOS=Target.the("informacion de cliente pendiente de aprobacion").located(By.xpath("/html/body/div[30]/div/div/div/section/div[13]/table/tbody/tr[1]/td[2]/a"));
    public static final  Target BTN_NORMALIZAR=Target.the("boton de normalizar").located(By.xpath("/html/body/div[30]/div/div/div/section/div[13]/table/tbody/tr[1]/td[9]/button"));
    public static final  Target BTN_DESCARGA=Target.the("Descarga de excel").located(By.xpath("/html/body/div[30]/div/div/div/section/div[15]/a/button"));

    public static final  Target TXT_INFOCLIENTRES=Target.the("informacion de cliente creditos huy").located(By.xpath("/html/body/div[30]/div/div/div/section/div[22]/table/tbody/tr[1]/td[4]/a"));
    public static final  Target BTN_PENDIENTEDOS=Target.the("boton de pendiente creditos huy").located(By.xpath("/html/body/div[30]/div/div/div/section/div[22]/table/tbody/tr[1]/td[11]/div/div/a"));

    public static final Target TXT_VALCUOTA = Target.the("valor de cuota").located(By.id("textoVlrCuota"));
    public static final Target TXT_TASA = Target.the("valor de tasa").located(By.id("textoTasa"));
    public static final Target TXT_PLAZO = Target.the("plazo").located(By.id("textoNumCuotas"));
    public static final Target LST_PAGADURIA = Target.the("pagaduria").located(By.id("textoPagadura"));
    public static final Target LST_CODIGO = Target.the("codigo de credito").located(By.id("comboCod"));
    public static final Target LST_PERFIL = Target.the("perfil de riesgo").located(By.id("combo_linea_credito"));
    public static final Target LST_GIRO = Target.the("tipo de giro").located(By.id("t_giro"));
    public static final Target DATE_FECHA= Target.the("liquidacion credito").located(By.id("textoIniDesc"));

    public static final Target CHK_CHECK = Target.the("check").located(By.id("chk1"));
    public static final Target LST_NOMBRE = Target.the("nombre libranza").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[11]/div[1]/table/tbody/tr[2]/td[2]/div/button"));
    public static final Target TXT_DESCRIPCION = Target.the("descripcion libranza").located(By.id("textoDes1"));
    public static final Target LST_TIPO = Target.the("tipo libranza").located(By.id("comboTipo1"));
    public static final Target LST_PAGO = Target.the("pago libranza").located(By.id("comboPago1"));
    public static final Target LST_BANCO = Target.the("banco libranza").located(By.id("textoBanco1"));
    public static final Target TXT_NUNCUENTA= Target.the("numero  de cuenta").located(By.id("textoNCuenta1"));
    public static final Target LST_TIPOCUENTA= Target.the("tipo  de cuenta").located(By.id("textoTipoC1"));
    public static final Target DATE_VENCERT= Target.the("vencimiento certificado").located(By.id("textoFVC1"));
    public static final Target TXT_CUORETEN= Target.the("Cuota retenida").located(By.id("textoCuotaRet1"));
    public static final Target TXT_VALGIRAR= Target.the("valor a girar").located(By.id("textoVlrGiro1"));
    public static final Target BTN_ELIMINAR = Target.the("eliminar seleccionados").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[11]/div[1]/table/tbody/tr[2]/td[2]/div/button"));
    public static final Target BTN_AGREGAR = Target.the("agregar").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[11]/div[2]/button[2]"));
    public static final Target BTN_NEGAR = Target.the("negar").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[14]/div[2]/div/button[1]"));
    public static final Target BTN_REPROCESO = Target.the("reproceso").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[14]/div[2]/div/button[2]"));
    public static final Target BTN_GUARDAR = Target.the("guardar").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[14]/div[2]/div/button[3]"));
    public static final Target BTN_ESTUDIO= Target.the("estudio").located(By.xpath("/html/body/div[30]/div/div/div/section/div[7]/div[2]/div[14]/div[2]/div/button[4]"));

    public static final Target TXT_CUENTA= Target.the("numero cuenta").located(By.id("n_cuenta"));
    public static final Target DATE_ANODESCUENTO= Target.the("año de descuento").located(By.id("comboAnoLiq"));
    public static final Target DATE_MESDECUENTO= Target.the("mes de descuento").located(By.id("comboMesLiq"));
    public static final Target CHK_CONFIRMACION= Target.the("sin confirmar").located(By.id("sin_confirmar"));
    public static final Target LST_PROCEENLINEA= Target.the("proceso enlinea").located(By.id("procesoEnlinea"));
    public static final Target LST_BANCOHUY= Target.the("banco").located(By.id("banco_huy"));
    public static final Target LST_PPAGO= Target.the("punto pago").located(By.id("punto_huy"));
  public static final Target BTN_APROBAR = Target.the("El boton aprobar").located(By.xpath("//button[contains(.,'Aprobar')]"));
  public static final Target LST_FILA_APROBACION_CREDITO_NOMBRE = Target.the("la fila de la tabla").locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,"
      + "'{1}')]//parent::tr//td[contains(.,'{2}')]");
  public static final Target LST_COLUMNAS_APROBACION_CREDITO = Target.the("la opcion de la tabla")
      .locatedBy("//div[@class='table-responsive']//td[contains(.,'{0}')]//parent::tr//td[contains(.,'{1}')]//parent::tr//child::td");
  public static final Target LBL_POLITICAS_CREDITO = Target.the("El label de politicas de credito").located(By.xpath("//h3[contains(.,'Políticas del crédito')]"));
  public static final Target BTN_OK = Target.the("El boton ok").located(By.xpath("//button[@class='confirm'][contains(.,'OK')]"));
  public static final Target BTN_ENVIAR = Target.the("El boton enviar").located(By.id("boton2"));
  public static final Target MNU_ACCION = Target.the("el menu de acciones de aprobacion de credito").locatedBy("//div[@class='btn-group open']//div[@class='dropdown-menu']//a[contains(.,'{0}')]");
  public static final Target LST_MOTIVO = Target.the("Lista de motivos en aprobacion de credito").located(By.id("motivo"));
  public static final Target LST_PERFIL_RIESGO = Target.the("Lista de perfil de riesgo").located(By.id("combo_linea_credito"));
  public static final Target LST_PENDIENTE_APROBACION_CREDITO = Target.the("Fila de los creditos pendientes en aprobacion de credito").locatedBy("//table[@id='table_p']//a[@class='faq-link"
      + "'][contains(@href,'{0}')]//ancestor::tr");
  public static final Target LST_FILA_APROBACION_CREDITO = Target.the("la fila de la tabla de aprobacion creditos").locatedBy("//table[@id='table_n']//tr//td[@style='text-align: left']//a[contains"
      + "(@href,'{0}')]//ancestor::tr");
  public static final Target TXT_MOTIVO = Target.the("motivo de regresar el credito").located(By.id("area"));


  private AprobacionCreditoPage() {
    throw new IllegalStateException("Utility class");
  }
}
