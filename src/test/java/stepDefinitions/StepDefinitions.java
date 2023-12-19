package stepDefinitions;


import Resources.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class StepDefinitions extends Utils {

    Properties prop = new Properties();
    FileInputStream fi;

    {
        try {
            fi = new FileInputStream(System.getProperty("user.dir") + "//src//main//java//configs//Configuration.properties");
            prop.load(fi);
        } catch (IOException e) {

        }
    }

    @Given("Open a browser and navigate to the given URL")
    public void navigateToURL() throws IOException, InterruptedException {
        driver = initialiseBrowser();
        goToURL();
        WebElement button = driver.findElement(By.xpath("(//button[contains(.,'Start demo')])[1]"));
        elementToVisible(button);
        driver.findElement(By.xpath("//div[@class='cookie-btn bg-red']")).click();
        Thread.sleep(5000);




    }

    @When("Click on start demo  of inline experience {string}.")
    public void ClickStartDemo(String StartDemo)
    {
        screenShot("Homepage");
        //        imageDifference("Homepage", "Homepage", "HomepageDiff");

        driver.findElement(By.xpath(prop.getProperty(StartDemo))).click();

    }


    @And("navigates to review page and click on next.")

    public void navigatesToReviewPageAndClickOnNext() throws InterruptedException {
        elementToVisible(stepDefinitionText());
        Thread.sleep(3000);

        screenShot("reviewPage");
        imageDifference("reviewPage", "reviewPage", "reviewPageDiff");
        Assert.assertEquals(stepDefinitionText().getText(), "STEP 5 OF 6: PLACE ORDER");
        clickNextButton();


    }

    @And("navigates to Order Confirmation page Click on {string}.")
    public void navigatesToOrderConfirmationPageClickOn(String endDemo) throws InterruptedException {
        elementToVisible(stepDefinitionText());
        Assert.assertEquals(stepDefinitionText().getText(), "STEP 6 OF 6: ORDER CONFIRMATION");
        Thread.sleep(3000);
        screenShot("orderConfirmationPage");
        imageDifference("orderConfirmationPage", "orderConfirmationPage", "orderConfirmationPageDiff");
        driver.findElement(By.xpath(prop.getProperty(endDemo))).click();
        closeDriver();
    }



    @When("Delete all the screenshot Folders")
    public void deleteAllTheScreenshotFolders() {
        try {
            FileUtils.cleanDirectory(new File("src//test//java//Images//ScreenShot"));
            FileUtils.cleanDirectory(new File("src//test//java//Images//Difference"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    @Then("it navigates to the product description details page capture screenshot and click on next button.")
    public void navigateToProductDescription() throws InterruptedException {
        Thread.sleep(3000);
        elementToVisible(stepDefinitionText());
        Assert.assertEquals(stepDefinitionText().getText(), "STEP 1 OF 6: BEGIN CHECKOUT");
        screenShot("ProductDescriptionPage");
        clickNextButton();
        imageDifference("ProductDescriptionPage","ProductDescriptionPage","ProductDescriptionPageDiff");

    }


    @Then("it navigates to the cart det page capture screenshot and click on next button.")
    public void navigateToCheckoutPage() throws InterruptedException {
        Thread.sleep(3000);
        elementToVisible(stepDefinitionText());
        Assert.assertEquals(stepDefinitionText().getText(), "STEP 1 OF 6: BEGIN CHECKOUT");
        screenShot("cartPage");
        imageDifference("cartPage","cartPage","cartPageDiff");
        clickNextButton();


    }

    @Then("navigates to the shipping details page capture screenshot and click on next button")
    public void navigateToShippingDetailsPage() throws InterruptedException {
        Thread.sleep(3000);
        elementToVisible(stepDefinitionText());
        Assert.assertEquals(stepDefinitionText().getText(), "STEP 2 OF 6: PROVIDE SHIPPING INFORMATION");
        screenShot("shippingDetailsPage");
        imageDifference("shippingDetailsPage","shippingDetailsPage","shippingDetailsPageDiff");
        clickNextButton();


    }


    @And("navigates to {string} capture screenshot and click on next button.")
    public void navigatesToCaptureScreenshotAndClickOnNextButton(String pageName) throws InterruptedException {
        Thread.sleep(3000);
        elementToVisible(stepDefinitionText());

        String step3expectedText="STEP 3 OF 6: CHOOSE INSTALLMENTS OFFER";
        String step4expectedText="STEP 4 OF 6: REAL-TIME APPROVAL FOR PAY IN INSTALLMENTS";
        if(stepDefinitionText().getText().equalsIgnoreCase(step3expectedText)||stepDefinitionText().getText().equalsIgnoreCase(step4expectedText))
            screenShot(pageName);
        imageDifference(pageName,pageName,pageName+"Diff");
        clickNextButton();
    }
}
