package talrise.pages;

import com.github.javafaker.Faker;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

public class SignUpPage extends CommonPageElements {



    Faker faker = new Faker();
    String linkedIn = "https://www.linkedin.com/in/";
    static String currentURL;

    @FindBy(xpath = "//*[.=\"SIGN UP\"]")
    public WebElement signUpButton;

    @FindBy(xpath = "//button[.=\"CREATE MY ACCOUNT\"]")
    public WebElement createAccountButton;

    @FindBy(xpath = "//*[contains(text(),\"Please \")]")
    public WebElement signUpErrorMessage;

    @FindBy(xpath = "//*[@id=\"firstName\"]")
    public WebElement firstNameBox;

    @FindBy(xpath = "//*[@id=\"lastName\"]")
    public WebElement lastNameBox;

    @FindBy(xpath = "//*[@id=\"linkedIn\"]")
    public WebElement linkedInBox;

    @FindBy(xpath = "//*[@id=\"email\"]")
    public WebElement emailBox;

    @FindBy(xpath = "//*[@id=\"password\"]")
    public WebElement passswordBox;

    @FindBy(xpath = "//*[@id=\"confirmPassword\"]")
    public WebElement confirmPasswordBox;

    @FindBy(xpath = "//*[@name=\"checkbox\"]")
    public WebElement GDPRcheckbox;

    @FindBy(xpath = "//button[.=\"CREATE MY ACCOUNT\"]")
    public WebElement signUpcreateAccountButton;

    @FindBy(xpath = "//*[contains(text(),'Registered')]")
    public WebElement RegisteredPopUp;

    @FindBy(xpath = "//*[contains(text(),'2 characters minimum')]")
    public WebElement warning_firstName_twoChar;

    @FindBy(xpath = "//*[contains(text(),'Only letters')]")
    public WebElement Warning_firstName_onlyLetters;

    @FindBy(xpath = "//*[contains(text(),'Email must be a valid email (example@mail.com)')]")
    public WebElement warningValidEmail;

    @FindBy(xpath = "//*[contains(text(),'Please include an '@'')]")
    public WebElement warningIncludeAtSign;

    @FindBy(xpath = "//*[contains(text(),'LinkedIn URL must be a valid LinkedIn URL')]")
    public WebElement linkedinErrorMessage;

    @FindBy(xpath = "//*[contains(text(),'Password must')]")
    public WebElement passwordErrorMessage;

    public void formFill(){
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        linkedInBox.sendKeys(linkedIn.concat(faker.name().firstName()));
        emailBox.sendKeys(faker.internet().emailAddress());
        passswordBox.sendKeys("Test123456!");
        confirmPasswordBox.sendKeys("Test123456!");
        GDPRcheckbox.click();


    }
    public void RolePageAssertion(){
        CommonSteps.waitFor(5);
        currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        Assert.assertTrue("We are on choose role page",currentURL.contains("chooseRole"));


    }

    public void signUp(String firstName, String lastName, String linkedin, String email, String password, String con_pass, String gdpr){

        firstNameBox.sendKeys(firstName);
        lastNameBox.sendKeys(lastName);
        linkedInBox.sendKeys(linkedin);
        emailBox.sendKeys(email);
        passswordBox.sendKeys(password);
        confirmPasswordBox.sendKeys(con_pass);
        if (gdpr.equals("true")){
            GDPRcheckbox.click();
        }
        signUpcreateAccountButton.click();

    }


    public void strEmailInputTests(String str) {

        if (str.equals("without @")) {
            str = faker.name().firstName().concat(".com");
        } else if (str.equals("one letter only")) {
            str = faker.letterify("?");
        } else if (str.equals("special characters")) {
            str = "!!";
        } else if (str.equals("emoji")) {
            str = "\uD83D\uDE00";
        } else if (str.equals("without TLDomain (.com)")) {
            str = faker.name().firstName().concat("@");
        }

    }

    public void emailTestForm(String str){
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        linkedInBox.sendKeys(linkedIn.concat(faker.name().firstName()));
        emailBox.sendKeys(str);
        passswordBox.sendKeys("Test123456!");
        confirmPasswordBox.sendKeys("Test123456!");
        GDPRcheckbox.click();
    }

    public void assertionTestName(){

        CommonSteps.waitFor(2);

        Assert.assertTrue(warning_firstName_twoChar.isDisplayed()|| Warning_firstName_onlyLetters.isDisplayed());

    }

    public void emailErrorMessageDisplayed() {

        Assert.assertTrue("email error message displayed",warningValidEmail.isDisplayed()||warningIncludeAtSign.isDisplayed());
    }

    public void linkedinTestForm(String linkedin){
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        linkedInBox.sendKeys(linkedin);
        emailBox.sendKeys(faker.internet().emailAddress());
        passswordBox.sendKeys("Test123456!");
        confirmPasswordBox.sendKeys("Test123456!");
        GDPRcheckbox.click();
    }

    public void passwordTestForm(String password){
        firstNameBox.sendKeys(faker.name().firstName());
        lastNameBox.sendKeys(faker.name().lastName());
        linkedInBox.sendKeys(linkedIn.concat(faker.name().firstName()));
        emailBox.sendKeys(faker.internet().emailAddress());
        passswordBox.sendKeys(password);
        confirmPasswordBox.sendKeys(password);
        GDPRcheckbox.click();
    }




}






