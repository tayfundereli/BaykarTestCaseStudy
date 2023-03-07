package Baykar.pages;


import Baykar.utils.Drivers;
import Baykar.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {
    public HomePage() {PageFactory.initElements(Drivers.get(), this);}

    public By girisBtn = By.linkText("GİRİŞ");
    public By navbar = By.className("navbar");

    public void verifyHomePage() {
        Assert.assertTrue(Helpers.waitElementClickable(girisBtn).isDisplayed(),
                "Giris Button didn't appear on Home Page");
        Assert.assertTrue(Helpers.waitElementClickable(navbar).isDisplayed(),
                "Navbar didn't appear on Home Page");
    }

    public void clickLoginBtn() {
        Helpers.waitElementClickable(girisBtn).click();
    }
}
