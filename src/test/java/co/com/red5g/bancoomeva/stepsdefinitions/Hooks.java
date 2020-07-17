package co.com.red5g.bancoomeva.stepsdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "chrome")
    WebDriver navegador;

    @Before
    public void setTheStage() {
            OnStage.setTheStage(new OnlineCast()
            );
    }

    @After
    public void close(){
      navegador.close();
      navegador.quit();
    }
}