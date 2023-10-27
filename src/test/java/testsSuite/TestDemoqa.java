package testsSuite;

import lombok.extern.log4j.Log4j2;
import org.example.pagedemoqa.ElementsPage;
import org.example.pagedemoqa.HomePages;
import org.example.pagedemoqa.TablesPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverService;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

@Log4j2
public class TestDemoqa {
    WebDriver driver;
    private HomePages homePage;
    private ElementsPage elementsPage;
    private TablesPage webtablesPage;
    private FirefoxOptions options;


    @BeforeMethod
    public void setup (){
        FirefoxOptions options = new FirefoxOptions();
        options.addArguments("--disable-notifications");
        driver = new FirefoxDriver(options);
        driver.manage().window().maximize();
        log.info("opened successfully");
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); // Attente implicite de 10 secondes

    }

    @Test
    public void testDemoQa (){
        HomePages homePages = new HomePages(driver);
        ElementsPage elementsPage = new ElementsPage(driver);
        TablesPage webTablesPage = new TablesPage(driver);

        homePages.goToHomePage("https://demoqa.com/");
        homePages.goToElementsPage();
        elementsPage.isOnElementsPage();
        elementsPage.goToWebTables();
        webTablesPage.salaryHeader();
        webTablesPage.deleteLastRow();
        webTablesPage.isLastRowDeleted();

            driver.quit();
            log.info("Le navigateur a été fermé.");

    }


}
