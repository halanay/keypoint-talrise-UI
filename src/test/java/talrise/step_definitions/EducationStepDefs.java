package talrise.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;
import talrise.utilities.ConfigurationReader;
import talrise.utilities.Driver;
import talrise.utilities.Log;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

import static talrise.pages.PageInitializer.educationStepDef;
import static talrise.pages.PageInitializer.loginPage;

public class EducationStepDefs extends CommonSteps {

    @Given("the user goes to login page and enter valid inputs")
    public void theUserGoesToLoginPageAndEnterValidInputs() {
        Log.info("User goes to login page and input valid credentials");
        loginPage.emailTextbox.sendKeys(ConfigurationReader.get("email"));
        loginPage.passwordTextbox.sendKeys(ConfigurationReader.get("password"));
        loginPage.loginButton.click();

    }

    @And("user clicks on the education button and deletes all informations")
    public void userClicksOnTheEducationButtonAndDeletesAllInformations() {
        Log.info("User clicks on the education button then delets previous info");
        waitForClickablility(educationStepDef.educationButton,2000).click();
        waitForClickablility(educationStepDef.deleteButton,2000).click();


    }
    @Then("user enters valid inputs of education")
    public void userEntersValidInputsOfEducation() {
        Log.info("User goes to Dashboard page and clicks Profile then inputs new Education Info");
        educationStepDef.educationInfoProcecess();
    }
}