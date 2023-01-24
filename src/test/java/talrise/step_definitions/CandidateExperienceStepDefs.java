package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;

import java.util.List;

public class CandidateExperienceStepDefs extends CommonSteps {
    @Given("US1 Candidate user clicks on Experience title")
    public void us1_candidate_user_clicks_on_experience_title() {
      clickWithTimeOut(profilePage.personalInfoProfileButton,1);
      waitFor(2);
      clickWithTimeOut(profilePage.experienceButton,2);
     scrollToElement(profilePage.experienceContractTypeBox);
      waitFor(1);
    }
    @Given("US1 Candidate user verifies the Experience title")
    public void us1_candidate_user_verifies_the_experience_title() {
        Assert.assertTrue(profilePage.experienceTitle.isDisplayed());
    }
    @Given("US1 Candidate user fills the Title Company boxes")
    public void us1_candidate_user_fills_the_title_company_boxes() {
      profilePage.experienceTitleBox.click();
      sendText(profilePage.experienceTitleBox,"Tester");
      profilePage.experienceCompanyBox.click();
      sendText(profilePage.experienceCompanyBox,"Talrise");
    }
    @Given("US1 Candidate user chooses Contract Type Workplace Start Date")
    public void us1_candidate_user_chooses_contract_type_workplace_start_date() {
     clickWithTimeOut(profilePage.experienceContractTypeBox,2);
     waitFor(1);
        List<WebElement> contractTypeElements = driver.findElements(By.xpath("//ul//li"));
        for(WebElement each: contractTypeElements){
            if(each.getText().equals("Permanent")){
                each.click();
                break;
            }
        }

     clickWithTimeOut(profilePage.experienceWorkplaceBox, 2);
     waitFor(1);
     List<WebElement> workPlaceList=driver.findElements(By.xpath("//ul//li"));
     for(WebElement each: workPlaceList){
         if(each.getText().equals("Hybrid")){
             each.click();
             break;
         }
     }

    }

    @Given("US1 Candidate user clicks on I am currently working box")
    public void us1_candidate_user_clicks_on_i_am_currently_working_box() {
     clickWithTimeOut(profilePage.experienceCurrentlyWorkingBox,1);
    }

    @Given("US1 Candidates chooses notice period from the dropdown")
    public void us1_candidates_chooses_notice_period_from_the_dropdown() {
     scrollToElement(profilePage.experienceStartDateBoxDropdown);
     click(profilePage.experienceStartDateBoxDropdown);
     clickWithTimeOut(profilePage.experienceNoticePeriodBox,1);
     waitFor(1);
        List<WebElement> noticePeriods = driver.findElements(By.xpath("//ul//li"));

        for (int i = 0; i < noticePeriods.size(); i++) {
            if(noticePeriods.get(i).getText().equals("4 week")){
                noticePeriods.get(i).click();
                break;
            }
    }
    }


    @Given("US1 Candidate user enters some text to the more experience")
    public void us1_candidate_user_enters_some_text_to_the_more_experience() {
      profilePage.experienceExplanationBox.clear();
     sendText(profilePage.experienceExplanationBox,"sadfasfd");
    }

    @Given("US1 Candidate user clicks to save button")
    public void us1_candidate_user_clicks_to_save_button() {
        clickWithJS(profilePage.saveButton);
    }
    @Given("US1 Candidate user verifies the success message")
    public void us1_candidate_user_verifies_the_success_message() {
        waitFor(1);
       Assert.assertTrue(profilePage.experienceSuccessMessage.isDisplayed());
    }
}
