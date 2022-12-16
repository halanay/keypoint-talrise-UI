package talrise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

public class LanguagePage extends CommonPageElements{
    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[contains(text(),'Logged in successfully.')])[1]")
    public WebElement loginMessage;

    @FindBy(xpath = "//span[contains(text(),'Profile')]")
    public WebElement profileButton;

    @FindBy(xpath = "//span[contains(text(),'Language')]")
    public WebElement languageButton;

//    @FindBy(xpath = "//input[@name='searchText']")
//    public WebElement language_searchBox;

    @FindBy(xpath = "//h2[.='Language*']//..//input[@name=\"searchText\"]")
    public WebElement language_searchBox;







}
