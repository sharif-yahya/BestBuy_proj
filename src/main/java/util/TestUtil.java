package util;

import Base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class TestUtil extends TestBase {


    public static long PAGE_LOAD_TIMEOUT = 30;
    public static long IMPLICIT_WAIT = 30;

  public void popupHandel(){
      Set<String> handle = driver.getWindowHandles();

      Iterator<String> it = handle.iterator();

      String parentId = (it.next());
      System.out.println("parenWidowId" + parentId);

      String childId = (it.next());
      System.out.println("childWindowId" + childId);

      driver.switchTo().window(childId);



      System.out.println("childId pop up title" + driver.getTitle());

      driver.close();

      driver.switchTo().window(parentId);


      System.out.println("parentId title" + driver.getTitle());
  }
  public void action(){
      Actions action = new Actions(driver);

      action.clickAndHold(driver.findElement(By.xpath("")))
              .moveToElement(driver.findElement(By.xpath("")))
              .release().build().perform();

  }

    }






