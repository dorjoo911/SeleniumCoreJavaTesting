package introToTesting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.InputMismatchException;

import static org.testng.asserts.Assertion.*;
public class UnitTest_PartOne {

    // Main application

    public String printName(String name){ // Instance method
        if (name.length() < 1){
            System.out.println("The name is too short !!!");
            throw new InputMismatchException("Name 'isn't' valid !!!");
        }
        return "Hello " + name.toUpperCase();
    }

    // Steve printName ... Steve ...
    //UnitTest

    /*
        TestData: Steve, John, Mike and Pete

        TestCase_01: Test the printName method
        Step 1: Verify that there is method called printName()
        Step 2: Pass the argument as name (String)
        Step 3: Make sure method does not have any error
        Step 4: return String must match the name that was given in args...
     */

    @Test
    public void testPrintNameMethod(){
        UnitTest_PartOne partOne = new UnitTest_PartOne(); // Created new Obj
//        String expectedResult = partOne.printName("Mike"); // Assigned it on String variable using created Obj
//        System.out.println(expectedResult);                // Printing out

        //testing
        Assert.assertEquals("Hello JO", partOne.printName("Jo"));     // Actual must match with Expected
        Assert.assertEquals("Hello MIKE", partOne.printName("Mike"));

    }
}
