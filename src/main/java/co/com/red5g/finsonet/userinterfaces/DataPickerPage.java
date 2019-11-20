package co.com.red5g.finsonet.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DataPickerPage {
    public static final Target BTN_DATA_PICKER_YEAR = Target.the("El año del calendario").located(By.xpath("//div[@class='datepicker-years']//th[@class='datepicker-switch']"));
    public static final Target DATA_PICKER_YEAR = Target.the("El año del calendario").locatedBy("//div[@class='datepicker-years']//table//span[contains(.,'{0}')]");
    public static final Target BTN_ARROW_LEFT = Target.the("Flecha izquierda").located(By.xpath("//div[@class='datepicker-years']//th[@class='prev']"));
    public static final Target BTN_ARROW_RIGHT = Target.the("Flecha derecha").located(By.xpath("//div[@class='datepicker-years']//th[@class='next']"));
    public static final Target BTN_DATA_PICKER_MONTH = Target.the("El mes del calendario").located(By.xpath("//div[@class='datepicker-months']//th[@class='datepicker-switch']"));
    public static final Target DATA_PICKER_MONTH = Target.the("El mes del calendario").locatedBy("//div[@class='datepicker-months']//table//span[contains(.,'{0}')]");
    public static final Target DATA_PICKER_DAY = Target.the("El dia del calendario").locatedBy("//div[@class='datepicker-days']//table//tr//td[@class='day'][.='{0}']");
    public static final Target BTN_DATA_PICKER_DAY = Target.the("El boton del dia calendario").located(By.xpath("//div[@class='datepicker-days']//th[@class='datepicker-switch']"));
}
