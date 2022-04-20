package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RequestAppointmentPage {

    WebDriver driver;

    public RequestAppointmentPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setAppointmentType(String type) {
        driver.findElement(By.id("appointment-type")).sendKeys(type);
    }

    public void setProvider(String provider) {
        driver.findElement(By.id("provider")).sendKeys(provider);
    }

    public void clickSaveButton() {
        driver.findElement(By.id("save-button")).click();
    }
}
