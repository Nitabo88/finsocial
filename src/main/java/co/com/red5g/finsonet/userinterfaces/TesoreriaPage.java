package co.com.red5g.finsonet.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class TesoreriaPage {
    public static final Target MNU_HAMBURGUESA_TESORERIA =  Target.the("menu principal").located(By.id("hamburger"));
    public static final Target CHEQUEO =  Target.the("opcion chequeo").located(By.id("or-chequeo"));
    public static final Target CONFIRMACION =  Target.the("boton confirmacion").located(By.id("or-confirm"));
    public static final Target APROBACION =  Target.the("Imput aprobacion").located(By.id("or-aprob"));
    public static final Target COMITE =  Target.the("Imput aprobacion").located(By.id("or-comite"));
    public static final Target INCORPORACION =  Target.the("Imput aprobacion").located(By.id("or-incor"));
    public static final Target FORMALIZACION =  Target.the("Imput aprobacion").located(By.id("or-formal"));
    public static final Target TESORERIA =  Target.the("Imput aprobacion").located(By.id("or-tesore"));
    public static final Target ANTECARTERA =  Target.the("Imput aprobacion").located(By.id("or-antecar"));
    public static final Target GIROS =  Target.the("Imput aprobacion").located(By.id("or-giros"));
    public static final Target CARTERA =  Target.the("Imput aprobacion").located(By.id("or-cartera"));
    public static final Target RESUMEN =  Target.the("Imput aprobacion").located(By.id("or-resumen"));
    public static final Target HERRAMIENTA =  Target.the("Imput aprobacion").located(By.id("or-herram"));
    public static final Target SOL_MOT_REGRESO =  Target.the("Imput aprobacion").located(By.id("txtAut"));
    public static final Target SOL_MOT_MOTIVO =  Target.the("Imput aprobacion").located(By.id("txtMotivo"));
    public static final Target BTN_REGRESO =  Target.the("el boton regresar").located(By.id("btn-aceptar-regreso"));
}