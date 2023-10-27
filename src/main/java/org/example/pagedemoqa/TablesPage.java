package org.example.pagedemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesPage {
    static WebDriver driver;

    public TablesPage(WebDriver driver) {

        TablesPage.driver = driver;
    }

    public void salaryHeader() {
        WebElement salaryHeader =  driver.findElement(By.cssSelector("div.rt-resizable-header-content"));
        salaryHeader.click();
    }
    public void deleteLastRow() {
        // Liste de boutons de suppression
        List<WebElement> deleteButtons = driver.findElements(By.xpath("//span[@title='Delete']"));

        if (!deleteButtons.isEmpty()) {
            // Dernier bouton de suppression
            WebElement lastDeleteButton = deleteButtons.get(deleteButtons.size() - 1);

            // Utilisez JavaScript pour faire défiler la page jusqu'à l'élément cible (dans ce cas, le bouton de suppression)
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", lastDeleteButton);

            // Attendez un court instant pour permettre au défilement de se terminer
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                //e.printStackTrace();
            }
            lastDeleteButton.click();
        }
    }

    public void isLastRowDeleted(){
        WebElement tableMessage = driver.findElement(By.id("app"));
        if (!tableMessage.getText().contains("No rows found")) {
            System.out.println("La suppression est OK.");
        } else {
            System.out.println("La suppression est KO.");
        }

    }

}
