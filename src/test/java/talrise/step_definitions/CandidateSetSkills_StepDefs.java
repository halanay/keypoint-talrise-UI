package talrise.step_definitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import talrise.utilities.CommonSteps;

import java.util.List;

public class CandidateSetSkills_StepDefs extends CommonSteps {
    @Given("US8 Candidate User clicks on Profile button")
    public void us8_candidate_user_clicks_on_profile_button() {
    clickWithTimeOut(profilePage.profileButton, 1);
    }

    @Given("US8 Candidate user clicks on Skill Set link")
    public void us8_candidate_user_clicks_on_skill_set_link() {
    clickWithTimeOut(profilePage.skillSetLink,1);
    }

    @Given("US8 User verifies the Skill Set Title")
    public void us8_user_verifies_the_skill_set_title() {
        waitFor(1);
        Assert.assertTrue(profilePage.skillSetTittle.isDisplayed());
    }

    @Given("US8 User verifies that a position from previous step is shown")
    public void us8_user_verifies_that_a_position_from_previous_step_is_shown() {
       Assert.assertTrue(driver.findElement(By.xpath("(//*[.='QA Engineer'])[5]")).isDisplayed());
    }

    @Given("US8 User verifies that suggested skill list is contains {string} and {string} skills")
    public void us8_user_verifies_that_suggested_skill_list_is_contains_and_skills(String Cucumber, String Cypress) {
        scrollToElement(profilePage.skillSetTittle);
        List<WebElement> suggestedSkillList = profilePage.suggestedSkillList;
        for(WebElement each: suggestedSkillList){
            if(each.getText().equals(Cucumber)||each.getText().equals(Cypress)){
                System.out.println(Cucumber+" and "+Cypress+" are in the list");
            }
        }
    }

    @Given("US8 User verifies that when the {string} is typed in the search box it should be seen with experience year")
    public void us8_user_verifies_that_when_the_is_typed_in_the_search_box_it_should_be_seen_with_experience_year(String Cypress) {
        click(profilePage.setSkillsSearchBox);
        sendText(profilePage.setSkillsSearchBox,Cypress);

        waitFor(1);
        Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Cypress']")).isDisplayed());
        driver.findElement(By.xpath("//button[normalize-space()='Cypress']")).click();
        Assert.assertTrue(profilePage.skillSetExperienceYearBox.isDisplayed());
    }

    @Given("US8 User verifies that when Experience Year dropdown is clicked options are visible")
    public void us8_user_verifies_that_when_experience_year_dropdown_is_clicked_options_are_visible() {
        scrollToElement(profilePage.skillSetExperienceYearBox);
        clickWithJS(profilePage.skillSetExperienceYearBox);
        driver.findElement(By.xpath("(//*[.='Skill Set*']//..//*[.='0-1'])[2]")).click();
        driver.findElement(By.xpath("//*[.='1-3']")).click();
        driver.findElement(By.xpath("//button[normalize-space()='Cypress']")).click();
    }

    @Given("US8 User clicks on save button and verifies the success message")
    public void us8_user_clicks_on_save_button_and_verifies_the_success_message() {
      click(profilePage.skillSetSaveButton);
      waitFor(1);
      Assert.assertTrue(profilePage.skillSetSuccessMessage.isDisplayed());
    }

}
