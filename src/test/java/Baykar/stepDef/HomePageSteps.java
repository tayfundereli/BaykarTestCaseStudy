package Baykar.stepDef;

import Baykar.pages.HomePage;
import Baykar.utils.ConfReader;
import Baykar.utils.Drivers;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("kariyer.baykartech.com web sitesine gidilir ve sayfaya gidildigi dogrulanir")
    public void kariyerBaykartechComWebSitesineGidilirVeSayfayaGidildigiDogrulanir() {
        Drivers.get().get(ConfReader.get("baseUrl"));
        homePage.verifyHomePage();
    }

    @When("Giris butonuna tiklanir")
    public void girisButonunaTiklanir() {
        homePage.clickLoginBtn();
    }
}
