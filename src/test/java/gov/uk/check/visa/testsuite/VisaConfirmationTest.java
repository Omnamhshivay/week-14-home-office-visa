package gov.uk.check.visa.testsuite;

import gov.uk.check.visa.pages.*;
import gov.uk.check.visa.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VisaConfirmationTest extends TestBase {

    StartPage startPage;
    SelectNationalityPage selectNationalityPage;
    ReasonForTravelPage reasonForTravelPage;
    WorkTypePage workTypePage;
    FamilyImmigrationStatusPage familyImmigrationStatusPage;
    ResultPage resultPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt() {
        startPage = new StartPage();
        selectNationalityPage = new SelectNationalityPage();
        reasonForTravelPage = new ReasonForTravelPage();
        workTypePage=new WorkTypePage();
        familyImmigrationStatusPage =new FamilyImmigrationStatusPage();
        resultPage =new ResultPage();
    }

    @Test(groups = {"sanity","regression"})
    public void anAustralianComingToUKForTourism() {
        startPage.clickStartNow();
        selectNationalityPage.selectCountry("australia");
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectTourism();
        reasonForTravelPage.clickOnContinue1();
        reasonForTravelPage.verifyText("You will not need a visa to come to the ");


    }

    @Test(groups = {"smoke","regression"})
    public void aChileanComingToTheUKForWorkAndPlansOnStayingForLongerThanSixMonths() {
        startPage.clickStartNow();
        selectNationalityPage.selectCountry("chile");
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectReasonForVisit("Work, academic visit or business");
        reasonForTravelPage.clickOnContinue1();
        reasonForTravelPage.selectDuration();
        reasonForTravelPage.clickOnContinue1();
        workTypePage.selectTypeOfWork("Health and care professional");
        reasonForTravelPage.clickOnContinue1();
        resultPage.verifyText("You need a visa to work in health and care");



    }
    @Test(groups = {"regression"})
    public void aColumbianNationalComingToTheUKToJoinAPartnerForALongStayTheyDoHaveAnArticle10Or20Card(){
        startPage.clickStartNow();
        selectNationalityPage.selectCountry("colombia");
        selectNationalityPage.clickOnContinue();
        reasonForTravelPage.selectReasonForVisit("Join partner or family for a long stay");
        reasonForTravelPage.clickOnContinue1();
        familyImmigrationStatusPage.selectImmigrationStatus("yes");
        reasonForTravelPage.clickOnContinue1();
        resultPage.verifyText2("You’ll need a visa to join your family or partner in the UK");

    }


}


