package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SignUpPage {

    WebDriver driver;

    String signUp = "//div[@class='content mb-0 p-4']/h3/strong";
    By signUp_Locator = By.xpath(signUp);
    WebElement signUpElement = driver.findElement(signUp_Locator);

    String signUpButton = "//button[@id='submitBTN']";
    By signUpButton_Locator = By.xpath(signUpButton);
    WebElement signUPButtonElement = driver.findElement(signUpButton_Locator);


   // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

    public SignUpPage(WebDriver driver)
    {
        this.driver = driver;
        //wait.until(ExpectedConditions.visibilityOf(signUpElement));

    }

    public void fillRegisterData(String fname,String lname ,String country,String phone, String email , String password)
    {
        driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys(fname);
        driver.findElement(By.xpath("//input[@id='last name']")).sendKeys(lname);
        driver.findElement(By.xpath("//button[@class='btn dropdown-toggle bs-placeholder btn-light']")).sendKeys(country);
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
        driver.findElement(By.xpath("//input[@id='user_email']")).sendKeys(email);
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);

        signUPButtonElement.click();




    }


}
