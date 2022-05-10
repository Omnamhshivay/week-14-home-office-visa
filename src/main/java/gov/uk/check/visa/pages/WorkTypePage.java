package gov.uk.check.visa.pages;

import gov.uk.check.visa.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkTypePage extends Utility {
    public WorkTypePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//div[@class='govuk-radios']/div/label")
    List<WebElement> typeOfWork;

    public void selectTypeOfWork(String work) {
        for (WebElement typeOfWorkList : typeOfWork) {
            if (typeOfWorkList.getText().equalsIgnoreCase(work)) {
                clickOnElement(typeOfWorkList);
            }
        }
    }
}
