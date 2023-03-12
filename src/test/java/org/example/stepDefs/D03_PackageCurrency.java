package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.testng.Assert;

public class D03_PackageCurrency {
    HomePage homeObject;
    @Given("User Switches Country to KSA from home screen")
    public void userSwitchesCountryToKSAFromHomeScreen() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKSA();
    }

    @Then("Currency displayed to KSA is SAR")
    public void currency_displayed_to_ksa_is_sar() {
        Assert.assertTrue(homeObject.currencyLite.getText().contains("SAR"));
        Assert.assertTrue(homeObject.currencyClassic.getText().contains("SAR"));
        Assert.assertTrue(homeObject.currencyPremium.getText().contains("SAR"));

    }

    @Given("User switches country to Kuwait")
    public void user_switches_country_to_kuwait() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKW();
    }

    @Then("Currency displayed to Kuwait is KWD")
    public void currency_displayed_to_kuwait_is_kwd() {
        Assert.assertTrue(homeObject.currencyLite.getText().contains("KWD"));
        Assert.assertTrue(homeObject.currencyClassic.getText().contains("KWD"));
        Assert.assertTrue(homeObject.currencyPremium.getText().contains("KWD"));
    }

    @Given("User switches country to Bahrain")
    public void user_switches_country_to_bahrain() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectBH();
    }

    @Then("Currency  displayed to Bahrain is BHD")
    public void currency_displayed_to_bahrain_is_bhd() {
        Assert.assertTrue(homeObject.currencyLite.getText().contains("BHD"));
        Assert.assertTrue(homeObject.currencyClassic.getText().contains("BHD"));
        Assert.assertTrue(homeObject.currencyPremium.getText().contains("BHD"));
    }

}
