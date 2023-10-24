package org.example.pageobject;

import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginUserPage {
    By userNameId = By.id("user-name");
    By passWordId = By.id("password");
    By loginId = By.id("login-button");
    WebDriver driver;

    public LoginUserPage(WebDriver driver){
        this.driver= driver;
    }
    public void inputUsername (String username){
        driver.findElement(userNameId).sendKeys(username);
    }
    public void inputPassword (String password){
        driver.findElement(passWordId).sendKeys(password);
    }
    public LoginUserPage login(){
        driver.findElement(loginId).click();
        return this;
    }
}
