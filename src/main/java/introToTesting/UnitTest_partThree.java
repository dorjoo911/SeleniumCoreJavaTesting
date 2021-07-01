package introToTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest_partThree {

    /*
        From given an array count the 6 how many times number 6 is in given array

        method that arrayCount6(int[] arr);
        return how many time number is been repeated in an array
        int[] arr ={3,4,5,6,5,7,8,9,6,5} --> 2
    */

    public int arrayCount6(int[] arr) {

        int count = 0;

        if (arr.length > 0) {
            for (int j : arr) {
                if (j == 6) {
                    count++;
                }
            }
        }
        return count;
    }

    /*
        Test Case: Verify that Array has count of number 6
        Step 1: Call the method arrayCount6 with args of array
        Step 2: if args array length is less than one, we should throw exeption
        Step 3: count the how many 6 are repeated in given array
        Step 4: return result as int number ...
        Step 5: if there is no six in an array, return 0 as number.
     */

    @Test
    public void testArrayCount6() {

        int[] arrOne = {3, 4, 5, 6};
        int[] arrTwo = {3, 4, 5, 6, 5, 7, 8, 9, 6, 5};
        int[] arrThree = {3, 4, 5, 5, 7, 8, 9, 5};
        int[] arrFour = {};

        Assert.assertEquals(arrayCount6(arrOne), 1);
        Assert.assertEquals(arrayCount6(arrTwo), 2);
        Assert.assertEquals(arrayCount6(arrThree), 0);
        Assert.assertEquals(arrayCount6(arrFour), 0);
    }
}
