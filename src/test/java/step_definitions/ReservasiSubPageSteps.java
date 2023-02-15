package step_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pageObject.*;
import org.example.pageObject.DetailPageTeacher_MuridPOVPage;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class ReservasiSubPageSteps {

    private WebDriver webDriver;

    ReservasiSubPage reservasiSubPage;

    DetailPageTeacher_MuridPOVPage detailPageTeacher_MuridPOVPage;

    public ReservasiSubPageSteps() {
        super();
        this.webDriver = Hooks.webDriver;
        reservasiSubPage = new ReservasiSubPage(webDriver);
        detailPageTeacher_MuridPOVPage = new DetailPageTeacher_MuridPOVPage(webDriver);
    }

//    @Given("Student At Detail Page Teacher Murid POV")
//    public void StudentAtDetailPageTeacherMuridPOV() {
//        detailPageTeacher_MuridPOVPage.isDisplayDetailPageTeacher_MuridPOVPage();
//    }

    @Given("Student at 'Detail Page Teacher murid POV'")
    public void isDisplayDetailPageTeacher_MuridPOVPage() {
        detailPageTeacher_MuridPOVPage.isDisplayDetailPageTeacher_MuridPOVPage();
    }

    @And("pop up 'Reservasi' sub page")
    public void isDisplayReservasiSubPage() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        reservasiSubPage.isDisplayReservasiSubPage();
    }

    @When("Student click 'Reservasi' button")
    public void clickReservasiButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        reservasiSubPage.clickReservasiButton();
    }

    @Given("Student at pop up Reservasi")
    public void StudentAtPopUpReservasi() {
        reservasiSubPage.isDisplayReservasiSubPage();
    }

    @Then("show X button")
    public void isDisplayXButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayXButton());
    }

    @Then("show title 'Reservasi' title")
    public void isDisplayTitleReservasi() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayTitleReservasi());
    }

    @Then("show text 'Let's thrive with \"(.*)\"'")
    public void isDisplayTextLetsThriveWith(String namaGuru) {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.getTextLetsThriveWithNamaGuru().contains(namaGuru));
    }

    @Then("show text 'Perkenalan diri'")
    public void isDisplayTextPerkenalanDiri() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayTextPerkenalkanDiri());
    }

    @Then("show 'Perkenalan Diri' field")
    public void isDisplayPerkenalkanDiriField() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayPerkenalkanDiriField());
    }

    @Then("show text 'Format Kursus'")
    public void isDisplayFormatKursus() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayFormatKursus());
    }

    @Then("show 'Format Kursus' button")
    public void isDisplayFormatKursusButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayFormatKursusButton());
    }

    @Then("'Format Kursus' button can be click")
    public void isEnabledFormatKursusButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isEnabledFormatKursusButton());
    }

    @And("Student click 'Format Kursus' button")
    public void clickFormatKursusButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        reservasiSubPage.clickFormatKursusButton();
    }

    @Then("show text 'Tanggal Kursus Pertama'")
    public void isDisplayTanggalKursusPertama() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayTanggalKursusPertama());
    }

    @Then("show 'Pilih Tanggal' button")
    public void isDisplayPilihTanggalButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayPilihTanggalButton());
    }

    @Then("'Pilih Tanggal' button can be click")
    public void isEnabledPilihTanggalButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isEnabledPilihTanggalButton());
    }

    @Then("show 'Pilih Jam' button")
    public void isDisplayPilihJamButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayPilihJamButton());
    }

    @Then("'Pilih Jam' button can be click")
    public void isEnabledPilihJamButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isEnabledPilihJamButton());
    }

    @Then("show text 'Informasi Kontak'")
    public void isDisplayInformasiKontak() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayInformasiKontak());
    }

    @Then("show text 'Kontak yang anda berikan hanya akan dibagikan ke guru terkait'")
    public void isDisplayKontakYangAndaBerikan() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayKontakYangAndaBerikan());
    }

    @Then("show 'Alamat' field")
    public void isDisplayAlamat() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayAlamat());
    }

    @Then("show 'No Hp' field")
    public void isDisplayNoHp() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayNoHp());
    }

    @Then("show 'Lanjutkan Pembayaran' button enable to click")
    public void isEnabledLanjutkanPembayaranButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        reservasiSubPage.isEnabledLanjutkanPembayaranButton();
    }

    @Then("show 'Lanjutkan Pembayaran' button")
    public void isDisplayLanjutkanPembayaranButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayLanjutkanPembayaranButton());
    }

    @Then("'Lanjutkan Pembayaran' button can be click")
        public void clickLanjutkanPembayaranButton() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        reservasiSubPage.clickLanjutkanPembayaranButton();
    }

    @Then("show picture 'Profil Picture'")
    public void isDisplayProfilePicture() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayProfilePicture());
    }

    @Then("show text Nama Guru \"(.*)\"")
    public void isDisplayTextNamaGuru(String namaGuru) {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.getTextNamaGuru().contains(namaGuru));
    }

    @Then("show text 'Ulasan'")
    public void isDisplayTextUlasan() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayTextUlasan());
    }

    @Then("show text 'Tarif Belajar/Jam'")
    public void isDisplayTextTarifBelajarPerJam() {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.isDisplayTextTarifBelajarPerJam());
    }

    @Then("show text Tarif \"(.*)\"")
    public void isDisplayTextTarif(String tarif) {
        ReservasiSubPage reservasiSubPage = new ReservasiSubPage(webDriver);
        Assert.assertTrue(reservasiSubPage.getTextTarif().contains(tarif));
    }





}
