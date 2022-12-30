package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static talrise.pages.PageInitializer.educationStepDef;
import static talrise.utilities.CommonSteps.clickWithJS;
import static talrise.utilities.CommonSteps.waitForVisibility;

public class EducationPage extends CommonPageElements {


    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[2]/div/div[1]/button[1]")
    public WebElement candidateButton;
    @FindBy(xpath = "(//*[@class='MuiAccordionSummary-content css-1n11r91'])[8]")
    public WebElement educationButton;

    @FindBy(xpath = "//button[.=\"Delete\"]")
    public WebElement deleteButton;


    @FindBy(xpath = "//*[@id=\"university-label\"]")
    public WebElement universities;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li")
    public List<WebElement> universitiesListBox;

    @FindBy(xpath = "/html/body/div[2]/div/ul/li[5]")
    public WebElement universitiesListBoxOne;
    @FindBy(xpath = " //button[@class='MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium MuiAutocomplete-popupIndicator css-uge3vf']")
    public WebElement universitiesButton;

    @FindBy(xpath = "(//div[@id='select-input-id'])[11]")
    public WebElement degreeButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> degreeList;

    @FindBy(xpath = "(//div[@role='button'])[20]")
    public WebElement departmentButton;
    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> departmentList;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div/div[2]/div/div[8]/div[2]/div/div/div/div/div[1]/div/div/div[2]/form/div[1]/div/div/div[3]/div[2]/div[2]/div")
    public WebElement startYearButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> startYearList;

    @FindBy(xpath = "(//*[@id=\"select-input-id\"])[14]")
    public WebElement endYearButton;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li")
    public List<WebElement> endYearList;

    @FindBy(xpath = "//span[contains(text(),'+ ADD EDUCATION')]")
    public WebElement addEdcationButton;

    @FindBy(xpath = "(//*[@class='sc-gikAfH aiAIi sc-hZDVde jOqzXV btn-delete'])[2]")
    public WebElement secondDeleteButton;

    @FindBy(xpath = "(//*[@id=\"text-field-input\"])[8]")
    public WebElement sendInputText;
    @FindBy(xpath = "//*[@class='sc-gikAfH jvOEnv sc-ehVsHJ keSgWF btn-cert small']")
    public WebElement clickX;

    @FindBy(xpath = "(//button[@type='submit'])[7]")
    public WebElement aDDbutton;

    @FindBy(xpath = "//div[@class='sc-gJFNMl fjOkVc containerList']")
    public List<WebElement> suggestedCertificates;

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/div/div[3]/div/div[2]/div/div[8]/div[2]/div/div/div/div/div[2]/button[2]")
    public WebElement educationSaveButton;

    @FindBy(xpath = "(//*[@class='collapseIconWrapper'])[8]")
    public WebElement closeTheEducationPartButton;

    @FindBy(xpath = "/html/body/div/div/div[2]/div/div/div/div[1]/div[2]")
    public WebElement educationInfoSuccessfullButton;

    public void educationInfoProcecess() {
        clickWithJS(educationStepDef.universitiesButton);
        List<WebElement> allUniversity= new ArrayList<WebElement>();
        allUniversity=educationStepDef.universitiesListBox;
        allUniversity.get(5).click();

        //degree işlemleri
        educationStepDef.degreeButton.click();
        List<WebElement> degreeList= new ArrayList<WebElement>();
        degreeList=educationStepDef.degreeList;
        degreeList.get(0).click();

        //department işlemleri
        educationStepDef.departmentButton.click();
        List<WebElement> departmentList= new ArrayList<WebElement>();
        departmentList=educationStepDef.departmentList;
        departmentList.get(0).click();

        //startYYearişlemleri
        educationStepDef.startYearButton.click();
        List<WebElement> yearList= new ArrayList<WebElement>();
        yearList=educationStepDef.startYearList;
        yearList.get(0).click();

        //endYYearişlemleri
        educationStepDef.endYearButton.click();
        List<WebElement> endList= new ArrayList<WebElement>();
        endList=educationStepDef.startYearList;
        endList.get(0).click();

        //add edusation proccess
       waitForVisibility(educationStepDef.addEdcationButton,3).click();
       waitForVisibility(educationStepDef.secondDeleteButton,5).click();

        //sendİnputText
        educationStepDef.sendInputText.sendKeys("Test");
        educationStepDef.aDDbutton.click();

        clickWithJS(educationStepDef.clickX);
        educationStepDef.educationSaveButton.click();
        educationStepDef.closeTheEducationPartButton.click();
        educationStepDef.educationInfoSuccessfullButton.isDisplayed();

        //      List<String> uniList = getElementsText(educationStepDef.universitiesListBox);
//        System.out.println(uniList.size());
//        System.out.println(uniList.get(5));
//        educationStepDef.universitiesListBoxOne.click();
        //sendİnputText
        // educationStepDef.sendInputText.sendKeys("Test");
        //educationStepDef.aDDbutton.click();

    }


}
