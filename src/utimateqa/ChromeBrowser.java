package utimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //Open URL into Browser
        driver.get(baseUrl);
        //Maximise the Browser
        driver.manage().window().maximize();
        //We give implicit wait to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get the title of the page
        String title = driver.getTitle();
        System.out.println(title);
        //Get the current URL
        driver.getCurrentUrl();
        System.out.println("Current URL : " + driver.getCurrentUrl());
        //Get the Page Source
        System.out.println("Page Source : " + driver.getPageSource());
        //Find the Username Field
        WebElement emailField = driver.findElement(By.name("user[email]"));
        emailField.sendKeys("mick123@gmail.com");
        //Find the Password field
        WebElement PasswordField = driver.findElement(By.name("user[password]"));
        PasswordField.sendKeys("Mick123");

        //Close driver
        driver.close();

    }
}
