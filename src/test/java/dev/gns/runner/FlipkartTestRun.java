package dev.gns.runner;

import dev.gns.pages.Models;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/dev/gns/features", glue = "dev.gns.steps")
public class FlipkartTestRun {

    public static WebDriver driver;
    public static Models models;

    @BeforeClass
    public static void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        models = new Models(driver);
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
