Feature: Validating Mock demo tool

  Scenario: Verify the use case 1 inline, Existing user flow.

    Given Open a browser and navigate to the given URL
#    When Delete all the screenshot Folders
    When Click on start demo  of inline experience "inlineStartDemoButton".
    Then it navigates to the product description details page capture screenshot and click on next button.
    And it navigates to the cart det page capture screenshot and click on next button.
  And navigates to the shipping details page capture screenshot and click on next button
    And navigates to "chooseInstallmentsPage" capture screenshot and click on next button.
    And navigates to "DCFPayInInstallmentsPage" capture screenshot and click on next button.
    And navigates to "DCFInstallmentsDetailsPage" capture screenshot and click on next button.
    And navigates to "DCFPayInInstallmentsSecondPage" capture screenshot and click on next button.
    And navigates to "DCFLetsGetStartedPage" capture screenshot and click on next button.
    And navigates to "DCFVerifyMobileNumberPage" capture screenshot and click on next button.
    And navigates to "DCFTellAboutYourselfPage" capture screenshot and click on next button.
    And navigates to "DCFYouAreReadyToGoPage" capture screenshot and click on next button.
    And navigates to "DCFPaymentDetailsPage" capture screenshot and click on next button.
    And navigates to "DCFSecuringPage" capture screenshot and click on next button.
    And navigates to "DCFReturnToMerchantPage" capture screenshot and click on next button.
    And navigates to review page and click on next.
  And navigates to Order Confirmation page Click on "endDemo".




















