package bookAppointment;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.*;

public class requestAppointmentTests extends BaseTests {
    @Test
    @DisplayName("TC01-Request an appointment")
    public void requestNewAppointment() throws InterruptedException{
        HomePage homePage = loginPage.loginToHomePage();
        FindPatientRecordPage findPatientRecordPage = homePage.redirectToFindPatientRecord();
        findPatientRecordPage.setInputField("");
        Thread.sleep(1000);
        ViewThePatientPage viewThePatientPage = findPatientRecordPage.viewThePage();
        Thread.sleep(1000);
        RequestAppointmentPage requestAppointmentPage = viewThePatientPage.redirectToRequestAppointmentPage();
        requestAppointmentPage.setAppointmentType("Dermatology");
        Thread.sleep(1000);
        requestAppointmentPage.clickSaveButton();
    }
}
