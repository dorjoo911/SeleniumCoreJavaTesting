package seleniumTests.basics;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import seleniumTests.util.TestUtil;

public class RadioButtonMF extends TestUtil {

    @BeforeMethod
    public void testSetUp() {
        getLocator(properties.getProperty("inputPageButton")).click();
        getLocator(properties.getProperty("radioButtonCheckPage")).click();
        webDriver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void radioButtonMaleOrFemale() {
//Non selected
        getLocator(properties.getProperty("buttonRadioMF")).click();
        Assert.assertEquals(getLocator(properties.getProperty("checkedRadioMessageMF")).getText(), "Radio button is Not checked");
//Male selected
        getLocator(properties.getProperty("maleRadioMF")).click();
        getLocator(properties.getProperty("buttonRadioMF")).click();
        Assert.assertEquals(getLocator(properties.getProperty("checkedRadioMessageMF")).getText(), "Radio button 'Male' is checked");
//Female selected
        getLocator(properties.getProperty("femaleRadioMF")).click();
        getLocator(properties.getProperty("buttonRadioMF")).click();
        Assert.assertEquals(getLocator(properties.getProperty("checkedRadioMessageMF")).getText(), "Radio button 'Female' is checked");
    }

    @Test(priority = 2)
    public void radioButtonMaleOrFemaleAgeGroup() {
//Non selected
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex :\n" + "Age group:");
//Male selected
        getLocator(properties.getProperty("radioMFAMale")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Male\n" + "Age group:");

        getLocator(properties.getProperty("radioMFA05")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Male\n" + "Age group: 0 - 5");

        getLocator(properties.getProperty("radioMFA515")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Male\n" + "Age group: 5 - 15");

        getLocator(properties.getProperty("radioMFA1550")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Male\n" + "Age group: 15 - 50");
// Female selected
        getLocator(properties.getProperty("radioMFAFemale")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
//        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Female\n" + "Age group:");

        getLocator(properties.getProperty("radioMFA05")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Female\n" + "Age group: 0 - 5");

        getLocator(properties.getProperty("radioMFA515")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Female\n" + "Age group: 5 - 15");

        getLocator(properties.getProperty("radioMFA1550")).click();
        getLocator(properties.getProperty("radioMFAButton")).click();
        Assert.assertEquals(getLocator(properties.getProperty("radioMFAValues")).getText(), "Sex : Female\n" + "Age group: 15 - 50");
    }
}
