package talrise.step_definitions;


import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.apache.xml.security.stax.config.ConfigurationProperties;
import org.junit.Assert;
import talrise.utilities.CommonSteps;
import talrise.utilities.ConfigurationReader;
import talrise.utilities.Driver;

import static talrise.pages.PageInitializer.loginPage;
import static talrise.utilities.CommonSteps.clickWithTimeOut;

public class SignUp_Alternative_StepDefs extends CommonSteps {
    Faker faker=new Faker();

    @Given("US1 User clicks on sign up button")
    public void us1_user_clicks_on_sign_up_button() {
        clickWithTimeOut(signUpPage.signUpButton,2);
    }
    @Given("US1 User verifies the Sign Up title")
    public void us1_user_verifies_the_sign_up_title() {
        // Assert.assertTrue(loginPage.signUpTittle.isDisplayed());
    }
    @Given("US1 User fills firstName, lastName, email, password,confirmPassword and clicks GDPR and create account button")
    public void us1_user_fills_first_name_last_name_email_password_confirm_password_and_clicks_gdpr_and_create_account_button() {
        signUpPage.firstNameBox.sendKeys(faker.name().firstName());
        signUpPage.lastNameBox.sendKeys(faker.name().lastName());
        signUpPage.linkedInBox.sendKeys("https://linkedin.com/in/"+faker.name().firstName());
        signUpPage.emailBox.sendKeys(faker.internet().emailAddress());
        sendText(signUpPage.passswordBox,"Test123456!");
        sendText(signUpPage.confirmPasswordBox,"Test123456!");
//       loginPage.passwordBox.sendKeys(ConfigurationProperties.getProperty("password"));
//       loginPage.confirmedPasswordBox.sendKeys(ConfigurationProperties.getProperty("password"));
        clickWithTimeOut(signUpPage.GDPRcheckbox,1);
        clickWithTimeOut(signUpPage.signUpcreateAccountButton,2);

    }
    @Given("US1 User verifies the success message")
    public void us1_user_verifies_the_success_message() {
        waitFor(2);
        Assert.assertTrue(signUpPage.RegisteredPopUp.isDisplayed());
    }
    @Given("US1 User close the browser")
    public void us1_user_close_the_browser() {
        driver.close();
    }
    //Negative
    @Given("US1 User fills {string}, {string},{string}, {string}, {string},{string} and clicks GDPR and create account button")
    public void us1_user_fills_and_clicks_gdpr_and_create_account_button(String firstName, String lastName, String linkedIn, String email, String password, String confirmedPassword) {
        signUpPage.firstNameBox.sendKeys(firstName);
        signUpPage.lastNameBox.sendKeys(lastName);
        signUpPage.linkedInBox.sendKeys(linkedIn);
        signUpPage.emailBox.sendKeys(email);
        sendText(signUpPage.passswordBox,password);
        sendText(signUpPage.confirmPasswordBox,confirmedPassword);
        clickWithTimeOut(signUpPage.GDPRcheckbox,1);
        clickWithTimeOut(signUpPage.signUpcreateAccountButton,2);
    }

    @Given("US1 User verifies the warning message")
    public void us1_user_verifies_the_warning_message() {
      Assert.assertTrue(signUpPage.generalWarningMessage.isDisplayed());
    }

}
