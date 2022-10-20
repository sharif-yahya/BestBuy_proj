package Pages;

import Base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuPage extends TestBase {

    @FindBy(xpath = "//*[@class='c-button-unstyled hamburger-menu-button']")
    WebElement menuBtn;

    @FindBy(xpath = "//button[contains(text(),'Cell Phones')]")
    WebElement cellPhones;

    @FindBy(xpath = "//button[contains(text(),'iPhone')]")
    WebElement iphone;

    @FindBy(xpath = "(//a[contains(text(),'iPhone 14')])[1]")
    WebElement iphone14;



    public  MenuPage(){
        PageFactory.initElements(driver,this);
    }
    public HomePage menuToPhone(){

        menuBtn.click();
        cellPhones.click();
        iphone.click();
        iphone14.click();
       return new HomePage();

    }



}