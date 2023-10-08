import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SimpleTest {
    @BeforeMethod
    public void setUp() {
        System.out.println("Before Method: Setting up the test...");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method: Cleaning up after the test...");
    }

    @Test
    public void testMethod1() {
        System.out.println("Test Method 1");
    }

    @Test
    public void testMethod2() {
        System.out.println("Test Method 2");
    }
}
