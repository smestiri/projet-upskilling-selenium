package features;

import org.apache.logging.log4j.core.config.plugins.PluginLoggerContext;
import org.example.pageobject.LoginUserPage;
import org.example.pageobject.LoginUserPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class TestSwagLabs {
    private static final String URL ="https://www.saucedemo.com/";
    WebDriver driver;
    @BeforeMethod
    public void setup (){
        driver = new FirefoxDriver();
        driver.get(URL);
        driver.manage().window().maximize();
        System.out.println(URL + " -> opened successfully");

    }
/*
    @Test
   public void testLogin(){
        //Arrange
        String user = "standard_user";
        String pwd = "secret_sauce";
        String expectedPrice = "$29.99";
        //Act
        LoginUserPage lp = new LoginUserPage(driver);
        String actualFirstPrice = lp

                .inputUsername(user)
               // .inputPassword(pwd)
                .login();
        System.out.println("We logged in :)");

        //Assert

    }
    @AfterMethod
    public void teardown(){
        driver.quit();
        System.out.println("Teardown successful !");
    }*/
}
