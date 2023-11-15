package multibrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class browserTesting {
    static WebDriver driver;
    static String browser = "Chrome"; // change it to Firefox or Edge
    //Setup Chrome browser//

    static String baseUrl =  "https://opensource-demo.orangehrmlive.com/";

    public static void main(String[] args) {
        if (browser.equalsIgnoreCase("Chrome")){
            driver = new ChromeDriver();

        }else if (browser.equalsIgnoreCase("Firefox")){
            driver = new FirefoxDriver();

        }else if (browser.equalsIgnoreCase("Edge")){
            driver = new EdgeDriver();
        }else {
            System.out.println("Invalid browser name ");
        }

        //Get baseurl
        driver.get(baseUrl);

        //Print the title of the page
        System.out.println("The title of the page is : " + driver.getTitle());

        //Print the current url
        System.out.println("Current URL :" + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source: " + driver.getPageSource());

        //Click on forgot password? link
        WebElement forgotPasswordLink = driver.findElement(By.id("app"));
        forgotPasswordLink.click();

        //Print the current url after clicking Forgot password link
        System.out.println("Current Url after clicking forgot password : " + driver.getCurrentUrl());
        System.out.println("---------------------------------------------------------------------");
        //Navigate back to the login page
        driver.navigate().back();

        //navigate to forward
        driver.navigate().forward();

        //Refresh the page
        driver.navigate().refresh();

        System.out.println("-----------------------------------------------");
        //Enter email to email field
        WebElement usernameField = driver.findElement(By.linkText("oxd-input oxd-input--active"));
        usernameField.sendKeys("prexastudy@gmail.com");

        //Enter password to password field
        WebElement passwordField = driver.findElement(By.linkText("oxd-input oxd-input--active"));
        passwordField.sendKeys("admin1234");

        //click on login button

        WebElement loginButton = driver.findElement(By.className("oxd-button oxd-button--medium oxd-button--main orangehrm-login-button"));
        loginButton.click();

        //close the browser
        driver.quit();


    }
}
