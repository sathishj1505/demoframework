import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    // -- constants, variables
    // methods

    // created a variable which is webdriver
    // name = driver
    public WebDriver driver;

    @BeforeClass
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.multiformis.com/");
    }

}
