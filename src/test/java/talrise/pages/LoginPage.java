package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends CommonPageElements{

    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "//*[contains(text(),'successfully')]")
    public WebElement loginMessage;

    @FindBy(xpath = "//*[text()='complete now']")
    public WebElement completeNowButton;

}
