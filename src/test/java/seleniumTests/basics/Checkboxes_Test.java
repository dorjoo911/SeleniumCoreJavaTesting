package seleniumTests.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.collections.CollectionUtils;
import seleniumTests.util.TestUtil;

import java.util.ArrayList;
import java.util.List;

public class Checkboxes_Test extends TestUtil {


    //TODO

    /**
     * 1. Open the check box page (@BeforeMethod)
     * 2. Find the elements for single check box and confirm if it's checked or not
     * 3. Find the elements for multiple check box and check and uncheck all options
     * 4. Verify that all the options are checked if checkAll button is checked and or when unchecked
     * button is click verify all options are unchecked
     */

    @BeforeMethod
    public void testSetUp() {
        getLocator(properties.getProperty("inputPageButton")).click();
        getLocator(properties.getProperty("checkBoxHomePage")).click();
        webDriver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void testCheckboxPageOptionOne() {
        getLocator(properties.getProperty("checkboxSingle")).click();
        String successText = getLocator(properties.getProperty("checkboxSingleBoxMessage")).getText();
        testVerify( successText, "Success - Check box is checked");
    }

//    @Test(priority = 2)
//    public void testMultipleCheckboxDemo(){
//        getLocator(properties.getProperty("multiCheckbox_1")).click();
//        getLocator(properties.getProperty("multiCheckbox_2")).click();
//        getLocator(properties.getProperty("multiCheckbox_3")).click();
//        getLocator(properties.getProperty("multiCheckbox_4")).click();
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        getLocator(properties.getProperty("multiCheckbox_button_checkAll")).click();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            System.out.println(e);
//        }
//        getLocator(properties.getProperty("multiCheckbox_button_checkAll")).click();
//    }

    @Test(priority = 3)
    public void testMultipleCheckboxDemo1(){
        List<WebElement> findOptions;   //findOptions deer 4 xpath aa hadgalsan
        findOptions = webDriver.findElements(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div/label/input"));
        boolean selected; // selected deer false or true utga hadgalsan
        int i; // i deer too sanasan
        for ( i =1; i<=findOptions.size(); i++){ // i index findOptions iin size buyu heden shirheg bgaagaar toologdono
            webDriver.findElement //webDriver deer i index.d hargalzah xpath iig ugsun
                    (By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[" + i + "]/label/input")).click();
            selected = webDriver.findElement //selected.d webDriver.findElement utgaa ugsun
                    (By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[" + i + "]/label/input")).isSelected();
            Assert.assertTrue(selected);  //IsSelected eer shalguulsan selected utga ---> true butsaaj bnu?
        }
        getLocator(properties.getProperty("multiCheckbox_button_checkAll")).click();

        for(WebElement j : findOptions){    // WebElement.d hadgalsan findOptions xpath.uudiig j index eer unshina
            Assert.assertFalse(j.isSelected()); // j index.deh buh utga isSelected()-oor False uu gej shalgana
        }
        getLocator(properties.getProperty("multiCheckbox_button_checkAll")).click();
        for(WebElement j : findOptions){ // WebElement.d hadgalsan findOptions xpath.uudiig j index eer unshina
            Assert.assertTrue(j.isSelected()); // j index.deh buh utga isSelected()-oor True uu gej shalgana
        }
    }
}
