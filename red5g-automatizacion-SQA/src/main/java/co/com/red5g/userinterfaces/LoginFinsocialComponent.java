package co.com.red5g.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;


public class LoginFinsocialComponent {


    public static final Target USUARIO =  Target.the("Input usuario").located(By.xpath("//*[@id='textfield']"));
    public static final Target CONTRASENA= Target.the("Input Contraseña").located (By.name("pass"));
    public static final Target ACCESO = Target.the("Iniciar sesion").located(By.id("butSubmit"));
    public static final Target CODIGO= Target.the("Input codigo").located (By.id("codigo"));
    public static final Target ENVIAR= Target.the("Input Contraseña").located (By.id("butSubmit"));
    //public static final Target CUENTA= Target.the("Boton cuenta").located (By.id("dropdownCuenta"));
    public static final Target CUENTA =  Target.the("Label cuenta").located(By.xpath("/html/body/header/header/div[2]/div/div[2]/div/p"));


}
