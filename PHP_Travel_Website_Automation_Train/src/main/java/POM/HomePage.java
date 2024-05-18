package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    WebDriver driver;
    String homeUrl = "https://phptravels.net/";

    String myAccount ="//li[@class='nav-item dropdown']/a[@class='bg-light nav-link dropdown-toggle btn btn-outline-secondary px-0 ps-3 text-center d-flex align-items-center justify-content-center gap-2 border-white waves-effect']";
    By myAccount_Locator = By.xpath(myAccount);
    WebElement myAccountElement = driver.findElement(myAccount_Locator);

    String signUp = "//ul[@class='dropdown-menu bg-white rounded-2 show']/li/a[@class='dropdown-item fadeout waves-effect'][@href='https://phptravels.net/signup']";
    By signUp_Locator = By.xpath(signUp);
    WebElement signUpElement = driver.findElement(signUp_Locator);

    WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(20));

    //constructor
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }

    //navigation to home
    public void navigateToHome()
    {
        driver.get(homeUrl);
        wait.until(ExpectedConditions.elementToBeClickable(myAccount_Locator));
    }

    //click on my account
    public void clickOnMyAccount()
    {
        wait.until(ExpectedConditions.visibilityOf(myAccountElement));
        myAccountElement.click();
    }

    //click on sign up

    public void clickOnSignUp()
    {
        wait.until(ExpectedConditions.visibilityOf(signUpElement));
        signUpElement.click();

    }
}
