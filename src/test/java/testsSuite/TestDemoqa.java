package testsSuite;

import lombok.extern.log4j.Log4j2;
import org.example.pagedemoqa.ElementsPage;
import org.example.pagedemoqa.HomePages;
import org.example.pagedemoqa.TablesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Log4j2
public class TestDemoqa {
    WebDriver driver;

    @BeforeMethod
    public void setup (){
        driver = new FirefoxDriver();
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

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("Teardown successful !");
    }

}
