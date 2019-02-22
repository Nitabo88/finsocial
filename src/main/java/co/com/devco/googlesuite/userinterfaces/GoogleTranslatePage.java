package co.com.devco.googlesuite.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class GoogleTranslatePage {

	public static final Target SOURCE_LANGUAGE_OPTION = Target.the("Source Language Button").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]");
	public static final Target TARGET_LANGUAGE_OPTION = Target.the("Target Language Button").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/div[3]");
	public static final Target SOURCE_LANGUAGE = Target.the("Source Language").located(By.id("sl_list-search-box"));
	public static final Target TARGET_LANGUAGE = Target.the("Target Language").located(By.id("tl_list-search-box"));
	public static final Target SOURCE_LANGUAGE_TEXTAREA = Target.the("Source Language TextArea").located(By.id("source"));
	public static final Target TARGET_LANGUAGE_RESULT = Target.the("Target Language Result Area").locatedBy("/html/body/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]");
}
