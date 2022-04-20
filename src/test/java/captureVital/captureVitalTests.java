package captureVital;

import base.BaseTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import pages.FindCaptureVitalPage;
import pages.HomePage;

public class captureVitalTests extends BaseTests {
    @Test
    @DisplayName("TC01-Capture Vital")
    public void viewCaptureVital() throws InterruptedException{
        HomePage homePage = loginPage.loginToHomePage();
        FindCaptureVitalPage findCaptureVitalPage = homePage.redirectToFindCaptureVital();
        findCaptureVitalPage.setInputField("100");
        Thread.sleep(1000);
        findCaptureVitalPage.viewThePage();
        Thread.sleep(2000);
    }
}
