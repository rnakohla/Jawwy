@smoke
Feature: F01_SubscriptionPackages |  packages are displayed successfully for the selected country
  Scenario: User could see the available packages in KSA
    Given User Switches Country to KSA from home page
    Then three available packages in KSA are displayed correctly

    Scenario: User Could See the available packages in Kuwait
      Given User Switched the country to be Kuwait checking packages
      Then Three Packages in Kuwait are displayed correctly

  Scenario: User Could See the available packages in Bahrain
    Given User Switched the country to be Bahrain checking packages
    Then Three Packages in Bahrain are displayed correctly