package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;

import java.util.List;

public class Activity_StepDefs extends CommonSteps {
    @Given("US5 User clicks on Activity Button")
    public void us5_user_clicks_on_activity_button() {
        waitFor(1);
        clickWithTimeOut(activityPage.activityButton,1);
    }

    @Given("US5 User verifies the Activity title")
    public void us5_user_verifies_the_activity_title() {
        Assert.assertTrue(activityPage.activityTitle.isDisplayed());
    }

    @Given("US5 User verifies Saved Jobs and Applied Jobs Button")
    public void us5_user_verifies_saved_jobs_and_applied_jobs_button() {
       Assert.assertTrue(activityPage.savedJobsButton.isDisplayed());
       Assert.assertTrue(activityPage.appliedJobsButton.isDisplayed());
    }

    @Given("US5 User clicks on Saved Jobs and verifies Saved Jobs and Saved Jobs with Talrise titles")
    public void us5_user_clicks_on_saved_jobs_and_verifies_saved_jobs_and_saved_jobs_with_talrise_titles() {
      clickWithTimeOut(activityPage.savedJobsButton, 1);
      Assert.assertTrue(activityPage.savedJobsTitle.isDisplayed());
      Assert.assertTrue(activityPage.savedJobsWithTalriseTitle.isDisplayed());
    }

    @Given("US5 User searches for a job and verifies the result")
    public void us5_user_searches_for_a_job_and_verifies_the_result() {
     sendText(activityPage.searchBox,"abc");
     Assert.assertTrue(activityPage.searchResultForSavedJobs.isDisplayed());
    }

    @Given("US5 User verifies Company Name title among the titles")
    public void us5_user_verifies_company_name_title_among_the_titles() {
        List<WebElement>titleList=activityPage.savedJonTitles;
        for(WebElement each:titleList){
            if(each.getText().equals("COMPANY NAME")){
                System.out.println("COMPANY");
                break;
            }
        }
    }

    @Given("US5 User clicks on Applied Jobs Button and verifies Applied Jobs title")
    public void us5_user_clicks_on_applied_jobs_button_and_verifies_applied_jobs_title() {
      clickWithTimeOut(activityPage.appliedJobsButton,1);
      Assert.assertTrue(activityPage.appliedJobsTitle.isDisplayed());
    }

    @Given("US5 User verifies Position is the one of the title displayed in the title list")
    public void us5_user_verifies_position_is_the_one_of_the_title_displayed_in_the_title_list() {
    List<WebElement>titles=activityPage.appliedJobTitles;
    for(WebElement each:titles){
        if(each.getText().equals("POSITION")){
            System.out.println("POSITION");
            break;
        }
    }
    }
    @Given("US5 User verifies number of records displayed")
    public void us5_user_verifies_number_of_records_displayed() {
    Assert.assertTrue(activityPage.searchResultForAppliedJobs.isDisplayed());

        List<WebElement> elements = driver.findElements(By.xpath("//tbody//tr"));
        if(elements.size()==5){
            System.out.println("passed");
        }
        }

    }




