package org.example.pagedemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
@Log4j2
public class ElementsPage {
    WebDriver driver;
    public ElementsPage(WebDriver driver){
        this.driver= driver;
    }
    public boolean isOnElementsPage() {
        boolean isOnPage = driver.getTitle().contains("Elements");
        log.info("Vérification de la page Elements : Est-ce sur la page des éléments ? Réponse : {}", isOnPage);
        return isOnPage;
    }
    public void performSomeAction() {
        WebElement element = driver.findElement(By.id("your-element-id"));
        element.click();
        log.info("Clic sur l'élément avec l'ID : your-element-id");
    }
}
