package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver driver;

    public LoginPage (WebDriver driver) {
        this.driver = driver;
    }

    @FindBy (id = "logInPanelHeading")
    private WebElement loginPanelHeading;

    @FindBy (id = "txtUsername")
    private WebElement usernameInput;

    @FindBy (id = "txtPassword")
    private WebElement passwordInput;

    @FindBy (id = "btnLogin")
    private WebElement submitBtn;

    @FindBy (id = "spanMessage")
    private WebElement errorMessage;

    public void setUsernameInput(String username){
        usernameInput.sendKeys(username);
    }

    public void setPasswordInput(String password) {
        passwordInput.sendKeys(password);
    }

    public HomePage clickSubmitBtn(){
        submitBtn.click();
        return PageFactory.initElements(driver,HomePage.class);
    }

    public WebElement setLoginPanelHeading (){
        return loginPanelHeading;
    }

    public WebElement returnErrorMessage(){
        return errorMessage;
    }

}
