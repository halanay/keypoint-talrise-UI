package talrise.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.*;
import talrise.pages.UploadFilePage;
import talrise.utilities.CommonSteps;
import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
import java.awt.event.KeyEvent;



public class UploadStepDefs extends CommonSteps {



//    public static void main(String[] args) {
//        String systemProperty = System.getProperty("user.name");
//        String systemUsername = System.getenv("USERNAME");
//        System.out.println("systemProperty = " + systemProperty);
//        System.out.println("systemUsername = " + systemUsername);
//        Map<String, String> getenv = System.getenv();
//        System.out.println("keyPointUserName = " + getenv);
//        String keyP = System.getenv("KeyP");
//        System.out.println("keyP = " + keyP);
//    }

    String systemUsername = System.getenv("USERNAME");
    String cv="C:\\Users\\"+systemUsername+"\\IdeaProjects\\keypoint-talrise-UI\\cv1.docx";
    String cover="C:\\Users\\"+systemUsername+"\\IdeaProjects\\keypoint-talrise-UI\\cover1.docx";
    String anotherCv="C:\\Users\\"+systemUsername+"\\IdeaProjects\\keypoint-talrise-UI\\cv2.pdf";
    String anotherCover="C:\\Users\\"+systemUsername+"\\IdeaProjects\\keypoint-talrise-UI\\cover2.pdf";
    StringSelection str;
    JavascriptExecutor js = (JavascriptExecutor)driver; // Scroll operation using Js Executor
    Robot rb = new Robot(); // creating object of Robot class

    public UploadStepDefs() throws AWTException {
    }

    @And("close complete now popup")
    public void closeCompleteNowPopup() {
        try{
            uploadFilePage.completeNowPopupCloseButton.click();}
        catch(RuntimeException e){
            System.out.println("Complete Now Popup hasn't shown up");
        }
    }

    @And("click on profile button")
    public void clickOnProfileButton() {


        uploadFilePage.profileButton.click();
    }

    @When("select upload file")
    public void select_upload_file() {
        uploadFilePage.uploadCvButton.click();
    }


    @And("user uploads {string} by using uploadCvBox\\(doc,pdf,docx)")
    public void userUploadsByUsingUploadCvBoxDocPdfDocx(String fileName) throws InterruptedException {
        String fileLocation = fileNameCreator(fileName);
        js.executeScript("arguments[0].click",uploadFilePage.uploadCvBox); // Scroll Down(+ve) upto browse option
        Thread.sleep(2000); // suspending execution for specified time period

        uploadFilePage.uploadCvBox.click();
        Thread.sleep(2000); // suspending execution for specified time period



        rb.delay(1000);

        // copying File path to Clipboard
        str = new StringSelection(fileLocation);
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
        System.out.println(fileLocation+" uploaded");
    }

    @And("user uploads {string} by using browseCvBox\\(doc,pdf,docx)")
    public void userUploadsByUsingBrowseCvBoxDocPdfDocx(String fileName) throws InterruptedException, AWTException {

        String fileLocation = fileNameCreator(fileName);
        js.executeScript("arguments[0].click",uploadFilePage.uploadCvBrowseButton); // Scroll Down(+ve) upto browse option
        Thread.sleep(2000); // suspending execution for specified time period

        uploadFilePage.uploadCvBrowseButton.click();
        Thread.sleep(2000); // suspending execution for specified time period


        rb.delay(1000);

        // copying File path to Clipboard
        str = new StringSelection(fileLocation);
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

    @And("user uploads {string} by using uploadCoverBox\\(doc,pdf,docx)")
    public void userUploadsByUsingUploadCoverBoxDocPdfDocx(String fileName) {
        String fileLocation = fileNameCreator(fileName);
        uploadFilePage.uploadCoverBox.sendKeys(fileLocation);
    }

    @And("user uploads {string} by using browseCoverBox\\(doc,pdf,docx)")
    public void userUploadsByUsingBrowseCoverBoxDocPdfDocx(String fileName) throws InterruptedException, AWTException {
        String fileLocation = fileNameCreator(fileName);

        js.executeScript("arguments[0].click",uploadFilePage.uploadCoverBrowseButton); // Scroll Down(+ve) upto browse option
        Thread.sleep(2000); // suspending execution for specified time period

        uploadFilePage.uploadCoverBrowseButton.click();
        Thread.sleep(2000); // suspending execution for specified time period


        rb.delay(1000);

        // copying File path to Clipboard
        str = new StringSelection(fileLocation);
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



    @And("user can delete uploaded file")
    public void userCanDeleteUploadedFile() throws InterruptedException {
        waitForVisibility(uploadFilePage.deleteButton,10);
        uploadFilePage.deleteButton.click();

        try{
            String actualFileName= uploadFilePage.fileUploaded.get(0).getText();}
        catch (RuntimeException e){
            System.out.println("File deleted");
        }
        System.out.println("cv deleted");

    }

    @Then("user see uploaded file name contains {string}")
    public void userSeeUploadedFileNameContains(String fileName) {
        String actualFileName= uploadFilePage.fileUploaded.get(0).getText();
        System.out.println("actualFileName = " + actualFileName);
        String fileLocation=fileNameCreator(fileName);
        System.out.println("file = " + fileLocation.substring(fileLocation.lastIndexOf("\\") + 1));
        Assert.assertEquals(fileLocation.substring(fileLocation.lastIndexOf("\\") + 1), actualFileName);

    }

    public String fileNameCreator(String fileSelection){
        if(fileSelection.equalsIgnoreCase("cv")) return cv;
        else if(fileSelection.equalsIgnoreCase("cover")) return cover;
        else if(fileSelection.equalsIgnoreCase("anotherCv")) return anotherCv;
        else if(fileSelection.equalsIgnoreCase("anotherCover"))return anotherCover;

        else return "File Not Found";


    }


    @When("user clicks save button in uploadFile Page")
    public void userClicksSaveButtonInUploadFilePage() {
        uploadFilePage.uploadFileSaveButton.click();
    }



    @Then("user should see {string} for {string}")
    public void userShouldSeeFor(String expectedPopupText, String file) {
        System.out.println("savedPopupText = " + expectedPopupText);
        System.out.println("file = " + file);
        String actualPopupText;
        if (file.equals("cv")) {
            waitForVisibility(UploadFilePage.cvSavedPopup,10);
            actualPopupText = UploadFilePage.cvSavedPopup.getText();

        }
        else{
            waitForVisibility(UploadFilePage.coverSavedPopup,10);
            actualPopupText = UploadFilePage.coverSavedPopup.getText();
        }
        System.out.println("actualPopupText = " + actualPopupText);
        Assert.assertEquals(expectedPopupText, actualPopupText);


    }

    @When("user clicks cancel button in uploadFile Page")
    public void userClicksCancelButtonInUploadFilePage() {
        uploadFilePage.uploadFileCancelButton.click();
    }


    @Then("user see file boxes empty")
    public void userSeeFileBoxesEmpty() {
        int numberOfFileUploaded=uploadFilePage.fileUploaded.size();
        Assert.assertEquals(numberOfFileUploaded,0);
    }
}
