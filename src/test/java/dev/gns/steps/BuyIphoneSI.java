package dev.gns.steps;

import dev.gns.pages.Models;
import dev.gns.runner.FlipkartTestRun;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BuyIphoneSI {
    public WebDriver driver = FlipkartTestRun.driver;
    public Models models = FlipkartTestRun.models;
    @Given("the user is on the website's home page")
    public void the_user_is_on_the_website_s_home_page() {
        driver.get("https://www.flipkart.com/");
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(models.closeModal));
        models.closeModal.click();
        String title = driver.getTitle();
        assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
    }

    @When("the user finds the search web element")
    public void the_user_finds_the_search_web_element() {
       assertTrue(models.searchBar.isDisplayed());
    }

    @When("enters {string} in the search field")
    public void enters_in_the_search_field(String string) {
        models.searchBar.sendKeys("iPhone");
        models.searchButton.click();
    }

    @When("selects the memory")
    public void selects_the_memory() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(models.internalStorage));
        models.internalStorage.click();
        models.memoryCase.click();
    }

    @When("selects the product")
    public void selects_the_product() {
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(models.phone));
        models.phone.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @When("adds it to the cart")
    public void adds_it_to_the_cart() {
        String currentWindow = driver.getWindowHandle();

        for(String windowHandle : driver.getWindowHandles()){
            if(!windowHandle.equals(currentWindow)){
                driver.switchTo().window(windowHandle);
            }
        }

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(models.addtoCart));

        models.addtoCart.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @When("selects place order")
    public void selects_place_order() {
        models.cartButton.click();
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(models.placeOrder));
        models.placeOrder.click();
    }

    @When("logs in to the website")
    public void logs_in_to_the_website() {
        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.visibilityOf(models.emailField));
        models.emailField.sendKeys("test123@gmail.com");
        models.continueButton.click();

        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(models.otpField));

        models.otpField.sendKeys("123");

        new WebDriverWait(driver, Duration.ofSeconds(5))
                .until(ExpectedConditions.elementToBeClickable(models.loginButton));

        models.loginButton.click();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

//    @When("enters their address")
//    public void enters_their_address() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Then("the user should see a confirmation of their order")
//    public void the_user_should_see_a_confirmation_of_their_order() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
}
