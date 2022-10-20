package TestCases;

import Base.TestBase;
import Pages.HomePage;

import Pages.MenuPage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends TestBase {
    HomePage homePage;
  //  MenuPage menuPage;


    public HomePageTest() {
        super();

    }

    @BeforeMethod
    public void seyUp() {
        initialization();
        homePage = new HomePage();
   // menuPage = new MenuPage();
    }

    @Test
    public void logoAndCartTest() {
        Assert.assertTrue(homePage.logoCart());

    }


    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


}
