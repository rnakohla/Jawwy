@smoke
Feature: F03_PackagesCurrency |  packages Currency is displayed correctly according to the selected country
  Scenario: packages Currency is displayed correctly for KSA
    Given User Switches Country to KSA from home screen
    Then  Currency displayed to KSA is SAR

  Scenario: packages Currency is displayed correctly for Kuwait
    Given User switches country to Kuwait
    Then Currency displayed to Kuwait is KWD

  Scenario: packages Currency is displayed correctly for Bahrain
    Given User switches country to Bahrain
    Then Currency  displayed to Bahrain is BHD
