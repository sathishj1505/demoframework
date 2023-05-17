import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    HomePage homePage = new HomePage(driver);

    @Test
    public void login_create_account_test(){
        homePage.clickSignButton();
        homePage.enterTextEmailField();
        homePage.clickCreateAccountButton();
    }
}
