package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ViewThePatientPage {
    WebDriver driver;

    private By requestAppointmentBtn = By.cssSelector(".action-section ul li:nth-child(3) a");

    public ViewThePatientPage(WebDriver driver) {}

    public RequestAppointmentPage redirectToRequestAppointmentPage() {
        driver.findElement(requestAppointmentBtn).click();
        return new RequestAppointmentPage(driver);
    }
}
