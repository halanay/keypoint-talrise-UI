package talrise.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;
import talrise.utilities.ConfigurationReader;
import talrise.utilities.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EducationStepDefs extends CommonSteps {

    @Given("the user goes to login page and enter valid inputs")
    public void theUserGoesToLoginPageAndEnterValidInputs() {
        Log.info("User goes to login page and input valid credentials");
        loginPage.emailTextbox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordTextbox.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginButton.click();
    }

    @And("user clicks on the education button and deletes all information")
    public void userClicksOnTheEducationButtonAndDeletesAllInformation() {
        Log.info("User clicks on the education button then delets previous info");
        waitForClickablility(educationPage.educationButton, 2000).click();
        waitForClickablility(educationPage.firstDeleteButton, 20).click();
    }

    @Then("user should be able to save their education details with valid inputs")
    public void userShouldBeAbleToSaveTheirEducationDetaisWithValidInputs() {
        Log.info("User goes to Dashboard page and clicks Profile then inputs new Education Info.");
        clickWithJS(educationPage.universitiesButton);
        List<WebElement> allUniversity;
        allUniversity= educationPage.universitiesListBox;
        allUniversity.get(5).click();
        educationPage.degreeButton.click();
        Random random = new Random();
        int randomNumber = random.nextInt(educationPage.dropdownOptionsList.size());
        waitForVisibility(educationPage.dropdownOptionsList.get(randomNumber), 10);
        educationPage.dropdownOptionsList.get(randomNumber).click();
        educationPage.departmentButton.click();
        randomNumber = random.nextInt(educationPage.dropdownOptionsList.size());
        educationPage.dropdownOptionsList.get(randomNumber).click();
        educationPage.startYearButton.click();
        waitFor(1);
        randomNumber = random.nextInt(educationPage.dropdownOptionsList.size());
        waitForClickablility(educationPage.dropdownOptionsList.get(randomNumber),10);
        educationPage.dropdownOptionsList.get(randomNumber).click();
        educationPage.endYearButton.click();
        waitFor(1);
        randomNumber = random.nextInt(educationPage.dropdownOptionsList.size());
        waitForClickablility(educationPage.dropdownOptionsList.get(randomNumber),10);
        educationPage.dropdownOptionsList.get(randomNumber).click();
        waitForVisibility(educationPage.addEdcationButton,3).click();
        waitForVisibility(educationPage.secondDeleteButton,5).click();
        educationPage.sendInputText.sendKeys("Test");
        educationPage.aDDbutton.click();
        clickWithJS(educationPage.clickX);
        educationPage.educationSaveButton.click();
        Assert.assertTrue(educationPage.educationSavedSuccessfullyPopup.isDisplayed());
        educationPage.closeTheEducationPartButton.click();
    }
}