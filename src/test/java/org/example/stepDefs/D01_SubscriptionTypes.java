package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.pages.HomePage;
import org.testng.Assert;

public class D01_SubscriptionTypes {

    HomePage homeObject;

    @Given("User Switches Country to KSA from home page")
    public void userSwitchesCountryToKSAFromHomePage() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKSA();
    }

    @Then("three available packages in KSA are displayed correctly")
    public void three_available_packages_in_ksa_are_displayed_correctly() {
        Assert.assertTrue(homeObject.litePackage.isDisplayed());
        Assert.assertTrue(homeObject.classicPackage.isDisplayed());
        Assert.assertTrue(homeObject.premiumPackage.isDisplayed());
    }


    @Given("User Switched the country to be Kuwait checking packages")
    public void user_switched_the_country_to_be_kuwait_checking_packages() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectKW();
    }
    @Then("Three Packages in Kuwait are displayed correctly")
    public void three_packages_in_kuwait_are_displayed_correctly() {
        Assert.assertTrue(homeObject.litePackage.isDisplayed());
        Assert.assertTrue(homeObject.classicPackage.isDisplayed());
        Assert.assertTrue(homeObject.premiumPackage.isDisplayed());
    }

    @Given("User Switched the country to be Bahrain checking packages")
    public void user_switched_the_country_to_be_bahrain_checking_packages() {
        homeObject=new HomePage(Hooks.driver);
        homeObject.selectBH();

    }
    @Then("Three Packages in Bahrain are displayed correctly")
    public void three_packages_in_bahrain_are_displayed_correctly() {
        Assert.assertTrue(homeObject.litePackage.isDisplayed());
        Assert.assertTrue(homeObject.classicPackage.isDisplayed());
        Assert.assertTrue(homeObject.premiumPackage.isDisplayed());
    }


}
