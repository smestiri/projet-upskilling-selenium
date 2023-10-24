package features;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import javax.naming.Name;
import java.time.Duration;

public class TestAmazon {
    public static final long WAIT_DURATION = 10;
    @Test
    public void TestNavBarClick () {
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.amazon.fr/");

        By navcartID = By.id("nav-cart");
        WebElement buttonCart = driver.findElement(navcartID);
        buttonCart.click();

        By acceptCookieID = By.id("sp-cc-accept");
        WebElement buttonAcceptCookie = driver.findElement(acceptCookieID);
        buttonAcceptCookie.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));
        wait.until(ExpectedConditions.visibilityOfAllElements(buttonCart));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
        @Test
        public void TestClick () {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.fr/");

            By acceptCookieID = By.id("sp-cc-accept");
            WebElement buttonAcceptCookie = driver.findElement(acceptCookieID);
            buttonAcceptCookie.click();

            By menuID = By.id("nav-hamburger-menu");
            WebElement buttonMenu = driver.findElement(menuID);
            buttonMenu.click();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));
            wait.until(ExpectedConditions.visibilityOfAllElements(buttonMenu));

            By ventexpath = By.xpath("//li/a[contains(concat(' ',normalize-space(@href),' '),'bestsellers')]");
            WebElement buttonVente = driver.findElement(ventexpath);
            buttonVente.click();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            driver.quit();

        }
        @Test
        public void TestSelector(){

            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.saucedemo.com");

            // * 0. champs User (sans id)
            By usertID = By.id("user-name");
            WebElement buttonUser = driver.findElement(usertID);
            buttonUser.click();

            // * 1. Bouton Filtres "Name (A to Z)

            //* 2. Texte du tshirt "Bolt T-Shirt"
            By boltTshirtID = By.id("item_1_title_link");
            WebElement buttonBolt = driver.findElement(boltTshirtID);
            buttonBolt.click();

            // * 3. Déroulez menu burger
            By menuBurgerID = By.id("react-burger-menu-btn");
            WebElement buttonBurger = driver.findElement(menuBurgerID);
            buttonBurger.click();

            // * 4. Menu burger : bouton all items
            By allItemsID = By.id("inventory_sidebar_link");
            WebElement buttonItems = driver.findElement(allItemsID);
            buttonItems.click();

            // * 5. Menu burger : bouton logout
            By logoutID = By.id("logout_sidebar_link");
            WebElement buttonLogout = driver.findElement(logoutID);
            buttonLogout.click();

            // * 6. Ajouter 3 élements dans le panier -> bouton "Remove" du 2eme élément dans le panier

            By addlabsID = By.id("add-to-cart-sauce-labs-backpack");
            WebElement buttonAddlabs = driver.findElement(addlabsID);
            buttonAddlabs.click();


            By removeID = By.id("remove-sauce-labs-bike-light");
            WebElement buttonRemove = driver.findElement(removeID );
            buttonRemove.click();
        }
        @Test
        public void TestExercice () {
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
            //1.	aller sur la page https://www.amazon.fr/
            WebDriver driver = new FirefoxDriver();
            driver.get("https://www.amazon.fr/");

            //2.	accepter les cookies
            By acceptcookiesID = By.id("sp-cc-accept");
            WebElement buttonCookies = driver.findElement(acceptcookiesID);
            buttonCookies.click();

            //3.	écrire "iphone 14 vert" dans le champs de recherche
            //By champs = By.id("twotabsearchtextbox");
            WebElement champsRecherche = driver.findElement(By.id("twotabsearchtextbox"));
            champsRecherche.sendKeys("iphone 14 vert");
            //4.	valider avec le bouton loupe
            champsRecherche.submit();

            //5.	cliquer sur le premier résultat de recherche
            By premierArticleCSS = By.cssSelector("div.s-result-list>div[data-component-type=\"s-search-result\"]");
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));
            wait.until(ExpectedConditions.elementToBeClickable(premierArticleCSS));
            WebElement premierArticle = driver.findElement(premierArticleCSS);
            premierArticle.click();

            //6.	l'ajouter dans le panier
            By ajoutPanierID = By.id("add-to-cart-button");
            WebDriverWait Wait = new WebDriverWait(driver, Duration.ofSeconds(WAIT_DURATION));
            Wait.until(ExpectedConditions.elementToBeClickable(ajoutPanierID));
            WebElement ajoutPanier = driver.findElement(ajoutPanierID);
            ajoutPanier.click();

            //7.	aller dans le panier
            //span.nav-cart-icon.nav-sprite
            WebElement allerPanier = driver.findElement(By.id("nav-cart-count-container"));
            allerPanier.click();

            driver.quit();
        }

}
