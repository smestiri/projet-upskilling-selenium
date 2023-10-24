package org.example.page;

import org.example.pageobject.LoginUserPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver= driver;
    }

    // Les 3 By
    By userNameId = By.id("user-name");
    By passWordId = By.id("password");
    By loginId = By.id("login-button");

    //Les méthodes
    public LoginPage inputUsername (String username){ WebElement champsLogin = driver.findElement(userNameId);
        champsLogin.sendKeys(username);
        return this;
    }
    public LoginPage inputPassword (String password){ WebElement champsPwd = driver.findElement(passWordId);
        champsPwd.sendKeys(password);
        return this;
    }
    public HomePage login(){WebElement loginButton = driver.findElement(loginId);
        loginButton.click();
        return new HomePage(driver);
    }



}*/
