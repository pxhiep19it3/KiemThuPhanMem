package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;

    private By logoutBtn = By.className("logout");
    private By registerPatientBtn = By.id("referenceapplication-registrationapp-registerPatient-homepageLink-referenceapplication-registrationapp-registerPatient-homepageLink-extension");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage logout() {
        driver.findElement(logoutBtn).click();
        return new LoginPage(driver);
    }

    public RegisterPatientPage redirectToRegisterPatient() {
        driver.findElement(registerPatientBtn).click();
        return new RegisterPatientPage(driver);
    }

    public FindPatientRecordPage redirectToFindPatientRecord() {
        driver.findElement(By.id("coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")).click();
        return new FindPatientRecordPage(driver);
    }

    public FindCaptureVitalPage redirectToFindCaptureVital() {
        driver.findElement(By.id("referenceapplication-vitals-referenceapplication-vitals-extension")).click();
        return new FindCaptureVitalPage(driver);
    }

}
