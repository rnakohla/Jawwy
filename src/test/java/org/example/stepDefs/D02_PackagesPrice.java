package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.testng.Assert;

public class D02_PackagesPrice {
    HomePage homeObject;
    @Given("User Switches Country to KSA")
    public void userSwitchesCountryToKSA() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKSA();
    }

    @Then("Packages price displayed to KSA")
    public void packages_price_displayed_to_ksa() {
        Assert.assertEquals(homeObject.litePrice.getText(),"15");
        Assert.assertEquals(homeObject.classicPrice.getText(),"25");
        Assert.assertEquals(homeObject.premiumPrice.getText(),"60");


    }

    @Given("User switches country to Kuwait checking price")
    public void user_switches_country_to_kuwait_checking_price() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKW();
    }

    @Then("Packages price displayed to Kuwait")
    public void packages_price_displayed_to_kuwait() {
        Assert.assertEquals(homeObject.litePrice.getText(),"1.2");
        Assert.assertEquals(homeObject.classicPrice.getText(),"2.5");
        Assert.assertEquals(homeObject.premiumPrice.getText(),"4.8");
    }

    @Given("User switches country to Bahrain checking price")
    public void user_switches_country_to_bahrain_checking_price() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectBH();
    }

    @Then("Packages price displayed to Bahrain")
    public void packages_price_displayed_to_bahrain() {
        Assert.assertEquals(homeObject.litePrice.getText(),"2");
        Assert.assertEquals(homeObject.classicPrice.getText(),"3");
        Assert.assertEquals(homeObject.premiumPrice.getText(),"6");
    }

}
