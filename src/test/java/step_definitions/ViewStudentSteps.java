package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.BerandaPage;
import org.example.pageObject.ViewStudentPage;
import org.openqa.selenium.WebDriver;

public class ViewStudentSteps {

    private WebDriver webDriver;
    ViewStudentPage viewStudentPage;

    public ViewStudentSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        viewStudentPage = new ViewStudentPage(webDriver);
    }

    @Given("Student already on Beranda / Home")
    public void studentAlreadyOnBerandaHome() {
        viewStudentPage.isHomeDisplayed();
    }

    @When("Student click 'user' button")
    public void studentClickUserButton() {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        if (berandaPage.successMessageIsDisplayed()){
            berandaPage.clickButtonConfirmationSuccessMessage();
        }
        viewStudentPage.userClicked();
    }

    @Then("button is enabled")
    public void buttonIsEnabled() {

        viewStudentPage.isUserDisplayed();
    }

    @Then("Student click 'Profile' option")
    public void studentClickProfileOption() throws InterruptedException {
        BerandaPage berandaPage = new BerandaPage(webDriver);
        berandaPage.clickProfile();
        webDriver.navigate().refresh();
        Thread.sleep(3000);
        viewStudentPage.closeListJadwalModal();
        viewStudentPage.profilClicked();
    }

    @And("Go to Student Profile")
    public void goToStudentProfile() {

        viewStudentPage.isProfilDisplayed();
    }
    @Given("Student already on User's Profile Page")
    public void studentAlreadyOnUserSProfilePage() {
        viewStudentPage.closeListJadwalModal();
        viewStudentPage.isUserDisplayed();
        viewStudentPage.userClicked();
        viewStudentPage.isStudentNameDisplayed();
    }

    @When("Student verifies 'Profile Picture'")
    public void studentVerifiesProfilePicture() {

    }

    @Then("Profile picture is displayed")
    public void profilePictureIsDisplayed() {
        viewStudentPage.isProfilPictureDisplayed();
    }

    @When("Student verifies 'Name'")
    public void studentVerifiesName() {
        viewStudentPage.isStudentNameDisplayed();
    }

    @Then("Name is displayed")
    public void nameIsDisplayed() {
        viewStudentPage.isStudentNameDisplayed();
    }

    @When("Student verifies 'Email'")
    public void studentVerifiesEmail() {
        viewStudentPage.isEmailDisplayed();
    }

    @Then("Email is displayed")
    public void emailIsDisplayed() {
        viewStudentPage.isEmailDisplayed();
    }

    @When("Student verifies 'Handphone'")
    public void studentVerifiesHandphone() {
        viewStudentPage.isHandphoneDisplayed();
    }

    @Then("Handphone is displayed")
    public void handphoneIsDisplayed() {
        viewStudentPage.isHandphoneDisplayed();
    }

    @When("Student verifies 'Alamat'")
    public void studentVerifiesAlamat() {
        viewStudentPage.isAlamatDisplayed();
    }

    @Then("Alamat is displayed")
    public void alamatIsDisplayed() {
        viewStudentPage.isAlamatDisplayed();
    }

    @When("Student click 'Profile' button")
    public void studentClickProfileButton() {
    }

    @And("Show Profile sidebar")
    public void showProfileSidebar() {
    }

    @When("Student click 'Riwayat' button")
    public void studentClickRiwayatButton() {
    }

    @And("Show Riwayat sidebar")
    public void showRiwayatSidebar() {
    }

    @When("Student click 'Sedang Berlangsung' button")
    public void studentClickSedangBerlangsungButton() {
    }

    @And("Show Sedang Berlangsung sidebar")
    public void showSedangBerlangsungSidebar() {
    }

    @When("Student click 'Perbarui Profil' button")
    public void studentClickPerbaruiProfilButton() {
    }

    @And("click 'user' button")
    public void clickUserButton() {
        viewStudentPage.userClicked();
    }

}
