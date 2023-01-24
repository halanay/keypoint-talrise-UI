package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;
import talrise.utilities.Driver;

import java.util.List;

public class CandidatePositon_StepDefs extends CommonSteps {
    @Given("US7 User clicks on Position button")
    public void us7_user_clicks_on_position_button() {
     clickWithTimeOut(profilePage.profileButton,1);
     waitFor(1);
     clickWithTimeOut(profilePage.positionButton,1);
    }

    @Given("US7 User verifies the Position and text titles")
    public void us7_user_verifies_the_position_and_text_titles() {
        waitFor(1);
        scrollToElement(profilePage.positionTitle);
        Assert.assertTrue(profilePage.positionTitle.isDisplayed());
        Assert.assertTrue(profilePage.positionInfoText.isDisplayed());
    }

    @Given("US7 User clicks on selected position to close it")
    public void us7_user_clicks_on_selected_position_to_close_it() {
       waitFor(1);
      clickWithJS(driver.findElement(By.xpath("//*[.='Position*']//..//*[.='QA Engineer']")));
    }

    @Given("US7 User types {string} on the search box and clicks on required position button")
    public void us7_user_types_on_the_search_box_and_clicks_on_required_position_button(String Position) {

        sendText(profilePage.positionSearchBox,Position);
        List<WebElement> suggestedList = profilePage.positionSuggestedPositionsList;
        for(WebElement each:suggestedList){
            if(each.getText().equals("QA Engineer")){
                each.click();
                break;
            }
        }
       waitFor(2);
      //suggestedList.stream().filter(t->t.getText().equals("Tester")).forEach(WebElement::click);
    }
    @Given("US7 User verifies that selected position appeared")
    public void us7_user_verifies_that_selected_position_appeared() {
     scrollToElement(profilePage.positionSelectedTesterTitle);
     Assert.assertTrue(profilePage.positionSelectedTesterTitle.isDisplayed());
    }

    @Given("US7 User clicks on save button")
    public void us7_user_clicks_on_save_button() {
     clickWithJS(profilePage.positionSaveButton);
    }

    @Given("US7 User verifies the success message")
    public void us7_user_verifies_the_success_message() {
    waitFor(3);
    Assert.assertTrue(profilePage.positionSuccessMessage.isDisplayed());
    }

    @Given("US7 User verifies the failure message")
    public void us7_user_verifies_the_failure_message() {
    waitFor(3);
    Assert.assertTrue(profilePage.positionWarningMessage.isDisplayed());
    }

    @Given("US7 User clicks on cancel button")
    public void us7_user_clicks_on_cancel_button() {
    clickWithJS(profilePage.positionSelectedTesterTitle);
    }




    @Given("US7 User types {string} again on the search box and clicks on required position button")
    public void us7_user_types_again_on_the_search_box_and_clicks_on_required_position_button(String string) {
        scrollToElement(profilePage.profileTitle);
        driver.findElement(By.xpath("//*[.='Position*']//..//*[.='QA Engineer']")).click();


    }




}
