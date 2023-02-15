package org.example.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ReservasiSubPage {

    public static WebDriver driver;

    public ReservasiSubPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }



    @FindBy(id = "")
    private WebElement detailPageTeacher_MuridPOVPage;

    @FindBy(id = "//div[@class='modal-box w-11/12 max-w-5xl relative']")
    private WebElement reservasiSubPage;

    @FindBy(xpath = "//h1[@class='font-bold text-3xl ml-5 mt-10']")
    private WebElement titleReservasi;

    @FindBy(xpath = "//p[@class='font-semibold text-lg ml-5 mt-2 ']")
    private WebElement textLetsThriveWith;

    @FindBy(xpath = "//p[@class='font-normal text-md w-10/12 ml-5']")
    private WebElement textPerkenalkanDiri;

    @FindBy(id = "input-tentang-saya")
    private WebElement perkenalkanDiriField;

    @FindBy(xpath = "//h1[@class='text-xl mx-auto w-10/12 lg:w-11/12 font-semibold mt-10']")
    private WebElement textFormatKursus;

    @FindBy(xpath = "//select[@class='select select-bordered w-11/12  mt-5 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement formatKursusButton;

    @FindBy(xpath = "//h1[@class='font-semibold text-lg m-5 mt-8']")
    private WebElement textTanggalKursusPertama;

    @FindBy(xpath = "//select[@class='select select-bordered flex-1 mr-5 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement selectPilihTanggalButton;
//        isi list tanggal = + /option[1]
//                           + /option[2]
//                           + /option[3]
//                           + dst...

    @FindBy(xpath = "//select[@class='flex-1 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement selectPilihJamButton;
//        isi list jam = + /option[.='22:00']
//                       + /option[.='12:00']
//                       + dst...

    @FindBy(xpath = "//div[@class='leaflet-container leaflet-touch leaflet-fade-anim leaflet-grab leaflet-touch-drag leaflet-touch-zoom']")
    private WebElement linkMap;

    @FindBy(xpath = "//h1[@class='font-semibold text-2xl m-5']")
    private WebElement textInformasiKontak;

    @FindBy(xpath = "//p[@class='font-normal text-lg w-11/12 ml-5']")
    private WebElement textKontakYangAndaBerikan;

    @FindBy(id = "input-alamat_siswa")
    private WebElement alamatField;

    @FindBy(id = "input-telepon")
    private WebElement noHpField;

    @FindBy(id = "btn-pembayaran")
    private WebElement lanjutkanPembayaranButton;

    @FindBy(xpath = "//div[@class='w-8/12 rounded-2xl bg-primary shadow-xl h-[30rem] mt-10 shad mx-auto']/img[@src='https://try123ok.s3.ap-southeast-1.amazonaws.com/files/guru/guruku4@gmail.com/avatar.jpeg']")
    private WebElement profilePicture;

    @FindBy(xpath ="//p[@class='font-bold text-3xl text-center mt-7']")
    private WebElement namaGuru;

    @FindBy(xpath = "//span[@class='text-lg font-semibold font-poppins']")
    private WebElement textUlasan;

    @FindBy(xpath = "//span[.='Tarif Belajar / Jam']")
    private WebElement textTarifBelajarPerJam;

    @FindBy(xpath = "//span[.='50000']")
    private WebElement textTarif;

    @FindBy(xpath = "//p[@class='text-lg font-bold text-center mt-5']")
    private WebElement textSpesialisasiDanMapel;

    @FindBy(xpath = "//span[@class='rounded-xl mr-3 py-3 px-2 bg-slate-300']")
    private WebElement textNamaPelajaran;

    @FindBy(xpath = "//span[@class='rounded-xl mr-3 py-3 px-2 bg-slate-300 ']")
    private WebElement textTingkatan;

    @FindBy(xpath = "//h2[@class='text-md text-center mt-5 font-bold']")
    private WebElement textResponPesanGuru;

    @FindBy(xpath = "//h1[@class='font-semibold text-xl mt-10 font-poppins ml-10 text-center']")
    private WebElement textPilihMetodePembayaran;

    @FindBy(id = "//select[@class='select select-bordered w-8/12 mt-5 border-2  font-poppins font-normal text-lg h-[3rem] p-2']")
    private WebElement selectMetodePembayaran;
//        isi list metode pembayaran = + /option[.='BCA']
//                                     + /option[.='BRI']
//                                     + /option[.='BNI']
//                                     + /option[.='Permata']
//                                     + /option[.='Metode Qris']
//                                     + dst...

    @FindBy(xpath = "//div[@class='modal-box w-11/12 max-w-5xl relative']/label[@class='btn btn-sm btn-circle absolute right-2 top-2']")
    private WebElement xButton;

    public boolean isDisplayDetailPageTeacher_MuridPOVPage() {
        return detailPageTeacher_MuridPOVPage.isDisplayed();
    }

    public void clickReservasiButton() {
        reservasiButton.click();
    }

    public boolean isDisplayReservasiSubPage() {
        return reservasiSubPage.isDisplayed();
    }

    public boolean isDisplayTitleReservasi() {
        return titleReservasi.isDisplayed();
    }

    public boolean isDisplayTextLetsThriveWith() {
        return textLetsThriveWith.isDisplayed();
    }

    public String getTextLetsThriveWithNamaGuru() {
        return textLetsThriveWith.getText();
    }

    public boolean isDisplayTextPerkenalkanDiri() {
        return textPerkenalkanDiri.isDisplayed();
    }

    public boolean isDisplayPerkenalkanDiriField() {
        return perkenalkanDiriField.isDisplayed();
    }

    public boolean isDisplayFormatKursus() {
        return textFormatKursus.isDisplayed();
    }

    public boolean isDisplayFormatKursusButton() {
        return formatKursusButton.isDisplayed();
    }

    public boolean isEnabledFormatKursusButton() {
        return formatKursusButton.isEnabled();
    }

    public boolean isDisplayTanggalKursusPertama() {
        return textTanggalKursusPertama.isEnabled();
    }

    public boolean isDisplayPilihTanggalButton() {
        return selectPilihTanggalButton.isDisplayed();
    }

    public boolean isEnabledPilihTanggalButton() {
        return selectPilihTanggalButton.isEnabled();
    }

    public boolean isDisplayPilihJamButton() {
        return selectPilihJamButton.isDisplayed();
    }

    public boolean isEnabledPilihJamButton() {
        return selectPilihJamButton.isEnabled();
    }

    public boolean isDisplayInformasiKontak() {
        return textInformasiKontak.isDisplayed();
    }

    public boolean isDisplayKontakYangAndaBerikan() {
        return textKontakYangAndaBerikan.isDisplayed();
    }

    public boolean isDisplayAlamat() {
        return alamatField.isDisplayed();
    }

    public boolean isDisplayNoHp() {
        return noHpField.isDisplayed();
    }

    public boolean isDisplayLanjutkanPembayaranButton() {
        return lanjutkanPembayaranButton.isDisplayed();
    }

    public boolean isEnabledLanjutkanPembayaranButton() {
        return lanjutkanPembayaranButton.isEnabled();
    }

    public void clickLanjutkanPembayaranButton() {
        lanjutkanPembayaranButton.click();
    }

    public boolean isDisplayProfilePicture() {
        return namaGuru.isDisplayed();
    }

    public String getTextNamaGuru() {
        return textLetsThriveWith.getText();
    }

    public boolean isDisplayTextUlasan() {
        return textUlasan.isDisplayed();
    }

    public boolean isDisplayTextTarifBelajarPerJam() {
        return textTarifBelajarPerJam.isDisplayed();
    }

    public String getTextTarif() {
        return textTarif.getText();
    }

    public void clickFormatKursusButton() {
        formatKursusButton.click();
    }


    public void clickperkenalkanDiriField() {
        perkenalkanDiriField.click();
    }


    public void clickPilihTanggalButton() {
        pilihTanggalButton.click();
    }

    public void clickPilihJamButton() {
        pilihJamButton.click();
    }

    public void clickTanggalButton() {
        tanggalButton.click();
    }

    public void clickJamButton() {
        jamButton.click();
    }

    public boolean isDisplayXButton() {
        return xButton.isDisplayed();
    }

    public void clickXButton() {
        xButton.click();
    }

//on progress
}
