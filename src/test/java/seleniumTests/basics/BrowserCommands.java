package seleniumTests.basics;

import org.testng.annotations.Test;
import seleniumTests.util.TestUtil;

public class BrowserCommands extends TestUtil {
    /*
        Basics of browser commands in selenium
     */

    @Test
    public void basicsBrowserCommands(){

        // Way to open website in selenium browser
//        webDriver.get("http://www.seleniumeasy.com/test/");

//        // Read the web page title
        String websiteTitle = webDriver.getTitle();
        System.out.println(websiteTitle);
//
//        // Count the length of page title
        int titleLength = webDriver.getTitle().length();
        System.out.println(titleLength);
//
//        // get the page source ... it will print html version of any web page.
        String pageSource = webDriver.getPageSource();
        System.out.println(pageSource);
//
//        // Refresh your web-site.
        webDriver.navigate().refresh();
//
        webDriver.manage().window().fullscreen();
//        webDriver.manage().window().maximize();
    }
}
