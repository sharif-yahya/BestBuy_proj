package TestCases;

import Base.TestBase;
import Pages.AccountPage;
import Pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AccountPageTest extends TestBase {
    AccountPage accountPage;


  public   AccountPageTest(){
      super();

    }
    @BeforeMethod
    public void setUp(){
      initialization();
    accountPage  = new  AccountPage();


    }
    @Test
    public void setAccountPageTest(){
   accountPage.setEmailAndPassword(prop.getProperty("emailAddress"),prop.getProperty("password"));
    }

   @AfterMethod
    public void tearDown(){
      driver.quit();
   }





}
