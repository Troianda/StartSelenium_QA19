import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class StartTest {

    WebDriver wd;


    @BeforeTest
    public void precondition() {
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/home");


        // negative to the Link
    }

    @Test
    public void test() {
        wd.findElement(By.tagName("a"));
        wd.findElement(By.cssSelector("a"));//tagName
        wd.findElement(By.id("root"));
        wd.findElement(By.cssSelector("#root"));//id
        wd.findElement(By.linkText("HOME"));

        wd.findElement(By.partialLinkText("HO"));
        WebElement element = wd.findElement(By.id("root"));
        List<WebElement> List = wd.findElements(By.tagName("div"));
        System.out.println(List.size());

        wd.findElement(By.cssSelector("[href = '/home']"));
        wd.findElement(By.cssSelector("[href^= '/ho']"));//найти  по вервым буквам
        wd.findElement(By.cssSelector("[href$= '/me']"));//найти по последним буквам
        wd.findElement(By.cssSelector("[href*= '/om']"));// найти по середним  буквам

    }
        @AfterTest
        public void tearDown () {

            wd.quit();


        }
}
