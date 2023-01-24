package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

import java.util.List;

public class ProfilePage extends CommonPageElements {
  @FindBy(xpath = "//span[normalize-space()='Profile']")
  public  WebElement profileButton;

  @FindBy(xpath = "//h1")
  public WebElement profileTitle;

  @FindBy(xpath = "//*[text()='Personal Information']")
  public WebElement personalInformationButton;

  @FindBy(xpath = "//h2[normalize-space()='Personal Information']")
  public WebElement personalInformationTitle;

  @FindBy(xpath = "//*[text()='Profile']")
  public WebElement personalInfoProfileButton;

  @FindBy(name = "firstName")
  public WebElement firstNameBox;

  @FindBy(name = "lastName")
  public WebElement lastNameBox;

  @FindBy(name = "linkedIn")
  public WebElement linkedNameBox;

  @FindBy(xpath = "//*[.='England']")
  public WebElement countryBox;

  @FindBy(xpath = "//li[normalize-space()='England']")
  public WebElement England;

  @FindBy(xpath = "//div[@id='cityId-select-input-id']")
  public WebElement cityBox;

  @FindBy(name = "email")
  public WebElement emailBox;

  @FindBy(xpath = "//div[@id='countryPhoneCode-select-input-id']")
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

  @FindBy(xpath = "//h2[normalize-space()='Experience']//..//..//*[.='Permanent']")
  public WebElement experienceContractTypeBox;

  @FindBy(xpath = "//*[.='Hybrid']")
  public WebElement experienceWorkplaceBox;

  @FindBy( css = "[value=\"02.2022\"]")
  public WebElement experienceStartDateBoxDropdown;

  @FindBy(xpath = "(//input[@id='text-field-input'])[7]]")
  public WebElement experienceEndDateBox;

  @FindBy(xpath = "//*[.='4 week']")
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

  //Industry
  @FindBy(xpath = "//span[normalize-space()='Industry']")
  public WebElement industryButton;

  @FindBy(xpath = "//h2[normalize-space()='Industry']")
  public WebElement industryTitle;

  @FindBy(xpath = "//h2[normalize-space()='Industry']//..//*[@name=\"searchText\"]")
  public WebElement industrySearchBox;

  @FindBy(xpath = "//button[normalize-space()='Education']")
  public WebElement industrySuggestedFieldEducationTitle;

  @FindBy(xpath = "//button[normalize-space()='Education']")
  public WebElement industrySelectedItem;

  @FindBy(css = "[id=\"addedItemsFormik[0][0].experienceYears.id-select-input-id\"]")
  public WebElement industryExperienceYearBox;

  @FindBy(xpath = "//ul//li")
  public List<WebElement> industryExperienceDropDownList;

  @FindBy(xpath = "//div[@class='sc-dIfARi dwHcSA addedLine']//div[@id='select-input-id']")
  public WebElement industryExperienceBox;

  @FindBy(xpath = "(//*[text()='SAVE'])[5]")
  public WebElement industrySaveButton;

  @FindBy(xpath = "//*[contains(text(),'industry')]")
  public WebElement industrySuccessMessage;

  //Position

  @FindBy(xpath = "//span[normalize-space()='Position']")
  public WebElement positionButton;

  @FindBy(xpath = "//*[text()='Position*']")
  public WebElement positionTitle;

  @FindBy(xpath = "//*[text()='You can choose max 5 positions.']")
  public WebElement positionInfoText;

  @FindBy(xpath = "//button[normalize-space()='Android Developer']")
  public WebElement positionAndroidDeveloperTitleToBeChoose;

  @FindBy(xpath = "//*[.='Position*']//..//*[.='QA Engineer']")
  public WebElement positionSelectedTesterTitle;

  @FindBy(xpath = "//*[text()='.NET Developer']//..//..//button")
  public List<WebElement> positionSuggestedPositionsList;

  @FindBy(xpath = "(//button[@type='button'][normalize-space()='See More >'])[1]")
  public WebElement positionSeeMoreButton;

  @FindBy(xpath = "//*[.='Position*']//..//..//..//..//..//*[.='SAVE']")
  public WebElement positionSaveButton;

  @FindBy(xpath = "//*[contains(text(),'position data')]")
  public WebElement positionSuccessMessage;

  @FindBy(xpath = "//*[contains(text(),'one position')]")
  public WebElement positionWarningMessage;

  @FindBy(css = "[id=\":r3:\"]")
  public WebElement positionSearchBox;

  @FindBy(xpath = "(//*[.='Cancel'])[3]")
  public WebElement positionCancelButton;

  //Skill Set
  @FindBy(xpath = "//span[normalize-space()='Skill Set']")
  public WebElement skillSetLink;

  @FindBy(xpath = "//*[.='Skill Set*']")
  public WebElement skillSetTittle;

  @FindBy(xpath = "//button[normalize-space()='Appium']//..//..")
  public List<WebElement> suggestedSkillList;

  @FindBy(xpath = "//*[.='Skill Set*']//..//*[@name=\"searchText\"]")
  public WebElement setSkillsSearchBox;

  @FindBy(xpath = "(//*[.='Skill Set*']//..//*[.='0-1'])[2]")
  public WebElement skillSetExperienceYearBox;

  @FindBy(xpath = "//ul[@role=\"listbox\"]//..")
  public List<WebElement> skillSetExperienceList;

  @FindBy(xpath = "(//button[@type='button'][normalize-space()='SAVE'])[4]")
  public WebElement skillSetSaveButton;

  @FindBy(xpath = "//*[contains(text(),'Your skill')]")
  public WebElement skillSetSuccessMessage;






}
