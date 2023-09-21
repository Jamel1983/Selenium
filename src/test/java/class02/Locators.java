package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("http://35.175.58.98/input-form-locator.php");
        driver.manage().window().maximize();
        WebElement firstName = driver.findElement(By.id("first_name"));
        firstName.sendKeys("Jamel");
        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Dumas");
        WebElement email = driver.findElement(By.className("form-control-01"));
        email.sendKeys("jaydumas.dsa@gmail.com");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        //submitButton.click();

        WebElement linkButton = driver.findElement(By.linkText("Link"));
        //linkButton.click();

        WebElement clickHere = driver.findElement(By.partialLinkText("Click"));
        clickHere.click();

    }
}
