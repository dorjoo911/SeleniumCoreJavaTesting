package introToTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest_PartTwo {

    // Main Application

    /*
        return true if non negative number is multiple of 3 and 5
        else return false;
        Create method name to3and5(int n) --> has to non-negative number !
     */

    public boolean to3and5(int n) {
        if (n > 0) {
            return (n % 3 == 0 || n % 5 == 0);
        } else {
            System.out.println("Number has to more than 0");
        }
        return false;
    }
    /*
        TestCase: Verify the number is divisible by 3 nad 5
        Step 1: Call the method to3and5(); with args as any non-negative number
        Step 2: if number is less that ZERO we should see false or
        Step 3: if number is not divisible by 3 or 5 then method will return false;
        Step 4: if number is divisible by 3 or 5 then will return true;
     */

    @Test
    public void testTo3And5() {
        UnitTest_PartTwo two = new UnitTest_PartTwo();

        Assert.assertTrue(two.to3and5(5));
        Assert.assertTrue(two.to3and5(3));
        Assert.assertFalse(two.to3and5(2));
    }
}
