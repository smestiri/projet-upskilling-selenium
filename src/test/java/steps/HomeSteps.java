package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.page.HomePage;
import org.example.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomeSteps {
    HomePage pageHome;

    public HomeSteps(StandardSteps std){
        WebDriver driver = std.getDriver();
        pageHome = PageFactory.initElements(driver, HomePage.class);
    }
    @Then("la page des articles est affichée {string}")
    public void la_page_des_articles_est_affichée(String titreAttendu) {
        pageHome.checkPageTitle(titreAttendu);

    }
    @And("je clique sur le bouton Add to cart pour ajouter le Backpack dans le panier")
    public void jeCliqueSurLeBoutonPourAjouterLeBackpackDansLePanier() {
        pageHome.addTocart();
    }

    @When("je clique sur le bouton panier")
    public void jeCliqueSurLeBoutonPanier() {
        pageHome.goTocart();

    }
}
