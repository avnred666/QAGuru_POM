import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.log.Log;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.time.Duration;

public class VerifyIncorrectUsername extends BaseTests{

    @Test
    public void verifyIncorrectUsername(){
        LoginPage loginPage = PageFactory.initElements(driver,LoginPage.class);
        loginPage.setUsernameInput("test");
        loginPage.setPasswordInput("Admin123");
        loginPage.clickSubmitBtn();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.visibilityOf(loginPage.returnErrorMessage()));

        WebElement errorMessage = loginPage.returnErrorMessage();

        Assert.assertEquals(errorMessage.getText(),"Invalid credentials");

    }

}
