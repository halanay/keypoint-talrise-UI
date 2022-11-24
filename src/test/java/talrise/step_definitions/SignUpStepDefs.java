package talrise.step_definitions;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import talrise.utilities.CommonSteps;




public class SignUpStepDefs extends CommonSteps {

    Faker faker=new Faker();



    @Given("the user clicks on sign up link")
    public void the_user_clicks_on_sign_up_link() {
        signUpPage.signUpButton.click();

    }

    @When("the user clicks the Create My Account button")
    public void theUserClicksTheCreateMyAccountButton() {

        signUpPage.createAccountButton.click();
    }

    @Then("error message should appear")
    public void errorMessageShouldAppear() {
        signUpPage.signUpErrorMessage.isDisplayed();
    }


    @Given("User is on the sign up page")
    public void userIsOnTheSignUpPage() {

        signUpPage.signUpButton.click();
    }

    @When("User enters valid inputs")
    public void userEntersValidInputs() {

        signUpPage.formFill();
        signUpPage.signUpcreateAccountButton.click();

    }

    @Then("User should be able to sign up.")
    public void userShouldBeAbleToSignUp() throws InterruptedException {
//     signUpPage.RolePageAssertion();

        Thread.sleep(1000);
        Assert.assertTrue(signUpPage.RegisteredPopUp.isDisplayed());



    }

    @When("the user leaves blank user information {string} {string}{string}{string}{string}{string}{string}")
    public void theUserLeavesBlankUserInformation(String firstName, String lastName, String linkedIn, String email, String password, String con_pass, String gdpr) {

        signUpPage.signUp(firstName, lastName, linkedIn, email, password, con_pass,gdpr);

    }



    @When("the user enters invalid {string} name inputs")
    public void theUserEntersInvalidNameInputs(String name) {

        signUpPage.firstNameBox.sendKeys(name);
        signUpPage.signUpcreateAccountButton.click();
    }


    @Then("warning message is displayed")
    public void warningMessageIsDisplayed() {

        signUpPage.assertionTestName();
    }

    @And("create my account button should not be enabled")
    public void createMyAccountButtonShouldNotBeEnabled() {

        Assert.assertFalse(signUpPage.createAccountButton.isEnabled());

    }

    @When("the user enters invalid {string} mail inputs")
    public void theUserEntersInvalidMailInputs(String email) {
        signUpPage.emailTestForm(email);
    }

    @And("the user clicks on Create My Account button")
    public void theUserClicksOnCreateMyAccountButton() {
        signUpPage.signUpcreateAccountButton.click();
    }

    @Then("email error message should appear")
    public void emailErrorMessageShouldAppear() {

        signUpPage.emailErrorMessageDisplayed();
    }

    @When("the user enters invalid {string}linkedin input")
    public void theUserEntersInvalidLinkedinInput(String linkedin) {
        signUpPage.linkedinTestForm(linkedin);

    }

    @Then("linkedin error message should be displayed")
    public void linkedinErrorMessageShouldBeDisplayed() {
        Assert.assertTrue(signUpPage.linkedinErrorMessage.isDisplayed());
    }

    @When("the user enters invalid {string} password inputs")
    public void theUserEntersInvalidPasswordInputs(String password) {
        signUpPage.passwordTestForm(password);
    }
    @Then("password error message should be displayed")
    public void passwordErrorMessageShouldBeDisplayed() {

        Assert.assertTrue(signUpPage.passwordErrorMessage.isDisplayed());
    }
}
