package findPatientRecord;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FindPatientRecordPage;
import pages.HomePage;

public class viewThePatient extends BaseTests {
    @Test
    @DisplayName("TC01-View Patient Record")
    public void viewThePatientRecord() throws InterruptedException{
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("");
        Thread.sleep(1000);
        findPatientRecordPage.viewThePage();
        Thread.sleep(1000);
    }
}
