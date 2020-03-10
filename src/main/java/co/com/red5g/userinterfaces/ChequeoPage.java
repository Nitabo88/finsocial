package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ChequeoPage {

    public static int cedula;

    public static Target encontrar (int cedula) {
        return Target.the("Lista de Chequeo").located(By.xpath("//*[contains(text(), '"+cedula+"' )]/preceding-sibling::td[1]/a"));
    }
    public static final Target PAPELERIA = Target.the("Lista de chequeo").locatedBy(("#modPapeleria > div > div > div.modal-body.content-class > div > div > div:nth-child(1) > label > p"));
    public static final Target ACEPTAR = Target.the("Lista de chequeo").located(By.id("btn-aceptar-1"));
    public static final Target ACEPTAR2 = Target.the("Lista de chequeo").locatedBy(("#modExitoso > div > div > div.actions-class.text-center > button"));
    public static final Target CHECK1 = Target.the("Lista de chequeo").located(By.id("rdSN11"));
    public static final Target CHECK2= Target.the("Lista de chequeo").located(By.id("rdSN12"));
    public static final Target CHECK3= Target.the("Lista de chequeo").located(By.id("rdSN13"));
    public static final Target CHECK4 = Target.the("Lista de chequeo").located(By.id("rdSN14"));
    public static final Target CHECK5 = Target.the("Lista de chequeo").located(By.id("rdSN15"));
    public static final Target CHECK6= Target.the("Lista de chequeo").located(By.id("rdSN16"));
    public static final Target CHECK7 = Target.the("Lista de chequeo").located(By.id("rdSN17"));
    public static final Target CHECK8 = Target.the("Lista de chequeo").located(By.id("rdSN18"));
    public static final Target CHECK9 = Target.the("Lista de chequeo").located(By.id("rdSN19"));
    public static final Target CHECK10 = Target.the("Lista de chequeo").located(By.id("rdSN110"));
    public static final Target CHECK11 = Target.the("Lista de chequeo").located(By.id("rdSN111"));
    public static final Target CHECK12 = Target.the("Lista de chequeo").located(By.id("rdSN112"));
    public static final Target CHECK13 = Target.the("Lista de chequeo").located(By.id("rdSN113"));
    public static final Target CHECK14 = Target.the("Lista de chequeo").located(By.id("rdSN114"));
    public static final Target CHECK15 = Target.the("Lista de chequeo").located(By.id("rdSN115"));
    public static final Target BTN_GUARDAR = Target.the("Lista de chequeo").located(By.id("btnGuardar"));
    public static final Target BTN_REGISTRO = Target.the("Lista de chequeo").located(By.xpath("/html/body/div[39]/div[7]/div/button"));
    public static final Target TEXTO_REGISTRO = Target.the("Lista de chequeo").located(By.xpath("/html/body/div[42]/div[7]/div/button"));


}