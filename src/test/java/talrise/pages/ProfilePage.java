package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

public class ProfilePage extends CommonPageElements {
  @FindBy(xpath = "//h1")
  public WebElement profileTitle;

  @FindBy(xpath = "//*[text()='Personal Information']")
  public WebElement personalInformationButton;

  @FindBy(xpath = "(//*[text()='Personal Information'])[2]")
  public WebElement personalInformationTitle;

  @FindBy(xpath = "//*[text()='Profile']")
  public WebElement personalInfoProfileButton;

  @FindBy(name = "firstName")
  public WebElement firstNameBox;

  @FindBy(name = "lastName")
  public WebElement lastNameBox;

  @FindBy(name = "linkedIn")
  public WebElement linkedNameBox;

  @FindBy(xpath = "(//div[@id='select-input-id'])[1]")
  public WebElement countryBox;

  @FindBy(xpath = "//li[normalize-space()='England']")
  public WebElement England;

  @FindBy(xpath = "(//div[@role='button'])[3]")
  public WebElement cityBox;

  @FindBy(name = "email")
  public WebElement emailBox;

  @FindBy(xpath = "(//*[@id='select-input-id'])[3]")
  public WebElement countryCodeBox;

  @FindBy(xpath = "//li[normalize-space()='+44']")
  public WebElement countryCodeValue;

  @FindBy(name = "mobile")
  public WebElement mobileBox;

  @FindBy(xpath = "//*[text()='SAVE']")
  public WebElement saveButton;

  @FindBy(xpath = "//li[normalize-space()='LONDON']")
  public WebElement London;

  @FindBy(xpath = "//*[text()='Personal information has been submitted successfully.']")
  public WebElement personalInfoSuccessMessage;

  //Experience
  @FindBy(xpath = "//span[normalize-space()='Experience']")
  public WebElement experienceButton;

  @FindBy(xpath = "//h2[normalize-space()='Experience']")
  public WebElement experienceTitle;

  @FindBy(xpath = "//input[@id='title']")
  public WebElement experienceTitleBox;

  @FindBy(xpath = "//input[@id='company']")
  public WebElement experienceCompanyBox;

  @FindBy(xpath = "(//div[@id='select-input-id'])[8]")
  public WebElement experienceContractTypeBox;

  @FindBy(xpath = "(//div[@id='select-input-id'])[9]")
  public WebElement experienceWorkplaceBox;

  @FindBy(xpath = "//button[@aria-label='Choose date, selected date is Jan 9, 2022']//*[name()='svg']")
  public WebElement experienceStartDateBoxDropdown;

  @FindBy(xpath = "(//input[@id='text-field-input'])[7]]")
  public WebElement experienceEndDateBox;

  @FindBy(xpath = "(//div[@id='select-input-id'])[10]")
  public WebElement experienceNoticePeriodBox;

  @FindBy(xpath = "(//input[@name='experiences[0].stillWorking'])[1]")
  public WebElement experienceCurrentlyWorkingBox;

  @FindBy(xpath = "(//div[@id='select-input-id'])[10]")
  public WebElement experienceToolBox;

  @FindBy(xpath = "//textarea[@rows='3']")
  public WebElement experienceExplanationBox;

  @FindBy(xpath = "//*[contains(text(),'ADD')]")
  public WebElement experienceAddMoreButton;

  @FindBy(xpath = "(//*[text()='SAVE'])[7]")
  public WebElement experienceSaveButton;

  @FindBy(xpath = "//*[contains(text(),'submitted')]")
  public WebElement experienceSuccessMessage;



}
