package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends PageBase{

    public HomePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(id = "country")
    WebElement countrybtn;

    @FindBy(id = "sa-contry-lable")
     WebElement ksaCountry;

    @FindBy(id = "bh-contry-flag")
     WebElement bahrainCountry;

    @FindBy(id = "kw-contry-flag")
     WebElement kuwaitCountry;

    @FindBy(id = "name-lite")
    public WebElement litePackage;

    @FindBy(id = "name-classic")
    public WebElement classicPackage;

    @FindBy(id = "name-premium")
    public WebElement premiumPackage;

    @FindBy(xpath = "//*[@id=\"currency-lite\"]/i/text()[1]")
    public WebElement currencyLite;

    @FindBy (xpath ="//*[@id=\"currency-classic\"]/i/text()[1]")
    public WebElement currencyClassic;

    @FindBy (xpath = "//*[@id=\"currency-premium\"]/i/text()[1]")
    public WebElement currencyPremium;

    @FindBy (xpath = "//*[@id=\"currency-lite\"]/b")
    public WebElement litePrice;

    @FindBy(xpath = "//*[@id=\"currency-classic\"]/b")
    public WebElement classicPrice;

    @FindBy (xpath = "//*[@id=\"currency-premium\"]/b")
    public WebElement premiumPrice;

    public void selectKSA(){
        clickButton(countrybtn);
        clickButton(ksaCountry);}
    public void selectKW(){
        clickButton(countrybtn);
        clickButton(kuwaitCountry);}
    public void selectBH(){
        clickButton(countrybtn);
        clickButton(bahrainCountry);}

}
