package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class UploadFilePage extends CommonPageElements{

    @FindBy(css = "[class=\"sc-bYMpWt iBIlnr\"]")
    public WebElement completeNowPopupCloseButton;

    @FindBy(css = "[href=\"/profile\"]")
    public WebElement profileButton;

    @FindBy(xpath = "//*[.=\"Upload CV\"]")
    public WebElement uploadCvButton;

    @FindBy(xpath = "(//button[@class=\"sc-gikAfH hQZbzO sc-cLNonn bwkOlG\"])[1]")
    public WebElement uploadCvBrowseButton;

    @FindBy(xpath = "(//input[@type=\"file\"])[1]/..")
    public WebElement uploadCvBox;

    @FindBy (xpath = "//div[@role=\"presentation\"]//p[@class=\"file-name\"]")
    public List<WebElement> fileUploaded;

    @FindBy(xpath = "(//input[@type=\"file\"])[2]")
    public WebElement uploadCoverBox;

    @FindBy(css = "[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//button[@class=\"sc-gikAfH hQZbzO sc-cLNonn bwkOlG\"])[2]")
    public WebElement uploadCoverBrowseButton;

    @FindBy(xpath = "//h2[@class=\"sc-iBYQkv bpgPjg sc-kiPvrU aiSzf header\"]//..//..//..//button[text()='SAVE']")
    public static WebElement uploadFileSaveButton;

    @FindBy(xpath = "//h2[@class=\"sc-iBYQkv bpgPjg sc-kiPvrU aiSzf header\"]//..//..//..//button[text()='Cancel']")
    public static WebElement uploadFileCancelButton;

    @FindBy(xpath = "(//div[.='Your Cv has been uploaded successfully.'])[6]")
    public static WebElement cvSavedPopup;

    @FindBy(xpath = "(//div[.='Your Cover Letter has been uploaded successfully.'])[6]")
    public static WebElement coverSavedPopup;



}
