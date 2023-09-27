package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement fullName = driver.findElement(By.xpath("//*[@id=\"userName\"]"));
        fullName.sendKeys("Full name");

        WebElement email = driver.findElement(By.xpath("//*[@id=\"userEmail\"]"));
        email.sendKeys("fullname@gmail.com");

        WebElement currentAddress = driver.findElement(By.xpath("//*[@id=\"currentAddress\"]"));
        currentAddress.sendKeys("123 Main St \n" + "Chamb, PA 12071");

        WebElement permAddress = driver.findElement(By.xpath("//*[@id=\"permanentAddress\"]"));
        permAddress.sendKeys("123 Main St \n" + "Chamb, PA 12071");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();


    }
}
