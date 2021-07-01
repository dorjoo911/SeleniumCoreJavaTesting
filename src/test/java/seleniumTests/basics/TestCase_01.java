package seleniumTests.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import seleniumTests.util.TestUtil;

import java.sql.Driver;
import java.util.ArrayList;

public class TestCase_01 extends TestUtil {

    /*
        Before Test: We should be able to open website in Chrome or Firefox

        TestCase: Test or verify the menu bar option are working or not
        Step 1: Open the web-site in given browser
        Step 2: Verify the that web-site title is matching with your expect tittle
        Step 2.1: Close popUp message through no, thanks button
        Step 3: Click on each menu bar item and ensure that it's open the list
        Step 4: Upon successful test we should close the browser.
     */

//    WebElement clickDropDown;
    @Test
    public void basicsBrowserCommands(){

        // Step 1: Open the web-site in given browser
//        webDriver.navigate().to("http://www.seleniumeasy.com/test/");
        webDriver.get("http://www.seleniumeasy.com/test/");
        webDriver.manage().window().maximize();

        // Step 2: Verify the that web-site title is matching with your expect tittle
//        String websiteTitle = webDriver.getTitle();
//        Assert.assertEquals(websiteTitle, "Selenium Easy - Best Demo website to practice Selenium Webdriver Online");

        String pageTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        Assert.assertEquals(webDriver.getTitle(), pageTitle);

        // Step 2.1: Close popUp

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e){
            System.out.println(e);
        }
        WebElement popUp = webDriver.findElement(new By.ByXPath("// a[.='No, thanks!']"));
        popUp.click();

//        webDriver.findElement(By.xpath(".//html/body/div[4]/div/div[1]/div/div[3]/div[2]/div[2]/div/a[2]")).click();

        // Step 3: Click on each menu bar item and ensure that it's open the list
        // //*[@id="navbar-brand-centered"]/ul[1]/li[1]/a
        // //*[@locator="class/id/name/link"] .... <=== syntax

//        WebElement clickDropDown = webDriver.findElement(new By.ByXPath("// a[.='Input Forms']"));
//        clickDropDown.click();
//        webDriver.findElement(By.xpath("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[2]/a"));

        ArrayList<WebElement> menuBars =
                (ArrayList<WebElement>) webDriver.findElements(By.xpath("//*[@class=\"dropdown-toggle\"]"));
//        System.out.println(menuBars);

        for (int i=0; i<menuBars.size(); i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e);
            }
            menuBars.get(i).click();
        }

        // Step 4: Upon successful test we should close the browser.




    }

}
