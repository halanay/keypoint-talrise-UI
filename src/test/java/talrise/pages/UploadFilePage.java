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

    @FindBy(xpath = "(//button[@class=\"sc-gikAfH hQZbzO sc-lknQiW jHSpQC\"])[1]")
    public WebElement uploadCvBrowseButton;

    @FindBy(xpath = "(//input[@type=\"file\"])[1]")
    public WebElement uploadCvBox;

    @FindBy(css = "[class=\"file-name\"]")
    public WebElement fileNameUploaded;




}
