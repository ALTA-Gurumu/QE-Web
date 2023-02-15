package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DetailPageTeacher_MuridPOVPage {
    public static WebDriver driver;

    public DetailPageTeacher_MuridPOVPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//label[@class='flex items-center justify-center gap-2 lg:w-60 w-52 bg-component hover:bg-navy border-none rounded-2xl p-2 lg:text-[20px]      text-[16px] text-white font-semibold']")
    private WebElement reservasiButton;

    public boolean isDisplayDetailPageTeacher_MuridPOVPage() {
        return detailPageTeacher_MuridPOVPage.isDisplayed();
    }

    public void clickReservasiButton() {
        reservasiButton.click();
    }

}
