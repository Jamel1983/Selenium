package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.id("email"));
        email.sendKeys("jaydumas.dsa@gmail.com");
        WebElement pass = driver.findElement(By.id("pass"));
        pass.sendKeys("thkykn787^");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();
    }
}
