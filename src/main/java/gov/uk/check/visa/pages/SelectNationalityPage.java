package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectNationalityPage extends Utility {
    public SelectNationalityPage() {
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//select[@id='response']")
    WebElement nationalityDropDown;
    @FindBy(xpath = "//button[contains(text(),'Continue')]")
    WebElement Continue;
    @FindBy(xpath = "//input[@id='response-0']")
    WebElement tourism;



    public void selectCountry(String country){

        selectByValueFromDropDown(nationalityDropDown,country);
    }
    public void clickOnContinue(){
        clickOnElement(Continue);
    }



}
