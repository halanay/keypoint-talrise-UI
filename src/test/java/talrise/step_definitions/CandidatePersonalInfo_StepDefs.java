package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import talrise.utilities.CommonSteps;
import talrise.utilities.ConfigurationReader;

public class CandidatePersonalInfo_StepDefs extends CommonSteps {
    @Given("US2 Candidate user fills the email and password and clicks login button")
    public void us2_candidate_user_fills_the_email_and_password_and_clicks_login_button() {
     sendText(loginPage.emailTextbox, ConfigurationReader.get("candidate_email"));
     sendText(loginPage.passwordTextbox,ConfigurationReader.get("password"));
     click(loginPage.loginButton);
    }

    @Given("US2 Candidate user verifies the success message")
    public void us2_candidate_user_verifies_the_success_message() {
        waitFor(2);
        Assert.assertTrue(loginPage.loginMessage.isDisplayed());
    }

    @Given("US2 Candidate clicks the complete now button")
    public void us2_candidate_clicks_the_complete_now_button() {
      //clickWithTimeOut(loginPage.completeNowButton,1);
        clickWithTimeOut(profilePage.personalInfoProfileButton,1);
        waitFor(2);
    }

    @Given("US2 Candidate user verifies the Profile title")
    public void us2_candidate_user_verifies_the_profile_title() {
     waitFor(2);
     Assert.assertTrue(profilePage.profileTitle.isDisplayed());
    }

    @Given("US2 Candidate user clicks the Personal Information button")
    public void us2_candidate_user_clicks_the_personal_information_button() {
        waitFor(1);
     clickWithJS(profilePage.personalInformationButton);
    }
    @Given("US2 Candidate user fills the Country City Country_Code Mobile")
    public void us2_candidate_user_fills_the_country_city_country_code_mobile() {
      click(profilePage.countryBox);
      waitFor(1);
      click(profilePage.England);
      click(profilePage.cityBox);
      waitFor(1);
      click(profilePage.London);
      scrollToElement(profilePage.countryCodeBox);
      waitFor(1);
      clickWithTimeOut(profilePage.countryCodeBox,1);
      waitFor(1);
      click(profilePage.countryCodeValue);

      profilePage.mobileBox.click();
      waitFor(1);
    }
    @Given("US2 Candidate user clicks the Save button and verifies success message")
    public void us2_candidate_user_clicks_the_save_button_and_verifies_success_message() {
      clickWithJS(profilePage.saveButton);
      waitFor(2);
      Assert.assertTrue(profilePage.personalInfoSuccessMessage.isDisplayed());
    }

}
