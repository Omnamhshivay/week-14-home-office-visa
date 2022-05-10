package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class ReasonForTravelPage extends Utility {
    public ReasonForTravelPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue1;
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement answersMessage;



    public void selectTourism(){
        clickOnElement(tourism);
    }
    public void clickOnContinue1(){
        clickOnElement(Continue1);
    }
    public void verifyText(String expectedMessage){
        String actualText=getTextFromElement(answersMessage);
        if(actualText.equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }
    public String getResultMessage(){
        String actualMessage=getTextFromElement(answersMessage);
        return actualMessage;
    }

    @FindBy(xpath = "//div[@class='govuk-radios']/div")
    List<WebElement> reasonForVisit;
    public void selectReasonForVisit(String reason){
        for(WebElement reasonList:reasonForVisit){
            if(reasonList.getText().equalsIgnoreCase(reason)){
                clickOnElement(reasonList);
            }
        }
    }
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement duration;
    public void selectDuration(){
        clickOnElement(duration);
    }




    }


