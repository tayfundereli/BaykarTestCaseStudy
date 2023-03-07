package Baykar.stepDef;

import Baykar.pages.DashboardPage;
import io.cucumber.java.en.Then;

public class DashboardPageSteps {
    DashboardPage dashboardPage = new DashboardPage();

    @Then("Basarili uye girisi yapildigi kontrol edilir")
    public void basariliUyeGirisiYapildigiKontrolEdilir() {
        dashboardPage.verifyDashboardPage();
    }
}
