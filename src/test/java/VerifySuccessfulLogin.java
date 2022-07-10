import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class VerifySuccessfulLogin extends BaseTests{

    @Test
    public void verifySuccessfulLogin(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.setUsernameInput("Admin");
        loginPage.setPasswordInput("admin123");
        HomePage homePage = loginPage.clickSubmitBtn();

        Assert.assertEquals(driver.getTitle(),"OrangeHRM");

        homePage.clickAssignLeaveBtn();
    }
}
