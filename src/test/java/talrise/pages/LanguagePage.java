package talrise.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import talrise.utilities.CommonSteps;

public class LanguagePage extends CommonPageElements{
    @FindBy(id = "email")
    public WebElement emailTextbox;

    @FindBy(id = "password")
    public WebElement passwordTextbox;

    @FindBy(css = "[type=\"submit\"]")
    public WebElement loginButton;

    @FindBy(xpath = "(//div[contains(text(),'Logged in successfully.')])[1]")
    public WebElement loginMessage;

    @FindBy(xpath = "//span[contains(text(),'Profile')]")
    public WebElement profileButton;

    @FindBy(xpath = "//span[contains(text(),'Language')]")
    public WebElement languageButton;

//    @FindBy(xpath = "//input[@name='searchText']")
//    public WebElement language_searchBox;

    @FindBy(xpath = "//input[@id=':r8:']")
    public WebElement language_searchBox;


    public void completeNowPopUpcancelation(){
        CommonSteps.waitFor(7);
        try{
            WebElement m= driver.findElement(By.xpath(("(//*[local-name()='svg'])[27]")));
            Actions actions = new Actions(driver);

            actions.moveToElement(m).click().build().perform();

        }catch(Exception e){

        }


    }




}
