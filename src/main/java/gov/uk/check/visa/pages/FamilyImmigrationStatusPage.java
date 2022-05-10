package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FamilyImmigrationStatusPage extends Utility {
    public FamilyImmigrationStatusPage() {
        PageFactory.initElements(driver,this);
    }
@FindBy(xpath = "//input[@id='response-0']")
WebElement yes;
    @FindBy(xpath = "//input[@id='response-1']")
    WebElement no;
    public void selectImmigrationStatus(String status){
        switch (status){
            case "yes":
                clickOnElement(yes);
                break;
            case "no":
                clickOnElement(no);
                break;
        }

    }

}
