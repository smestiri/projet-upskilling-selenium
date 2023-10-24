package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.example.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.net.URL;

public class LoginSteps {
    LoginPage pageLogin;
    public LoginSteps(StandardSteps std){
        WebDriver driver = std.getDriver();
        pageLogin = PageFactory.initElements(driver, LoginPage.class);
    }
    @Given("j'entre un username {string}")
    public void j_entre_un_username(String string) {
        pageLogin.inputUsername(string);

    }
    @Given("j'entre un mot de passe {string}")
    public void j_entre_un_mdp(String string) {
        pageLogin.inputPassword(string);

    }
    @When("je clique sur le boutton login")
    public void je_clique_sur_le_boutton_login() {
        pageLogin.login();

    }


}
