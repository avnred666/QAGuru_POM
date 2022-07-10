import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class VerifyIncorrectPassword extends BaseTests{

    @Test
    public void verifyIncorrectPassword(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.setUsernameInput("Admin");
        loginPage.setPasswordInput("test");

        loginPage.clickSubmitBtn();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(loginPage.returnErrorMessage()));

        WebElement errorMessage = loginPage.returnErrorMessage();
        Assert.assertEquals(errorMessage.getText(),"Invalid credentials");
    }
}
