package talrise.pages;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.ConfigurationReader;

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

    public void candidateLogin(){

        emailTextbox.sendKeys(ConfigurationReader.get("candidateEmail"));
        passwordTextbox.sendKeys(ConfigurationReader.get("password"));
    }

    public void adminLogin(){

        emailTextbox.sendKeys(ConfigurationReader.get("adminEmail"));
        passwordTextbox.sendKeys(ConfigurationReader.get("password"));
    }




}
