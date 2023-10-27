package org.example.pagedemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePages {
   WebDriver driver;
    public HomePages(WebDriver driver){
        this.driver= driver;
    }
    public void goToHomePage(String url) {
        driver.get(url);
    }
    public ElementsPage goToElementsPage() {
        WebElement elementToClick = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToClick);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace(); //Afficher la trace de la pile de l'exception
        }
        elementToClick.click();
        return new ElementsPage(driver);
    }


}
