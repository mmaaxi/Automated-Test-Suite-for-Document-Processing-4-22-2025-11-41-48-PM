package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_002Page {

    WebDriver driver;
    By uploadButton = By.id("uploadButton");
    By fileName = By.id("fileName");
    By fileSize = By.id("fileSize");
    By fileType = By.id("fileType");

    public tc_002Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUploadPage() {
        driver.get("http://example.com/upload");
    }

    public void uploadFile(String filePath) {
        WebElement uploadElement = driver.findElement(uploadButton);
        uploadElement.sendKeys(filePath);
    }

    public boolean isFileUploadedSuccessfully() {
        return driver.findElement(fileName).isDisplayed();
    }

    public String getFileName() {
        return driver.findElement(fileName).getText();
    }

    public long getFileSize() {
        // Assuming size is displayed in bytes for simplicity
        return Long.parseLong(driver.findElement(fileSize).getText());
    }

    public String getFileType() {
        return driver.findElement(fileType).getText();
    }
}