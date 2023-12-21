Feature: Validating Mock demo tool

  Scenario: Verify the use case 1 inline, Existing user flow.

    Given Open a browser and navigate to the given URL
    When Click on start demo  of inline experience "inlineStartDemoButton".
    Then it navigates to the "productDescriptionDetailsPage" verify the text "STEP 1 OF 6: BEGIN CHECKOUT" capture screenshot and click on next button.
    And it navigates to the "cartDetailsPage" verify the text "STEP 1 OF 6: BEGIN CHECKOUT" capture screenshot and click on next button.
    And it navigates to the "shippingDetailsPage" verify the text "STEP 2 OF 6: PROVIDE SHIPPING INFORMATION" capture screenshot and click on next button.
    And it navigates to the "chooseInstallmentsPage" verify the text "STEP 3 OF 6: CHOOSE INSTALLMENTS OFFER" capture screenshot and click on next button.
    And it navigates to the "DCFPayInInstallmentsPage" verify the text "STEP 3 OF 6: CHOOSE INSTALLMENTS OFFER" capture screenshot and click on next button.
    And it navigates to the "DCFInstallmentsDetailsPage" verify the text "STEP 3 OF 6: CHOOSE INSTALLMENTS OFFER" capture screenshot and click on next button.
    And it navigates to the "DCFPayInInstallmentsSecondPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFLetsGetStartedPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFVerifyMobileNumberPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFTellAboutYourselfPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFYouAreReadyToGoPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFPaymentDetailsPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFSecuringPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "DCFReturnToMerchantPage" verify the text "STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS" capture screenshot and click on next button.
    And it navigates to the "review" verify the text "STEP 5 OF 6: PLACE ORDER" capture screenshot and click on next button.
    And navigates to Order "ConfirmationPage" verify the text "STEP 6 OF 6: ORDER CONFIRMATION" Click on endDemo button..




















