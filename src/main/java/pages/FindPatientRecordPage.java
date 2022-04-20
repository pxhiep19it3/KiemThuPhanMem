package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Random;

public class FindPatientRecordPage {
    private WebDriver driver;

    private By inputField = By.id("patient-search");

    private By resultElement = By.cssSelector("#patient-search-results-table tr");

    public FindPatientRecordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setInputField(String input) {
        driver.findElement(inputField).sendKeys(input);
    }

    public ViewThePatientPage viewThePage() {
        List<WebElement> resultRows = driver.findElements(resultElement);
        Random random = new Random();
        int index = random.nextInt(resultRows.size() - 1);
        resultRows.get(index).click();
        return new ViewThePatientPage(driver);
    }
}
