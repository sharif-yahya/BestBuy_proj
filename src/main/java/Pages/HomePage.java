package Pages;

import Base.TestBase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    @FindBy(xpath = "//*[@class='block']")
    WebElement logoFlag;

    @FindBy(xpath = "//*[@aria-label='Cart Icon']")
    WebElement cartIcon;

    public HomePage() {
        PageFactory.initElements(driver, this);


    }

    public boolean logoCart() {
              cartIcon.isDisplayed();
       return logoFlag.isDisplayed();

    }




}
