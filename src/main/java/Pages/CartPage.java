package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage
{
    private WebDriver driver;
    private By nextButton= By.xpath("//div[@class='flex']//button[1]");
    private By endButton= By.xpath("//div[@class='flex']//button[1]");
    private By pageText=By.xpath("//div[@class='tour-nav-right']/div[1]");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }


        public void  clickOnNextButton()
        {
            driver.findElement(nextButton).click();

        }
        public void endDemo()
        {
            driver.findElement(endButton).click();
        }
    public WebElement stepDefinitionText()
    {
        WebElement pageElement= driver.findElement(pageText);
        return pageElement;
    }
}
