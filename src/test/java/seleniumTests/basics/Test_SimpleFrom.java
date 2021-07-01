package seleniumTests.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.json.JsonOutput;
import org.testng.Assert;
import org.testng.annotations.*;
import seleniumTests.util.TestUtil;

import java.lang.reflect.Method;
import java.util.Collections;

public class Test_SimpleFrom extends TestUtil {

    @DataProvider(name = "messageData")
    public Object[][] messageData(Method method){

        Object[][] result =null;

        if (method.getName().equals("testSimpleFormPage")){
            result = new Object[][]{
                    {"Message One"}, {"Message Two"}, {"Message Three"}
            };
        } else if (method.getName().equals("testSimpleTwoPage")) {
            result = new Object[][]{
                    {1, 'A', 66}, {2, 5, 7}, {5, 6, 11}
            };
        } else if (method.getName().equals("testSimpleTwoNaNPage")) {
            result = new Object[][]{
                    {"This is", "Selenium", "NaN"}, {"Test", "Project", "NaN"}, {"Isn't", "right?", "NaN"}
            };
        }
        return result;
    }

    @BeforeMethod
    public void testSetUp(){
        getLocator("//*[@id=\"navbar-brand-centered\"]/ul[1]/li[1]/a").click();
        getLocator("//*[@class=\"dropdown-menu\"]/li[1]/a").click();
        String currentUrl = "https://www.seleniumeasy.com/test/basic-first-form-demo.html";
        testVerify(webDriver.getCurrentUrl(), currentUrl);
        webDriver.manage().window().maximize();
    }

    @Test(dataProvider = "messageData", timeOut = 2000, invocationCount = 2, priority = 1)
    public void testSimpleFormPage(String msg) {
        //When
        String message = msg;
        getLocator("//*[@id=\"user-message\"]").sendKeys(message);
        getLocator("//*[@id=\"get-input\"]/button").click();
        //Then
        String resultMessage = getLocator("//*[@id=\"user-message\"]/span").getText();
        testVerify(resultMessage, message);
    }

    @Test(dataProvider = "messageData", priority = 2)
    public void testSimpleTwoPage(int numOne, int numTwo, int sumTotal){

        String strOne = String.valueOf(numOne);
        String strTwo = String.valueOf(numTwo);

        getLocator("//*[@id=\"sum1\"]").sendKeys(strOne);
        getLocator("//*[@id=\"sum2\"]").sendKeys(strTwo);
        getLocator("//*[@id=\"gettotal\"]/button").click();

        int result = Integer.parseInt(getLocator("//*[@id=\"displayvalue\"]").getText());
        Assert.assertEquals(result, sumTotal);
    }

    @Test(dataProvider = "messageData", priority = 3)
    public void testSimpleTwoNaNPage(String strOne, String strTwo, String concatStr){

        getLocator("//*[@id=\"sum1\"]").clear();
        getLocator("//*[@id=\"sum2\"]").clear();
        getLocator("//*[@id=\"sum1\"]").sendKeys(strOne);
        getLocator("//*[@id=\"sum2\"]").sendKeys(strTwo);
        getLocator("//*[@id=\"gettotal\"]/button").click();

        String result =getLocator("//*[@id=\"displayvalue\"]").getText();
        Assert.assertEquals(result, concatStr);
    }
}
