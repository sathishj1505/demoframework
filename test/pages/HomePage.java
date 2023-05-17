import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BaseTest {
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    By signInButton = By.xpath("//a[contains(text(),'Sign in')]");
    By emailInputField = By.name("email_create");

    By createAccountButton = By.id("SubmitCreate");

    public void clickSignButton(){
        driver.findElement(signInButton).click();
    }

    public void enterTextEmailField(){
        driver.findElement(emailInputField).sendKeys("demotest_one@test.com");
    }

    public void clickCreateAccountButton(){
        driver.findElement(createAccountButton).click();
    }
}
