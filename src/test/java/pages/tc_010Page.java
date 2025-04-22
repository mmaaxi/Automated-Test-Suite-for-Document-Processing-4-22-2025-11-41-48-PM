package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By uploadButton = By.id("uploadButton");
    By processButton = By.id("processButton");
    By slipOutput = By.id("slipOutput");
    By historySection = By.id("historySection");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loadDocuments() {
        WebElement uploadBtn = driver.findElement(uploadButton);
        uploadBtn.click(); // Additional steps to upload documents would be implemented here.
    }

    public void processDocuments() {
        WebElement processBtn = driver.findElement(processButton);
        processBtn.click(); // Additional steps for processing would be here.
    }

    public boolean isSlipGenerated() {
        return driver.findElement(slipOutput).isDisplayed();
    }

    public boolean isDataStoredInHistory() {
        return driver.findElement(historySection).getText().contains("Document Data Stored");
    }
}