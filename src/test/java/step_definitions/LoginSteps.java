package step_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.commons.logging.Log;
import org.example.pageObject.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class LoginSteps {
    private WebDriver webDriver;
    LoginPage loginPage;

    public LoginSteps(){
        super();
        this.webDriver = Hooks.webDriver;
        loginPage = new LoginPage(webDriver);
    }

    @Given("^User already in GuruMu login page$")
    public void userAlreadyInGuruMuLoginPage() {
        loginPage.avatarBtn();
        loginPage.isDisplayed();
    }

    @When("User input \"(.*)\" as email and input \"(.*)\" as password")
    public void inputCredential(String email, String password){
        loginPage.setEmail(email);
        loginPage.setPassword(password);
        loginPage.clickLogin();
    }

    @Then("User see error \"(.*)\" on login page")
    public void errorText(String errorText){
        Assert.assertEquals(errorText, loginPage.getErrorText());
    }


    @Then("User clicked masuk button")
    public void userClickMasukButton(){
        loginPage.clickLogin();
    }

    @Then("^User cant clicked masuk button$")
    public void userCantClickedMasukButton() {
        loginPage.disableBtn();
    }
}
