package stepDefinitions;


import Pages.CartPage;
import Pages.HomePage;
import Resources.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import java.io.IOException;


public class StepDefinitions extends Utils
{
    static HomePage homePage;
    static CartPage cartPage;
    public static WebDriver driver;


    @Given("Open a browser and navigate to the given URL")
    public void navigateToURL() throws IOException, InterruptedException
    {
        driver = initialiseBrowser();
        goToURL();
        homePage=new HomePage(driver);
        homePage.clickOnCookieButton();
        WebElement button = driver.findElement(By.xpath("(//button[contains(.,'Start demo')])[1]"));
        elementToVisible(button);
        Thread.sleep(5000);
    }

    @When("Click on start demo  of inline experience {string}.")
    public void ClickStartDemo(String StartDemo) throws InterruptedException
    {
        homePage=new HomePage(driver);

        screenShot("Homepage");
//                imageDifference("Homepage", "Homepage", "HomepageDiff");
        homePage.inlineExperienceClickOnStartDemo();
        Thread.sleep(3000);


    }
    @Then("it navigates to the {string} verify the text {string} capture screenshot and click on next button.")
    public void NavigatesToCorrespondingPages(String pageName, String expectedText) throws InterruptedException
    {
        cartPage=new CartPage(driver);
        elementToVisible(cartPage.stepDefinitionText());
        String actualText=cartPage.stepDefinitionText().getText();
        Assert.assertEquals(actualText,expectedText );
        screenShot(pageName);
        imageDifference(pageName, pageName, pageName+"diff");
        cartPage.clickOnNextButton();
        Thread.sleep(3000);
    }

    @And("navigates to Order {string} verify the text {string} Click on endDemo button..")
    public void navigatesToOrderConfirmationPage(String pageName,String expectedText) throws InterruptedException
    {
        elementToVisible(cartPage.stepDefinitionText());
        String actualText=cartPage.stepDefinitionText().getText();
        Assert.assertEquals(actualText, expectedText);
        Thread.sleep(3000);
        screenShot(pageName);
        imageDifference(pageName, pageName, pageName+"Diff");
        cartPage.endDemo();
        closeDriver();
    }


}
