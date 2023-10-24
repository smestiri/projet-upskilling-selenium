package steps;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@Log4j2
public class StandardSteps {
    WebDriver driver;
     private void init(){
         driver = new FirefoxDriver();
         driver.manage().window().maximize();
     }

public WebDriver getDriver() {
    return driver;
}
    @Given("je vais sur la page d'acceuil {string}")
    public void je_vais_sur_la_page_dacceuil (String url) {
        init();
        driver.get(url);
    }

    @After
    public void Teardown(){
        log.info("Test terminé");
        driver.quit();
    }


}
