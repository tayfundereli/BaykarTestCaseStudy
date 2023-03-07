package Baykar.pages;

import Baykar.utils.Drivers;
import Baykar.utils.Helpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {
    public LoginPage() {PageFactory.initElements(Drivers.get(), this);}

    public By emailField = By.name("login");
    public By passwordField = By.name("password");
    public By iframe = By.xpath("//*[@title='reCAPTCHA']");

    @FindBy(id = "recaptcha-anchor")
    public WebElement loginCheckbox;
    @FindBy(id = "kt_sign_in_submit")
    public WebElement loginBtn;
    @FindBy(css = ".alert-dismissible .flex-column span")
    public WebElement alertMessage;

    String emptyAlertMessage = "Bu alan zorunlu.";
    String invalidAlertMessage = "Girdiğiniz e-posta adresi ve/veya parola doğru değil.";

    public void fillLoginInfo(String email, String password) {
        Helpers.waitElementClickable(emailField).sendKeys(email);
        Helpers.waitFor(2);
        Helpers.waitElementClickable(passwordField).sendKeys(password);
    }

    public void clickLoginBtn() {
        loginBtn.click();
    }

    public void clickCaptchaBtn() {
        Helpers.switchToIframe(iframe);
        loginCheckbox.click();
        Helpers.leaveToIframe();
    }

    public void checkEmptyAlertMessage() {
        Assert.assertEquals(alertMessage.getText(), emptyAlertMessage, "Alert message didn't equal");
    }

    public void checkInvalidAlertMessage() {
        Assert.assertEquals(alertMessage.getText(), invalidAlertMessage, "Alert message didn't equal");
    }
}
