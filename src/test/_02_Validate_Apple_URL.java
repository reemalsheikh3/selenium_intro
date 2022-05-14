package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class _02_Validate_Apple_URL {
    public static void main(String[] args) throws InterruptedException {
        //1. Set up Driver
        System.setProperty("webdriver.chrome.driver", "/Users/reemalsheikh/IdeaProjects/selenium_intro/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        //2. Validation
        driver.get("https://www.apple.com/");
        String expectedResults = "https://www.apple.com/";
        String actualResults = driver.getCurrentUrl();

        if (expectedResults.equals(actualResults)) System.out.println("URL validation PASSED");
        else System.out.println("URL validation FAILED");

        //3. Quit Driver
        Thread.sleep(3000);
        driver.quit();

    }
}
