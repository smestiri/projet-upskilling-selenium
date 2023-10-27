package org.example.pagedemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class HomePages {
   WebDriver driver;
    public HomePages(WebDriver driver){
        this.driver= driver;
    }
    public void goToHomePage(String url) {
        driver.get(url);
    }
    public void goToElementsPage() {
        WebElement elementToClick = driver.findElement(By.xpath("//h5[text()='Elements']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementToClick);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }
        elementToClick.click();
        new ElementsPage(driver);
    }


}
