package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    @FindBy (className = "quickLaunge")
    private WebElement assignLeaveBtn;

    public AssignLeavePage clickAssignLeaveBtn(){
        assignLeaveBtn.click();
        return PageFactory.initElements(driver,AssignLeavePage.class);
    }
}
