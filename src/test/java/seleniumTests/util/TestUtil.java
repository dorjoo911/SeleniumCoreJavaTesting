package seleniumTests.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestUtil {

    public static WebDriver webDriver;
    public static Properties properties;

    @BeforeSuite
    public void testCaseSetUp() {
        properties = new Properties();

        try (InputStream readFile =
                     new FileInputStream("src/main/resources/WebElement.properties.properties")) {
            properties.load(readFile);

            if (properties.getProperty("browser").equals("chrome")) {
                System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
                webDriver = new ChromeDriver();
            } else if (properties.getProperty("browser").equals("firefox")) {
                System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
                webDriver = new FirefoxDriver();
            } else {
                System.out.println("Please enter valid browser name");
            }

        } catch (IOException e) {
            System.out.println(e);
        }


        //Step 1
        webDriver.navigate().to("https://www.seleniumeasy.com/test/");

        //Step 2
        String pageTitle = "Selenium Easy - Best Demo website to practice Selenium Webdriver Online";
        Assert.assertEquals(webDriver.getTitle(), pageTitle);

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        WebElement popUp = webDriver
                .findElement(new By.ByXPath("// a[.='No, thanks!']"));
        popUp.click();
    }

    public static WebElement getLocator(String xPath) {
        WebElement resultElement = webDriver.findElement(By.xpath(xPath));
        return resultElement;
    }

    public static void testVerify(String actual, String expected) {
        Assert.assertEquals(actual, expected);
    }

    @AfterSuite
    public void testCaseCleanUp() {

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        webDriver.quit();
    }

}
