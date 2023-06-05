import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TableTest {
    WebDriver wd;
    @BeforeMethod
    public void init() {
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
    @Test
    public void testCss() {

    }
    @AfterMethod
    public void tearDown() {
        wd.quit();
    }
}
