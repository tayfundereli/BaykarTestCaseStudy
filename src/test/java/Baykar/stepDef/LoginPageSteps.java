package Baykar.stepDef;

import Baykar.pages.LoginPage;
import Baykar.utils.Helpers;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
    LoginPage loginPage = new LoginPage();

    @When("{string} ve {string} alani doldurulmadan giris butonuna tiklanir")
    public void veAlaniDoldurulmadanGirisButonunaTiklanir(String email, String password) {
        loginPage.fillLoginInfo(email, password);
    }

    @Then("Bos email ve password hatasi kontrol edilir")
    public void bosEmailVePasswordHatasiKontrolEdilir() {
        loginPage.clickLoginBtn();
        loginPage.checkEmptyAlertMessage();
    }

    @When("Gecersiz {string} {string} yazilir")
    public void gecersizYazilir(String email, String password) {
        loginPage.fillLoginInfo(email, password);
        loginPage.clickCaptchaBtn();
        Helpers.waitFor(10);
    }

    @Then("Gecersiz Email Password hatasi kontrol edilir")
    public void gecersizEmailPasswordHatasiKontrolEdilir() {
        loginPage.clickLoginBtn();
        loginPage.checkInvalidAlertMessage();
    }

    @When("Gecerli {string} {string} yazilir")
    public void gecerliYazilir(String email, String password) {
        loginPage.fillLoginInfo(email, password);
        loginPage.clickCaptchaBtn();
        Helpers.waitFor(10);
        loginPage.clickLoginBtn();
    }
}
