package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.Driver;

public class _08_Locator_tagName {
    public static void main(String[] args) {
        /*
        Go to https://www.wikipedia.org/
        Validate the WIKIPEDIA heading1 is displayed
        Validate the WIKIPEDIA LOGO is displayed
        Validate the search input box is displayed
        Validate the search button is displayed
        Validate the search button is enabled
        */
        WebDriver driver = Driver.getDriver();
        driver.get("https://www.wikipedia.org/");

        WebElement heading1 = driver.findElement(By.cssSelector("h1[class='central-textlogo-wrapper']"));
        WebElement logo = driver.findElement(By.cssSelector("div[class='central-featured']"));
        WebElement searchInputBox = driver.findElement(By.id("searchInput"));
        WebElement searchButton = driver.findElement(By.cssSelector("button[class='pure-button pure-button-primary-progressive']"));

        if (heading1.isDisplayed()) System.out.println("Heading validation is PASSED");
        else System.out.println("Heading validation is FAILED!!!");

        if (logo.isDisplayed()) System.out.println("Logo validation is PASSED");
        else System.out.println("Logo validation is FAILED!!!");

        if (searchInputBox.isDisplayed()) System.out.println("Search input box validation is PASSED");
        else System.out.println("Search input box validation is FAILED!!!");

        if (searchButton.isDisplayed()) System.out.println("Search button display validation is PASSED");
        else System.out.println("Search button validation is FAILED!!!");

        if (searchButton.isEnabled()) System.out.println("Search button is enabled validation is PASSED");
        else System.out.println("Search button is enabled validation is FAILED!!!");

        Driver.quitDriver();

    }
}
