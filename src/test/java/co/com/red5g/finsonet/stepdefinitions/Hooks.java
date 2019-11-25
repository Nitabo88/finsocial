package co.com.red5g.finsonet.stepdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Managed(driver = "chrome")
    private WebDriver navegador;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(
                OnlineCast.whereEveryoneCan(
                        BrowseTheWeb.with(navegador)
                )
        );
    }
}