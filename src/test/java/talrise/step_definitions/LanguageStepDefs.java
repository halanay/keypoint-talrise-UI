package talrise.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import talrise.utilities.CommonSteps;

public class LanguageStepDefs extends CommonSteps {


    @Given("user clicks on the completeNowPopUp button")
    public void theUserClikOnTheProfileButton() {
        loginPage.completeNowPopUpcancelation();


    }

    @And("user clicks on the profile button")
    public void UserClicksOnTheProfileButton() {
        languagePage.profileButton.click();

    }

    @And("user clicks on the language button")
    public void UserClicksOnTheLanguageButton() {

        languagePage.languageButton.click();
    }

    @When("user clicks on the search box")
    public void UserClicksOnTheSearchBox() {


        languagePage.language_searchBox.click();
    }

    @Then("user  is able to type or enter in the search box or not")
    public void UserIsAbleToTypeOrEnterInTheSearchBoxOrNot() {
        click(languagePage.language_searchBox);
        languagePage.language_searchBox.sendKeys("English");

    }
}