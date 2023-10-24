package org.example.pagedemoqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TablesPage {
    static WebDriver driver;

    public TablesPage(WebDriver driver) {
        this.driver = driver;
    }
    public void sortBySalaryDescending() {
        driver.findElement(By.cssSelector("div.rt-th:nth-child(5) > div:nth-child(1)")).click();
        driver.findElement(By.cssSelector("div.rt-th:nth-child(5) > div:nth-child(1)")).click(); // Double-click to sort in descending order
    }
    public void deleteLastRow() {
        List<WebElement> rows = driver.findElements(By.cssSelector("div[role='row']"));
        if (rows.size() > 1) {
            WebElement lastRow = rows.get(rows.size() - 1);
            lastRow.findElement(By.id("delete-record-3")).click();
        }
    }
    public static boolean isLastRowDeleted() {
        List<WebElement> updatedRows = driver.findElements(By.cssSelector(".rt-thead > div:nth-child(1)"));
        return updatedRows.size() == driver.findElements(By.cssSelector(".rt-thead > div:nth-child(1)")).size() - 1;
    }

}
