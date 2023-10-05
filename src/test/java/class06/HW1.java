package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW1 {
    // HW1:
    //goto  http://35.175.58.98/handle-iframe.php
    //click the checkbox
    //then select the  babycat
    //then enter topic name
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://35.175.58.98/handle-iframe.php");

        driver.switchTo().frame(0);

        Thread.sleep(2000);

        driver.switchTo().frame("checkboxIframe");
        driver.switchTo().parentFrame();
        driver.switchTo().frame("checkboxIframe");

        WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        checkBox.click();
        Thread.sleep(1000);
        checkBox.click();

        driver.switchTo().defaultContent();
        driver.switchTo().frame("dropdownIframe");

        WebElement animalsDropDown = driver.findElement(By.id("animals"));

        Select sel = new Select(animalsDropDown);
        sel.selectByVisibleText("Baby Cat");

        Thread.sleep(3000);
        driver.quit();

    }
}
