package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _12_sendKeys_click_methods {
    public static void main(String[] args) {
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org");

        WebElement searchInputBox = driver.findElement(By.cssSelector("#searchInput"));
        WebElement searchButton = driver.findElement(By.cssSelector(".pure-button"));

        searchInputBox.sendKeys("Tesla" + Keys.RETURN);
        //searchButton.click();

        WebElement mainTitle = driver.findElement(By.cssSelector("#firstHeading"));

        if (mainTitle.isDisplayed() && mainTitle.getText().equals("Tesla")) System.out.println("Title validation is PASSED");
        else System.out.println("Title validation is FAILED");

        Driver.quitDriver();
    }
}
