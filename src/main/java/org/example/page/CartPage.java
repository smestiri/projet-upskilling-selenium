package org.example.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {
    WebDriver driver;
    public CartPage (WebDriver driver){
        this.driver= driver;}
    By  cartButtonCSS = By.cssSelector(".title");

    private WebElement cartButton = driver.findElement(cartButtonCSS);

    public void CartPage cartButton () {
        cartButton.click();
        return;
    }
}
