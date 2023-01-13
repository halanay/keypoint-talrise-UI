package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;

import java.util.List;

public class CandidateIndustryStepDefs extends CommonSteps {
    @Given("US3 Candidate user clicks on industry title")
    public void us3_candidate_user_clicks_on_industry_title() {
        clickWithTimeOut(profilePage.personalInfoProfileButton,1);
        waitFor(2);
        scrollToElement(profilePage.industryButton);
        clickWithTimeOut(profilePage.industryButton,1);
    }

    @Given("US3 Candidate user verifies the industry title")
    public void us3_candidate_user_verifies_the_industry_title() {
        waitFor(1);
        Assert.assertTrue(profilePage.industryTitle.isDisplayed());
    }

    @Given("US3 When the candidate user types any industry on search box verifies that it appears in dropdown")
    public void us3_when_the_candidate_user_types_any_industry_on_search_box_verifies_that_it_appears_in_dropdown() {
      scrollToElement(driver.findElement(By.xpath("//span[normalize-space()='Suggested fields']")));
      sendText(profilePage.industrySearchBox,"Ed");
      waitFor(1);
      Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Education']")).isDisplayed());
      profilePage.industrySearchBox.sendKeys(Keys.BACK_SPACE);
      profilePage.industrySearchBox.sendKeys(Keys.BACK_SPACE);
    }

    @Given("US3 When candidate clicks on an industry from dropdown verifies that it is selected")
    public void us3_when_candidate_clicks_on_an_industry_from_dropdown_verifies_that_it_is_selected() {
//        List<WebElement> suggestedFieldList = driver.findElements(By.xpath("//div[@class='sc-cxdZMj dRdSch']//div[@class='sc-iveFHk ftbcFb']//.."));
//        for(WebElement each:suggestedFieldList){
//            if(each.getText().equals("Education")){
//                each.click();
//                break;
//            }
//        }
        driver.findElement(By.xpath("//button[normalize-space()='Education']")).click();
        waitFor(3);
        Assert.assertTrue(profilePage.industrySelectedItem.isDisplayed());
    }

    @Given("US3 User chooses first option from the experience dropdown")
    public void us3_user_chooses_first_option_from_the_experience_dropdown() {
        List<WebElement>experienceList=profilePage.industryExperienceDropDownList;

        for(WebElement each:experienceList){
            if(each.getText().equals("1-3")){
                each.click();
                break;
            }
        }


    }


    @Given("US3 User closes industries which are selected")
    public void us3_user_closes_industries_which_are_selected() {
        scrollToElement(driver.findElement(By.xpath("//button[normalize-space()='Education']")));
       clickWithTimeOut(driver.findElement(By.xpath("//button[normalize-space()='Education']")),1 );
    }

    @Given("US3 User clicks on save button")
    public void us3_user_clicks_on_save_button() {
      clickWithTimeOut(profilePage.industrySaveButton,1);
    }

    @Given("US3 User verifies the success message")
    public void us3_user_verifies_the_success_message() {
     waitFor(1);
     Assert.assertTrue(profilePage.industrySuccessMessage.isDisplayed());
    }


}
