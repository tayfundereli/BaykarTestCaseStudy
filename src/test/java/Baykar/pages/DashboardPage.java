package Baykar.pages;

import Baykar.utils.Drivers;
import Baykar.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class DashboardPage {
    public DashboardPage() {PageFactory.initElements(Drivers.get(), this);}

    public By header = By.id("kt_header_user_menu_toggle");
    public By infoBox = By.className("info-info-box");

    public void verifyDashboardPage() {
        Assert.assertTrue(Helpers.waitElementClickable(header).isDisplayed(),
                "Header User Menu didn't appear on Dashboard Page");
        Assert.assertTrue(Helpers.waitElementClickable(infoBox).isDisplayed(),
                "Info Box didn't appear on Dashboard Page");
    }
}
