import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;
import POM.*;
import java.awt.*;
import java.time.Duration;

import static java.awt.SystemColor.window;

public class RegisterTest {


    WebDriver driver;
    HomePage home;
    SignUpPage signUpPage;
   // String myAccount ="//li[@class='nav-item dropdown']/a[@class='bg-light nav-link dropdown-toggle btn btn-outline-secondary px-0 ps-3 text-center d-flex align-items-center justify-content-center gap-2 border-white waves-effect']";
   // String signUp = "//ul[@class='dropdown-menu bg-white rounded-2 show']/li/a[@class='dropdown-item fadeout waves-effect'][@href='https://phptravels.net/signup']";

    @BeforeTest
    public void setup()
    {
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        home=new HomePage(driver);
        signUpPage=new SignUpPage(driver);
    }

    @Test
    public void registerTest1()
    {

        home.navigateToHome();
        home.clickOnMyAccount();
        home.clickOnSignUp();
       // signUpPage.fillRegisterData("dav","davv","egy","123456","dav12@gmail.com","dav123");


        /*      By test = By.xpath(myAccount);
        WebElement myAccount = driver.findElement(test);
        new WebDriverWait(driver, Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(myAccount));
        myAccount.click();
        By signUp_Selector = new By.ByXPath(signUp);
        WebElement signUp = driver.findElement(signUp_Selector);
        new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(signUp));
        signUp.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,2000)"); */





    }

}
