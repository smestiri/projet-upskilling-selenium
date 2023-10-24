package org.example.pagedemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePages {
    static WebDriver driver;
    public HomePages(WebDriver driver){
        this.driver= driver;
    }
    public void goToHomePage(String url) {
        driver.get(url);
    }
    public void navigateToElementsPage() {
        driver.findElement(By.xpath("//h5[text()='Elements']")).click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 2000);");

    }
    public void navigateToTablesPage() {
        driver.findElement(By.id("item-3")).click();
    }

}
