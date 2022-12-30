package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ActivityPage extends CommonPageElements {
    @FindBy(xpath = "//span[normalize-space()='Activity']")
    public WebElement activityButton;

    @FindBy(xpath = "//div[contains(text(),'Activity')]")
    public WebElement activityTitle;

    @FindBy(xpath = "//span[normalize-space()='Saved Jobs']")
    public WebElement savedJobsButton;

    @FindBy(xpath = "//span[normalize-space()='Applied Jobs']")
    public WebElement appliedJobsButton;

    @FindBy(xpath = "//h1[normalize-space()='Saved Jobs']")
    public WebElement savedJobsTitle;

    @FindBy(xpath = "//*[contains(text(),'saved jobs')]")
    public WebElement savedJobsWithTalriseTitle;

    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchBox;

    @FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body']")
    public WebElement searchResultForSavedJobs;

    @FindBy(xpath = "//span[@class='MuiButtonBase-root MuiTableSortLabel-root']")
    public List<WebElement> savedJonTitles;

    @FindBy(xpath = "//h1[normalize-space()='Applied Jobs']")
    public WebElement appliedJobsTitle;

    @FindBy(xpath = "//span[@class='MuiButtonBase-root MuiTableSortLabel-root']")
    public List<WebElement> appliedJobTitles;

    @FindBy(xpath = "//td[@class='MuiTableCell-root MuiTableCell-body']")
    public WebElement searchResultForAppliedJobs;





}
