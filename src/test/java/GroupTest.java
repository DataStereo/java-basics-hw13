import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupTest {
    @BeforeGroups(groups = "group1")
    public void beforeGroup1() {
        System.out.println("Before Group 1");
    }

    @AfterGroups(groups = "group1")
    public void afterGroup1() {
        System.out.println("After Group 1");
    }

    @BeforeGroups(groups = "group2")
    public void beforeGroup2() {
        System.out.println("Before Group 2");
    }

    @AfterGroups(groups = "group2")
    public void afterGroup2() {
        System.out.println("After Group 2");
    }

    @Test(groups = "group1")
    public void testInGroup1() {
        System.out.println("Test in Group 1");
    }

    @Test(groups = "group2")
    public void testInGroup2() {
        System.out.println("Test in Group 2");
    }

    @Test(groups = "group3")
    public void testInGroup3() {
        System.out.println("Test in Group 3");
    }
}
