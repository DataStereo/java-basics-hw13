import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizedTest {

    @Test(parameters = "paramFromXml")
    @Parameters("paramFromXml")
    public void testWithXmlParameter(String param) {
        System.out.println("Test with XML Parameter: " + param);
    }

    @Test(dataProvider = "dataProviderMethod")
    public void testWithDataProvider(String param) {
        System.out.println("Test with DataProvider: " + param);
    }

    @DataProvider
    public Object[][] dataProviderMethod() {
        return new Object[][]{
                {"Parameter 1"},
                {"Parameter 2"},
        };
    }
}
