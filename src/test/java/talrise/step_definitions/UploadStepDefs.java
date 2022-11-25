package talrise.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import talrise.utilities.CommonSteps;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;


public class UploadStepDefs extends CommonSteps {
    String fileName="C:\\Users\\Dell\\Desktop\\admin candidate skills.docx";
    StringSelection str;

    @And("close complete now popup")
    public void closeCompleteNowPopup() {
        uploadFilePage.completeNowPopupCloseButton.click();
    }

    @And("click on profile button")
    public void clickOnProfileButton() {
        uploadFilePage.profileButton.click();
    }

    @When("select upload CV")
    public void select_upload_cv() {
        uploadFilePage.uploadCvButton.click();
    }

    @And("user uploads file by using uploadCvBox\\(doc,pdf,docx)")
    public void userUploadsFileByUsingUploadCvBoxDocPdfDocx() {
        uploadFilePage.uploadCvBox.sendKeys(fileName);
    }

    @And("user uploads file by using browse\\(doc,pdf,docx)")
    public void userUploadsFileByUsingBrowseDocPdfDocx() throws InterruptedException, AWTException {

        JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
        js.executeScript("arguments[0].click",uploadFilePage.uploadCvBrowseButton); // Scroll Down(+ve) upto browse option
        Thread.sleep(2000); // suspending execution for specified time period

        uploadFilePage.uploadCvBrowseButton.click();
        Thread.sleep(2000); // suspending execution for specified time period

        // creating object of Robot class
        Robot rb = new Robot();
        rb.delay(1000);

        // copying File path to Clipboard
        str = new StringSelection(fileName);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

        // press Contol+V for pasting
        rb.keyPress(KeyEvent.VK_CONTROL);
        rb.keyPress(KeyEvent.VK_V);
        rb.delay(1000);
        // release Contol+V for pasting
        rb.keyRelease(KeyEvent.VK_CONTROL);
        rb.keyRelease(KeyEvent.VK_V);
        rb.delay(1000);
        // for pressing and releasing Enter
        rb.keyPress(KeyEvent.VK_ENTER);
        rb.keyRelease(KeyEvent.VK_ENTER);




    }
    @Then("user see document uploaded")
    public void user_see_document_uploaded() {
        String actualFileName= uploadFilePage.fileNameUploaded.getText();

        Assert.assertEquals(fileName.substring(fileName.lastIndexOf("\\") + 1), actualFileName);
    }



}
