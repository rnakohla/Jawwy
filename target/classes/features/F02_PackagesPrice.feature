@smoke
Feature: F02_PackagesPrice |  packages Price is displayed correctly for the selected country
  Scenario: packages price is displayed correctly for KSA
    Given User Switches Country to KSA
    Then Packages price displayed to KSA

  Scenario: packages price is displayed correctly for Kuwait
    Given User switches country to Kuwait checking price
    Then Packages price displayed to Kuwait

  Scenario: packages price is displayed correctly for Bahrain
    Given User switches country to Bahrain checking price
    Then Packages price displayed to Bahrain
