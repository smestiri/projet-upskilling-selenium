package org.example.page;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

/*@Log4j2
public class HomePage {
        WebDriver driver;

    public HomePage (WebDriver driver){
            this.driver= driver;
        setWait(new WebDriverWait(driver, TIME));
        PageFactory.initElements(driver, this);
    }
    @FindBy (id ="add-to-cart-sauce-labs-backpack")
    WebElement addButton;
    @FindBy(className = "shopping_cart_link")
    WebElement cartButton;

    //private WebElement addButton = driver.findElement(addToCartId);

    public HomePage addButton () {
        log.info("Add to cart");
        addButton.click();
        return this;
    }
    public CartPage cartButton(){
        log.info("Click on the cart button");
        waitAndClick(cartButton);
        return new CartPage(driver);
    }
}*/
