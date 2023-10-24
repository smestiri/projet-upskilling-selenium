package org.example.page;

import io.cucumber.java.en.When;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

@Log4j2
public class HomePage {
    WebDriver driver;
    @FindBy(id="add-to-cart-sauce-labs-backpack")
    WebElement bouttonAddtoCart;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }

    // By AddToCartID= By.id("add-to-cart-sauce-labs-backpack");
    By cart= By.className("shopping_cart_link");
    public HomePage addTocart(){
        log.info("Add bachpack to cart");
        bouttonAddtoCart.click();
        return this;

    }
    public CartPage goTocart(){
        log.info("openning cart page");
        driver.findElement(cart).click();
        return new CartPage(driver);

    }
    public void checkPageTitle(String titreAttendu){
        Assert.assertEquals(driver.getTitle(),titreAttendu);

    }

}
