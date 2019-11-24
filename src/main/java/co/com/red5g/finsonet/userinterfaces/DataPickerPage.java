package co.com.red5g.finsonet.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPickerPage {
    public static final Target BTN_DATA_PICKER_ANIO = Target.the("El  boton del calendario en años").located(By.xpath("//div[@class='datepicker-years']//th[@class='datepicker-switch']"));
    public static final Target DATA_PICKER_ANIO = Target.the("El calendario en años").locatedBy("//div[@class='datepicker-years']//table//span[contains(.,'{0}')]");
    public static final Target BTN_FLECHA_IZQUIERDA = Target.the("Flecha izquierda").located(By.xpath("//div[@class='datepicker-years']//th[@class='prev']"));
    public static final Target BTN_FLECHA_DERECHA = Target.the("Flecha derecha").located(By.xpath("//div[@class='datepicker-years']//th[@class='next']"));
    public static final Target BTN_DATA_PICKER_MES = Target.the("El boton del calendario de mes").located(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']"));
    public static final Target DATA_PICKER_MES = Target.the("El calendario en meses").locatedBy("//div[@class='datepicker-months']//table//span[contains(.,'{0}')]");
    public static final Target DATA_PICKER_DIA = Target.the("El calendario en dias").locatedBy("//div[@class='datepicker-days']//table//tr//td[@class='day'][.='{0}']");
    public static final Target BTN_DATA_PICKER_DIA = Target.the("El boton del calendario en dias").located(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
}
