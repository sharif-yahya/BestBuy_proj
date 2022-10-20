package TestCases;

import Base.TestBase;
import Pages.AccountPage;

import Pages.HomePage;
import Pages.MenuPage;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import util.TestUtil;

public class MenuPageTest extends TestBase {

    MenuPage menuPage;
    TestUtil testUtil;

    HomePage homePage;
    AccountPage accountPage;

    public MenuPageTest() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        initialization();
         menuPage = new MenuPage();
        testUtil = new TestUtil();
        accountPage = new AccountPage();

        accountPage.setEmailAndPassword(prop.getProperty("emailAddress"),prop.getProperty("password"));


    }

    @Test
    public void setMenuPageTest() {

     homePage = menuPage.menuToPhone();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
