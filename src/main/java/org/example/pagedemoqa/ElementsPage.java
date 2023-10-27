package org.example.pagedemoqa;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

@Log4j2
public class ElementsPage {
    WebDriver driver;
    public ElementsPage(WebDriver driver){
        this.driver= driver;
    }
    public void isOnElementsPage(){
        // Vérifiez que vous êtes sur la page Element
        WebElement pageTitle = driver.findElement(By.className("main-header"));
        if (pageTitle.getText().equalsIgnoreCase("elements")) {
            System.out.println("Vous êtes sur la page Element.");
        } else {
            System.out.println("Échec : Vous n'êtes pas sur la page Element.");
        }
    }
   public TablesPage goToWebTables() {
       // Trouvez l'élément obscurant et l'élément cible.
       WebElement obscurantElement = driver.findElement(By.id("adplus-anchor"));
       WebElement targetElement = driver.findElement(By.id("item-3"));

       // Utilisez JavaScript pour faire défiler la page pour que l'élément cible soit visible.
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});", targetElement);

       try {
           Thread.sleep(1000);
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       targetElement.click();

       return new TablesPage(driver);
   }
}
