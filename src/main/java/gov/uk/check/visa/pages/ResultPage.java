package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ResultPage extends Utility {
    public ResultPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//h2[contains(text(),'You will not need a visa to come to the UK')]")
    WebElement answersMessage;
    public void verifyText1(String expectedMessage){
        String actualText=getTextFromElement(youNeedVisa);
        if(actualText.equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }
    public String getResultMessage1(){
        String actualMessage=getTextFromElement(youNeedVisa);
        return actualMessage;
    }


    @FindBy(xpath = "//h2[contains(text(),'You need a visa to work in health and care')]")
    WebElement youNeedVisa;
    public void verifyText(String expectedMessage){
        String actualText=getTextFromElement(youNeedVisa);
        if(actualText.equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }
    public String getResultMessage(){
        String actualMessage=getTextFromElement(youNeedVisa);
        return actualMessage;
    }
    @FindBy(xpath = "//h2[contains(text(),'You’ll need a visa to join your family or partner ')]")
    WebElement youWillNeedVisaTOJoin;
    public void verifyText2(String expectedMessage){
        String actualText=getTextFromElement(youWillNeedVisaTOJoin);
        if(actualText.equalsIgnoreCase(expectedMessage)){
            Assert.assertTrue(true);
        }else{
            Assert.fail();
        }

    }
    public String getResultMessage2(){
        String actualMessage=getTextFromElement(youWillNeedVisaTOJoin);
        return actualMessage;
    }

}
