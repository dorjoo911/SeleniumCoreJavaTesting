package introToTesting;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNG_Annotation {

    /*  **********************************************************************
        @BeforeSuite: This will run before all test cases and classes
        @AfterSuite:  This will run after  all test cases and classes

        @BeforeTest:  This will run before each test
        @AfterTest:   This will run after  all  tests

        @BeforeGroups: For the group testing
        @AfterGroups:  For the group testing

        @BeforeClass:  This will run before each class
        @AfterClass:   This will run after  each class

        @BeforeMethod: This will run before each test method
        @AfterMethod:  This will run after  each test method

        **********************************************************************
     */
    @BeforeSuite
    public  void testBeforeSuite(){
        System.out.println("Before Suite method is running ... ");
        System.out.println("Connect To DataBase ... ");
    }

    @Test
    public  void testSetUp(){
        System.out.println("Running the test ... ");
        System.out.println("Reading and Writing information into DB ... ");
    }

    @AfterSuite
    public  void testAfterSuite(){
        System.out.println("After Suite method is running ... ");
        System.out.println("Closing the Connection to DB ... ");
    }


}
