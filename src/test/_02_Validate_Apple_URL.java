package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {
        //1. Set up Driver
        WebDriver driver = Driver.getDriver();

        //2. Validation
        driver.get("https://www.apple.com/");
        String expectedResults = "https://www.apple.com/";
        String actualResults = driver.getCurrentUrl();

        if (expectedResults.equals(actualResults)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        System.out.println("End of the program");
        //3. Quit Driver
        Driver.quitDriver();

    }
}
