package org.example.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

@Log4j2
public class CartPage {
    WebDriver driver;
    public CartPage (WebDriver driver) {
        this.driver = driver;
    }
    By title= By.cssSelector(".title");
    public String getTitle(){
        return driver.findElement(title).getText();
    }
    public void checkPageTitle(String titreCart){

        Assert.assertEquals(getTitle(),titreCart);

    }
}
