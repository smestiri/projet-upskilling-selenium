package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.CartPage;
import org.example.page.HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CartSteps {
    CartPage cartPage;
    public CartSteps(StandardSteps std){
        WebDriver driver = std.getDriver();
        cartPage = PageFactory.initElements(driver, CartPage.class);
    }


    @Then("je vérifie que le titre panier est bien affiché {string}")
    public void jeVérifieQueLeTitrePanierEstBienAffiché(String titreCart) {
        cartPage.checkPageTitle(titreCart);
    }
}
