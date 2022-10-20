package Pages;

import Base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage extends TestBase {

    @FindBy(xpath = "//span[contains(text(),'Account')]")
    WebElement account;

    @FindBy(xpath = "//a[contains(text(),'Sign In')]")
    WebElement signIn;

    @FindBy(xpath = "//input[@type='email']")
    WebElement email;

    @FindBy(xpath = "//input[@type='password']")
    WebElement password;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement submit;

    @FindBy(xpath = "//*[contains(text(),'Skip For Now')]")
    WebElement SkipForNow;

    @FindBy(xpath = "//*[contains(text(),'Continue Anyway')]")
    WebElement ContinueAnyway;

    public AccountPage(){
        PageFactory.initElements(driver,this);

    }


    public HomePage setEmailAndPassword(String emadd, String password) {
        account.click();
        signIn.click();
        this.email.sendKeys(emadd);
        this.password.sendKeys(password);
        submit.click();
        SkipForNow.click();
        ContinueAnyway.click();
      return new HomePage();
    }
}
