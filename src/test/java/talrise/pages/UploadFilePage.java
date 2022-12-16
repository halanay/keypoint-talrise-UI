package talrise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

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

    @FindBy(xpath = "(//div[@role=\"presentation\"])[1]//p[@class=\"file-name\"]")
    public WebElement fileNameUploaded;

    @FindBy(xpath = "(//div[@role=\"presentation\"])[1]//p[@class=\"file-name\"]")
    public WebElement cvUploaded;

    @FindBy(xpath = "(//div[@role=\"presentation\"])[2]//p[@class=\"file-name\"]")
    public WebElement coverUploaded;

    @FindBy(xpath = "(//input[@type=\"file\"])[2]")
    public WebElement uploadCoverBox;

    @FindBy(css = "[class=\"MuiButtonBase-root MuiIconButton-root MuiIconButton-sizeMedium css-1yxmbwk\"]")
    public WebElement deleteButton;

    @FindBy(xpath = "(//button[@class=\"sc-gikAfH hQZbzO sc-cLNonn bwkOlG\"])[2]")
    public WebElement uploadCoverBrowseButton;

    @FindBy(xpath = "//h2[@class=\"sc-iBYQkv bpgPjg sc-kiPvrU aiSzf header\"]/following::button[text()='SAVE'][1]")
    public static WebElement uploadFileSaveButton;

    @FindBy(xpath = "//h2[@class=\"sc-iBYQkv bpgPjg sc-kiPvrU aiSzf header\"]/following::button[text()='Cancel'][1]")
    public static WebElement uploadFileCancelButton;

    @FindBy(xpath = "(//div[.='Your Cv has been uploaded successfully.'])[6]")
    public static WebElement cvSavedPopup;

    @FindBy(xpath = "(//div[.='Your Cover Letter has been uploaded successfully.'])[6]")
    public static WebElement coverSavedPopup;



}
