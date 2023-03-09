package dev.gns.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Models {
    public WebDriver driver;
    public Models(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    //elements on login page
    @FindBy(xpath = "/html/body/div[2]/div/div/button")
    public WebElement closeModal;
    @FindBy(className = "_3704LK")
    public WebElement searchBar;
    @FindBy(className = "L0Z3Pu")
    public WebElement searchButton;
    @FindBy(xpath = "/html/body/div[1]/div/div[3]/div/div[1]/div/div[1]/div/section[8]/div[1]/div")
    public WebElement internalStorage;
    @FindBy(className = "_24_Dny")
    public WebElement memoryCase;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]")
    public WebElement phone;

    @FindBy(className = "_3SkBxJ")
    public WebElement cartButton;
    //on Cart page
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")
    public WebElement addtoCart;

    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[4]/div/form/button")
    public WebElement placeOrder;

    //login sign up page
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[1]/input")
    public WebElement emailField;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[3]/button")
    public WebElement continueButton;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[2]/input")
    public WebElement otpField;
    @FindBy(xpath = "//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div/div/div/div[1]/div/form/div[4]/button")
    public WebElement loginButton;
}
