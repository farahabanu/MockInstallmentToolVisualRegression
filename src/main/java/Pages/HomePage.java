package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage
{
    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By inlineStartDemoButton=By.xpath("(//button[contains(.,'Start demo')])[1]");
    private By cookieBar=By.xpath("//div[@class='cookie-btn bg-red']");

    public void inlineExperienceClickOnStartDemo()
    {
        WebElement button= driver.findElement(inlineStartDemoButton);
        button.click();

    }

    public void clickOnCookieButton()
    {
        WebElement cookieButton= driver.findElement(cookieBar);
        cookieButton.click();
    }



}
