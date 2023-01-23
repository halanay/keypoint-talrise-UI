package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class EducationPage extends CommonPageElements {


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/button[1]") // notes
    public WebElement candidateButton;
    @FindBy(xpath = "(//*[@class='MuiAccordionSummary-content css-1n11r91'])[8]")
    public WebElement educationButton;

    @FindBy(xpath = "//h2[.='Education']//..//..//button[.=\"Delete\"]")
    public WebElement firstDeleteButton;

    @FindBy(xpath = "(//h2[.='Education']//..//..//button[.=\"Delete\"])[2]")
    public WebElement secondDeleteButton;


    @FindBy(xpath = "//*[@id=\"university-label\"]")
    public WebElement universities;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li")
    public List<WebElement> universitiesListBox;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[5]")
    public WebElement universitiesListBoxOne;
    @FindBy(xpath = " //button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf']")
    public WebElement universitiesButton;

    @FindBy(xpath = "//div[contains(@id,'degreeId')]")
    public WebElement degreeButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> degreeList;

    @FindBy(xpath = "//div[contains(@id,'departmentId')]")
    public WebElement departmentButton;
    @FindBy(xpath = "[aria-labelledby=\"select-label-id\"]>li")
    public List<WebElement> departmentList;

    @FindBy(xpath = "//div[contains(@id,'startYear')]")
    public WebElement startYearButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> startYearList;

    @FindBy(xpath = "//div[contains(@id,'endYear')]")
    public WebElement endYearButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> endYearList;

    @FindBy(xpath = "//span[contains(text(),'+ ADD EDUCATION')]")
    public WebElement addEdcationButton;

    @FindBy(xpath = "(//*[@id=\"text-field-input\"])[8]")
    public WebElement sendInputText;
    @FindBy(xpath = "//span[.='X']")
    public WebElement clickX;

    @FindBy(xpath = "//h2[.='Education']//..//..//span[.='ADD']")
    public WebElement aDDbutton;

    @FindBy(xpath = "//div[@class='sc-gJFNMl fjOkVc containerList']")
    public List<WebElement> suggestedCertificates;

    @FindBy(xpath = "//span[.='Education']//..//..//..//button[.='SAVE']")
    public WebElement educationSaveButton;

    @FindBy(xpath = "(//*[@class='collapseIconWrapper'])[8]")
    public WebElement closeTheEducationPartButton;

    @FindBy(xpath = "//div[.='Your education info has been added successfully.']")
    public WebElement educationSavedSuccessfullyPopup;

    @FindBy(css = "[aria-labelledby=\"select-label-id\"]>li")
    public List<WebElement> dropdownOptionsList;


}
